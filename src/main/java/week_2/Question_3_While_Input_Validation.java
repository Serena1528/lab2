package week_2;

import input.InputUtils;

import static input.InputUtils.intInput;

/**
 
 Write a program that asks for a college class code.
 A code must be a number between 1000 and 2999.
 
 Your program should validate that the class code entered is between 1000 and 2999.
 If it is not, then ask for the code again. Repeat until the user enters a valid class code.
 
 */
public class Question_3_While_Input_Validation {
    
    public static void main(String[] args) {
        int code = getCollegeClassCode();
        System.out.println("Thank you, your code is " + code);
    }

    public static int getCollegeClassCode() {

        /*
        * TODO Complete this method.
        *
        * Use the intInput method to print a message asking the user for a class code. (don't use positiveIntInput.)
        *
        * A code must be a number between 1000 and 2999.
        * In case the user makes a mistake and enters a number lower than 1000 or a number more than 2999,
        * write a validation while loop. This loop should repeat while the data entered is invalid.
        *
        * When the user enters a valid class code, the method will return the class code entered.
        *
        * */
        
        //TODO delete this line and replace this with your code.
       return 0;
        
    }

}
