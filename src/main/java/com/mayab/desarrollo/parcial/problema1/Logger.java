package com.mayab.desarrollo.parcial.problema1;

import java.util.ArrayList;

public class Logger implements Observer {
	
	String accion;
	String mensaje;
	
	public Logger() {
		this.mensaje = "";
		this.accion = "";
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
	
	public void setAccion(String accion) {
		this.accion = accion;
	}

	public void update(String producto, double importe, String mensaje, String envioStatus) {

		System.out.println("-----Logger-----\n"
				+ nombre + ", " + tipo + " ha sigo avisado la siguiente transaccion" 
				+ "\nProducto: " + producto
				+ "\nImporte: " + importe
				+ "\nMensaje: " + mensaje
				+ "\nEnvio Estatus: " + envioStatus);
		
	}
	



}
