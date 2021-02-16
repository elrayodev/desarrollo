package com.mayab.desarrollo.patrones.estrutural.proxy;
import java.io.IOException;

public class ClienteDriver {
	
	public static void main(String[] args) throws IOException{
		
		ReporteVentas reporte = new ReporteVentas();
		Empleado e1 = new Empleado("Administrador");
		Empleado e2 = new Empleado("Vendedor");
		Empleado e3 = new Empleado("Vendedor");
		Proxy p1 = new Proxy(e1);
		Proxy p2 = new Proxy(e2);
		Proxy p3 = new Proxy(e3);
		p1.escribir("Hey, soy administrador");
		p2.escribir("Hey, soy vendedor 1");
		p2.escribir(", solo los vendedores pueden escribir en el archivo.");
		p1.escribir("Dejame escribir");
		p3.escribir(" Vendendor 2 ha escrito en el documento");
		p1.leer();
		p2.leer();
		p3.leer();
		
		
		
	}

}
