package com.mayab.desarrollo.patrones.comportamiento.decorator;

//Concrete component
public class BlackCoffee extends Beverage {
	
	public BlackCoffee() {
		description = "Black Coffee";
	}
	
	@Override
	double getCost() {
		return 20.2;
	}
	
	public String toString() {
		return "Producto " + getDescription() 
		+ "\nPrecio: $" + Double.toString(getCost());	
	}

}
