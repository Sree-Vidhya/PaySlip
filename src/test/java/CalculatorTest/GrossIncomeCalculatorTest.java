package CalculatorTest;

import org.junit.Test;
import Calculator.GrossIncomeCalculator;

import static org.junit.Assert.assertEquals;


public class GrossIncomeCalculatorTest {
    private GrossIncomeCalculator grossIncomeCalculator = new GrossIncomeCalculator();
    @Test
    public void calcGrossIncome() {
        double actual = grossIncomeCalculator.calcGrossIncome(12000);
        assertEquals("1000.0",Double.toString(actual));
    }


}


