import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class BankAccountTest {



    @org.junit.Test
    public void deposit() {
        BankAccount bankaccount = new BankAccount("Jane", "Doe", 100.0, BankAccount.CHECKINGACCOUNT);
        double result = bankaccount.deposit(20.0, true);
        assertEquals(120.00, result, 0.1 );
    }

    @org.junit.Test
    public void withdraw() {
        BankAccount bankaccount = new BankAccount("Joe", "Bloggs", 100.0, BankAccount.CHECKINGACCOUNT);
        double result = bankaccount.withdraw(20.0, true);
        assertEquals(80.0, result, 0.1);
    }

    @org.junit.Test
    public void getBalance() {
        BankAccount bankaccount = new BankAccount("Jane", "Doe", 60.0, BankAccount.CHECKINGACCOUNT);
        double result = bankaccount.getBalance();
        assertEquals(60.0, result, 0.1);
    }

    @org.junit.Test
    public void isCheckingAccount_true() {
        BankAccount bankaccount = new BankAccount("Jane", "Doe", 120.0, BankAccount.CHECKINGACCOUNT);
        boolean result = bankaccount.isCheckingAccount();
        assertEquals(true,  result);
    }
}