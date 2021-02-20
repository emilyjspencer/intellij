import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class BankAccountTest {

   BankAccount bankaccount;

    @org.junit.Before
    public void setUp() throws Exception {
        bankaccount = new BankAccount("Jane", "Doe", 100.0, BankAccount.CHECKINGACCOUNT);
    }

    @org.junit.Test
    public void deposit() {
        double result = bankaccount.deposit(20.0, true);
        assertEquals(120.00, result, 0.1 );
    }

    @org.junit.Test
    public void withdraw() {
        double result = bankaccount.withdraw(20.0, true);
        assertEquals(80.0, result, 0.1);
    }

    @org.junit.Test
    public void getBalance() {
        double result = bankaccount.getBalance();
        assertEquals(100.0, result, 0.1);
    }

    @org.junit.Test
    public void isCheckingAccount_true() {
        assertTrue( bankaccount.isCheckingAccount());
    }
}