//implementing constructor here
public class BankAccount {
    private double balance;
    private String accountHolder;
    public BankAccount()//default case to fall back to
    {
        this.balance = 0;
        this.accountHolder = "";
    }
    public BankAccount(double balance, String accountHolder) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }
    //overloading the constructor
     public BankAccount(double balance) {
        this.balance = balance;
    }
     public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

}

class maineta {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0, "John Doe");
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());

}

