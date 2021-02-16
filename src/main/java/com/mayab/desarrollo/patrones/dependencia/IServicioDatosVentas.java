package com.mayab.desarrollo.patrones.dependencia;

import java.util.List;

public interface IServicioDatosVentas {
	
	public List<Venta> getAllVentas();
	public List<Venta> getVentasByEmpleado(Empleado e);
	public void addVenta();
	
}
