package Input;

public class MockInput implements InterfaceInput {

    @Override
    public String firstName() {
        return "John ";
    }

    @Override
    public String lastName() {
        return "Doe";
    }

    @Override
    public String salary() {
        return "60050";
    }

    @Override
    public String superRate() {
        return "9";
    }

    @Override
    public String startDate() {
        return "1 March";
    }

    @Override
    public String endDate() {
        return "31 March";
    }
}
