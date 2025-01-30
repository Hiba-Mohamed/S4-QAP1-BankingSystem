import BankingSystem.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void testCreationOfAccount(){
        Account account1 = new Account("cutomerycustomer", 100.00);
        //want to test the name is the same
        Assertions.assertEquals( "cutomerycustomer", account1.customerName);
        //make sure the account balance the same
        Assertions.assertEquals(100.00, account1.accountBalance);
    }

}
