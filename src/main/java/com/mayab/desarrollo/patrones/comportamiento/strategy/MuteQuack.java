package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class MuteQuack implements QuackBehavoir{

	public void performQuack() {
		
		System.out.println("<<Silence>>");
		
	}

}
