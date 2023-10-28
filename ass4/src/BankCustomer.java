public class BankCustomer implements BankObserver {
    private String name;
    private double balance;

    public BankCustomer(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    @Override
    public void updateBalance(double newBalance) {
        System.out.println(name + "'s new balance: " + newBalance);
        balance = newBalance;
    }
}


