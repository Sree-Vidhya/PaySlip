import Input.ConsoleInput;
import Input.InterfaceInput;
import Output.ConsoleOutput;
import Output.InterfaceOutput;

public class PayslipApp {
    public static void main(String[] args) {
        InterfaceInput input = new ConsoleInput();
        InterfaceOutput output = new ConsoleOutput(input);
        output.display();
    }
}
