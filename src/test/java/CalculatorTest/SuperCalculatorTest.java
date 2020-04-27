package CalculatorTest;

import org.junit.Test;
import Calculator.*;

import static org.junit.Assert.assertEquals;

public class SuperCalculatorTest {

    @Test
    public void calcSuperRate() {
        GrossIncomeCalculator grossIncomeCalculator = new GrossIncomeCalculator();
        SuperCalculator Super = new SuperCalculator(grossIncomeCalculator,9);
        String actual = Double.toString(Super.calcSuperRate(60050));
        assertEquals("450.0",actual);
    }
}
