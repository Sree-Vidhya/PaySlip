package CalculatorTest;

import org.junit.Test;
import Calculator.*;

import static org.junit.Assert.assertEquals;

public class NetIncomeCalculatorTest {

    @Test
    public void calcNetIncome() {
        GrossIncomeCalculator gross = new GrossIncomeCalculator();
        NetIncomeCalculator incomeCalculator = new NetIncomeCalculator(gross,60050);
        double netIncome = (incomeCalculator.calcNetIncome());
        assertEquals("4082.0",Double.toString(netIncome));
    }
}
