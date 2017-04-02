//
// Assignment 4 problem 2       Kevin Kovack
//
import java.util.Scanner;

public class SpeedOfSound
{
	public static void main(String[] args)
	{
		//declarations
		Scanner kb = new Scanner(System.in);
		String myMedium;
		
		//input
		System.out.print("Speed of sound in what medium?" + "\n(Enter Air, Water, or Steel): ");
		myMedium = kb.nextLine();

		//processing & output

		myMedium = myMedium.toUpperCase();//get all caps

		switch(myMedium)//(1100 feet/sec in air; 4900 feet/sec in water and 16,400 feet/sec in steel)
		{
			case "AIR": 	System.out.println("The speed of sound is 1100 feet/sec in air.");
							break;

			case "WATER":	System.out.println("The speed of sounds is 4900 feet/sec in water.");
							break;
			
			case "STEEL":	System.out.println("The speed of sound is 16,400 feet/sec in steel.");
							break;
			
			default:   System.out.println("The information you entered does not match AIR, WATER, or STEEL.");//error message for erroneus input
		}
	}
}