//
// Assignment 6 problem 2 -- Kevin Kovack
//




public class NYCPopulation
{
	public static void main(String [] args)
	{
		//declarations
		int population = 8175133;
		double populationDouble = (double)population;
		int year = 2010;

		//output & processing
		System.out.println("In " + year +", the NYC population was " + population);
		
		while(population > 10000)
		{
			System.out.println(year + ": Population: " + population);
			year-=40;
			populationDouble/=2;
			population = (int)populationDouble;

		}
		if(populationDouble < 10000)
		{
			year+=40;
			populationDouble*=2;
			population = (int)populationDouble;
		}
		System.out.println("The closest to 10000 NYC population ever was, was in year " 
					+ year + " with a population of about " + population + ".");
	}
}