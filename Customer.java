package junior;
public class Customer {
    private String ID = "";
    private String name = "";
    private String address = "";
    private String phoneNumber = "";
    private String emailAddress = "";

    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Customer() {
    }
    public Customer(String ID, String name, String address, String phoneNumber, String emailAdrress) {
        this.ID = ID;
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAdrress;
    }

    public void setCusInfor(String ID, String name, String address, String phoneNumber, String emailAdrress) {
        this.ID = ID;
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAdrress;
    }
    
    public void setCusInfor(String ID, String name, String address, String phoneNumber) {
        setCusInfor(ID, name, address, phoneNumber, "");
    }

    public void showInfor() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("__________________________________________________");
    }
}
class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.setCusInfor("AZZ-001", "Person1", "Unknown", "00001", "unknown@gmail.com");
        customer2.setCusInfor("AZZ-002", "Person2", "Unknown", "000123");

        customer1.showInfor();
        customer2.showInfor();
    }    
}