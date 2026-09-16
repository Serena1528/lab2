package week_2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.util.regex.Pattern;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static week_2.Question_2_Tip_Amount_Calculator.printTipTable;

public class Question_2_Tip_Amount_Calculator_Test {
    
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    @Test(timeout = 3000)
    public void testCorrectNumbersPrinted() {
        
        systemOutRule.clearLog();
        printTipTable(30);
        String out = systemOutRule.getLog().trim();
        out = out.replace("\n", " ");
        out = out.replace("\r", "");
        out = out.replace("\t", " ");
        
        String expectedTableNoFormatting = " 10 3.0 33.0 " +
                "15 4.5 34.5 " +
                "20 6.0 36.0 " +
                "25 7.5 37.5 " +
                "30 9.0 39.0 ";
        
        String regex = expectedTableNoFormatting.replace(" ", ".*");
        System.out.println(regex);
        
        assertTrue("Check the math in your loop. Make sure your percentages are calculated correctly. Example: 10% of 30 is 3. \n" +
                        "Don't print any extra numbers.  " +
                        "Print the tip percent, then the tip amount, then the total (tip+check) for every tip percent. ",
                Pattern.matches(regex, out));
    }
    
    
    @Test(timeout = 3000)
    public void testTipTableWithFormatting30() {
        
        /*
   
        * Expected table for a check of $30 looks like this
        *
             10% tip $3.00 total $33.00
             15% tip $4.50 total $34.50
             20% tip $6.00 total $36.00
             25% tip $7.50 total $37.50
             30% tip $9.00 total $39.00
        *
        * */
        
        
        String expectedTable = "10% tip $3.00 total $33.00\n" +
                "15% tip $4.50 total $34.50\n" +
                "20% tip $6.00 total $36.00\n" +
                "25% tip $7.50 total $37.50\n" +
                "30% tip $9.00 total $39.00";
        
        systemOutRule.clearLog();
        printTipTable(30);
        String out = systemOutRule.getLog().replace("\r", "").trim();
        
        assertEquals("Make sure you print the table in the exact format specified in the question. \n" +
                        "Click the \"Click to see difference\" link in the test results to compare the \n" +
                        "expected table to the text your code printed.",
                expectedTable, out);
    }
    
    
    
    @Test(timeout = 3000)
    public void testTipTable_1722() {
        
        /*
        * Expected table for a check of $17.22 looks like this
       
        10% tip $1.72 total $18.94
        15% tip $2.58 total $19.80
        20% tip $3.44 total $20.66
        25% tip $4.31 total $21.53
        30% tip $5.17 total $22.39
*
        *
        * */
        
        
        String expectedTable = "10% tip $1.72 total $18.94\n" +
                "15% tip $2.58 total $19.80\n" +
                "20% tip $3.44 total $20.66\n" +
                "25% tip $4.31 total $21.53\n" +
                "30% tip $5.17 total $22.39";
        
        systemOutRule.clearLog();
        printTipTable(17.22);
        String out = systemOutRule.getLog();
        out = out.replace("\r", "");  // remove windows line feed chars
        out = out.trim();  // and any stray whitespace

        assertEquals("Make sure you print the table in the exact format specified in the question. \n" +
                        "Click the \"Click to see difference\" link in the test results to compare the \n" +
                        "expected table to the text your code printed.",
                expectedTable, out);
        
        
        
    }
    
    
    
}