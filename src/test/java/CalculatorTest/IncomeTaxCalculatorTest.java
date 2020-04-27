package CalculatorTest;

import org.junit.Test;
import Calculator.IncomeTaxCalculator;

import static org.junit.Assert.assertEquals;

public class IncomeTaxCalculatorTest {
    private IncomeTaxCalculator taxCalculator = new IncomeTaxCalculator(60050);
    @Test
    public void calcIncomeTax() {
        double actual = taxCalculator.calcIncomeTax();
        assertEquals("922.0",Double.toString(actual));
    }
}
