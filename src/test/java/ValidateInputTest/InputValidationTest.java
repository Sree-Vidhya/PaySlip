package ValidateInputTest;

import ValidateInput.InputValidation;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InputValidationTest {
    private InputValidation inputValidation = new InputValidation();
    @Test
    public void returnsTrueForDouble() {
        assertTrue(inputValidation.isSalaryValid("1000.00"));
    }
    @Test
    public void returnsFalseForInvalidSalary() {
        assertFalse(inputValidation.isSalaryValid("1000s"));
    }
    @Test
    public void returnsTrueForInteger() {
        assertTrue(inputValidation.isSuperValid("9"));
    }
    @Test
    public void returnsFalseForInvalidSuper() {
        assertFalse(inputValidation.isSalaryValid("9s"));
    }
}
