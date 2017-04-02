//
// Assignment # 5 problem 4 --  Kevin Kovack
//

import java.util.Scanner;

public class ClassAverageS
{
	public static void main(String[] args)
	{
		//declarations
		boolean myLoop;
		int count=0;
		double grade, avg=0;
		Scanner kb = new Scanner(System.in);
		//input
		System.out.println("Enter numeric grades that need to be averaged.\nTo stop, enter a negative number.");
		//processing
		do
		{
			System.out.print("Student " + (count+1) + ": Enter a grade: ");
			grade = kb.nextDouble();
			if(grade>=0)
			{
				avg += grade;
				count++;
				myLoop = true;
			}
			else
			{
				myLoop = false;
			}
		}while(myLoop);

		avg = avg/count;

		//output
		System.out.println("Class average: " + avg);
	}
}