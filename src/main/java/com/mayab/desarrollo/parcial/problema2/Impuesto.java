package com.mayab.desarrollo.parcial.problema2;

public class Impuesto extends DescuentoImpuestoDecorator{
	
	final double nuevoImpuesto = 0.2;
	
	public Impuesto(Producto p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	public double agregarDescuento() {
		return 0;
	}

	public double agregarNuevoImpuesto() {
		this.costoFinal += p.getPrecioBase() * nuevoImpuesto;
		return this.costoFinal;
	}

	@Override
	double calcularPrecioConIVA(Producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
