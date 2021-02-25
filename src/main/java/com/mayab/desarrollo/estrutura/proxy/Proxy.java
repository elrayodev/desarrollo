package com.mayab.desarrollo.estrutural.proxy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Proxy implements IReporte {
	
	private Empleado e;
	private ReporteVentas reporte;
	
	public Proxy(Empleado e) {
		this.e = e;
	}

	public void escribir(String data) throws IOException {
		
		if(reporte==null) {
			reporte = new ReporteVentas();
		}
		
		if(e.getTipo() == "Administrador") {
			System.out.println("\n---Administrador no puede escribir en el archivo---\n");
		}else if(e.getTipo() == "Vendedor") {
			System.out.println("\n---Ventas escribiendo en archivo---\n");
			reporte.escribir(data);
		}
		
	}

	public void leer() throws IOException {
		
		System.out.println("\n---" + e.getTipo() + " esta leyendo el archivo---\n");
		reporte.leer();
		System.out.println("\n");

	}

}
