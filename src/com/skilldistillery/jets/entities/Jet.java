package com.skilldistillery.jets.entities;

public abstract class Jet
{
	private String model;
	private double speedInMPH;
	private int range;
	private long price;
	
	public void fly()
	{
		System.out.println("Model:  " + model + 
				"\nSpeed (MPH):  " + speedInMPH + 
				"\nRange:  " + range + 
				"\nPrice:  " + price + 
				"\nMaximum Flight Time:  " + (speedInMPH / range) );
	}

	
}
