package com.skilldistillery.jets.entities;

public class PassengerPlane extends Jet implements AirLiner
{
	public PassengerPlane(String model, int speedInMPH, int range, double price)
	{
		super(model, speedInMPH, range, price);
		// TODO Auto-generated constructor stub
	}

	public void loadPassengers()
	{
		System.out.println("Passengers are embarking onto the " + getModel() + "... Done!\n"
				+ "Since this isn't United we're skipping the break guitars step.");
	}
}
