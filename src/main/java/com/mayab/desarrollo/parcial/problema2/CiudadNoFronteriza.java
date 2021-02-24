package com.mayab.desarrollo.parcial.problema2;

public class CiudadNoFronteriza extends Ciudad {

	final double descuentoTemporada = 0.1;
	double impuestoIva = 0.16;

	
	public CiudadNoFronteriza(Producto p) {
		super(p);

	}


	@Override
	double calcularPrecioConIVA(Producto p) {

		this.costoFinal += p.getPrecioBase() * impuestoIva;
		System.out.println("Agregando iva a producto... Precio Actual: " + costoFinal );
		return this.costoFinal;
		
		
	}

	public double agregarDescuento() {
		
		this.precioConDescuento = p.getPrecioBase() * descuentoTemporada;
		this.costoFinal -=precioConDescuento;
		System.out.println("Agregando descuento... Precio Actual: " + costoFinal );
		return this.costoFinal;
	
	}
	
	public String toString() {
		return "-----COSTO EN CIUDAD NO FRONTERIZA-----"
				+ "\n\tImpuesto IVA: " + this.impuestoIva
				+ "\n\tProducto: " + this.p.getNombre()
				+ "\n\tCosto Base Producto: " + this.p.getPrecioBase()
				+ "\n\tCosto Final: " + this.costoFinal + "\n";
	}

}
