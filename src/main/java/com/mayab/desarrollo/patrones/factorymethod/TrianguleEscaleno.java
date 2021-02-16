package com.mayab.desarrollo.patrones.factorymethod;

public class TrianguleEscaleno extends Triangle {
	
	public TrianguleEscaleno() {
		this.name = "escaleno";
		this.lado1 = 6;
		this.lado2 = 8;
		this.base = 10;
	}
	
	public double calcularAltura() {
		double altura;
		altura = (lado1 * lado2)/base;
		return altura;
	}
	
	@Override
	public double calcularArea() {
		
		double h = calcularAltura();

		//System.out.println("... Calculando Area de Triangulo " + this.getName());
		this.area = (base*h)/2;
		//System.out.println("Area: " + area);
		return this.area;
		
	}

	@Override
	public double calcularPerimetro() {
	
		//System.out.println("... Calculando Perímetro de Triangulo " + this.getName());
		this.perimetro = lado1+lado2+base;
		//System.out.println("Perimetro: " + perimetro);
		return this.perimetro;
		
	}
	
}
