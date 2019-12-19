package bus;

public class Address {
    private String address;

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Address() {
        this.address = "";
    }

    public Address(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
