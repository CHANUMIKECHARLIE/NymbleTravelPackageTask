package com.nymble.entities;

import java.util.ArrayList;
import java.util.List;


public class Destination {


	private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }
    
    @Override
	public String toString() {
		return "Destination [name=" + name + ", activities=" + activities + "]";
	}
    
}
