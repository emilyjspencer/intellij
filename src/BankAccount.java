public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKINGACCOUNT = 1;
    public static final int SAVINGSACCOUNT = 2;

    private int accountType;


    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Unable to withdraw. Funds unavailable");
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isSavingsAccount() {
        return accountType == SAVINGSACCOUNT;
    }

    public boolean isCheckingAccount() {
        return accountType == CHECKINGACCOUNT;
    }
}
