package com.mayab.desarollo.patrones.creacion.abstractfactory;

public class MueblesOchenterosFactory implements MueblesAbstractFactory {

	public Silla createSilla() {
		return new SillaOchentera();
	}

	public Sofa createSofa() {
		return new SofaOchentero();
	}

	public Mesa createMesa() {
		return new MesaOchentera();
	}

}
