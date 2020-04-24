import Input.ConsoleInput;
import Input.InterfaceInput;
import Output.ConsoleOutput;
import Output.InterfaceOutput;

public class PayslipApp {
    public static void main(String[] args) {
        InterfaceInput input = new ConsoleInput();
        InterfaceOutput output = new ConsoleOutput(input);
        System.out.println();
        System.out.println("Welcome to the payslip generator! ");
        System.out.println(output.display());
    }
}
