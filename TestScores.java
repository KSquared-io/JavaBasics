//Kevin Kovack Assignment 8

/*
TestScores CLASS
*/

import java.util.Scanner;

public class TestScores
{
	//properties / data / fields
	
	private double test1;
	private double test2;
	private double test3;
	Scanner kb = new Scanner(System.in);

	//methods / procedures


	//Constructors
	public TestScores() //non argument Constructor	
	{
		System.out.println("\nNew 3 Test Series Data created...\n"
			+ "\nEnter information for this Tester.\n");
		System.out.print("Test1: ");
		test1 = kb.nextDouble();
		System.out.print("Test2: ");
		test2 = kb.nextDouble();
		System.out.print("Test3: ");
		test3 = kb.nextDouble();
		this.displayAverage();

	}

	public TestScores(double firstTest, double secondTest, double thirdTest) //argument Constructor
	{
			test1=firstTest;
			test2=secondTest;
			test3=thirdTest;
			this.displayAverage();
	}

	//getters
	
	public double getTest1()
	{
		return test1;
	}

	public double getTest2()
	{
		return test2;
	}
	
	public double getTest3()
	{
		return test3;
	}

	//setters

	public void setTest1(int score1)
	{
		test1 = score1;
	}

	public void setTest2(int score2)
	{
		test2 = score2;
	}

	public void setTest3(int score3)
	{
		test3 = score3;
	}
	
	//other methods

	public double getAverage()
	{
		return ((test1+test2+test3)/3);
	}

	public void displayAverage()
	{
		System.out.println("The average of the 3 tests is: " + this.getAverage());
	}
}