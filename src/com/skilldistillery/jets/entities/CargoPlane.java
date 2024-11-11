package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier
{
	public CargoPlane(String model, int speedInMPH, int range, double price)
	{
		super(model, speedInMPH, range, price);
	
		// TODO Auto-generated constructor stub
	}
	
	public void loadCargo()
	{
		System.out.println("Loading up the " + getModel() + " with cargo... Done!");
	}
}
