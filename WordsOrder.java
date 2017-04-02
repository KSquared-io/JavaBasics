//
// Assignment 3 problem 2       Kevin Kovack
//

//need scanner imported
import java.util.Scanner;

public class WordsOrder
{
	public static void main(String [] args)
	{
		//DECLARATIONS
		String firstWord, secondWord, thirdWord;
		Scanner kb = new Scanner(System.in);

		//INPUT
		System.out.print("Enter three words, then I will print them in alphabetical order.\nEnter the first word: ");
		firstWord = kb.nextLine();

		System.out.print("Enter the second word: ");
		secondWord = kb.nextLine();

		System.out.print("Enter the third word: ");
		thirdWord = kb.nextLine();

		//PROCESSING // OUTPUT
		boolean movedWord; //use this to determine if there's changes that were made until there are no changes
		do 
		{
 			movedWord = false; //start with no changes
  			if (secondWord.compareTo(firstWord) < 0) 
  			{
    			String temporaryWord = secondWord; //temporaryWord holds the other word while we move positions
    			secondWord = firstWord;
    			firstWord = temporaryWord;
    			movedWord = true;
  			}
  			if (thirdWord.compareTo(secondWord) < 0) 
  			{
    			String temporaryWord = thirdWord;
    			thirdWord = secondWord;
    			secondWord = temporaryWord;
    			movedWord = true;
  			}		
  		} while (movedWord);

System.out.println(firstWord);
System.out.println(secondWord);
System.out.println(thirdWord);
	}
}