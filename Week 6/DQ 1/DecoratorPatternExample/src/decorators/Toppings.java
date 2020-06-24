package decorators;

import interfaces.Food;

public abstract class Toppings implements Food 
{
	protected String description;
	protected double price;
	protected Food food;
	
	public Toppings(Food food)
	{
		this.food = food;
	}

	public abstract double getPrice();
	
	public String getDescription()
	{
		return food.getDescription() + ", " + this.description;
	}

}
