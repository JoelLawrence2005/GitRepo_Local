import java.util.*;

public class Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Date date = new Date();

        BankAccount User1 = new BankAccount("James", "123456", 300.0);
        BankAccount User2 = new BankAccount("Jason", "445556", 0.0);
        BankAccount User3 = new BankAccount("Alex", "334456", 10000.0);
        BankAccount User4 = new BankAccount("Periera", "102456", 90.0);

        User1.deposit("Deposit: 300", 200.0);
        User2.deposit(500.0);
        User3.withdraw("Withdraw: 200", 200.0);
        User4.withdraw(200.0);
        User1.deposit("Deposit: 400", 400.0);

        System.out.println(" ");
        User1.displayAccountDetails();

        System.out.println(" ");
        User1.displayTransactionHistory();

        System.out.println();
    }
}
