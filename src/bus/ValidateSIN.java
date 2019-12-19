package bus;

public class ValidateSIN extends Exception {
    private static String message = "SIN only contain numbers. Please re-enter in a correct format";
    public ValidateSIN() {
        super(message);
    }
}
