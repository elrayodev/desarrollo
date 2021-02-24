package com.mayab.desarrollo.parcial.problema4;

public class OracleStrategy extends BasesDatos {

	String nombre = "Oracle";
	
	public OracleStrategy() {
		BDBehavoir = new BDBStrategy();
	}
	
	public String toString() {
		return "Se esta ejecutando: " + nombre;
	}

}
