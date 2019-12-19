package bus;

public class ValidatePostalCode extends Exception{
    private static String message = "Please enter a right format for postal code";
    public ValidatePostalCode() { super(message); }
}
