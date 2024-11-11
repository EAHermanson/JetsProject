package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatAircraft
{
	public FighterJet(String model, int speedInMPH, int range, double price)
	{
		super(model, speedInMPH, range, price);
	}

	public void fight()
	{
		System.out.println("Sending the " + getModel() + " out to do battle!  Good luck, " + getModel()+ "!");
	}
}
