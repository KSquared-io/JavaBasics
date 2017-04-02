//
// Assignment 3 problem 1       Kevin Kovack
//

//need scanner imported
import java.util.Scanner;

public class SmallestNum
{
	public static void main(String [] args)
	{
		//DECLARATIONS
		double a,b,c;
		Scanner kb = new Scanner(System.in);

		//INPUT
		System.out.print("Enter three numbers, then I will determine which is smallest.\nEnter the first number: ");
		a = kb.nextDouble();

		System.out.print("Enter the second number: ");
		b = kb.nextDouble();

		System.out.print("Enter the third number: ");
		c = kb.nextDouble();

		//PROCESSING // OUTPUT
		if (a < b && a < c)
		{
			System.out.println("The first number, " + a + " is the smallest.");
		}
		else if (b < a && b < c)
		{
			System.out.println("The second number, " + b + " is the smallest.");	
		}
		else if (c < a && c < b)
		{
			System.out.println("The third number, " + c + " is the smallest.");	
		}
		else if (a == b && b == c)
		{
			System.out.println("You tried to trick me. The numbers are all equal!!");	
		}
		else
		{
			System.out.println("You tried to trick me. There are two smallest numbers!!");	
		}
	}
}