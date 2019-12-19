package bus;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private String sin;
    private int id, phoneNumber;
    private String email, address, postalCode;
    private Date birthDate;
    private List<Account> accountList;

    public Customer() {
        this.firstName = "";
        this.lastName = "";
        this.sin = "0";
        this.id = 0;
        this.phoneNumber = 0;
        this.email = "";
        this.address = "";
        this.postalCode = "";

        this.birthDate = new Date();
        this.accountList = new ArrayList<>();
    }

    public Customer(String firstName, String lastName, String sin, int id, int phoneNumber, String email, String address, Date birthDate, String postalCode, List<Account> accountList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sin = sin;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.postalCode = postalCode;
        this.accountList = accountList;
    }



    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) throws ValidateLetters {
        if (Validation.alphabetFormat(firstName)) {
            this.firstName = firstName;
        }
    }

    public String getLastName() { return lastName; }
    public void setLastname(String lastName) throws ValidateLetters {
        if (Validation.alphabetFormat(lastName)) {
            this.lastName = lastName;
        }
    }

    public String getSin() { return sin; }
    public void setSin(String sin) throws  ValidateSIN{
        if(Validation.SINFormat(sin)) {
            this.sin = sin;
        }
    }

    public int getId() { return id; }
    public void setId(int id) throws ValidateNumbers {
        if(Validation.numberFormat(id)) {
            this.id = id;
        }
    }

    public int getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(int phoneNumber) throws ValidatePhoneNumber {
        if(Validation.PhoneFormat(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws  ValidateEmail {
        if(Validation.EmailFormat(email)) {
            this.email = email;
        }
    }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) throws ValidatePostalCode {
        if(Validation.PostalCodeFormat(postalCode)) {
            this.postalCode = postalCode;
        }
    }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public List<Account> getAccountList() { return accountList; }
    public void setAccountList(List<Account> accountList) { this.accountList = accountList; }

    ArrayList<Customer> customers = new ArrayList<Customer>();
    void addCustomer(Customer customer) {
        customers.add(customer);
    }

    Customer getCustomer(int account) {
        return customers.get(account);
    }

    ArrayList<Customer> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sin='" + sin + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", birthDate=" + birthDate +
                ", accountList=" + accountList +
                '}';
    }
}
