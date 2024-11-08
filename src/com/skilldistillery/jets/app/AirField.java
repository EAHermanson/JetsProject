package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.entities.Jet;

public class AirField
{
	private List<Jet> fleet = new ArrayList<>();
	
	public AirField()
	{
		loadJetsFromFile("jets.txt");
	}
	
	private void loadJetsFromFile(String fileName)
	{
		//FIXME - bufferedreader template
		try
		{
			// String model, int speedInMPH, int range, double price
			
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			line = br.readLine();
			
			while((line = br.readLine()) != null)
			{
				System.out.println("Line read!:  " + line);

				String[] fields = line.split(",");
				String jetType = fields[0];
				String jetModel = fields[1];
				String jetSpeed = fields[2];
				String jetRange = fields[3];
				String jetPrice = fields[4];
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
	
	//TODO: public methods for handling jets
}
