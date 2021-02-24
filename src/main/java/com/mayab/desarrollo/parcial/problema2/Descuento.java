package com.mayab.desarrollo.parcial.problema2;

public class Descuento extends DescuentoImpuestoDecorator{
	
	final double descuentoTemporada = 0.1;
	
	public Descuento(Producto p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	public double agregarDescuento() {
		this.costoFinal += p.getPrecioBase() * descuentoTemporada;
		System.out.println("Agregando descuento... Precio Actual: " + this.costoFinal);
		return this.costoFinal;
	}

	public double agregarNuevoImpuesto() {
		return 0;
	}

	@Override
	double calcularPrecioConIVA(Producto p) {
		return 0;
	}
	

	
}
