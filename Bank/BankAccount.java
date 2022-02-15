package Bank;

public abstract class BankAccount {
    private int accNumber;
    private Customer customer;
    private double balance;
    private Boolean fees;
    public static int AccId=1;

    public BankAccount() {
    }

    public BankAccount(Customer customer, double balance, Boolean fees) {
        this.customer = customer;
        this.balance = balance;
        this.fees = fees;
        setAccNumber();
    }

    public int getAccNumber() {
        return accNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public Boolean getFees() {
        return fees;
    }

    public void setAccNumber() {
        this.accNumber = (int) (AccId*getBalance()-8);
        AccId++;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setFees(Boolean fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Bank.BankAccount{" +
                "accNumber=" + accNumber +" "+
                 customer.toString() +
                ", balance=" + balance +
                ", fees=" + fees +
                '}';
    }

    public abstract void deposit(double amount);
    public abstract double withdraw(double amount);
}
