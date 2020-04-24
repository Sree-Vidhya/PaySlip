package OutputTest;

import Input.ConsoleInput;
import Input.InterfaceInput;
import Input.MockInput;
import Output.ConsoleOutput;
import Output.InterfaceOutput;
import org.junit.Test;

public class ConsoleOutputTest {
    @Test
    public void display() {
        InterfaceInput input = new MockInput();
        InterfaceOutput output = new ConsoleOutput(input);
        output.display();
    }
}
