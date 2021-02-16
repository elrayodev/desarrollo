package com.mayab.desarrollo.patrones.comportamiento.observer;

public class Pasajero implements Observer {
	
	String nombre;
	Vuelo vuelo;
	
	public Pasajero(String nombre, Vuelo vuelo) {
		this.nombre = nombre;
		this.vuelo = vuelo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void update(String fromto, String diaVuelo, String horaVuelo, String salaVuelo, String status) {
		System.out.println("-----Datos de vuelo pasajero-----"
							+ "\nVuelo: " + fromto
							+ "\nDia: " + diaVuelo
							+ "\nHora: " + horaVuelo
							+ "\nSala: " +  salaVuelo
							+ "\nStatus: " + status + "\n");
	}
	
	public String toString() {
		return "-----Estatus actual del vuelo del pasajero-----"
				+"\nPasajero: " + getNombre()
				+ "\nVuelo: " + vuelo.getFromTo()
				+ "\nDia: " + vuelo.getDiaVuelo()
				+ "\nHora: " + vuelo.getHoraVuelo()
				+ "\nSala: " +  vuelo.getSalaVuelo()
				+ "\nStatus: " + vuelo.getStatus();
		
	}

}
