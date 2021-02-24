package com.mayab.desarrollo.parcial.problema2;

public abstract class Ciudad{
	
	private double impuestoIva;
	protected double precioConIva;
	public Producto p;
	protected double precioConDescuento;
	protected double precioEnCiudad;
	protected double costoFinal;
	
	public Ciudad(Producto p) {
		this.p = p;
		this.costoFinal = p.getPrecioBase();
	}
	
	abstract double calcularPrecioConIVA(Producto p);
	
	public double getImpuestoIva() {
		return impuestoIva;
	}
	
	public double costo() {
		
		return costoFinal;
		
		
	}
	
	
}
