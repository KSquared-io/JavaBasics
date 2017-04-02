//
// Assignment 6 problem 3 -- Kevin Kovack
//

/*
3.	Cobalt 60, a radioactive form of cobalt used in 
cancer therapy, decays or dissipates over a period of
time. Each year, 12 percent of the amount present at 
the beginning of the year will have decayed. If a 
container of cobalt 60 initially contains 10 grams, 
create a Java program to determine the amount remaining 
after five years.
*/

public class Cobalt
{
	public static void main(String[] args)
	{
		//declarations
		double grams = 10, decayRate = 0.12;
				
		System.out.println("\nAnnual decay of 10 grams of Cobalt 60 is 12% annually as seen below:");

		//processing and output
		for(double years = 0; years<=5; years++)
		{ 
			System.out.printf("\nAfter %2.0f years, %2.2f grams of Cobalt 60 remain.\n", years, grams);
			grams*= (1-decayRate);
		}
	}
}