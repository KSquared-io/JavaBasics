//
// Assignment # 5 problem 3 --  Kevin Kovack
//

import java.util.Scanner;

public class ClassAverage
{
	public static void main(String[] args)
	{
		//declarations
		int students, count=0;
		double grade, avg=0;
		Scanner kb = new Scanner(System.in);
		//input
		System.out.println("How many numeric grades need to be averaged?");
		students=Integer.parseInt(kb.nextLine());

		//processing
		for(int x=students; x > 0; x--)
		{
			count = students - x + 1;
			System.out.print("Student " + count + ": Enter a grade: ");
			grade = kb.nextDouble();
			avg += grade;
		}
		avg = avg/count;

		//output
		System.out.println("Class average: " + avg);
	}
}