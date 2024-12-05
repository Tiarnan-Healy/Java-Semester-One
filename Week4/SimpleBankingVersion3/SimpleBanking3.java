package Week4.SimpleBankingVersion3;

import java.util.Scanner;

public class SimpleBanking3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleBanking3Data.loadData();
        System.out.println("Bank System Version 3");

        int choice;
        int accountChoice;
        // Account choice
        System.out.println("Please enter account number (0 - 4): ");
        accountChoice = sc.nextInt();
        if (accountChoice == -1) {
            viewAllInformation();
            System.out.println("Please enter account number (0 - 4): ");
            accountChoice = sc.nextInt();
        }
        do {
            // Display menu
            System.out.println("\nWelcome, " + SimpleBanking3Data.accountList.get(accountChoice).getAccountName() + "\n"
                    + "\t1. View account information \n"
                    + "\t2. Deposit \n"
                    + "\t3. Withdraw \n"
                    + "\t4. Switch Account \n"
                    + "\t5. Exit \n"
                    + "Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> viewInformation(SimpleBanking3Data.accountList.get(accountChoice));
                case 2 -> deposit(SimpleBanking3Data.accountList.get(accountChoice), sc);
                case 3 -> withdraw(SimpleBanking3Data.accountList.get(accountChoice), sc);
                case 4 -> switchAccount(SimpleBanking3Data.accountList.get(accountChoice), sc);
                case 5 -> exit();
                case 6 -> viewAllInformation();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    // methods
    public static void viewInformation(SimpleBanking3DataStructure account) {
        // display information
        System.out.printf("%-20s %-10s %s %n", "Name", "Number", "Balance");
        System.out.println("-".repeat(40));
        System.out.printf("%-20s %-10s $%.2f %n", account.getAccountName(), account.getAccountNumber(), account.getAccountBalance());
    }

    public static void deposit(SimpleBanking3DataStructure account, Scanner sc) {
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

    public static void withdraw(SimpleBanking3DataStructure account, Scanner sc) {
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

    // Method to allow switching account without restarting program
    public static void switchAccount(SimpleBanking3DataStructure account, Scanner sc) {
        System.out.print("Enter account number: ");
        int accountChoice = sc.nextInt();
    }

    public static void viewAllInformation() {
        // display information
        System.out.printf("%-20s %-10s %s %n", "Name", "Number", "Balance");
        System.out.println("-".repeat(40));
        for (SimpleBanking3DataStructure account: SimpleBanking3Data.accountList){
            System.out.printf("%-20s %-10s $%.2f %n", account.getAccountName(),
                    account.getAccountNumber(), account.getAccountBalance());
        }
        System.out.println("-".repeat(40));
    }
}

