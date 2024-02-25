class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public void initialBalance(double initialBalance) {
        System.out.println("Initial balance: " + initialBalance	);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal denied.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of 100 required.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        account1.deposit(100);
        account1.withdraw(50);
        account1.withdraw(600);

        SavingsAccount account2 = new SavingsAccount(200);
        account2.deposit(50);
        account2.withdraw(150);
        account2.withdraw(50);
    }
}
