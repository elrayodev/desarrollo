package com.mayab.desarrollo.patrones.comportamiento.strategy;

public class MallardDuck extends Duck{
	
	public void MallarDuck() {
		quackBehavoir = new Quack();
		flyBehavoir = new FlyWithWings();
		
	}

	@Override
	public void display() {
		
		System.out.println("I'm a mdrfkr MallarDuck");
		
	}

}
