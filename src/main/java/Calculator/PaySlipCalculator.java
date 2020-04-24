package Calculator;

import Input.ConsoleInput;
import Input.InterfaceInput;
import ValidateInput.InputValidation;

public class PaySlipCalculator {
    InterfaceInput input = new ConsoleInput();
    InputValidation validate = new InputValidation();
    GrossIncomeCalculator grossIncome = new GrossIncomeCalculator();
    boolean checkSalary;
    boolean checkSuper;

    public String payslipCalculator(){
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
        stringBuilder.append("Name: "+firstName+" "+lastName+"\n");
        stringBuilder.append("Pay period: "+startDate+" - "+endDate+"\n");
        stringBuilder.append("Gross Income: "+grossIncome.calcGrossIncome(annualIncome)+"\n");
        stringBuilder.append("Income Tax: "+incomeTax.calcIncomeTax()+"\n");
        stringBuilder.append("Net Income: "+netIncome.calcNetIncome()+"\n");
        stringBuilder.append("Super: "+superCalc.calcSuperRate(annualIncome)+"\n");
        stringBuilder.append("Thank you for using MYOB!");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        PaySlipCalculator paySlipCalculator = new PaySlipCalculator();
        System.out.println(paySlipCalculator.payslipCalculator());
    }
}
