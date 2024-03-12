package com.nymble.services.impl;

import org.springframework.stereotype.Service;

import com.nymble.services.PassengerType;

@Service
public class PremiumPassenger implements PassengerType{

	@Override
    public double applyDiscount(double cost) {
        return 0; // Free for premium passengers
    }
	
}
