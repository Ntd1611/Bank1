package bus;

public class ValidateNumbers extends Exception {
    private static  String error = "Please Enter Numbers From 0 to 9";
    public ValidateNumbers() {super(error);}
}
