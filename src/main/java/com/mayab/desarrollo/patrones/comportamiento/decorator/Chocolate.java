package com.mayab.desarrollo.patrones.comportamiento.decorator;

//Decorador concreto
public class Chocolate extends CondimentDecorator{
	
	Beverage beverage;
	
	private String name = "Chocolate";
	private double costo = 5.2;

	public Chocolate(Beverage bebida) {
		this.beverage = bebida;
	}
	
	public String getDescription() {
		return beverage.getDescription() + " + extra " + this.name;
	}

	@Override
	double getCost() {
		// TODO Auto-generated method stub
		return costo + beverage.getCost();
	}
	
	public String toString() {
		return "Producto " + getDescription() 
		+ "\nPrecio: $" + Double.toString(getCost());
	}

}
