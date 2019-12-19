package bus;

public class Validation {

    public static boolean alphabetFormat(String alpha) throws ValidateLetters {
        if ((alpha.matches("^[a-zA-Z]*$")))
        {
            System.out.println( alpha + " is in a good format. Please continue");
        } else {
            throw new ValidateLetters();
        }
        return true;
    }

    public static boolean numberFormat(Integer source) throws ValidateNumbers {
        if ((Integer.toString(source).matches("\\d+.\\d+")))
        {
            System.out.println("\"" + source + "\""  + " is in a good format. Please continue");
        } else {
            throw new ValidateNumbers();
        }
        return true;
    }

    public static boolean SINFormat(String SIN) throws ValidateSIN {
        if ((SIN.matches("^\\d{3}-\\d{3}-\\d{3}$")))
        {
            System.out.println( SIN + " is in a good format. Please continue");
        } else {
            throw new ValidateSIN();
        }
        return true;
    }

    public static boolean EmailFormat(String email) throws ValidateEmail {
        if ((email.matches("^[\\\\w!#$%&’*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$")))
        {
            System.out.println( email + " is in a good format. Please continue");
        } else {
            throw new ValidateEmail();
        }
        return true;
    }

    public static boolean PhoneFormat(Integer number) throws ValidatePhoneNumber {
        if ((Integer.toString(number).matches("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$")))
        {
            System.out.println( number + " is in a good format. Please continue");
        } else {
            throw new ValidatePhoneNumber();
        }
        return true;
    }

    public static boolean PostalCodeFormat(String pp) throws ValidatePostalCode {
        if ((pp.matches("^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$")))
        {
            System.out.println( pp + " is in a good format. Please continue");
        } else {
            throw new ValidatePostalCode();
        }
        return true;
    }

}
