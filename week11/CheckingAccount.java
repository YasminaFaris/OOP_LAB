
public class CheckingAccount extends Account {
    private double credit;
    
    public CheckingAccount(){
        this(0.0, "", 0.0);
    }

    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit(){
        return credit;
    }

    @Override
    public void withdraw(double amount) throws WithdrawException {
        if (amount <= 0) {
            throw new WithdrawException("Input number must be a positive integer.");
        }

        if (this.getBalance() >= amount) {
            this.setBalance(this.getBalance() - amount);
            System.out.println(amount + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.credit + ".");
        }
        else if (this.getBalance() + this.getCredit() >= amount) {
            double remainingAmount = amount - this.getBalance();
            this.setBalance(0);
            this.setCredit(this.getCredit() - remainingAmount);
            System.out.println(amount + " baht is withdrawn from " + this.getName() + " and your credit balance is " + this.getCredit() + ".");
        }
        else {
            throw new WithdrawException("Account "+ this.getName()+" has not enough money!");
        }
    }

    @Override
    public String toString(){
        return "The " + this.getName() + " account has " + this.getBalance() + " baht and " + this.credit + " credits.";
    }
}
