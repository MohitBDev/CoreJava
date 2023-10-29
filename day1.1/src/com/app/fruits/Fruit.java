package com.app.fruits;

public abstract class Fruit {
	
  private String color,name;
  private double weight;
  private boolean fresh;
   
  
  public Fruit() {
	  this.name="no name";
	  this.color="no colour";
	  this.weight=0.00;
	  this.fresh=true;
	  
	  
  }
  public Fruit(String name,String color,double weight) {
	  
	  this.name=name;
	  this.color=color;
	  this.weight=weight;
	  this.fresh=true;
	  
	  
	  
  }
  
  public abstract String taste() ;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public boolean isFresh() {
	return fresh;
}
public void setFresh(boolean fresh) {
	this.fresh = fresh;
}
@Override
public String toString() {
	return "Fruit [color=" + color + ", name=" + name + ", weight=" + weight +"gm" +", fresh=" + fresh + "]";
}
  
  
  

}
