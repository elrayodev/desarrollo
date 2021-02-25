package com.mayab.desarrollo.comportamiento.strategy;

public class Driver {
	
	public static void main (String[] args) {
		
		ExportBehavoir json = new ExportJson();
		ExportBehavoir pdf = new ExportPdf();
		ExportBehavoir xml = new ExportXml();
		
		Articulo a1 = new Articulo("Cereal");
		Articulo a2 = new Articulo("Leche");
		Articulo a3 = new Articulo("Platano");
		
		Reporte reporteVentas = new ReporteVentas();
		reporteVentas.agregarArticulo(a1);
		reporteVentas.agregarArticulo(a2);
		reporteVentas.exportar();
		reporteVentas.setExportBehavoir(pdf);
		reporteVentas.exportar();
		
		Reporte reporteInventario = new ReporteInventario();
		reporteInventario.agregarArticulo(a2);
		reporteInventario.agregarArticulo(a3);
		reporteInventario.exportar();
		reporteInventario.setExportBehavoir(json);
		reporteInventario.exportar();
		
	}

}
