public class PrivateAccount extends BankAccount{

    private final double FEE_AMOUNT=6.9;

    public PrivateAccount(Customer customer, double balance,Boolean fees) {
        super(customer,balance,true);
    }

    @Override
    public void deposit(double amount) {
        double temp=getBalance()+amount - FEE_AMOUNT;
        setBalance(temp);
    }

    @Override
    public double withdraw(double amount) {
        double temp=getBalance()-amount - FEE_AMOUNT;
        if(temp>0) {
            setBalance(temp);
        }
        return getBalance();
    }

    @Override
    public String toString(){
        return super.toString()+"\n"+"Fee: "+FEE_AMOUNT;
    }
}
