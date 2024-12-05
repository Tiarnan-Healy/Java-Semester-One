package Week4.SimpleBankingVersion2;

public class BankAccount {
    // Class level variables for account information
    private String accountName;
    private String accountNumber;
    private double accountBalance;

    // Constructor to initialize account details
    public BankAccount(String name, String number, double balance) {
        this.accountName = name;
        this.accountNumber = number;
        this.accountBalance = balance;
    }

    //accessors
    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    //mutator
    public void setAccountBalance(double balance) {
        accountBalance = balance;
    }

    //service method
    public String getFormattedBalance() {
        return String.format("$ %.2f", accountBalance);
    }
}