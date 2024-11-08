package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication
{
	private AirField airField = new AirField();
	private static Scanner scanner;
	
	public static void main(String[] args)
	{
		scanner = new Scanner(System.in);
		
		JetsApplication jetsApp = new JetsApplication();
		jetsApp.launch();		
		
		scanner.close();
	}
	
	private void launch()
	{
		// TODO Loop
		boolean quit = false;
		int input;
		
		while(!quit)
		{
			displayUserMenu();
			
			input = scanner.nextInt();
			scanner.nextLine();
		
			/*
			 * List fleet
			 * Fly all jets
			 * View fastest jet
			 * View jet with longest range
			 * Load all Cargo Jets
			 * Dogfight!
			 * Add a jet to Fleet
			 * Remove a jet from Fleet
			 * Quit
			 */
			
			switch(input)
			{
			case 1:
				listFleet();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				viewFastestJet();
				break;
			case 4:
				viewLongestRangeJet();
				break;
			case 5:
				loadCargoJets();
				break;
			case 6:
				dogfight();
				break;
			case 7:
				addJet();
				break;
			case 8:
				removeJet();
				break;
			case 9:
				quit = true;
				break;
			default:
				System.out.println("Invalid entry, please try again...");
			}
			
			
		}
		
		System.out.println("Thank you for playing!");
	}
	
	private void removeJet()
	{
		// TODO Auto-generated method stub
		
	}

	private void addJet()
	{
		// TODO Auto-generated method stub
		
	}

	private void dogfight()
	{
		// TODO Auto-generated method stub
		
	}

	private void loadCargoJets()
	{
		// TODO Auto-generated method stub
		
	}

	private void viewLongestRangeJet()
	{
		// TODO Auto-generated method stub
		
	}

	private void viewFastestJet()
	{
		// TODO Auto-generated method stub
		
	}

	private void flyAllJets()
	{
		// TODO Auto-generated method stub
		
	}

	private void listFleet()
	{
		// TODO Auto-generated method stub
		
		
	}

	private void displayUserMenu()
	{
		/*
		 * List fleet
		 * Fly all jets
		 * View fastest jet
		 * View jet with longest range
		 * Load all Cargo Jets
		 * Dogfight!
		 * Add a jet to Fleet
		 * Remove a jet from Fleet
		 * Quit
		 */
		
		System.out.println("1 - List the fleet" +
						"\n2 - Fly all jets" + 
						"\n3 - View fastest jet" + 
						"\n4 - View jet with longest range" + 
						"\n5 - Load all Cargo Jets" + 
						"\n6 - Dogfight!" + 
						"\n7 - Add a jet to the fleet" + 
						"\n8 - Remove a jet from the fleet" +
						"\n9 - Quit" +
						"\nPlease enter selection:  ");
	}

}
