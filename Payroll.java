//Kevin Kovack Assignment 8

/*
Payroll CLASS
*/

import java.util.Scanner;

public class Payroll
{
	//properties / data / fields
	//employee's name, ID number, hourly pay rate,
	//and number of hours worked
	private String name;
	private String idNumber;
	private double payRate;
	private double hoursWorked;
	Scanner kb = new Scanner(System.in);

	//methods / procedures

	//Constructors
	public Payroll() //non argument Constructor	
	{
		System.out.println("\nNew Payroll Data created...\n"
			+ "\nEnter information for this employee.\n");
		System.out.print("Name: ");
		name = kb.nextLine();
		System.out.print("ID Number: ");
		idNumber = kb.nextLine();
		System.out.print("Pay Rate: ");
		payRate = kb.nextDouble();
		System.out.print("Hours Worked: ");
		hoursWorked = kb.nextDouble();
	}

	public Payroll(String theName, String theID, double thePay, double theHoursWorked) //argument Constructor
	{
		name = theName;
		idNumber = theID;
		payRate = thePay;
		hoursWorked = theHoursWorked;
	}

	//getters
	public String getName()
	{
		return name;
	}

	public String getID()
	{
		return idNumber;
	}

	public double getPayRate()
	{
		return payRate;
	}

	public double getHoursWorked()
	{
		return hoursWorked;
	}


	

	//setters

	public void setName(String newName)
	{
		name = newName;
	}

	public void setID(String newID)
	{
		idNumber = newID;
	}

	public void setPayRate(double newPay)
	{
		payRate = newPay;
	}

	public void setHoursWorked(double newHours)
	{
		hoursWorked = newHours;
	}

	//other methods
	public double getGrossPay()
	{
		return payRate*hoursWorked;
	}
}