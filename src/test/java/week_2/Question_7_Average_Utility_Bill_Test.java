package week_2;


import input.InputUtils;

import org.mockito.MockedStatic;
import org.mockito.Mockito;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

import static org.mockito.ArgumentMatchers.anyString;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Question_7_Average_Utility_Bill_Test {

    double delta = 0.00001;

    @Test(timeout=3000)
    public void testGetBillAmounts() {

        try (MockedStatic<InputUtils> mockInputUtil = Mockito.mockStatic(InputUtils.class)) {

            double[] exampleBills = {3.0, 4.0, 5.0, 6.0, 1.0, 2.0, 3.0, 6.0, 7.0, 3.0, 6.0, 7.0};

            mockInputUtil.when( () -> InputUtils.doubleInput(anyString())).thenReturn(3.0, 4.0, 5.0, 6.0, 1.0, 2.0, 3.0, 6.0, 7.0, 3.0, 6.0, 7.0);

            double[] actualBills = Question_7_Average_Utility_Bill.getBillAmounts(Question_7_Average_Utility_Bill.months);

            assertArrayEquals("Make you ask the user for 12 bill amounts, and save each value in a 12-element array. Return this array.",
                    exampleBills, actualBills, delta);
        }
    }

    @Test(timeout=3000)
    public void testGetBillsAmountsForFewerMonths() {

        try (MockedStatic<InputUtils> mockInputUtil = Mockito.mockStatic(InputUtils.class)) {

            double[] exampleBills = {3.0, 4.0, 5.0, 6.0};

            mockInputUtil.when( () -> InputUtils.doubleInput(anyString())).thenReturn(3.0, 4.0, 5.0, 6.0);

            double[] actualBills = Question_7_Average_Utility_Bill.getBillAmounts(new String[]{"January", "February", "March", "April"});

            assertArrayEquals("Make you ask the user for the bill amount for each month in the months array.\n,  " +
                            "Save each value in an array that is the same length as the months array. Return this array.",
                    exampleBills, actualBills, delta);
        }
    }

    @Test(timeout=3000)
    public void testGetBillsAmountsForMoreMonths() {

        try (MockedStatic<InputUtils> mockInputUtil = Mockito.mockStatic(InputUtils.class)) {

            double[] exampleBills = {3.0, 4.0, 5.0, 6.0, 1.0, 2.0, 3.0, 6.0, 7.0, 3.0, 6.0, 7.0, 19.3, 34.2};

            // two extra months at the end
            String[] moreMonths = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "January", "February"};

            mockInputUtil.when( () -> InputUtils.doubleInput(anyString())).thenReturn(3.0, 4.0, 5.0, 6.0, 1.0, 2.0, 3.0, 6.0, 7.0, 3.0, 6.0, 7.0, 19.3, 34.2);

            double[] actualBills = Question_7_Average_Utility_Bill.getBillAmounts(moreMonths);

            assertArrayEquals("Make you ask the user for the bill amount for each month in the months array.\n,  " +
                            "Save each value in an array that is the same length as the months array. Return this array.",
                    exampleBills, actualBills, delta);
        }
    }
    
    @Test(timeout=3000)
    public void testAverageBillAmount() {

        double[] exampleBills = {4.1, 5.1, 6.1};
        double expectedAverage = ( 4.1 + 5.1 + 6.1 ) / 3;
        double actualAverage = Question_7_Average_Utility_Bill.averageBillAmount(exampleBills);
        assertEquals("Check your math in the addition and average calculation. This method should work with any length array.",
                expectedAverage, actualAverage, delta);

    }
    
    @Test(timeout=3000)
    public void testPrintBillTable() {

        // Replace standard out to be able to test what System.out.println/printf is called with
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        double[] exampleBills = { 2 , 3 , 4 };

        String[] exampleMonths = { "jan", "feb", "mar" } ;

        Question_7_Average_Utility_Bill.printBillTable(exampleMonths, exampleBills);

        String output = out.toString();

        // Matching newlines with regex is a bit of a hassle. Get rid of the newline chars
        output = output.replace("\n", " ");    // Mac/Linux have \n for a newline char
        output = output.replace("\r", " ");   // For Windows PCs, which use \r\n for a newline.
        
        String pattern = ".*jan.*2.*feb.*3.*mar.*4.*";

        assertTrue("If you are sure your table is right but this method fails, please tell Clara, " +
                "\nthe test might not be reading your table correctly.", Pattern.matches(pattern, output));

    }
}