package com.mayab.desarrollo.patrones.singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonSchedule {
	
	private HashMap<String, String> schedule = new HashMap<String, String>();
	
	private static SingletonSchedule instance;
	
	private SingletonSchedule() {
		
	}
	
	public static SingletonSchedule getInstance() {
		if(instance == null){
			instance = new SingletonSchedule();
		}
		return instance;
	}
	
	// Agregamos al horario del profesor una clase
	public void agregarClaseHorario(String hora, String clase) {
		
		if(schedule.containsKey(hora)) {
			System.out.println("Horario ocupado");
		}else {
			schedule.put(hora, clase);
		}
		
	}
	
	public void print() {

		for (Map.Entry me : schedule.entrySet()) {
			System.out.println("Hora: " + me.getKey() + ", Clase: " + me.getValue());
		}
		
	}
	

}
