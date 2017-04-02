//assignment #9 problem 1 -- Kevin Kovack

import java.util.Scanner;

public class ArrayNumbers
{
	public static void main(String[] args)
	{
		//declarations
		int num =0;
		Scanner kb = new Scanner(System.in);
		double average = 0.0, total = 0.0, highest = 0.0, lowest = 0.0;

		//input 
		System.out.print("How many numbers do you want to process?: ");
		num = kb.nextInt();

		double[] numbers = new double[num];

		getValues(numbers);

		//processing & output
		total = getTotal(numbers);
		System.out.println("Total of the number set is: " + total);

		average = getAverage(numbers);
		System.out.println("Average of the number set is: " + average);

		highest = getHighest(numbers);
		System.out.println("The highest number of the number set is: " + highest);

		lowest = getLowest(numbers);
		System.out.println("The lowest number of the number set is: " + lowest);
		
	}

	public static void getValues(double[] n)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter numbers for Array position.");
		
		for(int i=0; i<n.length;i++)
		{
			System.out.print(i+": ");
			n[i] = kb.nextInt();
		}
	}

	public static double getTotal(double[] n)
	{
		double total = 0;

		for(int i=0; i<n.length;i++)
		{
			total += n[i];
		}	

		return total;
	}

	public static double getAverage(double[] n)
	{
		double total = getTotal(n);

		return (total/n.length);

	}

	public static double getHighest(double[] n)
	{
		int highestPos = 0;
		for(int i=0; i<n.length;i++)
		{
			if(n[i] > n[highestPos])
				highestPos = i;
		}	

		return n[highestPos];
	}

	public static double getLowest(double[] n)
	{
		int lowestPos = 0;
		for(int i=0; i<n.length;i++)
		{
			if(n[i] < n[lowestPos])
				lowestPos = i;
		}	

		return n[lowestPos];	
	}



/*
METHODS NEEDED
a.	getTotal: The method should accept a one-dimensional array as its argument and return 
		the total of the values in the array.
b.	getAverage: The method should accept a one-dimensional array as its argument and return 
		the average of the values in the array.
c.	getHighest: The method should accept a one-dimensional array as its argument and return 
		the highest value in the array.
d.	getLowest: The method should accept a one-dimensional array as its argument and return 
		the lowest value in the array
*/


}