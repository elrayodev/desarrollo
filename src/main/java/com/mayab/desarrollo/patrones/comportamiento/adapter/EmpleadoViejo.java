package com.mayab.desarrollo.patrones.comportamiento.adapter;

//Clase concreta para interfaz vieja
public class EmpleadoViejo implements IPersonaVieja{
	
	private String nombre;
	private String apellido;
	private String fechaNacimiento;

	public EmpleadoViejo(String nombre, String apellido, String fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getName() {
		return this.nombre;
	}

	public String getLastName() {
		return this.apellido;
	}

	public String getBirthDate() {
		return this.fechaNacimiento;
	}

}
