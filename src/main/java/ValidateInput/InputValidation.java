package ValidateInput;

public class InputValidation {

    public boolean isSalaryValid(String salary){
        try {
            Double.parseDouble(salary);
            return true;
        }
        catch (Exception ex){
            System.out.println("Not a valid Input. try again!");
            return false;
        }
}
    public boolean isSuperValid(String superInput){
        try {
            Integer.parseInt(superInput);
            return true;
        }
        catch (Exception ex){
            System.out.println("Not a valid Input. try again!");
            return false;
        }
    }
}
