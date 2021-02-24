package com.mayab.desarrollo.parcial.problema3;

import java.util.Scanner;

public class GasAcetileno extends GasProcess{

	Scanner sc = new Scanner(System.in);

	private float nivelMpInicial, nivelMpFinal;
	private int cantidadInicialTambores, cantidadFinalTambores;
	private String fecha;
	private int cantidad;
	private float consumoM;
	
	@Override
	void registrarParametrosInicialesLote() {
		
		System.out.println("PREPARANDO LOTE DE GAS ACETILENO");
		System.out.println("Cantidad Inicial de Tambores: ");
		cantidadInicialTambores = sc.nextInt();
		System.out.println("Nivel MP inicial: ");
		nivelMpInicial = sc.nextFloat();
		
	}

	@Override
	void registrarParametrosFinalesLote() {
		System.out.println("Cantidad Final de Tambores: ");
		cantidadFinalTambores = sc.nextInt();
		System.out.println("Nivel MP final: ");
		nivelMpFinal = sc.nextFloat();
		
	}

	@Override
	void calcularVolGas() {

		System.out.println("El Volumen se Calcula Mediante Fórmula Especial Que Incluye"
						+ " el Consumo de Materia Prima. Fórumla Proporcionada por Gerente de Producción");
		
	}

	@Override
	void inspeccionar() {

		System.out.println("Inspección Rigurosa, Checklist Proporcionado por Gerente de Seguridad");
		
	}
	
}
