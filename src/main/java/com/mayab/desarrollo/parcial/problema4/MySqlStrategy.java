package com.mayab.desarrollo.parcial.problema4;

public class MySqlStrategy extends BasesDatos {


	String nombre = "MySql";
	
	public MySqlStrategy() {
		BDBehavoir = new BDAStrategy();
	}
	
	public String toString() {
		return "Se esta ejecutando: " + nombre;
	}
	
}
