//
// Assignment # 5 problem 5 --  Kevin Kovack
//
import java.util.Scanner;

public class Cipher 
{
    public static void main(String[] args) 
    {
 
        //declarations
        String myString;
 		Scanner kb = new Scanner(System.in);

        //input
        System.out.println("Type a String for me to Caeser Cipher:");
        myString = kb.nextLine();

 		//output
        System.out.println( Cipher.encode( myString, 3  ));
        System.out.println( Cipher.decode( Cipher.encode( myString, 3), 3 ));
    }

    //processing
    public static String decode(String enc, int offset) 
    {
    	//reverse the encoding
        return encode(enc, 26-offset);
    }
 
    public static String encode(String enc, int offset) 
    {
    	//use the offset within the alphabets
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        //do letter by letter for capital and lowercase seperately since each is 26 characters
        for (char i : enc.toCharArray()) 
        {
            if (Character.isLetter(i)) 
            {
                if (Character.isUpperCase(i)) 
                {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } 
                else 
                {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } 
            else 
            {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
}