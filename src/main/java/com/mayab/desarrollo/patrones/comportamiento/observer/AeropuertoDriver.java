package com.mayab.desarrollo.patrones.comportamiento.observer;

public class AeropuertoDriver {
	
	public static void main(String[] args) {
		
		Vuelo vuelo = new Vuelo("CUN-MID", "16:30", "Sala 2", "12/12/12");
		Pasajero p1 = new Pasajero("Eloy", vuelo);
		Pasajero p2 = new Pasajero("Lesli", vuelo);
		Crew c1 = new Crew();
		//Crew c2 = new Crew();
		Aeropuerto a = new Aeropuerto();
	
		vuelo.registerObserver(p1);
		//vuelo.registerObserver(p2);
		vuelo.registerObserver(c1);
		//vuelo.registerObserver(c2);
		vuelo.registerObserver(a);
		vuelo.setStatus("Vuelo A Tiempo");
		vuelo.setStatus("Vuelo Retrasado");
		vuelo.setStatus("Vuelo Cancelado");
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
	
	

}
