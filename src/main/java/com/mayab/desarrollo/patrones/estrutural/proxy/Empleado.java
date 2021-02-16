package com.mayab.desarrollo.patrones.estrutural.proxy;

public class Empleado {
	
	protected String tipo;
	
	public Empleado(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
}
