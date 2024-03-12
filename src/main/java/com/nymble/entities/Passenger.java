package com.nymble.entities;

import java.util.ArrayList;
import java.util.List;

import com.nymble.services.PassengerType;


public class Passenger {
	


	private String name;
    private int passengerNumber;
    private double balance;
    private PassengerType type;
    private List<Activity> activities;
    
   

    public Passenger(String name, int passengerNumber, double balance, PassengerType type) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.type = type;
        this.activities = new ArrayList<>();
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassengerNumber() {
		return passengerNumber;
	}

	public void setPassengerNumber(int passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public PassengerType getType() {
		return type;
	}

	public void setType(PassengerType type) {
		this.type = type;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public void signUp(Activity activity) {
        double cost = type.applyDiscount(activity.getCost());
        if (balance >= cost && activity.getCapacity() > 0) {
            balance -= cost;
            activities.add(activity);
            activity.setCapacity(activity.getCapacity() - 1);
        }
    }
    
    @Override
	public String toString() {
		return "Passenger [name=" + name + ", passengerNumber=" + passengerNumber + ", balance=" + balance + ", type="
				+ type + ", activities=" + activities + "]";
	}
    
}
