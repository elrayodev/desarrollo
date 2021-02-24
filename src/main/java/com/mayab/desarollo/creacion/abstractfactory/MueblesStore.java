package com.mayab.desarollo.creacion.abstractfactory;

public class MueblesStore {
	
	MueblesAbstractFactory factory;
	Mesa mesa;
	Silla silla;
	Sofa sofa;
	
	void crearSala(String tipo) {
		if(tipo == "Moderna") {
			factory = new MueblesModernosFactory();
		} else if (tipo == "Ochentera") {
			factory = new MueblesOchenterosFactory();
		} else if (tipo == "Victoriana") {
			factory = new MueblesVictorianosFactory();
		}
		mesa = factory.createMesa();
		silla = factory.createSilla();
		sofa = factory.createSofa();
	}
	
	void entregarSala() {
		System.out.println("Mesa: " + mesa.getType()
							+ "\nSilla: " + silla.getType()
							+ "\nSofa: " + sofa.getType());
	}
	
}
