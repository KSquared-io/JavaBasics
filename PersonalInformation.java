//Kevin Kovack Assignment 8

/*
PersonalInformation CLASS
*/

public class PersonalInformation
{
	//properties / data / fields
	//name, address, age, and phone number
	private String name;
	private String address;
	private String age;
	private String phoneNumber;

	//methods / procedures


	//Constructors
	public PersonalInformation() //non argument Constructor	
	{
		name = "Unnamed";
		address = "Nowhere";
		age = "0";
		phoneNumber = "(000)-000-0000";
	}

	public PersonalInformation(String theName, String theAddress, String theAge, String thePhoneNumber) //argument Constructor
	{
		name = theName;
		address = theAddress;
		age = theAge;
		phoneNumber = thePhoneNumber;		
	}

	//getters
	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public String getAge()
	{
		return age;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	//setters
	public void setName(String newName)
	{
		name = newName;
	}

	public void setAddress(String newAddress)
	{
		address = newAddress;
	}

	public void setAge(String newAge)
	{
		age = newAge;
	}

	public void setPhoneNumber(String newPhoneNumber)
	{
		phoneNumber = newPhoneNumber;
	}

	//other methods
	public void displayData()
	{
		System.out.println("\nName: "+ this.getName()
			+"\nAddress: " + this.getAddress()
			+"\nAge: " + this.getAge()
			+"\nPhone Number: " + this.getPhoneNumber()
			+"\n");
	}
}