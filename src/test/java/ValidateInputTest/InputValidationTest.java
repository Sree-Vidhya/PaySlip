package ValidateInputTest;

import ValidateInput.InputValidation;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InputValidationTest {
    InputValidation inputValidation = new InputValidation();
    @Test
    public void returnsTrueForDouble() {
        assertTrue(inputValidation.isSalaryValid("1000.00"));
    }
    @Test
    public void returnsTrueForInteger() {
        assertTrue(inputValidation.isSuperValid("1000"));
    }
}
