package com.nymble.travelPackageTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.nymble.entities.Destination;
import com.nymble.entities.Passenger;
import com.nymble.entities.TravelPackage;
import com.nymble.services.PassengerType;
import com.nymble.services.impl.GoldPassenger;
import com.nymble.services.impl.PremiumPassenger;
import com.nymble.services.impl.StandardPassenger;

public class TravelPackageTest {
//TravelPackage(String name, List<Destination> itinerary, List<Passenger> passengers, List<String> activityDetails)
	@Test
    public void testPrintItinerary() {
		        
        PassengerType type1 = new GoldPassenger(10000.0);
        PassengerType type2 = new PremiumPassenger();
        PassengerType type3 = new StandardPassenger(1000000);
        
        Passenger p1 = new Passenger("Chanu",1,10000.0,type1);
        Passenger p2 = new Passenger("Divya",2,100000.0,type2);
        Passenger p3 = new Passenger("Renu",3,1000000.0,type3);
        
        List<Destination> itinerary = Arrays.asList(new Destination("Cubbon Park"),new Destination("MG road"));        
        List<Passenger> passengers = Arrays.asList(p1,p2,p3);
        List<String> activityDetails = Arrays.asList("Visit Bangalore Palace","Go to Gym","Play badminton");
        
        TravelPackage travelPackage = new TravelPackage("Package A", itinerary, passengers, activityDetails);
        // No assertion needed for print method, just checking for no errors
        travelPackage.printItinerary();
    }

    @Test
    public void testPrintPassengerList() {
        List<String> passengerList = Arrays.asList("John Doe", "Jane Doe", "Alice Smith");
        
        PassengerType type1 = new GoldPassenger(10000.0);
        PassengerType type2 = new PremiumPassenger();
        PassengerType type3 = new StandardPassenger(1000000);
        
        Passenger p1 = new Passenger("Chanu",1,10000.0,type1);
        Passenger p2 = new Passenger("Divya",2,100000.0,type2);
        Passenger p3 = new Passenger("Renu",3,1000000.0,type3);
        
        List<Destination> itinerary = Arrays.asList(new Destination("Cubbon Park"),new Destination("MG road"));        
        List<Passenger> passengers = Arrays.asList(p1,p2,p3);
        List<String> activityDetails = Arrays.asList("Visit Bangalore Palace","Go to Gym","Play badminton");
        
        TravelPackage travelPackage = new TravelPackage("Package B", itinerary, passengers, activityDetails);
        // No assertion needed for print method, just checking for no errors
        travelPackage.printPassengerList();
    }

    @Test
    public void testPrintActivityDetails() {
        List<String> activityDetails = Arrays.asList("Day 1: Welcome dinner at 7 PM", "Day 2: Sightseeing at 10 AM");
        TravelPackage travelPackage = new TravelPackage("Package C", new ArrayList<>(), new ArrayList<>(), activityDetails);
        // No assertion needed for print method, just checking for no errors
        travelPackage.printActivityDetails();
    }
    
}
