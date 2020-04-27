import Input.ConsoleInput;
import Input.FileInput;
import Input.InterfaceInput;
import Output.ConsoleOutput;
import Output.FileOutput;
import Output.InterfaceOutput;

public class PayslipApp {
    public static void main(String[] args) {
        System.out.println("Input From Console");
        InterfaceInput consoleInput = new ConsoleInput();
        InterfaceOutput consoleOutput = new ConsoleOutput(consoleInput);
        System.out.println();
        System.out.println("Welcome to the payslip generator! ");
        System.out.println(consoleOutput.display());
        System.out.println();

        System.out.println("Input From File");
        InterfaceInput interfaceInput = new FileInput();
        FileOutput output = new FileOutput(interfaceInput);
        System.out.println("Welcome to the payslip generator! ");
        System.out.println(output.display());
    }
}
