package com.mayab.desarrollo.parcial.problema2;

import java.util.ArrayList;

public class Driver {

	public static void main( String[] args ){
		
		Producto p1 = new Producto("Tijeras", 2.6);
		Producto p2 = new Producto("Borrador", 4.6);
		Producto p3 = new Producto("Libreta", 10.5);
			
		CiudadFronteriza chetumal = new CiudadFronteriza(p1);
		CiudadNoFronteriza merida = new CiudadNoFronteriza(p1);
		
		CiudadFronteriza cancun = new CiudadFronteriza(p2);
		CiudadNoFronteriza campeche = new CiudadNoFronteriza(p2);
		
	
		System.out.println(chetumal);
		chetumal.calcularPrecioConIVA(p1);
		System.out.println(chetumal);
		chetumal.agregarDescuento();
		System.out.println(chetumal);
		chetumal.agregarNuevoImpuesto();
		System.out.println(chetumal);		

		
		System.out.println(merida);
		merida.calcularPrecioConIVA(p1);
		System.out.println(merida);
		merida.agregarDescuento();
		System.out.println(merida);
		
		System.out.println(cancun);
		cancun.calcularPrecioConIVA(p2);
		System.out.println(cancun);
		cancun.agregarDescuento();
		System.out.println(cancun);
		cancun.agregarNuevoImpuesto();
		System.out.println(chetumal);		

		
		System.out.println(campeche);
		campeche.calcularPrecioConIVA(p2);
		System.out.println(campeche);
		campeche.agregarDescuento();
		System.out.println(campeche);
	
	}

}

