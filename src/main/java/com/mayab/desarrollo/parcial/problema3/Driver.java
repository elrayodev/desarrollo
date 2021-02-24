package com.mayab.desarrollo.parcial.problema3;

public class Driver {
	
	public static void main( String[] args ){
		
		GasProcess gasAltaPresion = new GasAltaPresion();
		GasProcess gasLiquido = new GasLiquido();
		GasProcess gasAcetileno = new GasAcetileno();
		
		gasAltaPresion.prepararLote();
		gasLiquido.prepararLote();
		gasAcetileno.prepararLote();
		
	}

}
