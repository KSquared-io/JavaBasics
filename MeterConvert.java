//
//Assignment 7 problem 3 -- Kevin Kovack
//

import java.util.Scanner;

class MeterConvert
{
	public static double mtoK(double m)
	{
		//convert m to K
		m/=1000;
		return m;
	}
	public static double mtoIN(double m)
	{
		m=mtoFT(m);
		m*=12;
		return m;
	}	
	public static double mtoFT(double m)
	{
		//convert m to ft  1 Meter is equal to 3.28083989501 Feet
		m*=3.28083989501;
		return m;
	}
	public static void exitMy()
	{
		System.exit(0);
	}

	public static void main(String[] args)
	{
		//declarations
		Scanner kb = new Scanner(System.in);
		double meters;
		double newMeasurement;
		String choice =""; 
		boolean myLoop;
		//input
		do
		{
			System.out.println("\n========= Meter Converter =========");
			System.out.print("Enter in meters the number to convert: ");
			meters = kb.nextDouble();
			System.out.println("Make a selection:\n"
					+ "A. Convert to kilometers\n"
					+ "B. Convert to inches\n"
					+ "C. Convert to feet\n"
					+ "D. Quit the program");
			myLoop=true;
			while(myLoop)
			{
				
				choice = kb.nextLine();

				choice = choice.toUpperCase();

				if(choice.equals("A") || choice.equals("B") || choice.equals("C") || choice.equals("D"))
					myLoop=false;
				else
					myLoop=true;
			}
			
			switch(choice)
			{
				case "A":
					newMeasurement=mtoK(meters);
					System.out.println(meters + "m = " + newMeasurement +"K");
					break;
				case "B":
					newMeasurement=mtoIN(meters);
					System.out.println(meters + "m = " + newMeasurement +"in");
					break;
				case "C" :
					newMeasurement=mtoFT(meters);
					System.out.println(meters + "m = " + newMeasurement +"ft");
					break;
				case "D" :
					exitMy();
					break;
				default:
					System.out.println("ERROR UNKNOWN CHOICE");
					break;
			}
		}while(true);
		//processing

		//output
	}
}