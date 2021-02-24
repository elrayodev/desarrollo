package com.mayab.desarrollo.comportamiento.strategy;

public abstract class Duck {

	FlyBehavoir flyBehavoir;
	QuackBehavoir quackBehavoir;
	
	public Duck() {
		
	}
	
	public void setFlyBehaoir(FlyBehavoir fb) {
		flyBehavoir = fb;
	}
	
	public void setQuackBehavoir(QuackBehavoir qb) {
		quackBehavoir = qb;
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavoir.performFly();
	}
	
	public void performQuack() {
		quackBehavoir.performQuack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
