package com.app.tester;

import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basket Size :");
		int b = sc.nextInt();
		Fruit[] basket = new Fruit[b];
		int ch,a ,d,count = 0,index=0;
		System.out.println("  Basket ");
		System.out.println("1. Add Mango ");
		System.out.println("2. Add Orange ");
		System.out.println("3. Add Apple");
		System.out.println("4. Display ");
		System.out.println("5. Invoke taste ");
		System.out.println("6. Select Fruit Not Fresh ");
		System.out.println("7. Set Sour Fruits Not Fresh ");
		System.out.println("8. Invoke All Fruits  ");
		System.out.println("9. Exit ");
		

		do {

			System.out.println("Enter Choice :");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (count < basket.length) {

					basket[count++] = new Mango("Mango", "yellow", 400.00);

					System.out.println(" Mango Added " + count);
				} else {
					System.out.println("Basket Full");
				}

				break;
			case 2:
				if (count < basket.length) {

					basket[count++] = new Orange();

					System.out.println(" Orange Added " + count);

				} else {
					System.out.println("Basket Full");
				}
				break;
			case 3:
				if (count < basket.length) {

					basket[count++] = new Apple();

					System.out.println(" Apple Added " + count);
				} else {
					System.out.println("Basket Full");
				}
				break;
			case 4:
				for (Fruit f : basket) {
					if (f != null) {
                        System.out.print("Index :"+index+" ");
						System.out.println(f.getName());
						index++;
					}
				}

				break;
			case 5:
				for (Fruit f : basket) {
					if (f != null) {
System.out.println("Name :" + f.getName() + "Color :" + f.getColor() + "Weight :" + f.getWeight()+" Taste :"+f.taste());
						
					}
				}

				break;
			case 6: 
				do {
				System.out.println("Enter Index of Fruit Not Fresh");
				index=sc.nextInt();
				if(index<basket.length) {
				basket[index].setFresh(false);
				}
				else
				{
					System.out.println("Invalid Index ");
				}
				System.out.println("if done Enter 1 to exit  Any Number to continue ");
				 a=sc.nextInt();
				
				
				
			}while(a!=1);
				   
				break;
			case 7:
				for(int j=0;j<basket.length;j++) {
					
					if(basket[j].taste().equals("sour")) {
						
						basket[j].setFresh(false);
					}
					
				}
			
				break;
			case 8:
				do {
					System.out.println("Enter Index of Fruit :");
					index=sc.nextInt();
					if(index<basket.length) {
						if(basket[index] instanceof Mango) {
							((Mango)basket[index]).pulp();
						}
						else if(basket[index] instanceof Orange) {
							((Orange)basket[index]).juice();
						}
						else if(basket[index] instanceof Apple) {
							((Apple)basket[index]).jam();;
						}
					}else {
						System.out.println("Invalid Index");
					}
					System.out.println("if done Enter 1 to exit Any Number to continue ");
					 d=sc.nextInt();

					
					
					
					
					
				}while(d!=1);
				
				
				break;
			case 9:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid Option");
			}

		} while (ch != 9);

	}

}