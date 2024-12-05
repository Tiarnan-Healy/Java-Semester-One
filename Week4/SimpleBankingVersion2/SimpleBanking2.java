package Week4.SimpleBankingVersion2;

import java.util.Scanner;

public class SimpleBanking2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bank System Version 3");
        BankAccount account = new BankAccount("H Kane", "0123456", 0);
        System.out.println("Account Name: " + account.getAccountName());
        System.out.println("Account Number: " + account.getAccountNumber());

        // Account balance update test
        int amount = sc.nextInt();
        double balance = account.getAccountBalance() + amount;
        account.setAccountBalance(balance);

        System.out.println("Balance: " + account.getFormattedBalance());

        int choice;
        int accountChoice;
        // Account choice
        System.out.println("Please enter account number (0 - 4): ");
        accountChoice = sc.nextInt();
        do {
            // Display menu
            System.out.println("\nWelcome, " + account.getAccountName() + "\n"
                    + "\t1. View account information \n"
                    + "\t2. Deposit \n"
                    + "\t3. Withdraw \n"
                    + "\t4. Exit \n"
                    + "Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> viewInformation(account);
                case 2 -> deposit(account, sc);
                case 3 -> withdraw(account, sc);
                case 4 -> exit();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    // methods
    public static void viewInformation(BankAccount account) {
        // display information
        System.out.printf("%-20s %-10s %s %n", "Name", "Number", "Balance");
        System.out.println("-".repeat(40));
        System.out.printf("%-20s %-10s $%.2f %n", account.getAccountName(), account.getAccountNumber(), account.getAccountBalance());
    }

    public static void deposit(BankAccount account, Scanner sc) {
        System.out.print("Enter deposit amount: ");
        int amount = sc.nextInt();
        if (amount > 0) {
            account.setAccountBalance(account.getAccountBalance() + amount);
            System.out.println("Successfully deposited $" + amount);
            System.out.println("Updated Balance: $" + account.getAccountBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public static void withdraw(BankAccount account, Scanner sc) {
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();
        if (amount > 0 && amount <= account.getAccountBalance()) {
            account.setAccountBalance(account.getAccountBalance() - amount);
            System.out.println("Successfully withdrew $" + amount);
            System.out.println("Updated Balance: $" + account.getFormattedBalance());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public static void exit() {
        System.out.println("Thank you for using our service!");
    }
}

