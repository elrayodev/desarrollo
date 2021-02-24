package com.mayab.desarrollo.parcial.problema2;

public class CiudadFronteriza extends Ciudad {
	
	final double descuentoTemporada = 0.1;
	final double otroImpuesto = 0.2;
	final double impuestoIva = 0.08;
	private double precioConNuevoImpuesto;

	public CiudadFronteriza(Producto p) {
		super(p);
	}

	
	@Override
	double calcularPrecioConIVA(Producto p) {

		this.costoFinal += p.getPrecioBase() * impuestoIva;
		System.out.println("Agregando iva a producto... Precio Actual: " + costoFinal );
		return precioConIva;
		
	}

	public double agregarDescuento() {
		
		this.precioConDescuento = p.getPrecioBase() * descuentoTemporada;
		this.costoFinal -=precioConDescuento;
		System.out.println("Agregando descuento... Precio Actual: " + costoFinal );
		return this.costoFinal;
				
	}


	public double agregarNuevoImpuesto() {

		this.precioConNuevoImpuesto = p.getPrecioBase() * otroImpuesto;
		this.costoFinal += precioConNuevoImpuesto;
		System.out.println("Agregando otro impuesto al producto... Precio Actual: " + costoFinal );
		return this.costoFinal;
		
	}
	
	public String toString() {
		return "-----COSTO EN CIUDAD FRONTERIZA-----"
				+ "\n\tImpuesto IVA: " + this.impuestoIva
				+ "\n\tProducto: " + this.p.getNombre()
				+ "\n\tCosto Base Producto: " + this.p.getPrecioBase()
				+ "\n\tCosto Final: " + this.costoFinal + "\n";
	}

}
