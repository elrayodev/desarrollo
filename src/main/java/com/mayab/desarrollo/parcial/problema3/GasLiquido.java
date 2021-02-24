package com.mayab.desarrollo.parcial.problema3;

import java.util.Scanner;

public class GasLiquido extends GasProcess {
	
	Scanner sc = new Scanner(System.in);
	
	private float nivelMpInicial, nivelMpFinal;
	private String fecha;
	private int cantidad;
	private float consumoM;

	@Override
	void registrarParametrosInicialesLote() {
		
		System.out.println("PREPARANDO LOTE DE GAS LIQUIDO");
		System.out.println("Nivel MP inicial: ");
		nivelMpInicial = sc.nextFloat();
		
	}

	@Override
	void registrarParametrosFinalesLote() {
		
		System.out.println("Nivel MP final: ");
		nivelMpFinal = sc.nextFloat();
		
	}

	@Override
	void calcularVolGas() {
		
		consumoM = nivelMpInicial - nivelMpFinal;
		System.out.println("MPinicial - MPfinal: " + consumoM);
		
	}

	@Override
	void inspeccionar() {

		System.out.println("Inspección Menos Riguroza, Checklist Proporcionado por Gerente de Seguridad");
		
	}


}
