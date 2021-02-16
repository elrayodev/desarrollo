package com.mayab.desarrollo.patrones.comportamiento.adapter;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

// Clase que adapta las personas anteriormente registradas con el sistema viejo
// que las disfraza con el nuevo formado de IPersonaNueva para que sea compatible con
// el nuevo sistema a implementar
public class PersonaViejaANuevaAdapter implements IPersonaNueva {
	
	// Instanciamos interfaz concreta para adaptar al nuevo sistema
	IPersonaVieja empleadoV;
	
	// Construimos el adaptador
	public PersonaViejaANuevaAdapter(IPersonaVieja empleadoV) {
		this.empleadoV = empleadoV;
	}

	// Calculamos edad de viejos empleados, ya que en el nuevo sistema no existe un atributo edad
	// pero en nuestro anterior sistema teniamos la fecha de nacimiento, por lo tanto calculamos la edad del empleado viejo
	// para adaptarlo a nuestro nuevo sistema
	private int calcularEdad(String fechaNacimiento) {
		int edad = 0;
		
		// Separamos string de fecha de nacimiento
		String cumple = fechaNacimiento;
		String[] parts = cumple.split("-");
		int dia = Integer.parseInt(parts[0]);
		int mes = Integer.parseInt(parts[1]);
		int anio = Integer.parseInt(parts[2]);
		
		// Separamos string de fecha actual
		Date fechaActual = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String fecha = dateFormat.format(fechaActual);
		String[] partsFecha = fecha.split("/");
		int diaActual = Integer.parseInt(partsFecha[0]);
		int mesActual = Integer.parseInt(partsFecha[1]);
		int anioActual = Integer.parseInt(partsFecha[2]);

		//System.out.println(dia + "/" + mes + "/" + anio);
		//System.out.println(diaActual + "/" + mesActual + "/" + anioActual);
		
		if((mesActual >= mes) && (diaActual >= dia)) {
			edad = anioActual - anio;
		}else {
			edad = anioActual - anio - 1;
		}
		
		return edad;
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return empleadoV.getName() + " " + empleadoV.getLastName();
	}

	public int getEdad() {
		String fechaNacimiento = empleadoV.getBirthDate();
		int edad = calcularEdad(fechaNacimiento);
		return edad;
	}
	
	public String toString() {
		return "Nombre Empleado: " + getName()
				+ "\nEdad: " + getEdad();
	}
	
}
