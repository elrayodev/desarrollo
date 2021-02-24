package com.mayab.desarrollo.parcial.problema1;

import java.util.ArrayList;

public class Compra implements Subject {
	
	static final double importemax = 5000;
	double importe;
	String producto;
	Empleado e;
	String mensaje;
	String envioStatus;
	
	ArrayList<Observer> obs = new ArrayList<Observer>();
	
	public Compra(String producto, double importe, Empleado e) {
		this.producto = producto;
		this.importe = importe;
		this.e = e;
		this.envioStatus = e.getStatusServicio();
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
		notifyObservers();
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
	
	public void registerObserver(Observer o) {

		if(!obs.contains(o)) {
			obs.add(o);
			System.out.println("Subject added successfully to observers list (Compras)");
		}else {
			System.out.println("Subject is not in observers list");
		}
		
	}

	public void removeObserver(Observer o) {

		if(obs.contains(o)) {
			obs.remove(o);
			System.out.println("Subject removed successfully from observers list (Compras)");
		}else {
			System.out.println("Subject is not in observers list");
		}
		
	}

	public void notifyObservers() {

		for(Observer subjects : obs) {
			subjects.update(producto, importe, mensaje, envioStatus);
		}
		
	}

}
