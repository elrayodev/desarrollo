package com.mayab.desarrollo.comportamiento.observer;


public class Aeropuerto implements Observer {

	public void update(String fromto, String diaVuelo, String horaVuelo, String salaVuelo, String status) {
		
		System.out.println("-----Estatus actual del vuelo aeropuerto-----"
							+ "\nVuelo: " + fromto
							+ "\nDia: " + diaVuelo
							+ "\nHora: " + horaVuelo
							+ "\nSala: " +  salaVuelo
							+ "\nStatus: " + status + "\n");
	}

}
