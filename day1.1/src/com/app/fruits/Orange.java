package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		super("Orange", "Orange", 300.00);
	}

	public Orange(String name, String color, double weight) {

		super.setName(name);
		super.setColor(color);
		super.setWeight(weight);

	}

	@Override
	public String taste() {
		return "sour" ;
	}

	public void juice() {
		System.out.println(super.getName() + " extracting juice!  ");
	}
}
