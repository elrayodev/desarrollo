package com.mayab.desarrollo.parcial.problema1;

public abstract class Service {
	
	protected String tipo;
	protected boolean pausarEnvios =  false;
	protected String msg;
	protected String statusEnvios;
	
	public Service() {
		
	}
	
	
	public String getStatus() {
		if(pausarEnvios) {
			this.statusEnvios = "Servicio suspendido";
		}else {
			this.statusEnvios = "Servicio activo";
		}
		
		return statusEnvios;
	}
	
	abstract void pausarEnvios(boolean p);

}
