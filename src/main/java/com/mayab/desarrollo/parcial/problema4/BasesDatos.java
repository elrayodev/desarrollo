package com.mayab.desarrollo.parcial.problema4;

public abstract class BasesDatos {
	
	String nombre;
	BDBehavoir BDBehavoir;
	
	public BasesDatos() {
	}
	
	public void setBDStrategy(BDBehavoir behavoir){
		System.out.println("Query modificado en tiempo de ejecución");
		BDBehavoir = behavoir;
	}
	
	public void abrirConexion() {
		System.out.println("Abriendo conexión");
	}
	
	public void ejecutarSentencia() {
		System.out.println("Ejecutar sentencia\n");
	}
	
	public void performSentencia() {
		BDBehavoir.crearSentencia();
	}

}
