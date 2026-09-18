package week_2;

/**

 Write a program that prints only the program file names from an array.
 
 For this question, a program file is any file that ends with .py or .java or .cs
 
 For example, if a filenames array  = { "lab1.py", "assignment.docx", "music.mp3", "Website.cs", "Calculator.java" }
 Then the program should print
 
 lab1.py
 Website.cs
 Calculator.java
 
 */

public class Question_5_Filter_Array {
    
    public static void main(String[] args) {
      
        // Some example String arrays, to help test the printProgramFiles method
        
        String[] exampleFilenames1 = { "lab1.py", "assignment.docx", "music.mp3", "Website.cs", "Calculator.java" };
        printProgramFiles(exampleFilenames1);   // This should print lab1.py, Website.cs and Calculator.java, one per line
        
        
        String[] exampleFilenames2 = { "accounting.xlsx", "lab2.py", "Arrays.java" };
        printProgramFiles(exampleFilenames2);   // This should print lab2.py and Arrays.java, one per line
    }
    
    
    public static void printProgramFiles(String[] filenames) {
        
        
        /*TODO complete this method. It should loop over the filenames array
        *   If the filename is a program code file then print the filename
        *   If not, then ignore it.
        *
        * A program file is any file that ends with .py or .java or .cs
        *
        * For example, if the filenames array  = { "lab1.py", "assignment.docx", "music.mp3", "Website.cs", "Calculator.java" }
        * Then this method should print these filenames, one per line:
        *

        lab1.py
        Website.cs
        Calculator.java

        *
        * Don't print anything else.
        * */
       for(int i = 0; i < filenames.length; i++){
        if(filenames[i].endsWith(".py") || filenames[i].endsWith(".java") || filenames[i].endsWith(".cs") ){
            System.out.println(filenames[i]);
        }
       }
        
        
    }

    
}


