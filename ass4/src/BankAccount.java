import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<BankObserver> observers = new ArrayList<>();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        notifyObservers();
    }

    public void withdraw(double amount) {
        balance -= amount;
        notifyObservers();
    }

    public void addObserver(BankObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BankObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (BankObserver observer : observers) {
            observer.updateBalance(balance);
        }
    }
}


