package com.mayab.desarrollo.estructura.decorator;

// Clase padre
public abstract class Beverage {
	
	String description = "Unknown description";
	
	public String getDescription() {
		return description;
	}
	
	abstract double getCost();

}
