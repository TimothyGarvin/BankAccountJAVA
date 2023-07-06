public class BankTest {
    public static void main(String[] args){
        BankAccount John = new BankAccount();
        BankAccount Tim = new BankAccount(5.86, 0.00); //accurate. help.
        BankAccount Jessica = new BankAccount(3000.88, 30000.00);

        // Deposit Test
        John.deposit("Checking", 800);
        Tim.deposit("Savings", 1000);
        Jessica.deposit("Savings", 2000);

        // Withdrawal Test
        John.withdraw("Checking", 400);
        Tim.withdraw("Checking", 20);
        Jessica.withdraw("Savings", 500);

        John.balance();
        Tim.balance();
        Jessica.balance();

        // System.out.println(BankAccount.accounts + BankAccount.totalMoney); Doesn't work, as intended
    }
}
