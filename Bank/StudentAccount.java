package Bank;

public class StudentAccount extends BankAccount{
    private int years;

    public StudentAccount(Customer customer, double balance, Boolean fees, int years) {
        super(customer, balance, false);
        this.years = years;
    }

    @Override
    public void deposit(double amount) {
        double temp = getBalance();
        if(years<4){
            temp += amount;
        }
        else{
            temp += amount-10;
        }
        setBalance(temp);
    }

    @Override
    public double withdraw(double amount) {
        double temp = getBalance()-amount;
        if(temp<0){
            return getBalance();
        }
        else{
            setBalance(temp);
            return getBalance();
        }
    }
}
