package com.mayab.desarrollo.patrones.dependencia;

public class Venta {
	
	private String producto;
	private float monto;
	private Empleado e;
	
	
	
	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



	public float getMonto() {
		return monto;
	}



	public void setMonto(float monto) {
		this.monto = monto;
	}



	public Empleado getE() {
		return e;
	}



	public void setE(Empleado e) {
		this.e = e;
	}



	public Venta(String producto, float monto, Empleado e) {
		this.producto = producto;
		this.monto = monto;
		this.e = e;
	}

}
