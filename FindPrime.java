//
// assignment 7 -- problem 4 -- kevin kovack
//
import java.util.Scanner;
import java.io.*;

public class FindPrime
{
	public static int userInt()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer and I will write "
			+ "all the prime numbers leading to it: ");
		return kb.nextInt();
	}

	public static boolean isPrime(int number) 
	{
    	number = Math.abs(number);
	    //2 is a special case. It's the only even prime number
		if(number==2 || number == 1)
			return true;
	    //multiples of 2 are never prime
	    if (number%2==0) 
	    	return false;
	    
	    //check square roots of numbers to check only the next divisors that matter
	    for(int i=3;i*i<=number;i+=2) 
	    {
	        if(number%i==0)
	            return false;
	    }

    	return true;
	}

	public static void savePrimes(int number) throws IOException
	{
		for(int i=0;i<=number;i++) 
		{
       		if(isPrime(i))
       			writeMyInt(i);	
    	}
	}

	public static void writeMyInt(int number) throws IOException
	{
		PrintWriter out = new PrintWriter(new FileWriter("outputfile.txt", true)); 
		out.println(number); 
		out.close();	
		System.out.println(number + " was printed to outputfile.txt");
	}

	public static void newOutputFile() throws IOException
	{
		PrintWriter out = new PrintWriter(new FileWriter("outputfile.txt")); 
		out.print(""); 
		out.close();
		System.out.println("\nA blank outputfile.txt was created in current directory.\n");	
	}

	public static void main(String[] args) throws IOException
	{
		int myUserInt;

		//get user int
		myUserInt = userInt();

		//is it prime?
		if(isPrime(myUserInt))
		{
			System.out.println("YOU FOUND A PRIME NUMBER!");
			newOutputFile();
			savePrimes(myUserInt);
		}
		else
		{
			System.out.println("Your number is not prime.");
			newOutputFile();
			savePrimes(myUserInt);
		}
	}
}