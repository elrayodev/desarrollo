package com.mayab.desarrollo.comportamiento.strategy;

public class ReporteVentas extends Reporte {
	
	public ReporteVentas() {
		behavoir = new ExportXml();
	}

}
