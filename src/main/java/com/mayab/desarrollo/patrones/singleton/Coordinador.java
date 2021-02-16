package com.mayab.desarrollo.patrones.singleton;

public class Coordinador {
	
	String nombre;
	String escuela;
	
	public Coordinador(String nombre, String escuela) {
		this.nombre = nombre;
		this.escuela = escuela;
	}
	
	// Agregamos clase al profesor
	public void agregarClaseProfesor(String hora, String nombre) {
		SingletonSchedule.getInstance().agregarClaseHorario(hora, nombre);
	}

}
