package com.mayab.desarrollo.patrones.creacion.factorymethod;

public class TriangleCreator {
	
	public Triangle createTriangle(String name) {
		Triangle t;
		if(name.equals("escaleno")) {
			t = new TrianguleEscaleno();
		} else if(name.equals("isosceles")) {
			t = new TriangleIsosceles();
		} else if(name.equals("equilatero")) {
			t = new TrianguleEquilatero();
		} else { 
			System.out.println("Triangulo Invalido");
			return null;
		}
		
		return t;
	}

	
}
