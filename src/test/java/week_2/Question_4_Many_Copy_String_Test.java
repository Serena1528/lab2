package week_2;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.*;
import static week_2.Question_4_Many_Copy_String.multiplyString;


/**
 * Created by clara on 11/2/17.
 */

public class Question_4_Many_Copy_String_Test {
    
    @Test(timeout=3000)
    public void multiplyStringTest() {
    
        String testIn = "cat";
        int[] inM = { 1, 5, 8, 5034 };
        String[] out = {"cat", "catcatcatcatcat", "catcatcatcatcatcatcatcat", "cat".repeat(5034)};
    
        for (int s = 0; s < inM.length ; s++) {
        
            int inMult = inM[s];
            String outSt = out[s];
        
            String msg = String.format("When calling multiplyString method with '%s', and %d repeats, it should return '%s'",
                    testIn, inMult, outSt);
                    
            assertEquals(msg, outSt, multiplyString(testIn, inMult) );
        
        }
    }


    @Test(timeout=3000)
    public void multiplyStringTestHandleNegative() {

        String testIn = "cat";
        int[] inM = { -1, -100 };
        String outSt = "";

        for (int inMult : inM) {
            String msg = String.format("When calling multiplyString method with the String '%s', and %d repeats, it should return an empty string'",
                    testIn, inMult);

            assertEquals(msg, outSt, multiplyString(testIn, inMult));
        }
    }


    @Test(timeout=3000)
    public void multiplyStringTestHandleZero() {

        String testIn = "example";
        int inMult = 0;
        String msg = String.format("When calling multiplyString method with the String '%s', and %d repeats, it should return an empty string'",
                testIn, inMult);

        assertEquals(msg, "", multiplyString("example", 0) );

    }


    @Test(timeout=3000)
    public void doesNotUseRepeat() {

        // Has the method been completed?
        assertEquals("aaaaa", multiplyString("a", 5));

        // Seems to be working, but does it use repeat?

        // Since we can't mock the String repeat method with Mockito, read the file and see if it uses the repeat method (ew)

        String codeFileName = "Question_4_Many_Copy_String.java";

        try {
            Path codeFilePath = Path.of("src", "main", "java", "week_2", codeFileName);
            String manyCopyStringFile = new String(Files.readAllBytes(codeFilePath));
            manyCopyStringFile = manyCopyStringFile.replace(" ", "");
            assertFalse("Don't use the String repeat() method in your code. Use a loop to create the repeated string. " +
                            "\nIf you have the text '.repeat(intVal)' in a comment or note in your code, please remove it. ",
                    manyCopyStringFile.contains(".repeat(repeats)"));

        } catch (IOException e) {
            System.err.println(e);
            fail("Error reading your code file for Question 2. " +
                    "Make sure you haven't renamed the code file. It should be called " + codeFileName );
        }
    }
    
}