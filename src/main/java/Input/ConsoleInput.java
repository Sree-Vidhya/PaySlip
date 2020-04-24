package Input;

import java.util.Scanner;

public class ConsoleInput implements InterfaceInput {
   private Scanner scanner = new Scanner(System.in);
    @Override
    public String firstName() {
        System.out.println("Please input your name: ");
        return (scanner.nextLine());
    }

    @Override
    public String lastName() {
        System.out.println("Please input your surname: ");
        return (scanner.nextLine());
    }

    @Override
    public String salary() {
        System.out.println("Please enter your annual salary: ");
        return (scanner.nextLine());
    }

    @Override
    public String superRate() {
        System.out.println("Please enter your super rate: ");
        return (scanner.nextLine());
    }

    @Override
    public String startDate() {
        System.out.println("Please enter your payment start date: ");
        return (scanner.nextLine());
    }

    @Override
    public String endDate() {
        System.out.println("Please enter your payment end date: ");
        return (scanner.nextLine());
    }
}
