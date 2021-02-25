package com.mayab.desarrollo.comportamiento.strategy;

import java.util.ArrayList;

public abstract class Reporte {

	ArrayList<Articulo> articulos;
	ExportBehavoir behavoir;

	public Reporte() {
		articulos = new ArrayList<Articulo>();
	}

	public void exportar() {
		behavoir.performExport();
		for (Articulo a : articulos) {
			System.out.println(a.getNombre());
		}
	}

	public void setExportBehavoir(ExportBehavoir b) {
		this.behavoir = b;
	}

	public void agregarArticulo(Articulo a) {
		articulos.add(a);
	}

}
