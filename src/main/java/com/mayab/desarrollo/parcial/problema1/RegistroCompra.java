package com.mayab.desarrollo.parcial.problema1;

public class RegistroCompra implements IRegistroCompra{
	
	Compra c;
	
	public RegistroCompra() {
	}
	
	public RegistroCompra(Compra c) {
		this.c = c;
	}

	public void registrarCompra(Compra c) {

		if(c.importe >= Compra.importemax) {
			c.setMensaje("La compra no ha sido realizada ya que el importe es mayor al máximo permitido de " + Compra.importemax);
		}else {
			c.setMensaje("La compra ha sido realizada");
		}
		
	}

}
