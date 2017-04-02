//
// Assignment #2 problem #3 --- Kevin Kovack
//

import java.util.Scanner; //needed to use the Scanner class

public class CityName
{
	public static void main(String[] args)
	{
		//Declarations
		String nameOfCity, cityInCaps, cityInLows;
		char cityFirstLetter;
		int numberOfCityLetters;
		Scanner keyboard = new Scanner(System.in);
		
		//Input
		//what's your favorite city?
		System.out.print("What is your favorite city?: ");
		nameOfCity = keyboard.nextLine();

		//Processing
		//-The number of characters in the city name
		numberOfCityLetters = nameOfCity.length();
		//-The name of the city in uppercase letters
		cityInCaps = nameOfCity.toUpperCase();
		//-The name of the city in lowercase letters
		cityInLows = nameOfCity.toLowerCase();
		//-The first character in the city name
		cityFirstLetter = nameOfCity.charAt(0);


		//Output
		System.out.println("The number of characters in " + nameOfCity + " is: " + numberOfCityLetters);
		System.out.println(nameOfCity + " in all CAPS is: " + cityInCaps);
		System.out.println(nameOfCity + " in all lows is: " + cityInLows);
		System.out.println("The first character in " + nameOfCity + " is: " + cityFirstLetter);

	}
}
