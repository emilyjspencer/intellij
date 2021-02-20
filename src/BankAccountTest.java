import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount bankaccount = new BankAccount("Jane", "Doe", 100.0);
        double result = bankaccount.deposit(20.0, true);
        assertEquals(120.00, result, 0.1 );
    }

    @org.junit.Test
    public void withdraw() {
        BankAccount bankaccount = new BankAccount("Joe", "Bloggs", 100.0);
        double result = bankaccount.withdraw(20.0, true);
        assertEquals(80.0, result, 0.1);
    }

    @org.junit.Test
    public void getBalance() {
        BankAccount bankaccount = new BankAccount("Jane", "Doe", 60.0);
        double result = bankaccount.getBalance();
        assertEquals(60.0, result, 0.1);
    }
}