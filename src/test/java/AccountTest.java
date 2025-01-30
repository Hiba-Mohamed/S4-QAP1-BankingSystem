import BankingSystem.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    Account account1 = new Account("cutomerycustomer", 100.00);

    @Test
    public void testCreationOfAccount(){
        //want to test the name is the same
        Assertions.assertEquals( "cutomerycustomer", account1.customerName);
        //make sure the account balance the same
        Assertions.assertEquals(100.00, account1.accountBalance);
    }

    @Test
    public void testDepositToAccount(){
        account1.depositToAccount(200.00);
        Assertions.assertEquals(300.00, account1.accountBalance);
    }

    @Test
    public void testWithdrawalFromAccount(){
        account1.withdrawFromAccount(30.00);
        Assertions.assertEquals(70.00, account1.accountBalance);
        account1.withdrawFromAccount(70.00);
        Assertions.assertEquals(0.00, account1.accountBalance);
        account1.withdrawFromAccount(70.00);
        Assertions.assertEquals(0.00, account1.accountBalance);

    }

}
