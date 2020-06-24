package decorators;

import interfaces.Food;

public class Tomato extends Toppings{



	public Tomato(Food food) {
		super(food);
		this.description = "tomato";
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
