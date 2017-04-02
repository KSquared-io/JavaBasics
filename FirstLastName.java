//
// Assignment 4 problem 1       Kevin Kovack
//
import java.util.Scanner;

public class FirstLastName
{
	public static void main(String[] args)
	{
		//declarations
		String fullNameInput, firstName, lastName;
		Scanner kb = new Scanner(System.in);
		String[] piecesOfName;

		//input
		System.out.print("Enter your first name and last name, in a single line"
			+ "\nand separate them a space:");
		fullNameInput = kb.nextLine();

		//processing
			//split name by spaces
		piecesOfName = fullNameInput.split("\\s");
		
		//output
		System.out.println("First name: " + piecesOfName[0]);
		System.out.println("Last name: " + piecesOfName[1]);

	}
}