package com.mayab.desarrollo.estructura.decorator;

//Decorador concreto
public class Soy extends CondimentDecorator{
	
	Beverage beverage;
	
	private String name = "Soya";
	private double costo = 6.5;
	
	public Soy(Beverage bebida) {
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
