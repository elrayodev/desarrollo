package com.mayab.desarollo.patrones.creacion.abstractfactory;

public class MueblesModernosFactory implements MueblesAbstractFactory {

	public Silla createSilla() {
		return new SillaModerna();
	}

	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new SofaModerno();
	}

	public Mesa createMesa() {
		// TODO Auto-generated method stub
		return new MesaModerna();
	}



	
	

}
