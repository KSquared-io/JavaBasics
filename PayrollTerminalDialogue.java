//
// Assignment #2 problem #2 --- Kevin Kovack
//

import java.util.Scanner; //needed to use the Scanner class

import javax.swing.JOptionPane; //need this for dialogues

public class PayrollTerminalDialogue
{
    public static void main(String[] args)
    {
        //Declarations
        String employeeName;
        double payRate, hoursWorked, grossPay;
            //creating a Scanner object to read input
        Scanner keyboard = new Scanner(System.in); 

        //Input
        
        //Old Input
        //System.out.print("What is your name?: ");
        //employeeName = keyboard.nextLine(); //reads the name
        
        //New Input for name
        employeeName = JOptionPane.showInputDialog("What is your name?: ");

        //Old Input for hours worked
        //System.out.print("Enter the hours you worked:");
        //hoursWorked = keyboard.nextDouble(); //reads the hours worked

        //New Input for hours worked
        String hoursWorkedText = JOptionPane.showInputDialog("Enter the hours you worked: ");
        hoursWorked = Double.parseDouble(hoursWorkedText);

        //Old Input for pay rate
        //System.out.print("What is your pay rate?:");
        //payRate = keyboard.nextDouble(); //reads the payrate
        
        //New Input for pay rate
        String payRateText = JOptionPane.showInputDialog("What is your pay rate?: ");
        payRate = Double.parseDouble(payRateText);

        //Processing
            //calculate grossPay based on the 
            //pay rate times the number of hours worked
        grossPay = payRate * hoursWorked; 

        //Output

        //Old output
        //System.out.println("\nHello " + employeeName + 
        //                   "\nYour gross pay is $" + grossPay);
        
        //New output without using NetBeans
        JOptionPane.showMessageDialog (null, "\nHello " + employeeName + 
                                    "\nYour gross pay is $" + grossPay); 
    }
}