package com.mayab.desarrollo.parcial.problema2;

public abstract class DescuentoImpuestoDecorator extends Ciudad{
	
	public DescuentoImpuestoDecorator(Producto p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	abstract double agregarDescuento();
	abstract double agregarNuevoImpuesto();

}
