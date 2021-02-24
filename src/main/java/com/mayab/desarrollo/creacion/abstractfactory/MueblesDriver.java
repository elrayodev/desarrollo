package com.mayab.desarollo.creacion.abstractfactory;

public class MueblesDriver {
	
	public static void main (String[] args) {
		
		MueblesStore tienda = new MueblesStore();
		
		System.out.println("----- Sala Victoriana -----");
		tienda.crearSala("Victoriana");
		tienda.entregarSala();
		System.out.println("----- Sala Ochentera -----");
		tienda.crearSala("Ochentera");
		tienda.entregarSala();
		System.out.println("----- Sala Moderna -----");
		tienda.crearSala("Moderna");
		tienda.entregarSala();
		
		System.out.println(tienda);
		
	}
	

}
