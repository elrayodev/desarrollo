package com.mayab.desarrollo.comportamiento.strategy;

public class ReporteInventario extends Reporte{
	
	public ReporteInventario() {
		behavoir = new ExportPdf();
	}
	
}
