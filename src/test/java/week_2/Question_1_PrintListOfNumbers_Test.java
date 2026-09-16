package week_2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;
import static week_2.Question_1_Print_List_Of_Numbers.*;

public class Question_1_PrintListOfNumbers_Test {
    
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    @Test(timeout=3000)
    public void testPrintNumbers1To10() {
        systemOutRule.clearLog();
        String expected = buildExpected(1, 10);
        printNumbers(1, 10);
        String actualPrinted = systemOutRule.getLog().replace("\r", "").trim();
        assertEquals("Print the numbers 1 through 10, one per line. Make sure you include 10.", expected, actualPrinted);
    }
    
    
    @Test(timeout=3000)
    public void testPrintNumbers1To4() {
        systemOutRule.clearLog();
        String expected = buildExpected(1, 4);
        printNumbers(1, 4);
        String actualPrinted = systemOutRule.getLog().replace("\r", "").trim();
        assertEquals("Use the method's from and to arguments to set up your loop. " +
                "If the method is called with 1 and 4, it should print " +
                        "\n1 \n2 \n3 \n4\n" +
                        "Make sure you include the number 4.",
                expected, actualPrinted);
    }
    
    
    
    @Test(timeout=3000)
    public void testPrintNumbers37To42() {
        systemOutRule.clearLog();
        String expected = buildExpected(37, 42);
        printNumbers(37, 42);
        String actualPrinted = systemOutRule.getLog().replace("\r", "").trim();
        assertEquals("Use the method's from and to arguments to set up your loop. " +
                        "If the method is called with 37 and 42, it should print " +
                        "\n37 \n38 \n39 \n40 \n41 \n42\n." +
                        "Make sure you include the number 42.",
                expected, actualPrinted);
    }


    private String buildExpected(int from, int to) {
    
        StringBuilder builder = new StringBuilder();
        
        for (int x = from; x <= to ; x++) {
            builder.append(x);
            builder.append("\n");
        }
        
        return builder.toString().trim();
    }
    
}