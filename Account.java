public class Account {

    private double balance;

    public Account() {
        balance = 0.00;
    }

    public void deposit(double amount) {
        balance += amount;

        if (amount <= 1000) {
            System.out.println("You deposited: " + amount);
        }
        if (amount > 1000 && amount <= 5000) {
            System.out.println("You deposited: " + amount  + " The bank is suspecting you of money laundering! Where did you get all that cash?");
        }
        if (amount > 5000) {
            System.err.println("ERROR: transaction cancelled! The bank rejected your transaction of " + amount + "!" + " Sheesh! definitley money laundering...");
        }

    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
        if (amount <= 1000) {
            System.out.println("You withdrew: " + amount);
        }
        if (amount > 1000 && amount <= 5000) {
            System.out.println("Are you sure you need all that money?");
        }
        if (amount > 5000) {
            System.out.println("Daddy Elon is that you?");
        } else {
            System.err.println("ERROR: trasaction cancelled! You tried to withdraw " + amount + " but your balance is " + balance + "!" + " How are you going to withdraw money when you're broke?");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
            " balance='" + getBalance() + "'" +
            "}";
    }

}
