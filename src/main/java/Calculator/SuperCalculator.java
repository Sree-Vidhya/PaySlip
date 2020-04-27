package Calculator;

public class SuperCalculator {
    private GrossIncomeCalculator grossIncomeCalculator;
    private int rateOfSuper;

    public SuperCalculator(GrossIncomeCalculator grossIncomeCalculator, int rateOfSuper) {
        this.grossIncomeCalculator = grossIncomeCalculator;
        this.rateOfSuper = rateOfSuper;
    }

    public double calcSuperRate(double salary){
        double grossIncome =  grossIncomeCalculator.calcGrossIncome(salary);
        double superRate = grossIncome * rateOfSuper/100;
        return Math.round(superRate);
    }
}
