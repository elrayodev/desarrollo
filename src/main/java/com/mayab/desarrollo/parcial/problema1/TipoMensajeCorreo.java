package com.mayab.desarrollo.parcial.problema1;

public class TipoMensajeCorreo extends Service {
	
	private Logger l;
	
	public TipoMensajeCorreo() {
		this.tipo = "Correo";
	}


	@Override
	void pausarEnvios(boolean p) {

		if(p) {
			l.setAccion("Servicio de notificacion por celular detenido");
		}else {
			l.setAccion("Servicio de notificacion por celular reanudado");
		}
		
	}

}
