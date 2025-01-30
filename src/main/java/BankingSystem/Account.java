package BankingSystem;

public class Account {
    public String customerName;
    public Double accountBalance;

    public Account(String customer, Double balance){
        this. customerName = customer;
        this.accountBalance = balance;
    }

    public void depositToAccount (Double amountToDeposit){
        System.out.println("|-----------------------------------------------------------------------------------------------|");
        System.out.println("|  Customer: "+ customerName + " , Account Balance Before deposit: "+ accountBalance);
        this.accountBalance = accountBalance + amountToDeposit;
        System.out.println("|  Customer: "+ customerName + " , Account Balance After Deposit of "+ amountToDeposit +": " + accountBalance);
        System.out.println("|-----------------------------------------------------------------------------------------------|");

    }

    public void withdrawFromAccount (Double amountToWithdraw){
        if (accountBalance>=amountToWithdraw) {
            System.out.println("|-----------------------------------------------------------------------------------------------|");
            System.out.println("|  Customer: " + customerName + " , Account Balance Before Withdrawal: " + accountBalance);
            this.accountBalance = accountBalance - amountToWithdraw;
            System.out.println("|  Customer: " + customerName + " , Account Balance After Withdrawal of "+ amountToWithdraw +": " + accountBalance);
            System.out.println("|-----------------------------------------------------------------------------------------------|");

        }
        else{
            System.out.println("|-----------------------------------------------------------------------------------------------|");
            System.out.println("|  ERROR: You Do Not Have Sufficient Funds. You Current Account Balance is : " + accountBalance);
            System.out.println("|-----------------------------------------------------------------------------------------------|");

            return;
        }
    }

    public Double getAccountBalance(){
        return accountBalance;
    }
}
