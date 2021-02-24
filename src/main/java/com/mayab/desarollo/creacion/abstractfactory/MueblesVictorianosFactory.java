package com.mayab.desarollo.creacion.abstractfactory;

public class MueblesVictorianosFactory implements MueblesAbstractFactory {

	public Silla createSilla() {
		return new SillaVictoriana();
	}

	public Sofa createSofa() {
		return new SofaVictoriano();
	}

	public Mesa createMesa() {
		return new MesaVictoriana();
	}

}
