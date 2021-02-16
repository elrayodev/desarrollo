package com.mayab.desarrollo.patrones.comportamiento.decorator;

public class CoffeeDriver {
	public static void main(String[] args) {
		
		Beverage house = new HouseBlend();
		house = new Milk(house);
		house = new Soy(house);
		
		Beverage black = new BlackCoffee();
		black = new Chocolate(black);
		black = new Milk(black);

		/*
		System.out.println("---- Beverage description ----"
							+ "\nProducto: " + house.getDescription()
							+ "\nPrecio: " + house.getCost());
		*/
		System.out.println(house);
		System.out.println(black);
				
	}
}
