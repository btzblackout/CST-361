package com.blackout;

public class Profile 
{
	private String userName, firstName, lastName, bio;
	private int monthJoined, yearJoined;
	
	public Profile(String userName, String firstName, String lastName, String bio, int monthJoined, int yearJoined) 
	{
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.monthJoined = monthJoined;
		this.yearJoined = yearJoined;
	}
	public Profile()
	{
		
	}

	public String getUserName() {
		return userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getBio() {
		return bio;
	}

	public int getMonthJoined() {
		return monthJoined;
	}

	public int getYearJoined() {
		return yearJoined;
	}
	
	
	
	

}