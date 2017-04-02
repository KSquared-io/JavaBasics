//
// Assignment 4 problem 4       Kevin Kovack
//
import java.util.Scanner;

public class Runners
{
	public static void main(String[] args)
	{
		//declarations
		String runnerA, runnerB, runnerC;
		double timeA, timeB, timeC;
		Scanner kb = new Scanner(System.in);
		
		//input
			//get names
		System.out.print("Enter the 3 runner's names\nRunner A: ");
		runnerA = kb.nextLine();
		System.out.print("Runner B: ");
		runnerB = kb.nextLine();
		System.out.print("Runner C: ");
		runnerC = kb.nextLine();
			//get times
		System.out.print("Enter each runner's time in minutes.\n" + runnerA + ": ");
		timeA = kb.nextDouble();
		System.out.print(runnerB + ": ");
		timeB = kb.nextDouble();
		System.out.print(runnerC + ": ");
		timeC = kb.nextDouble();
		

		//processing & output
			//who is in first
		if (timeA < timeB && timeA < timeC)//A is first
		{
			System.out.println(runnerA + " finished the race in " + timeA + " minutes and came in first!");
			//figure out second and third
			if(timeB < timeC)//B is second and C is third
			{
				System.out.println(runnerB + " finished the race in " + timeB + " minutes and came in second.\n"
					+ runnerC + " finished the race in " + timeC + " minutes and came in third.");
			}
			else if(timeB > timeC)//B is third and C is second
			{
				System.out.println(runnerC + " finished the race in " + timeC + " minutes and came in second.\n"
					+ runnerB + " finished the race in " + timeB + " minutes and came in third.");
			}
			else//B and C tied for second
			{
				System.out.println(runnerB + " and " + runnerC + " both finished the race in " + timeB + " minutes and tied for second.");
			}
		}
		else if (timeB < timeA && timeB < timeC)//B is first
		{
			System.out.println(runnerB + " finished the race in " + timeB + " minutes and came in first!");
			//figure out second and third
			if(timeA < timeC)//A is second and C is third
			{
				System.out.println(runnerA + " finished the race in " + timeA + " minutes and came in second.\n"
					+ runnerC + " finished the race in " + timeC + " minutes and came in third.");
			}
			else if(timeA > timeC)//A is third and C is second
			{
				System.out.println(runnerC + " finished the race in " + timeC + " minutes and came in second.\n"
					+ runnerA + " finished the race in " + timeA + " minutes and came in third.");
			}
			else//A and C tied for second
			{
				System.out.println(runnerA + " and " + runnerC + " both finished the race in " + timeA + " minutes and tied for second.");
			}
		}
		else if (timeC < timeA && timeC < timeB)//C is first
		{
			System.out.println(runnerC + " finished the race in " + timeC + " minutes and came in first!");
			//figure out second and third
			if(timeB < timeA)//B is second and A is third
			{
				System.out.println(runnerB + " finished the race in " + timeB + " minutes and came in second.\n"
					+ runnerA + " finished the race in " + timeA + " minutes and came in third.");
			}
			else if(timeB > timeA)//B is third and A is second
			{
				System.out.println(runnerA + " finished the race in " + timeA + " minutes and came in second.\n"
					+ runnerB + " finished the race in " + timeB + " minutes and came in third.");
			}
			else//B and A tied for second
			{
				System.out.println(runnerB + " and " + runnerA + " both finished the race in " + timeA + " minutes and tied for second.");
			}	
		}
		else if (timeA == timeB && timeB == timeC)//Everybody tied
		{
			System.out.println(runnerA +", " + runnerB +", and " + runnerC + " tied for first with a time of " + timeA + " minutes!!");	
		}
		else//2 runners tied for first
		{
			//A and B tied for first
			if(timeA == timeB)
			{
				System.out.println(runnerA + " and " + runnerB + " both finished the race in " + timeA + " minutes and tied for first!"
					+ "\nand " + runnerC + " finised the race in " + timeC + " minutes and came in second.");
			}
			//B and C tied for first
			else if(timeB == timeC)
			{
				System.out.println(runnerB + " and " + runnerC + " both finished the race in " + timeB + " minutes and tied for first!"
					+ "\nand " + runnerA + " finised the race in " + timeA + " minutes and came in second.");
			}
			//A and C tied for first
			else
			{
				System.out.println(runnerA + " and " + runnerC + " both finished the race in " + timeA + " minutes and tied for first!"
					+ "\nand " + runnerB + " finised the race in " + timeB + " minutes and came in second.");
			}
		}
	}
}