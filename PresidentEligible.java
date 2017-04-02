//
// Assignment # 5 problem 1 --  Kevin Kovack
//

import javax.swing.JOptionPane;

public class PresidentEligible
{
	public static void main(String[] args)
	{
		//declarations
		String validCitizen = "no", ageString;
		int age; 
		boolean yesNoRepeat; //check for valid yes/no response
		//input
			//find out if natural born citizen
		do
		{
			validCitizen = JOptionPane.showInputDialog("Are you a natural born citizen of the United States?");
			validCitizen = validCitizen.toUpperCase();
			if(validCitizen.equals("Y") || validCitizen.equals("YES") || validCitizen.equals("N") || validCitizen.equals("NO"))
			{
				//user used acceptable y/Y/Yes/n/N/No etc
				yesNoRepeat = false;
			}
			else
			{
				//user made bad input
				yesNoRepeat = true;
			}
		}while(yesNoRepeat);//while true make user try again :)

			//find out users age
		age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));

		//processing & output
		validCitizen = validCitizen.toUpperCase();

		if(age >= 35 && (validCitizen.equals("YES") || validCitizen.equals("Y")))
		{
			//eligible
			JOptionPane.showMessageDialog(null, "You are eligible to be the U.S. Presient!");
		}
		else
		{
			//not eligible
			JOptionPane.showMessageDialog(null, "You are NOT eligible to be the U.S. Presient!");
		}

	}
}