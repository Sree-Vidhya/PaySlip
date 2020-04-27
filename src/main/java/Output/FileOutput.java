package Output;

import Calculator.PaySlipCalculator;
import Input.FileInput;
import Input.InterfaceInput;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements InterfaceOutput {
    private InterfaceInput input;
    private FileInput fileInput = new FileInput();
    private PaySlipCalculator paySlipCalculator = new PaySlipCalculator(fileInput);

    public FileOutput(InterfaceInput input) {
        this.input = input;
    }

    @Override
    public String display() {
        String fileName = "OutputFile";
        FileWriter filewriter = null;
        try {
            fileInput.readFile();
            filewriter = new FileWriter(fileName);
            String content = paySlipCalculator.payslipCalculator();
            filewriter.write(content);
            filewriter.flush();
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ("Success");
    }
}
