package com.mayab.desarrollo.patrones.creacion.factorymethod;

public abstract class Triangle {
	
	String name;
	double lado1, lado2, base;
	double area;
	double perimetro;
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("--- "+ name + " ---\n");
		display.append("\nLado1: " + lado1
				+ "\nLado2: " + lado2
				+ "\nBase: " + base
				+ "\nArea: " + calcularArea()
				+ "\nPerimetro: " + calcularPerimetro() + "\n");

		return display.toString();
	}
	
}
