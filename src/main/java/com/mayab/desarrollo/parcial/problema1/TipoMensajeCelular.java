package com.mayab.desarrollo.parcial.problema1;

public class TipoMensajeCelular extends Service {
	
	private Logger l;
	
	public TipoMensajeCelular(Logger l) {
		this.tipo = "Celular";
		this.l = l;
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
