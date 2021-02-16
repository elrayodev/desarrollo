package com.mayab.desarrollo.patrones.comportamiento.adapter;

import java.util.ArrayList;

public class Driver {
	
	public static void main(String[] args) {
		
		ArrayList<IPersonaNueva> empleados = new ArrayList<IPersonaNueva>();
		
		EmpleadoNuevo empleadoN = new EmpleadoNuevo("Jimena Hernandez",25);
		EmpleadoViejo empleadoV = new EmpleadoViejo("Eloy","Jimenez","09-03-1996");
		EmpleadoViejo empleadoV1 = new EmpleadoViejo("Ramiro", "Cicero", "09-02-1996");
		PersonaViejaANuevaAdapter adapterViejoANuevo = new PersonaViejaANuevaAdapter(empleadoV);
		PersonaViejaANuevaAdapter adapterViejoANuevo1 = new PersonaViejaANuevaAdapter(empleadoV1);
		
		empleados.add(empleadoN);
		empleados.add(adapterViejoANuevo);
		empleados.add(adapterViejoANuevo1);
		
		for(int i = 0; i<empleados.size(); i++) {
			System.out.println(empleados.get(i));
			System.out.println("------------");
		}
		
	
	}

}
