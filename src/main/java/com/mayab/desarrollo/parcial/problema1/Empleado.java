package com.mayab.desarrollo.parcial.problema1;


public class Empleado implements Observer{
	
	private String nombre;
	private String tipo;
	private String envioStatus;
	private Service service;

	public Empleado(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.envioStatus = "Activo";
		
	}
	
	public void setServicio(Service s) {
		this.service = s;
	}
	
	public Service getServicio() {
		return this.service;
	}
	
	public String getStatusServicio() {
		return this.envioStatus;
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
