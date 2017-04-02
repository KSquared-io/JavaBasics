//
// Assignment 6 problem 4 -- Kevin Kovack
//

import java.util.Scanner;

public class Weight
{
	public static void main(String[] args)
	{
		//declarations
		double targetWeight = 0, currentWeight = 0, height = 0, difference = 0;
		boolean loopOn = true;
		String gender = "";
		Scanner kb = new Scanner(System.in);

		//input
		System.out.print("Enter your current height in inches: ");
		height = kb.nextDouble();
		System.out.print("Enter your current weight in pounds: ");
		currentWeight = kb.nextDouble();
		
		while(loopOn)
		{
			System.out.print("Are you MALE or FEMALE? ");
			gender = kb.nextLine();
			gender = gender.toUpperCase();
			
			if(gender.equals("M") || gender.equals("MALE"))
			{
				gender = "MALE";
				loopOn = false;
			}
			else if(gender.equals("F") || gender.equals("FEMALE"))
			{
				gender = "FEMALE";
				loopOn = false;
			}
		}
		
		//processing
			//Male
		if (gender.equals("MALE")) 
		{
			targetWeight = height * 4 - 128;
		}
			//Female
		else if(gender.equals("FEMALE"))
		{
			targetWeight = height * 3.5 - 128;
		}
		difference = currentWeight-targetWeight;

		//output
		if(targetWeight < currentWeight)
		{
			System.out.println("You are overweight.");
			System.out.println("Target: " + targetWeight 
				+ " You: " + currentWeight + " Difference: " + difference +".");
		}
		else if(targetWeight > currentWeight)
		{
			System.out.println("You are underweight.");
			System.out.println("Target: " + targetWeight 
				+ " You: " + currentWeight + " Difference: " + difference +".");
		}
		else
		{
			System.out.println("You are exactly your expected weight.");
			System.out.println("Target: " + targetWeight 
				+ " You: " + currentWeight + " Difference: " + difference +".");
		}
	}
}