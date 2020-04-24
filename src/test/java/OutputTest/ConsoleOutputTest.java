package OutputTest;

import Input.InterfaceInput;
import Input.MockInput;
import Output.ConsoleOutput;
import Output.InterfaceOutput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsoleOutputTest {
    @Test
    public void display() {
        InterfaceInput input = new MockInput();
        InterfaceOutput output = new ConsoleOutput(input);
        assertEquals("Your payslip has been generated:\n" +
                "Name: John  Doe\n" +
                "Pay period: 1 March - 31 March\n" +
                "Gross Income: 5004.0\n" +
                "Income Tax: 922.0\n" +
                "Net Income: 4082.0\n" +
                "Super: 450.0\n" +
                "Thank you for using MYOB!",output.display());

    }
}
