package decorators;

import interfaces.Food;

public class Onion extends Toppings{

	public Onion(Food food) 
	{
		super(food);
		this.description = "onion";
		this.price = 0.25;
	}

	public double getPrice() 
	{
		return this.price + food.getPrice();
	}
	
	public String getDescription()
	{
		return food.getDescription() + this.description + ", ";
	}

}

