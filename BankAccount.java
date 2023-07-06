public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts = 0;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accounts++;
    }

    public BankAccount(double checking, double savings){
        this.checkingBalance = checking;
        this.savingsBalance = savings;
        accounts++;
    }

    // GETTERS
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    private void setCheckingBalance(double checking){
        this.checkingBalance = checking;
    }
    private void setSavingsBalance(double savings){
        this.savingsBalance = savings;
    }

    // METHODS
    public void deposit(String type, double deposit){
        if(type == "Checking"){
            setCheckingBalance(getCheckingBalance() + deposit);
            totalMoney += deposit;
        }
        if(type == "Savings"){
            setSavingsBalance(getSavingsBalance() + deposit);
            totalMoney += deposit;
        }
    }
    public void withdraw(String type, double withdraw){
        if(type == "Checking"){
            if(getCheckingBalance() < withdraw){
                System.out.println("Lol broke.");
            }
            else{
                setCheckingBalance(getCheckingBalance() - withdraw);
                totalMoney -= withdraw;
            }
        }
        if(type == "Savings"){
            if(getSavingsBalance() < withdraw){
                System.out.println("We've all been there.");
            }
            else{
                setSavingsBalance(getSavingsBalance() - withdraw);
                totalMoney -= withdraw;
            }
        }
    }
    public void balance() {
        double totalBalance = checkingBalance + savingsBalance;
        System.out.println("Checking: $" + checkingBalance);
        System.out.println("Savings: $" + savingsBalance);
        System.out.println("Total: $" + totalBalance);
    }
}
