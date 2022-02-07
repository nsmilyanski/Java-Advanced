package Bank;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int bankAcountCount = 1;
    private int id;
    private double balance;

    BankAccount(){
        this.id = bankAcountCount;
        bankAcountCount++;
    }

    static void setInterestRate(double interestRate){
        BankAccount.interestRate = interestRate;
    }
    public double getInterest(int years){
        return BankAccount.interestRate * years * this.balance;
    }

    public int getId() {
        return this.id;
    }

    void deposid(double amount){
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
