package com.mayab.desarrollo.comportamiento.template;

public abstract class ProcesarArchivo {
	
	final void procesarArchivo() {
		validar();
		abrir();
		leer();
		escribirBD();
	}
	
	abstract void validar();
	
	void abrir() {
		System.out.println("Abriendo archivo...");
	}
	
	abstract void leer();
	
	void escribirBD() {
		System.out.println("Escribiendo en BD...");
	}

}
