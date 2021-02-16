package com.mayab.desarrollo.patrones.comportamiento.decorator;

// Concrete component
public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	double getCost() {
		return 15.6;
	}
	
	public String toString() {
		return "Producto " + getDescription() 
		+ "\nPrecio: $" + Double.toString(getCost());	
	}
	
}
