//
// Assignment 7 problem 1 -- Kevin Kovack
//

import java.util.Scanner;
import java.io.*;

class DailySales
{

	public static String getFileName()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("What is the filename for your sales?:");
		return kb.nextLine();
	}

	public static double getTotalSales(String filename) throws IOException
	{
		double sales=0.0, total=0.0;
	
		//open file
		File theFile = new File(filename);
		Scanner inputFile = new Scanner(theFile);

		//read file
		while(inputFile.hasNext())
		{
			sales = inputFile.nextDouble(); // reads a line from the file.
			total += sales;//update total
		}

		//close file
		inputFile.close();

		//return the total sales
		return total;
	}

	public static double getAverageSales(String filename) throws IOException
	{
		double totalSales = 0.0;
		int numberDays = 0;

		totalSales = getTotalSales(filename);
		numberDays = getNumberDays(filename);

		return (totalSales/((double)numberDays));
	}

	public static int getNumberDays(String filename) throws IOException
	{	
		double sales=0.0;
		int days=0;
	
		//open file
		File theFile = new File(filename);
		Scanner inputFile = new Scanner(theFile);

		//read file
		while(inputFile.hasNext())
		{
			sales = inputFile.nextDouble(); // reads a line from the file.
			days++;//update total
		}

		//close file
		inputFile.close();

		//return the total sales
		return days;
	}

	public static void displaySales(double totalSales, double averageSales)
	{
		System.out.println("Total sales: " + totalSales 
			+ "\nAverage daily sales: " + averageSales);
	}

	public static void main(String[] args) throws IOException
	{
		//declarations
		String filename="";
		double totalSales =0.0, averageSales = 0.0;
		int numberDays = 0;

		//input
		filename = getFileName();

		//processing
		totalSales = getTotalSales(filename);
		numberDays = getNumberDays(filename);
		averageSales = getAverageSales(filename);
		
		//output
		displaySales(totalSales, averageSales);
	}
}

/*
1.	Create a text file (you can name it sales.txt) that contains in each line the daily sales of a company for a whole month. Then write a Java application that:
a.	asks the user for the name of the file
b.	reads the total amount of sales
c.	calculates the average daily sales
d.	displays the total and average sales.
*/