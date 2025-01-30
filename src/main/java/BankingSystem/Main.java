package BankingSystem;
import BankingSystem.Account;

public class Main {

    public static void main(String[] args) {
       Account account1 = new Account("customer1", 10.00);
       Account account2 = new Account("customer2", 20.00);
       System.out.println(account1.getAccountBalance());
       account1.depositToAccount(20.00);
       account2.withdrawFromAccount(10.00);
   }

}
