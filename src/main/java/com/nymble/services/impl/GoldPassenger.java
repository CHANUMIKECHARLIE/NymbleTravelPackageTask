package com.nymble.services.impl;

import org.springframework.stereotype.Service;

import com.nymble.services.PassengerType;

@Service
public class GoldPassenger implements PassengerType{

	private double balance;

    public GoldPassenger(double balance) {
        this.balance = balance;
    }

    @Override
    public double applyDiscount(double cost) {
        return cost * 0.9;
    }
    
}
