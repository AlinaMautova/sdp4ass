public class BankExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        BankObserver customer1 = new BankCustomer("Customer 1", 1000);
        BankObserver customer2 = new BankCustomer("Customer 2", 1000);

        account.addObserver(customer1);
        account.addObserver(customer2);

        account.deposit(500);
        account.withdraw(200);
    }
}
