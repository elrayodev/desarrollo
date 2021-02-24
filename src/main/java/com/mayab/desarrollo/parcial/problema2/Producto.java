package com.mayab.desarrollo.parcial.problema2;

public class Producto {
	
	private double precioBase;
	private String nombre;
	
	public Producto(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	public double getPrecioBase() {
		return this.precioBase;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String toString() {
		return "Nombre Producto: " + this.nombre
				+ "\nPrecio Base: " + this.precioBase;
		
	}

}
