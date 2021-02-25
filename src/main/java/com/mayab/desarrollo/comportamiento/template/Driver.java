package com.mayab.desarrollo.comportamiento.template;

public class Driver {
	
	public static void main (String[] args) {
		
		ProcesarArchivo archivoExcel = new ProcesarExcel();
		ProcesarArchivo archivoJson = new ProcesarJson();
		
		archivoExcel.procesarArchivo();
		archivoJson.procesarArchivo();
		
	}

}
