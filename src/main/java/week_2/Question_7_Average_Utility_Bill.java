package week_2;

import static input.InputUtils.doubleInput;

/**
 Customers of a energy (gas, electricity) utility company have much larger bills in the
 cold winter than in the summer.
 
 The utility company allows customers to spread the cost of bills through the year by
 charging the average bill payment every month.
 
 So, the customer will pay the same amount every month, to make budgeting easier.
 A customer will pay less than their actual bill in the winter, and more than their
 actual bill in the summer. But over the year, they will pay the same total amount.
 
 The utility company averages all the last year's bills, and uses that to estimate the
 average payment for next year.
 
 Write a program to calculate the average bill for all 12 monthly bills.
 
 Ask the user for each month's bill for last year.
 Store this data in a new double array.
 Store January's bill in element 0, February's in element 1, March's in element 3...
 
 Then, add up all the bills and calculate, and display the average.
 
 Also, display the user's data in a table of months and bill amounts, so they can
 review it for accuracy.
 
 Tip: use the `months` array provided, with the names of the months,
 to help ask for data and display data.
 */


public class Question_7_Average_Utility_Bill {

    // Use this array in your loops to help print questions like "What was your January bill?"   "What was your February bill?"
    static String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

    public static void main(String[] args) {

        // You don't need to modify this method.
        double[] bills = getBillAmounts(months);
        double average = averageBillAmount(bills);
        System.out.printf("Your average bill is %.2f%n", average);
        printBillTable(months, bills);

    }

    public static double[] getBillAmounts(String[] monthNames) {

        //TODO ask user for bill amount for each of the months named in the monthNames array.
        //  Create a new double array.
        //  Store values the user enters in this array.
        //  Return this array.
        //  Use doubleInput(question) to ask the user for each bill amount.
        //   Why not positiveDoubleInput? A bill may be negative if the user overpaid in the previous month or received a credit.
        //   Use the form with the String argument, e.g. doubleInput("Enter bill amount");
        //   The test will fail if you use doubleInput() with no argument.
        //  Make sure your method still works if the length of the monthNames array is different
        //  So for example, when monthNames only has 3 months in it, then create a bill amounts array for 3 bills.
        //  Or if monthNames has 15 months in it, then create a bill amounts array for 15 bills.
        //  Remember that you can find out the length of an array, and use that length to set the size of another array.

        return null;  // TODO replace with your code

    }


    public static double averageBillAmount(double[] bills) {

        //TODO Calculate the average value of all the bills, and return this number.
        //  make sure this method works with any length array.
        
        return 0;  // TODO replace with your code
    }


    public static void printBillTable(String[] months, double[] bills) {

        //TODO display the month names, and bill amounts, in table form.
        //  Use the data in the months and bills parameters. You can assume the arrays are the same length
        //  and the first element of the months array corresponds to the first element of the bills array
        //  the second element of the months array corresponds to the second element of the bills array etc...
        //  make sure this method works with any length array.

        
        /* Replace these lines with your code. You'll need to use a loop to display all the months.
        String formatting is helpful. Here's some examples that space columns with exactly 15 character width,
        
        System.out.println(String.format("| %-15s| %-15s|", "Month", "Bill" ));
        System.out.println(String.format("| %-15s| %-15.2f|", "January", 44.5995 ));
        
        */

    }


}
