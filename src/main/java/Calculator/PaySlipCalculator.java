package Calculator;
import Input.InterfaceInput;
import ValidateInput.InputValidation;

public class PaySlipCalculator {
    private InterfaceInput input;
    private InputValidation validate = new InputValidation();
    private GrossIncomeCalculator grossIncome = new GrossIncomeCalculator();

    public PaySlipCalculator(InterfaceInput input) {
        this.input = input;
    }
    public String payslipCalculator(){
        boolean checkSalary;
        boolean checkSuper;
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println();
        System.out.println("Welcome to the payslip generator! ");
        System.out.println();
        String firstName = input.firstName();
        String lastName = input.lastName();
        String salary = input.salary();
        checkSalary = validate.isSalaryValid(salary);
        while (!checkSalary){
            salary = input.salary();
            checkSalary = validate.isSalaryValid(salary);
        }
        double annualIncome =Double.parseDouble(salary);

        String Super = input.superRate();
        checkSuper = validate.isSuperValid(Super);
        while (!checkSuper){
           Super = input.superRate();
           checkSuper = validate.isSuperValid(Super);
        }
        int inputSuperRate = Integer.parseInt(Super);
        String startDate = input.startDate();
        String endDate = input.endDate();
        System.out.println();

        IncomeTaxCalculator incomeTax = new IncomeTaxCalculator(annualIncome);
        NetIncomeCalculator netIncome = new NetIncomeCalculator(grossIncome,annualIncome);
        SuperCalculator superCalc = new SuperCalculator(grossIncome,inputSuperRate);
        stringBuilder.append("Your payslip has been generated:\n");
        stringBuilder.append("Name: ").append(firstName).append(" ").append(lastName).append("\n");
        stringBuilder.append("Pay period: ").append(startDate).append(" - ").append(endDate).append("\n");
        stringBuilder.append("Gross Income: ").append(grossIncome.calcGrossIncome(annualIncome)).append("\n");
        stringBuilder.append("Income Tax: ").append(incomeTax.calcIncomeTax()).append("\n");
        stringBuilder.append("Net Income: ").append(netIncome.calcNetIncome()).append("\n");
        stringBuilder.append("Super: ").append(superCalc.calcSuperRate(annualIncome)).append("\n");
        stringBuilder.append("Thank you for using MYOB!");
        return stringBuilder.toString();
    }
}
