package com.mayab.desarrollo.parcial.problema3;

import java.util.Scanner;

public abstract class GasProcess {
	
	Scanner sc = new Scanner(System.in);
	
	private String fecha;
	private int cantidad;
	private float consumoM;
	protected float nivelMpInicial, nivelMpFinal;
	
	static int lote = 15;
	
	final void prepararLote() {
		registrarParametrosInicialesLote();
		registrarParametrosFinalesLote();
		calcularVolGas();
		inspeccionar();
		imprimirLlenado();
	}
	
	abstract void registrarParametrosInicialesLote();
	abstract void registrarParametrosFinalesLote();
	abstract void calcularVolGas();
	abstract void inspeccionar();
	void imprimirLlenado() {
		
		System.out.println("Fecha: ");
		fecha = sc.next();
		System.out.println("Candiad Envasada: ");
		cantidad = sc.nextInt();
		consumoM = this.nivelMpInicial - this.nivelMpFinal;
		System.out.println("Consumo Materia Prima: " + consumoM);

		
		System.out.println("\n-----Reporte-----"
						+ "\nFecha Reporte: " + fecha
						+ "\nTanques Envasados: " + cantidad
						+ "\nConsumo de Materia Prima: " + consumoM + "\n");
		
	}
	
	

}
