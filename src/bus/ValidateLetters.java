package bus;

public class ValidateLetters extends Exception {
    private static String message = "Name contain only alphabet. Please re-enter the correct one";
    public ValidateLetters() {super(message);}
}
