package com.mayab.desarrollo.comportamiento.strategy;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		
		quackBehavoir = new FakeQuack();
		flyBehavoir = new FlyNoWay();
		
	}

	@Override
	public void display() {

		System.out.println("I'm a fake Duck, a RubberDucky");
		
	}

}
