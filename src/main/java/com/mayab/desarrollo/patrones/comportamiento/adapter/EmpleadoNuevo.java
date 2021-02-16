package com.mayab.desarrollo.patrones.comportamiento.adapter;

//Clase concreta que implementa nueva interfaz
public class EmpleadoNuevo implements IPersonaNueva{
	
	private String nombre;
	private int edad;
	
	public EmpleadoNuevo(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getName() {
		return this.nombre;
	}

	public int getEdad() {
		return this.edad;
	}
	
	public String toString() {
		return "Nombre Empleado: " + getName()
				+ "\nEdad: " + getEdad();
	}

}
