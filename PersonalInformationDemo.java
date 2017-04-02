//Kevin Kovack Assignment 8

public class PersonalInformationDemo
{

	public static void main(String[] args)
	{
		PersonalInformation me = new PersonalInformation("Kevin", "Staten Island", "27", "(123) 456-7890");
		PersonalInformation you = new PersonalInformation("You", "Some Place", "22", "(555) 555-5555");
		PersonalInformation someGirl = new PersonalInformation("Janie", "Queens", "18", "(123) 867-5309");
		PersonalInformation elmo = new PersonalInformation("Elmo", "123 Sesame St", "6", "(347) 347-3477");
		elmo.displayData();
		me.displayData();
		you.displayData();
		someGirl.displayData();
	}
}