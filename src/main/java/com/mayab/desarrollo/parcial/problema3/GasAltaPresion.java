package com.mayab.desarrollo.parcial.problema3;

import java.util.Scanner;

public class GasAltaPresion extends GasProcess {
	
	Scanner sc = new Scanner(System.in);
	
	private boolean usoBomba;
	private float horasUso;
	private float nivelMpInicial, nivelMpFinal, tempEnvasesLlenados, presionEnvases;
	private String fecha;
	private int cantidad;
	private float consumoM;
	
	@Override
	void registrarParametrosInicialesLote() {
		
		System.out.println("PREPARANDO LOTE DE GAS ALTA PRESION");
		
		System.out.println("Uso de bomba: ");
		usoBomba =  sc.nextBoolean();
		System.out.println("Horas de uso: ");
		horasUso = sc.nextFloat();
		System.out.println("Nivel MP inicial: ");
		nivelMpInicial = sc.nextFloat();
		
	}

	@Override
	void registrarParametrosFinalesLote() {
		//for(int i = 0; i<lote; i++) {
			System.out.println("Temp Envases Llenados: ");
			tempEnvasesLlenados = sc.nextFloat();
			System.out.println("Presión final envases: ");
			presionEnvases = sc.nextFloat();
		//}
		System.out.println("Nivel MP final: ");
		nivelMpFinal = sc.nextFloat();
	}

	@Override
	void calcularVolGas() {
		
		System.out.println("Calculando Vol de Gas Con Formula Proporcionada por la Empresa");

	}

	@Override
	void inspeccionar() {
		System.out.println("Imprimiendo checklist");
	}
	
}
