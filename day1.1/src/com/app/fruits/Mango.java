package com.app.fruits;

public class Mango extends Fruit {
	
	public Mango () {
		super("Mango","Yellow",200.00);
	}
	public Mango(String name,String color,double weight) {
		  
		  super.setName(name);
		  super.setColor(color);
		  super.setWeight(weight);
		  super.setFresh(true);
		  
		  
	  }
	
	
	
	
	@Override
	public  String taste() {
		  return "sweet";
	  }
	public void pulp() {
		System.out.println(super.getName()+"Creating Pulp !");
	}

}
