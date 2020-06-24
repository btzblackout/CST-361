package decorators;

import interfaces.Food;

public class Lettuce extends Toppings{

	public Lettuce(Food food) 
	{
		super(food);
		this.description = "lettuce";
		this.price = 0.75;
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
