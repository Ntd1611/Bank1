package bus;

public class ValidatePhoneNumber extends Exception {
    private static String message = "Phone Number is in wrong format. Please re-enter phone number";
    public ValidatePhoneNumber() { super(message );}
}
