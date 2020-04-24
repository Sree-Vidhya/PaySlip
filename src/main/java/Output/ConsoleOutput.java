package Output;

import Calculator.PaySlipCalculator;
import Input.InterfaceInput;

public class ConsoleOutput implements InterfaceOutput {
    private InterfaceInput interfaceInput;

    public ConsoleOutput(InterfaceInput interfaceInput) {
        this.interfaceInput = interfaceInput;
    }
    public String display(){
        PaySlipCalculator paySlipCalculator = new PaySlipCalculator(interfaceInput);
        return paySlipCalculator.payslipCalculator();
    }
}
