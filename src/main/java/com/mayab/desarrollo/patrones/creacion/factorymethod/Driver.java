package com.mayab.desarrollo.patrones.creacion.factorymethod;

public class Driver {
	
	public static void main(String[] args) {
		
		TriangleCreator tCreator = new TriangleCreator();

		Triangle t1 = tCreator.createTriangle("equilatero");
		Triangle t2 = tCreator.createTriangle("isosceles");
		Triangle t3 = tCreator.createTriangle("escaleno");
		Triangle t4 = tCreator.createTriangle("mf");
		Triangle t5 = tCreator.createTriangle("escaleno");
		
		System.out.println(t1);
		System.out.println(t3);
		System.out.println(t2);
		System.out.println(t4);
		System.out.println(t5);
		
		if(t3.equals(t5)) {
			System.out.println("Yes, they're equals");
		}else {
			System.out.println("They're different objects");
		}
		
		System.out.println(t3.hashCode());
		System.out.println(t5.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t1.hashCode());


		
	}
	
}
