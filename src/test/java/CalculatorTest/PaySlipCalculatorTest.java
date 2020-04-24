package CalculatorTest;

import Calculator.PaySlipCalculator;
import Input.InterfaceInput;
import Input.MockInput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PaySlipCalculatorTest {

    @Test
    public void payslipCalculator() {
        InterfaceInput interfaceInput = new MockInput();
        PaySlipCalculator paySlipCalculator = new PaySlipCalculator(interfaceInput);
        System.out.println(paySlipCalculator.payslipCalculator());
        assertEquals("Your payslip has been generated:\n" +
                "Name: John  Doe\n" +
                "Pay period: 1 March - 31 March\n" +
                "Gross Income: 5004.0\n" +
                "Income Tax: 922.0\n" +
                "Net Income: 4082.0\n" +
                "Super: 450.0\n" +
                "Thank you for using MYOB!",paySlipCalculator.payslipCalculator());
    }
}
