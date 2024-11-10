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
				loadPassengerPlanes();
				break;
			case 7:
				dogfight();
				break;
			case 8:
				addJet();
				break;
			case 9:
				removeJet();
				break;
			case 10:
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
		System.out.println(airField.launchFighters() );
	}
	
	private void loadPassengerPlanes()
	{
		System.out.println(airField.loadPassengerJets() );
	}

	private void loadCargoJets()
	{
		System.out.println(airField.loadCargoJets() );
	}

	private void viewLongestRangeJet()
	{
		// TODO Auto-generated method stub
		System.out.println(airField.viewLongestRange());
	}

	private void viewFastestJet()
	{
		// TODO Auto-generated method stub
		System.out.println(airField.viewFastest());
	}

	private void flyAllJets()
	{
		// TODO Auto-generated method stub
		airField.flyAllJets();
		
	}

	private void listFleet()
	{
		// TODO Auto-generated method stub
		System.out.println(airField.listJets() );
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
						"\n2 - Fly All Jets" + 
						"\n3 - View Fastest Jet" + 
						"\n4 - View Jet With Longest Range" + 
						"\n5 - Load All Cargo Planes" + 
						"\n6 - Load All Passenger Planes" +
						"\n7 - Dogfight!" + 
						"\n8 - Add A Jet To The Fleet" + 
						"\n9 - Remove A Jet From The Fleet" +
						"\n10 - Quit" +
						"\nPlease enter selection:  ");
	}

}
