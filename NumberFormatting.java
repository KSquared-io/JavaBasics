//
// Assignment 4 problem 3       Kevin Kovack
//

/*
Create a Java program from scratch that formats the number 123456789.1234567890 using the DecimalFormat class and the printf method as:
123456789.1
123,456,789.12
123,456,789.123
*/
import java.text.DecimalFormat;

public class NumberFormatting
{
	public static void main(String[] args)
	{
		//declarations
		double givenNumber = 123456789.1234567890;
		DecimalFormat format1 = new DecimalFormat("#.#"),
						 format2 = new DecimalFormat("#,###.##"),
						 format3 = new DecimalFormat("#,###.###");
		//processing & ouput
		System.out.println("The given number is: " + givenNumber);
		System.out.println("\nUsing DecimalFormat: ");
		System.out.println("Format1: " + format1.format(givenNumber));
		System.out.println("Format2: " + format2.format(givenNumber));
		System.out.println("Format3: " + format3.format(givenNumber));

		System.out.println("\nUsing printf: ");
		System.out.printf("Format1: %.1f\n", givenNumber);
		System.out.printf("Format2: %,.2f\n", givenNumber);
		System.out.printf("Format3: %,.3f\n", givenNumber);

	}
}