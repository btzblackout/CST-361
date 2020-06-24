package beans;

import interfaces.Food;

public class Hamburger implements Food
{
	private String description;
	private double price;
	
	public Hamburger()
	{
		this.description = "Hamburger";
		this.price = 7.00;
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
