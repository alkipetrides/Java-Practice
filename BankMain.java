import javax.security.auth.login.AccountException;

public class BankMain {

    public static void main(String[] args) {



        Account alki = new Account();
        System.out.println();
        System.out.println("Your current balance is: " + alki.getBalance());
        alki.deposit(10000);
        System.out.println();



        Account user = new Account();
        System.out.println("Your balance is: " + user.getBalance());
        user.deposit(100);
        System.out.println("Your balance is: " + user.getBalance());
        System.out.println();
        user.withdraw(800);


    }
}
