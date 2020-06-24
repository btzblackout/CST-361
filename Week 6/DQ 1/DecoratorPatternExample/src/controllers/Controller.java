/*This class is just used to test the Decorator pattern*/

package controllers;

import interfaces.Food;
import beans.Hamburger;
import beans.HotDog;
import decorators.*;

public class Controller 
{
	public static void main(String[]args)
	{
		Food hamburger = new Hamburger();
		hamburger = new Lettuce(hamburger);
		hamburger = new Tomato(hamburger);
		hamburger = new Onion(hamburger);
		hamburger = new Cheese(hamburger);
		
		Food hotdog = new HotDog();
		hotdog = new Onion(hotdog);
		hotdog= new Tomato(hotdog);
		
		
		System.out.println("You have ordered a " + hamburger.getDescription() + ". It cost $" + hamburger.getPrice() + ".");
		System.out.println("You have ordered a " + hotdog.getDescription() + ". It cost $" + hotdog.getPrice() + ".");
	}
}
