package com.mayab.desarrollo.patrones.factorymethod;

public class TrianguleEquilatero extends Triangle {

	public TrianguleEquilatero() {
		this.name = "equilatero";
		this.lado1 = 10;
		this.lado2 = 10;
		this.base = 10;
	}
		
	@Override
	public double calcularArea() {
		
		//System.out.println("... Calculando Area de Triangulo " + this.getName());
		this.area = (Math.sqrt(3)* Math.pow(base, 2))/4;
		//System.out.println("Area: " + this.area);
		return area;
		
	}

	@Override
	public double calcularPerimetro() {
	
		//System.out.println("... Calculando Perímetro de Triangulo " + this.getName());
		this.perimetro = lado1+lado2+base;
		//System.out.println("Perimetro: " + this.perimetro);
		return perimetro;
		
	}


}
