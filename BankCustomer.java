public class BankCustomer {
    String name;
    String accountNumber;
    int age;

    public BankCustomer(String name, String accountNumber, int age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.age = age;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        BankCustomer customer1 = new BankCustomer("John", "123456789", 20);
        BankCustomer customer2 = new BankCustomer("harish", "987654321", 19);
        
        customer1.displayCustomerDetails();
        customer2.displayCustomerDetails();
    }
    
}
