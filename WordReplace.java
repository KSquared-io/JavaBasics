//
// Assignment # 5 problem 2 --  Kevin Kovack
//

import java.util.Scanner;

public class WordReplace
{
	public static void main(String[] args)
	{
		//declarations
		String mySentence, findWord, replaceWord, newSentence;
		Scanner kb = new Scanner(System.in);
		int findWordStart, findWordEnd;
		//input
			//get a sentence from the user
		System.out.println("Write me any sentence:");
		mySentence = kb.nextLine();

		System.out.println("Write me a word from that sentence:");
		findWord = kb.nextLine();

		System.out.println("What should I replace that word with?:");
		replaceWord = kb.nextLine();

		//processing and output
		findWordStart = mySentence.indexOf(findWord);

		if (findWordStart >= 0)
		{
			//we found the word
			findWordEnd = findWordStart + findWord.length();

			newSentence = mySentence.substring(0, findWordStart) 
						+ replaceWord 
						+ mySentence.substring(findWordEnd, mySentence.length());
			System.out.println(newSentence);
		}
		else
		{
			System.out.println("The word " + findWord + " is not in the sentence.");
		}
	}
}