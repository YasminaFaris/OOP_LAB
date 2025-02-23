
public class Bank {
    private Account acct[];
    private int numAcct;
    
    public Bank(){
        acct = new Account[10];
        numAcct = 0;
    }
    public void addAccount(Account ac){
        if (numAcct < acct.length){
            acct[numAcct] = ac;
            numAcct++;
        }else {
            System.out.println("Bank is full, cannot add more accounts.");
        }
    }
    public Account getAccount(int index){
        if (index >= 0 && index < numAcct){
            return acct[index];
        }
        return null;
    }
    public int getNumAccount(){
        return numAcct;
    }
}
