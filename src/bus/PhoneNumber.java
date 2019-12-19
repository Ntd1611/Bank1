package bus;

import java.io.Serializable;

public class PhoneNumber implements Serializable {
    private int phoneNumber;

    public int getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }

    public PhoneNumber() {
        this.phoneNumber = 0;
    }

    public PhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
