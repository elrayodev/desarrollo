package com.mayab.desarrollo.parcial.problema1;

public class Driver 
{
    public static void main( String[] args )
    {
    	
    	//Declaramos pausa y reanudo de servicios
    	boolean desactivar = true;
    	boolean activar = false;
    	
    	// Creamos empleados
    	Empleado emp1 = new Empleado("Armando Eloy", "Comprador");
    	Empleado emp2 = new Empleado("Humberto Antonio", "Gerente");
    	
    	Compra comp1 = new Compra("Hielos", 400, emp1);
    	Compra comp2 = new Compra("Casa", 80000, emp1);
    	
    	Logger l = new Logger();
    	
    	// Creamos servicio para mandar notificaciones
    	TipoMensajeCelular servicioCelular = new TipoMensajeCelular(l);
    	TipoMensajeCorreo servicioCorreo = new TipoMensajeCorreo();
    	
    	// Creamos un registro de compra
    	RegistroCompra rc = new RegistroCompra();
    	
    	
    	// Seteamos tipo de servicio para notificaciones
    	emp1.setServicio(servicioCelular);
    	emp2.setServicio(servicioCorreo);
    	
    	comp1.registerObserver(l);
    	comp1.registerObserver(emp2);
    	comp2.registerObserver(emp2);
    	
    	rc.registrarCompra(comp1);
    	
    	emp2.setServicio(servicioCelular);
    	rc.registrarCompra(comp2);
    	
    	emp2.getServicio().pausarEnvios(desactivar);
    	rc.registrarCompra(comp1);

    }
}
