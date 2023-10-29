package com.app.fruits;

public class Apple extends Fruit {
	
	public Apple() {
		super("Apple","red",400.00);
	}
	
	public Apple(String name,String color,double weight) {
		  
		  super.setName(name);
		  super.setColor(color);
		  super.setWeight(weight);
		  
		  
		  
	  }
	
	@Override
	public  String taste() {
		return "sweet n sour";
	  }
	public void jam() {
		System.out.println(this.getName()+ " Making  Jam !");
		
	}

}
