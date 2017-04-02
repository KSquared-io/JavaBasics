//Kevin Kovack Assignment 8

/*
RetailItem CLASS
*/

public class RetailItem
{
	//properties / data / fields
	private String description;
	private int unitsOnHand;
	private double price;

	//methods / procedures


	//Constructors
	public RetailItem() //non argument Constructor
	{
		description = "Nothing Assigned";
		unitsOnHand = 0;
		double price = 0.00;
	}

	public RetailItem(String nameOfItem, int units, double cost) //argument Constructor
	{	
		description = nameOfItem;
		unitsOnHand = units;
		price = cost;
	}

	//getters
	public String getDescription()
	{
		return description;
	}

	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}

	public double getPrice()
	{
		return price;
	}
	

	//setters

	public void setDescription(String rename)
	{
		description = rename;
	}

	public void setUnitsOnHand(int changeUnits)
	{
		unitsOnHand = changeUnits;
	}

	public void setPrice(double changePrice)
	{
		price = changePrice;
	}

	public void displayData()
	{
		System.out.println("\nDescription: "+ getDescription()
			+"\nUnits on Hand: " + getUnitsOnHand()
			+"\nPrice: " + getPrice()
			+"\n");
	}
}