package com.mike.designpattern.decorator1;

public abstract class Beverage {
	protected String mDescription = "Unknown Beverage";

	public String getDescription() {
		return mDescription;
	}

	public abstract double cost();
}
