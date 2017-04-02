//assignment #9 problem 2 -- Kevin Kovack

import java.util.Scanner;

public class ArrayNames
{
	public static void main(String[] args)
	{
		//declarations
		int num =0;
		Scanner kb = new Scanner(System.in);
		
		//input 
		System.out.print("How many family and friends names do you want to process?: ");
		num = kb.nextInt();

		//array created
		String[] names = new String[num];

		//fill array
		getValues(names);

		//processing and output
		System.out.print("Making all lower case...");
		makeNamesLower(names);

		showNames(names);


		System.out.print("Making all upper case...");
		makeNamesUpper(names);

		showNames(names);
		
		
		System.out.print("Showing first letter...");
		showFirstLetter(names);

		System.out.print("Showing length of names...");

		showLengths(names);
	}

	public static void getValues(String[] n)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter names for Array position.");
		
		for(int i=0; i<n.length;i++)
		{
			System.out.print(i+": ");
			n[i] = kb.nextLine();
		}
	}

	public static void makeNamesUpper(String[] n)
	{
		for(int i=0; i<n.length;i++)
		{
			n[i]=n[i].toUpperCase();
		}	
	}

	public static void makeNamesLower(String[] n)
	{
		for(int i=0; i<n.length;i++)
		{
			n[i]=n[i].toLowerCase();
		}	
	}

	public static void showFirstLetter(String[] n)
	{
		System.out.println("Printing everyone's first letter of their name...");
		String nameHolder = "";
		char letterHolder;
		for(int i=0; i<n.length;i++)
		{
			nameHolder =n[i];
			letterHolder = nameHolder.charAt(0);
			System.out.println(i+": " + letterHolder);
		}	
	}	

	public static void showLengths(String[] n)
	{
		System.out.println("Printing the length of everyone's name...");
		int nameLength = 0;
		for(int i=0; i<n.length;i++)
		{
			nameLength = n[i].length();
			System.out.println(i+": " + nameLength);
		}	
	}		

	public static void showNames(String[] n)
	{
		System.out.println("Printing everyone's name...");

		for(int i=0; i<n.length;i++)
		{
			System.out.println(i+": " + n[i]);
		}	
	}		
}
/*
Write a Java application that stores the names of your family and friends 
	in a one-dimensional array of Strings. The program should show 
	-all names in upper case 
	-and lower case, 
	-identify the first character of the name, 
	-and the lengths of the names. 
*/