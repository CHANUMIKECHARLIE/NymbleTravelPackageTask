package com.nymble.entities;

import java.util.List;

public class TravelPackage {

	private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;
    private List<String> activityDetails;
    
    public TravelPackage(String name, List<Destination> itinerary, List<Passenger> passengers, List<String> activityDetails) {
        this.name = name;
        this.itinerary = itinerary;
        this.passengers = passengers;
        this.activityDetails = activityDetails;
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        }
    }

    public void printItinerary() {
    	System.out.println("Itinerary for " + name + ":");
        for (Destination item : itinerary) {
            System.out.println(item.toString());
        }
    }

    public void printPassengerList() {
    	System.out.println("Passenger List for " + name + ":");
        for (Passenger passenger : passengers) {
            System.out.println(passenger.toString());
        }
    }

    public void printActivityDetails() {
    	System.out.println("Activity Details for " + name + ":");
        for (String activity : activityDetails) {
            System.out.println(activity);
        }
    }

}
