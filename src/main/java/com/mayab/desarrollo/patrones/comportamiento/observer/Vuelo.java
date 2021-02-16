package com.mayab.desarrollo.patrones.comportamiento.observer;

import java.util.ArrayList;

public class Vuelo implements Subject {

	static final String vuelo_atiempo = "Vuelo A Tiempo";
	static final String vuelo_retrasado = "Vuelo Retrasado";
	static final String vuelo_cancelado = "Vuelo Cancelado";
	
	private String horaVuelo;
	private String salaVuelo;
	private String fromto;
	private String diaVuelo;
	private String status;
	
	ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public Vuelo (String f, String h, String s, String d) {
		this.fromto = f;
		this.setHoraVuelo(h);
		this.setSalaVuelo(s);
		this.setDiaVuelo(d);
	}
	
	public void fromto(String fromto) {
		this.fromto = fromto;
	}
	
	public String getFromTo() {
		return fromto;
	}
	
	public void setHoraVuelo(String horaVuelo) {
		this.horaVuelo = horaVuelo;
		notifyObservers();
	}
	
	public String getHoraVuelo() {
		return horaVuelo;
	}

	public void setSalaVuelo(String salaVuelo) {
		this.salaVuelo = salaVuelo;
		notifyObservers();
	}
	
	public String getSalaVuelo() {
		return salaVuelo;
	}

	public void setDiaVuelo(String diaVuelo) {
		this.diaVuelo = diaVuelo;
		notifyObservers();
	}

	public String getDiaVuelo() {
		return diaVuelo;
	}
	
	public void setStatus(String status) {
		if(status == vuelo_atiempo) {
			this.status = vuelo_atiempo;
		}else if(status == vuelo_retrasado) {
			this.status = vuelo_retrasado;
		}else {
			this.status = vuelo_cancelado;
		}
		notifyObservers();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void registerObserver(Observer o) {
		if(!observers.contains(o)) {
			observers.add(o);
		}
	}

	public void removeObserver(Observer o) {
		if(observers.contains(o)) {
			observers.remove(o);
		}
	}

	public void notifyObservers() {
		
		for(Observer subjects : observers) {
			subjects.update(fromto, diaVuelo, horaVuelo, salaVuelo, status);
		}
		
	}

}
