package Week4.SimpleBankingVersion3;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleBanking3Data {
    // Class level Scanner object
    static Scanner sc = new Scanner(System.in);
    // ArrayList to hold multiple BankAccount objects
    static ArrayList<SimpleBanking3DataStructure> accountList = new ArrayList<>();

    public static void loadData() {
        // Create some initial accounts and add them to the list
        accountList.add(new SimpleBanking3DataStructure("H Kane", "0123456", 0));
        accountList.add(new SimpleBanking3DataStructure("E Hayes", "1234567", 500));
        accountList.add(new SimpleBanking3DataStructure("B Mead", "2345678", 1000));
        accountList.add(new SimpleBanking3DataStructure("L Bronze", "3456789", 5000));
        accountList.add(new SimpleBanking3DataStructure("P Foden", "4567890", 200));
    }

    // Method to view information
    public static void viewInformation() {
        // display information
        System.out.printf("%-20s %-10s %s %n", "Name", "Number", "Balance");
        System.out.println("-".repeat(40));
        for (SimpleBanking3DataStructure account : accountList) {
            System.out.printf("%-20s %-10s $%.2f %n", account.getAccountName(),
                    account.getAccountNumber(), account.getAccountBalance());
        }
        System.out.println("-".repeat(40));
    }
}

