package decorators;

import interfaces.Food;

public class Cheese extends Toppings{

	public Cheese(Food food) 
	{
		super(food);
		this.description = "cheese";
		this.price = 0.10;
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

