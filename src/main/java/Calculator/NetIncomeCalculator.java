package Calculator;

public class NetIncomeCalculator {
    IncomeTaxCalculator taxCalculator;
    GrossIncomeCalculator grossIncomeCalculator;
    double salary;

    public NetIncomeCalculator(GrossIncomeCalculator grossIncomeCalculator, double salary) {
        this.grossIncomeCalculator = grossIncomeCalculator;
        this.salary = salary;
        taxCalculator = new IncomeTaxCalculator(salary);
    }

    public double calcNetIncome(){
        return Math. round(grossIncomeCalculator.calcGrossIncome(salary) - taxCalculator.calcIncomeTax());
    }
}
