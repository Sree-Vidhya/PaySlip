package OutputTest;

import Calculator.PaySlipCalculator;
import Input.InterfaceInput;
import Output.FileOutput;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class FileOutputTest {

    @Test
    public void displayOutputTest() {
        InterfaceInput interfaceInput = Mockito.mock(InterfaceInput.class);
        FileOutput output = new FileOutput(interfaceInput);
        PaySlipCalculator paySlipCalculator = Mockito.mock(PaySlipCalculator.class);
        when(paySlipCalculator.payslipCalculator()).thenReturn("Your payslip has been generated:\n" +
                "Name: John  Doe\n" +
                "Pay period: 1 March - 31 March\n" +
                "Gross Income: 5004.0\n" +
                "Income Tax: 922.0\n" +
                "Net Income: 4082.0\n" +
                "Super: 450.0\n" +
                "Thank you for using MYOB!");
        assertEquals("Success",output.display());
    }
}
