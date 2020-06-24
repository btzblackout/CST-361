package beans;

import interfaces.Food;

public class HotDog implements Food
{
	private String description;
	private double price;
	
	public HotDog()
	{
		this.description = "Hotdog";
		this.price = 3.50;
	}
	public String getDescription() 
	{
		return description + " with ";
	}

	public double getPrice() 
	{
		return price;
	}

}