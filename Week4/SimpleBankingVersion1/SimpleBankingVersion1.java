package Week4;
import java.util.Scanner;
// change to push

public class SimpleBankingVersion1 {
    // Class level variables for account information
    static String accountName;
    static String accountNumber;
    static double accountBalance;

    // Class level Scanner object
    static Scanner sc = new Scanner(System.in);

    // Constructor to initialize account details
    public SimpleBankingVersion1(String name, String number, double balance) {
        this.accountName = name;
        this.accountNumber = number;
        this.accountBalance = balance;
    }

    public static void viewInformation() {
    // display information
        System.out.printf("%-20s %-10s %s %n", "Name", "Number", "Balance");
        System.out.println("-".repeat(40));
        System.out.printf("%-20s %-10s $%.2f %n", accountName, accountNumber, accountBalance);
    }

    public static void deposit() {
        System.out.print("Enter deposit amount: ");
        int amount = sc.nextInt();
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Successfully deposited $" + amount);
            System.out.println("Updated Balance: $" + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public static void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Successfully withdrew $" + amount);
            System.out.println("Updated Balance: $" + accountBalance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public static void exit() {
        System.out.println("Thank you for using our service!");
    }

    public static void main(String[] args) {
        // Create a SimpleBanking object with initial account details
        SimpleBankingVersion1 account = new SimpleBankingVersion1("John Doe", "123456789", 1000.00);
        int choice;
        do {
        // Display menu
        System.out.println("\nWelcome, " +
                    accountName + "\n"
                    + "\t1. View account information \n"
                    + "\t2. Deposit \n"
                    + "\t3. Withdraw \n"
                    + "\t4. Exit \n"
                    + "Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> viewInformation();
            case 2 -> deposit();
            case 3 -> withdraw();
            case 4 -> exit();
            default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
