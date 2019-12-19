package bus;

public class ValidateEmail extends Exception {
    private static String message = "Email is in a wrong format. Please re-enter the correct one";
    public ValidateEmail() {super(message);}
}
