package com.mayab.desarrollo.comportamiento.observer;

public class Crew implements Observer {
	
	public void update(String fromto, String diaVuelo, String horaVuelo, String salaVuelo, String status) {
		System.out.println("-----Estatus actual el vuelo del crew-----"
							+ "\nVuelo: " + fromto
							+ "\nDia: " + diaVuelo
							+ "\nHora: " + horaVuelo
							+ "\nSala: " +  salaVuelo
							+ "\nStatus: " + status + "\n");
	}

}
