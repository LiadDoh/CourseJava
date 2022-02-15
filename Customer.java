public class Customer {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private int customerId;
    private static int ID=1;

    public Customer(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.setCustomerId(ID);

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 0)
            this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 0)
            this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() >=9 && phoneNumber.length() <=10 && phoneNumber.charAt(0) == '0')
            this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomerId(int id) {
        this.customerId = id;
        ID++;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}
