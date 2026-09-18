package week_2;

import static input.InputUtils.positiveDoubleInput;

/**
 
 Write a program that prints suggested tip amounts for a food check in a restaurant.
 
 The user will enter the amount of the check.
 
 The program will print the amount of tip for various percentages.
 
 It will print a table of suggested tip amounts from 10% to 30%, in 5% increments.
 
 For example, if the user has a check of $30, the program will print
 
10% tip $3.00 total $33.00
15% tip $4.50 total $34.50
20% tip $6.00 total $36.00
25% tip $7.50 total $37.50
30% tip $9.00 total $39.00
 
 Format the numbers to 2 decimal places.
 
 Your program's output should look exactly as shown above.
 
*/

public class Question_2_Tip_Amount_Calculator {

    public static void main(String[] args) {
    
        // You don't need to modify the main method.
        double checkAmount = positiveDoubleInput("What is the amount of the check?");
        printTipTable(checkAmount);

    }


    public static void printTipTable(double check) {
        
        /*
        * TODO Write a loop that loops from 10 to 30 in increments of 5
        * For each value (10, 15, 20, 25, 30) assume that this is a tip percentage
        *
        * Calculate the tip and total for each tip percentage.
        *
        *  For example, when the user has a check of $30, the program will print
 
         10% tip $3.00 total $33.00
         15% tip $4.50 total $34.50
         20% tip $6.00 total $36.00
         25% tip $7.50 total $37.50
         30% tip $9.00 total $39.00

        * Format the numbers to 2 decimal places.
        *
        * */
        
        // TODO write your loop here.
        double tip;
        double newCheck;
        String tipFormatted;
        String checkFormatted; 
    
        for (int i = 10; i <= 30; i += 5){
            tip = check * (i / 100.0);
            newCheck = tip + check;
            tipFormatted = String.format("%.2f", tip);
            checkFormatted = String.format("%.2f", newCheck);


            System.out.println(i + "% tip $" + tipFormatted + " total $" + checkFormatted);
        }
        
    }

}
