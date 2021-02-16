package com.mayab.desarrollo.patrones.dependencia;

import java.util.ArrayList;
import java.util.List;

public class ServicioDatosVentas implements IServicioDatosVentas{
	
	List<Venta> allVentas = new ArrayList<Venta>();
	public ServicioDatosVentas() {
		allVentas.clear();
	}

	public List<Venta> getAllVentas() {
		return allVentas;
	}

	public List<Venta> getVentasByEmpleado(Empleado e) {
		List<Venta> ventasEmpleado = new ArrayList<Venta>();
		for (Venta ventaEmpleado : allVentas ) {
			if(ventaEmpleado.getE().getNombre() == e.getNombre()) {
				ventasEmpleado.add(ventaEmpleado);
			}
		}
		return ventasEmpleado;
	}

	public void addVenta() {
		
		
	}

}
