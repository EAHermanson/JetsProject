package com.skilldistillery.jets.entities;

public class FighterJet extends Jet
{
	public FighterJet(String model, int speedInMPH, int range, double price)
	{
		super(model, speedInMPH, range, price);
		// TODO Auto-generated constructor stub
	}

	public void fight()
	{
		System.out.println("Sending the " + getModel() + " out to do battle!  Good luck, " + getModel()+ "!");
	}
}
