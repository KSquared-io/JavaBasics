//
// assignment 7 problem 2 -- kevin kovack
//



import java.util.Scanner;

public class PaintJob
{
	public static void main(String[] args)
	{
		//declarations
		double wallSpace, pricePerGallon, numberGallons, hoursOfLabor, costOfPaint, laborCharges, totalCost;
		final double laborPerHour = 18.0;
		Scanner kb = new Scanner(System.in);

		//input

		System.out.print("Enter the wall space in sq ft: ");
		wallSpace=kb.nextDouble();

		System.out.print("Enter the price per gallon of paint: ");
		pricePerGallon=kb.nextDouble();

		//processing
		
		numberGallons = calNumberGallons(wallSpace);
		
		costOfPaint = calCostPaint(numberGallons, pricePerGallon);
		
		hoursOfLabor = calHoursLabor(wallSpace);
		
		laborCharges = calCostLabor(hoursOfLabor, laborPerHour);
		
		totalCost = calTotalCost(costOfPaint, laborCharges);

		//output

		displayTotals(numberGallons, costOfPaint, hoursOfLabor, laborCharges, totalCost);

	}

	public static double calNumberGallons(double wall)
	{
		double ng;
		ng = wall/115.0;
		return ng;
	}

	public static double calCostPaint(double numberGallons, double pricePerGal)
	{
		return (numberGallons * pricePerGal);
	}

	public static double calHoursLabor(double wall)
	{
		return (wall*8.0/115.0);
	}

	public static double calCostLabor(double hours, double payrate)
	{
		return (hours * payrate);
	}

	public static double calTotalCost(double paint, double labor)
	{
		return (paint + labor);
	}

	public static void displayTotals(double numberGallons, double costOfPaint, double hoursOfLabor, double laborCharges, double totalCost)
	{
		System.out.println("The number of gallons: " + numberGallons);
		System.out.println("The cost of paint: " + costOfPaint);
		System.out.println("The hours of labor: " + hoursOfLabor);
		System.out.println("The cost of labor: " + laborCharges);
		System.out.println("The total cost: " + totalCost);
	}

}