import java.util.*;

public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    Transaction[] transactionList = new Transaction[20];

    Scanner input = new Scanner(System.in);

    Date date = new Date();

    public BankAccount() {
        this.accountHolderName = "Unknown";
        this.accountNumber = "000000";
        this.balance = 0.0;
    }

    public BankAccount(String name, String accNumber) {
        this.accountHolderName = name;
        balance = 0.0;
    }

    public BankAccount(String name, String accNumber, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = accNumber;
        this.balance = initialBalance;
    }

    public void logTransaction(Transaction transaction) {
        for (int i = 0; i < transactionList.length; i++) {
            if (transactionList[i] == null) {
                transactionList[i] = transaction;
            }
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(String description, double amount) {
        this.balance += amount;
        Transaction transaction1 = new Transaction("Deposit", this.balance, description, date);
        logTransaction(transaction1);
        System.out.println("Description : " + description);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            amount = 0;
        } else {
            this.balance -= amount;
        }

        Transaction transaction1 = new Transaction("Withdraw", this.balance, this.accountNumber, date);
        logTransaction(transaction1);
    }

    public void withdraw(String description, double amount) {
        if (amount > this.balance) {
            System.out.println("Not enough funds");
        } else {
            this.balance -= amount;
            Transaction transaction1 = new Transaction("Withdraw", this.balance, description, date);
            logTransaction(transaction1);
            System.out.println("Description: " + description);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder's Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + this.balance);
    }

    public void displayTransactionHistory() {
        System.out.print("Enter account number: ");
        String accNum = input.nextLine();

        boolean status = true;

        while (status) {
            if (accNum.length() == 6) {
                System.out.println("Transaction history for account number: " + accNum);
                for (Transaction transaction : transactionList) {
                    if (transaction != null) {
                        System.out.println(transaction);
                    }
                }
                break;
            } else {
                System.out.println("Wrong Length of Integers");
                System.out.println(" ");
                System.out.print("Enter account number: ");
                accNum = input.nextLine();
            }
        }


    }

}