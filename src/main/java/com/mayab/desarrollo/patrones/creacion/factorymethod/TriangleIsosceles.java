package com.mayab.desarrollo.patrones.creacion.factorymethod;

public class TriangleIsosceles extends Triangle {
	
	public TriangleIsosceles() {
		this.name = "isosceles";
		this.lado1 = 8;
		this.lado2 = 8;
		this.base = 4;
	}
	
	@Override
	public double calcularArea() {
		
		//System.out.println("... Calculando Area de Triangulo " + this.getName());
		double raiz = Math.sqrt(Math.pow(lado1,2)-(Math.pow(base,2)/4));
		this.area = (base * raiz)/2;
		//System.out.println("Area: " + area);
		return this.area;
		
	}

	@Override
	public double calcularPerimetro() {
	
		//System.out.println("... Calculando Perímetro de Triangulo " + this.getName());
		this.perimetro = lado1+lado2+base;
		//System.out.println("Perimetro: " + perimetro);
		return perimetro;
		
	}



	
	
}
