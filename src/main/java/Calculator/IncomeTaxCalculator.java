package Calculator;

public class IncomeTaxCalculator {
    double salary;
    double extra_cents;
    double base_salary;
    double base_tax;

    public IncomeTaxCalculator(double salary) {
        this.salary = salary;
    }

    public double calcIncomeTax() {
        if (salary > 18201 && salary < 37000) {
            extra_cents = 0.19;
            base_salary = 18200;
        } else if (salary > 37001 && salary < 87000) {
            base_tax = 3572;
            extra_cents = 0.325;
            base_salary = 37000;
        } else if (salary > 87001 && salary < 180000) {
            base_tax = 19822;
            extra_cents = 0.37;
            base_salary = 87000;
        } else if (salary > 180001) {
            base_tax = 54232;
            extra_cents = 0.45;
            base_salary = 180000;
        }
        double income_tax = (base_tax + (salary - base_salary) * extra_cents) / 12;
        income_tax = Math.ceil(income_tax);
        return income_tax;
    }
}
