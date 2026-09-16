package week_2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;
import static week_2.Question_5_Filter_Array.printProgramFiles;


public class Question_5_Filter_Array_Test {
    
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    
    @Test(timeout = 3000)
    public void printingFilenamesTest() {
        // Check if the filenames are printed at all

        systemOutRule.clearLog();

        String[] exampleFilenames = { "accounting.xlsx", "ArraysAndStrings.java" , "Code.cs", "Diary.docx"};
        printProgramFiles(exampleFilenames);

        String actualOut = systemOutRule.getLog().trim().replace("\r", "");

        assertTrue("If printProgramFiles is called with the array { \"accounting.xlsx\", \"ArraysAndStrings.java\" , \"Code.cs\", \"Diary.docx\" } \n " +
                "then the output should include \"ArraysAndStrings.java\"",  actualOut.contains("ArraysAndStrings.java"));

        assertTrue("If printProgramFiles is called with the array { \"accounting.xlsx\", \"ArraysAndStrings.java\" , \"Code.cs\", \"Diary.docx\" } \n " +
                "then the output should include \"Code.cs\"",  actualOut.contains("ArraysAndStrings.java"));

    }
    
    
    @Test(timeout = 3000)
    public void filterArrayTest() {
    
        systemOutRule.clearLog();
    
        String[] exampleFilenames1 = { "lab1.py", "assignment.docx", "music.mp3", "Website.cs", "Calculator.java" };
        printProgramFiles(exampleFilenames1);   // This should print lab1.py, Website.cs and Calculator.java, one per line
        
        String expectedOut = "lab1.py\nWebsite.cs\nCalculator.java";
        String actualOut = systemOutRule.getLog().trim().replace("\r", "");
    
        assertEquals("Make sure your printProgramFiles method prints only the program files, " +
                "one per line, and doesn't print anything else.", expectedOut, actualOut);
        
        
        systemOutRule.clearLog();
        
        String[] exampleFilenames2 = { "accounting.xlsx", "ArraysAndStrings.java" };
        printProgramFiles(exampleFilenames2);   // This should print ArraysAndStrings.java, one per line
    
        String expectedOut2 = "ArraysAndStrings.java";
        String actualOut2 = systemOutRule.getLog().trim().replace("\r", "");
    
        assertEquals("Make sure your printProgramFiles method prints only the program files, " +
                "one per line, and doesn't print anything else.", expectedOut2, actualOut2);
        
    }
    
    
    @Test(timeout = 3000)
    public void filterByExtensionsTest() {
    
        systemOutRule.clearLog();
    
        String[] exampleFilenames2 = { "accountingcs", "happy", "theextension.java.isinthemiddle", "I_am_code.py", "ArraysAndStrings.notjava" };
        printProgramFiles(exampleFilenames2);   // This should only print I_am_code.java
    
        String expectedOut = "I_am_code.py";
        String actualOut = systemOutRule.getLog().trim().replace("\r", "");
    
        assertEquals("Make sure your printProgramFiles method prints only the program files. " +
                "Check that the filename ends with the extension, for example, '.py' and not with 'py'. A file called 'happy' should not be printed." +
                "Print the program filenames one per line, and don't print anything else.", expectedOut, actualOut);
    
    }
    
}
