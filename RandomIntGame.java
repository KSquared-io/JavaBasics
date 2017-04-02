//
// Assignment #6 Problem 1 -- Kevin Kovack
//

import java.util.Random;
import java.util.Scanner;

public class RandomIntGame
{
	public static void main(String [] args)
	{
		//declarations
		int myRandomInt;
		int guessedInt;
		int tries = 0;
		Scanner kb = new Scanner(System.in);
		Random randomNumber = new Random();
		
		//Generate my random number
		myRandomInt= randomNumber.nextInt(99)+1;

		//System.out.println(myRandomInt);
		
		//input
		System.out.println("I have selected a random number between 1 and 100."
					+ "\nSee if you can guess it!");
					

		//processing and output
		do
		{
			//get user's guess
			System.out.print("What is your guess?: ");
			guessedInt = kb.nextInt();

			tries++;
			if(guessedInt < myRandomInt)//the guess is too low
			{
				System.out.println("\nToo low. Try again!\n");	
			}
			else if(guessedInt > myRandomInt)//the is too high
			{
				System.out.println("\nToo high. Try again!\n");	
			}
		}while(guessedInt != myRandomInt);

		//successful guess
		for(int i=0; i <= 45; i++, System.out.print("*"));
		System.out.println("\nHooray!!! You guessed my number after " + tries + " tries!");
		for(int i=0; i <= 45; i++, System.out.print("*"));
	}
}

