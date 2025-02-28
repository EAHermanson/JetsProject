package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerPlane;

public class AirField
{
	private List<Jet> fleet = new ArrayList<>();
	
	public AirField()
	{
		loadJetsFromFile("jets.txt");
	}
	
	private void loadJetsFromFile(String fileName)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			line = br.readLine();
			
			while((line = br.readLine()) != null)
			{
				String[] fields = line.split(",");
				String jetType = fields[0];
				String jetModel = fields[1];
				String jetSpeed = fields[2];
				String jetRange = fields[3];
				String jetPrice = fields[4];

				createJet(jetType, jetModel, jetSpeed, jetRange, jetPrice);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void createJet(String type, String model, String speedInMPH, String range, String price)
	{
		int jetSpeed = Integer.parseInt(speedInMPH);
		int jetRange = Integer.parseInt(range);
		double jetPrice = Double.parseDouble(price);
		Jet jet = null;
		
		switch(type)
		{
		case "passenger":
			jet = new PassengerPlane(model, jetSpeed, jetRange, jetPrice);
			break;
		case "fighter":
			jet = new FighterJet(model, jetSpeed, jetRange, jetPrice);
			break;
		case "cargo":
			jet = new CargoPlane(model, jetSpeed, jetRange, jetPrice);
			break;
		default:
			System.out.println("Unknown jet type, custom builds not yet supported.");
			return;
		}
		
		fleet.add(jet);
	}
	
	public void removeJet(int jetNumber)
	{
		fleet.remove(jetNumber);
	}
	
	public String listJets()
	{
		String list = "";
		int index = 0;
		
		for (Jet jet : fleet)
		{
			index++;
			
			list = list + index + 
					"  Model:  " + jet.getModel() + 
					".\tSpeed:  " + jet.getSpeedInMPH() + 
					".\tRange:  " + jet.getRange() + 
					".\tPrice:  " + jet.getPrice() + ".\n";
		}
		
		return list;
	}
	
	public void flyJet(Jet flyMe)
	{
		flyMe.fly();
	}
	
	public void flyAllJets()
	{
		for (Jet jet : fleet)
		{
			flyJet(jet);
			System.out.println();
		}
	}

	public Jet selectJetAtIndex(int index)
	{
		fleet.get(index);
		return null;
	}
	
	public int getIndexOfJetWithHighestTrait(int traitNumber)
	{
		int indexOfHighest = 0;
		
		for (Jet jet : fleet)
		{			
//			String jetType = fields[0];
//			String jetModel = fields[1];
//			String jetSpeed = fields[2];
//			String jetRange = fields[3];
//			String jetPrice = fields[4];
			switch(traitNumber)
			{
			case 0:	//type makes no sense
			case 1:	//model makes no sense
			default:	
				System.out.println("How do we find the highest of this trait?");
				break;	
				
			case 2:	//speed
				if(jet.getSpeedInMPH() > fleet.get(indexOfHighest).getSpeedInMPH())
				{
					indexOfHighest = fleet.indexOf(jet);
				}
				
			case 3:	//range
				if(jet.getRange() > fleet.get(indexOfHighest).getRange())
				{
					indexOfHighest = fleet.indexOf(jet);
				}
				
			case 4: //price
				{
					if(jet.getPrice() > fleet.get(indexOfHighest).getPrice())
					indexOfHighest = fleet.indexOf(jet);
				}
			}
		}
		
		return indexOfHighest;
	}
	
	public String viewFastest()
	{
		int indexOfFastestJet = getIndexOfJetWithHighestTrait(2);
		
		return fleet.get(indexOfFastestJet).toString();
	}
	
	public String viewLongestRange()
	{
		int indexOfLongestRangeJet = getIndexOfJetWithHighestTrait(3);
		
		return fleet.get(indexOfLongestRangeJet).toString();
	}
	
	public String loadCargoJets()
	{
		int count = 0;
		
		for (Jet jet : fleet)
		{
			if(jet instanceof CargoPlane)
			{
				((CargoPlane) jet).loadCargo();
				count++;
			}
		}
		
		return "All " + count + " cargo planes loaded and ready to go!";
	}
	
	public String loadPassengerJets()
	{
		int count = 0;
		
		for (Jet jet : fleet)
		{
			if(jet instanceof PassengerPlane)
			{
				((PassengerPlane) jet).loadPassengers();
				count++;
			}
		}
		
		return "All " + count + " passenger planes loaded and ready to go!";
	}
	
	public String launchFighters()
	{
		int count = 0;
		
		for (Jet jet : fleet)
		{
			if(jet instanceof FighterJet)
			{
				((FighterJet) jet).fight();
				count++;
			}
		}
		
		return "All " + count + " fighter planes have launched!";
	}

	
}
