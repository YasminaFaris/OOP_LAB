
public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double a){
        if (a > 0){
            this.setBalance(this.getBalance() + a);
            System.out.println(a+" baht is deposited to "+this.getName()+".");
        }
    }
    public void withdraw(double amount) throws WithdrawException{
        if (amount >= 0){
            if (this.getBalance() - amount >= 0){
                this.setBalance(this.getBalance() - amount);
                System.out.println(amount+" baht is withdrawn from "+this.getName()+".");
            }else{
                throw new WithdrawException("Not enough money!");
            }   
        }else{
            throw new WithdrawException("Input number must be a positive integer.");
        }
    }
    public void showAccount(){
        System.out.println(this.name+" account has "+this.balance+" baht.");
    }
    
}
