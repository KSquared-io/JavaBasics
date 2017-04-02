//
// Assignment #2 problem #1 --- Kevin Kovack
//

import java.util.Scanner; //needed to use the Scanner class

public class PayrollTerminal
{
	public static void main(String[] args)
	{
		//Declarations
		String employeeName;
		double payRate, hoursWorked, grossPay;
			//creating a Scanner object to read input
		Scanner keyboard = new Scanner(System.in); 

		//Input
		System.out.print("What is your name?: ");
		employeeName = keyboard.nextLine(); //reads the name

		System.out.print("Enter the hours you worked:");
		hoursWorked = keyboard.nextDouble(); //reads the hours worked

		System.out.print("What is your pay rate?:");
		payRate = keyboard.nextDouble(); //reads the payrate
		
		//Processing
			//calculate grossPay based on the 
			//pay rate times the number of hours worked
		grossPay = payRate * hoursWorked; 

		//Output

		System.out.println("\nHello " + employeeName + 
						   "\nYour gross pay is $" + grossPay);
	}
}
