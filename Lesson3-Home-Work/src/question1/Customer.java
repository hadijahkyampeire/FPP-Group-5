package question1;

public class Customer {
    String firstName;
    String lastName;
    String socialSecurityNumber;
    Address billingAddress;
    Address shippingAddress;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Customer(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socialSecurityNumber + ", " + "billingAddress: " + billingAddress + ", " + "shippingAddress: " + shippingAddress + "]";
    }

    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setStreet("1000 N 4th Street");
        address1.setCity("Fairfield");
        address1.setState("IA");
        address1.setZip("52557");


        Address address2 = new Address();
        address2.setStreet("1003 N 4th Street");
        address2.setCity("Chicago");
        address2.setState("IA");
        address2.setZip("52550");

        Address address3 = new Address();
        address3.setStreet("1003 N 4th Street");
        address3.setCity("Chicago");
        address3.setState("IL");
        address3.setZip("52550");

        Customer customer1 = new Customer("John", "Smith", "123456789");
        customer1.setBillingAddress(address1);
        customer1.setShippingAddress(address2);

        Customer customer2 = new Customer("Jane", "Smith", "123456789");
        customer2.setBillingAddress(address2);
        customer2.setShippingAddress(address2);

        Customer customer3 = new Customer("Test", "question1.Customer", "123456789");
        customer3.setBillingAddress(address3);
        customer3.setShippingAddress(address3);

        Customer[] customers = {customer1, customer2, customer3};

        for (Customer customer : customers) {
            if(customer.billingAddress.city.equals("Chicago")) {
                System.out.println(customer);
            }
        }

    }
}