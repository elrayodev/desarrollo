package com.mayab.desarrollo.parcial.problema4;

public class MongoDBStrategy extends BasesDatos {

	String nombre = "Mongo DB";

	public MongoDBStrategy() {
		BDBehavoir = new BDBStrategy();
	}
	
	public String toString() {
		return "Se esta ejecutando: " + nombre;
	}

}
