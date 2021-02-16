package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class RedHeadDuck extends Duck{
	
	public void ReadHeadDuck() {
		quackBehavoir = new MuteQuack();
		flyBehavoir = new FlyRocketPowered();
	}

	@Override
	public void display() {

		System.out.println("I'm a Red Head Mdrfkn Duck");
		
	}

}
