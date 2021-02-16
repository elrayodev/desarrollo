package com.mayab.desarrollo.patrones.dependencia;

public class Empleado {
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	private String nombre;
	private String tipo;
	
	public Empleado(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

}
