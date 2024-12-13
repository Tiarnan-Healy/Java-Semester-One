package Week7.SwingGUIBank;

public class BankGUIData {
    // Class level variables for account information
    private String accountName;
    private String accountNumber;
    private double accountBalance;

    // Constructor to initialize account details
    public BankGUIData(String name, String number, double balance) {
        this.accountName = name;
        this.accountNumber = number;
        this.accountBalance = balance;
    }

}
