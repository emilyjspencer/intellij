import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

   private BankAccount bankaccount;
   private static int count;

   @BeforeAll
   public static void beforeClass() {
       System.out.println("Runs before any of the test cases. \nCount = " + count++);
   }

    @BeforeEach
    public void setUp() throws Exception {
        bankaccount = new BankAccount("Jane", "Doe", 100.0, BankAccount.CHECKINGACCOUNT);
    }

    @Test
    public void deposit() {
        double result = bankaccount.deposit(20.0);
        assertEquals(120.00, result, 0.1 );
    }

    @Test
    public void depositTooMuch() {
       Throwable exception = assertThrows(
               IllegalArgumentException.class, () -> {
                   double result = bankaccount.deposit(1200.0);
               }
       );
        assertEquals("Unable to deposit more than 1000 in one go", exception.getMessage());
    }

    @Test
    public void withdraw() throws Exception {
        double result = bankaccount.withdraw(20.0);
        assertEquals(80.0, result, 0);
    }

    @Test
    public void withdrawTooMuch() {
       Throwable exception = assertThrows(
               IllegalArgumentException.class, () -> {
                   double result = bankaccount.withdraw(120.0);
               }
       );
        assertEquals("Unable to withdraw. Funds unavailable", exception.getMessage());
    }

    @Test
    public void getBalance() {
        double result = bankaccount.getBalance();
        assertEquals(100.0, result, 0.1);
    }

    @Test
    public void isCheckingAccount_true() {
        assertTrue( bankaccount.isCheckingAccount());
    }

    @AfterAll
    public static void afterClass() {
       System.out.println("This runs are all of the test cases. \nCount = " + count++);
    }

    @org.junit.After
    public void teardown() {
       System.out.print("Count = " + count++);
    };
}