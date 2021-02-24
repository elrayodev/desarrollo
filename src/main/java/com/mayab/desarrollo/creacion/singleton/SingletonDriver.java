package com.mayab.desarrollo.creacion.singleton;

public class SingletonDriver {
	
	public static void main(String[] args) {
		
		Coordinador coor1 = new Coordinador("nombre1", "escuela1");
		Coordinador coor2= new Coordinador("nombre2", "escuela2");
		Coordinador coor3 = new Coordinador("nombre3", "escuela3");
		
		coor1.agregarClaseProfesor("lun4pm", "clase1");
		coor2.agregarClaseProfesor("lun5pm", "clase2");
		coor3.agregarClaseProfesor("lun4pm", "clase3");
		
		SingletonSchedule.getInstance().print();
		
	}

}
