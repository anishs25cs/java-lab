class Account {
    String name;
    int accNo;
    double balance;

    void deposit(double amt) {
        balance += amt;
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

class SavAcct extends Account {
    void interest() {
        balance += balance * 0.05;
    }
}

class CurAcct extends Account {
    double minBal = 1000;

    void withdraw(double amt) {
        balance -= amt;
        if (balance < minBal) {
            balance -= 50;
            System.out.println("Penalty imposed");
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        SavAcct s = new SavAcct();
        s.deposit(5000);
        s.interest();
        s.display();

        CurAcct c = new CurAcct();
        c.deposit(1500);
        c.withdraw(600);
        c.display();
    }
}
