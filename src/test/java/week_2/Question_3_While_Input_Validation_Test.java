package week_2;

import input.InputUtils;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static week_2.Question_3_While_Input_Validation.getCollegeClassCode;

public class Question_3_While_Input_Validation_Test {

    @Test(timeout=3000)
    public void testGetCodeRejectNumbersTooHigh() {

        try (MockedStatic<InputUtils> mockInputUtil = Mockito.mockStatic(InputUtils.class)) {
            mockInputUtil.when( () -> InputUtils.intInput(anyString()))
                    .thenReturn(3000)      // too high
                    .thenReturn(300000000)   // too high
                    .thenReturn(12345)   // too high
                    .thenReturn(1500)  // valid
                    .thenThrow(new RuntimeException("Once the user has entered a valid code, don't ask any for any more input."));

            int code = getCollegeClassCode();

            assertEquals("The getCollegeClassCode method should reject input numbers greater than 2999.\n" +
                            "If the user enters a number greater then 2999, ask the user to enter the number again.",
                    code, 1500);
        }
    }

    @Test(timeout=3000)
    public void testGetCodeRejectNumbersTooLow() {

        try (MockedStatic<InputUtils> mockInputUtil = Mockito.mockStatic(InputUtils.class)) {
            mockInputUtil.when( () -> InputUtils.intInput(anyString()))
                    .thenReturn(999)      // too low
                    .thenReturn(300)   // too low
                    .thenReturn(300)   // too low
                    .thenReturn(-10000)   // too low
                    .thenReturn(1500)    // valid
                    .thenThrow(new RuntimeException("Once the user has entered a valid code, don't ask any more questions."));

            int code = getCollegeClassCode();

            assertEquals("The getCollegeClassCode method should reject input numbers lower than 1000.\n" +
                            "If the user enters a number lower thn 1000, ask the user to enter the number again.",
                    code, 1500);
        }
    }


    @Test(timeout=3000)
    public void testGetCodeAcceptValidNumbers() {

        try (MockedStatic<InputUtils> mockInputUtil = Mockito.mockStatic(InputUtils.class)) {
            mockInputUtil.when( () -> InputUtils.intInput(anyString()))
                    .thenReturn(1000)
                    .thenThrow(new RuntimeException("Once the user has entered a valid code, don't ask any for any more input."));

            int code = getCollegeClassCode();

            assertEquals("The getCollegeClassCode method should accept the code 1000. " +
                            "\nOnce a valid number is entered, don't ask for any more input.",
                    code, 1000);
        }


        try (MockedStatic<InputUtils> mockInputUtil = Mockito.mockStatic(InputUtils.class)) {
            mockInputUtil.when( () -> InputUtils.intInput(anyString()))
                    .thenReturn(2545)
                    .thenThrow(new RuntimeException("Once the user has entered a valid code, don't ask any for any more input."));

            int code = getCollegeClassCode();

            assertEquals("The getCollegeClassCode method should accept the code 2545.",
                    code, 2545);
        }


        try (MockedStatic<InputUtils> mockInputUtil = Mockito.mockStatic(InputUtils.class)) {
            mockInputUtil.when( () -> InputUtils.intInput(anyString()))
                    .thenReturn(2999)
                    .thenThrow(new RuntimeException("Once the user has entered a valid code, don't ask any for any more input."));

            int code = getCollegeClassCode();

            assertEquals("The getCollegeClassCode method should accept the code 2999.",
                    code, 2999);
        }

    }

}