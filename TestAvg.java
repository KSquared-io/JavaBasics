//
// Assignment 3 problem 3       Kevin Kovack
//
import java.util.Scanner; // need scanner for input
import javax.swing.JOptionPane; //need this for dialogues


public class TestAvg
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in); //to get data from keyboard AKA kb

		//declarations
		double testOne, testTwo, testThree, testAverage;
		String testOneText, testTwoText, testThreeText;
		char letterGrade;


		//input
			//System.out.println("Please input your three test scores for me to compute your Average.");
		JOptionPane.showMessageDialog(null, "Please input your three test scores for me to compute your Average.");
			//System.out.print("Score for Test One: ");
			//testOne = kb.nextDouble();
		testOneText = JOptionPane.showInputDialog("Score for Test One: ");
        testOne = Double.parseDouble(testOneText);
			//System.out.print("Score for Test Two: ");
			//testTwo = kb.nextDouble();
		testTwoText = JOptionPane.showInputDialog("Score for Test Two: ");
       	testTwo = Double.parseDouble(testTwoText);
			//System.out.print("Score for Test Three: ");
			//testThree = kb.nextDouble();
       	testThreeText = JOptionPane.showInputDialog("Score for Test Three: ");
        	testThree = Double.parseDouble(testThreeText);

		//processing
		testAverage = (testOne + testTwo + testThree)/3; //easy avg math

			//now we have to determine what letter grade the avg is
		if(testAverage >= 90)
		{
			letterGrade = 'A';
		}
		else if(testAverage >= 80 && testAverage < 90) 
		{
			letterGrade = 'B';
		}
		else if(testAverage >= 70 && testAverage < 80)
		{
			letterGrade = 'C';
		}
		else if(testAverage >= 60 && testAverage < 70)
		{
			letterGrade = 'D';
		}
		else if(testAverage < 60)
		{
			letterGrade = 'F';
		}
		else
		{
			//some kind of error happened
			letterGrade = 'E';
		}
		//output
			//System.out.println("You earned a '" + letterGrade + "' with a test average of " + testAverage +".");
		JOptionPane.showMessageDialog(null, "You earned a '" + letterGrade + "' with a test average of " + testAverage +".");
	}
}