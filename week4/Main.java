class Account {
    public double balance;
    public String name;
    
    public void deposit(double b){
        if (b >= 0){
            balance += b;
        }else {
            System.out.println("The balance variable must be greater than or equal to zero.");
        }
    }
    public double withdraw(double b){
        if (b >= 0){
            if (balance >= b){
                balance -= b;
                return b;
            }else {
                System.out.println("Your account balance is insufficient. ");
                return 0;
            }
        }else {
            System.out.println("The balance variable must be greater than or equal to zero.");
            return 0;
        }
    }
    public void showInfo(){
        System.out.println("In "+name+" account, there is a balance equal to "+balance+" baht.");
    }
}
class MyDate {
    public int day;
    public int month;
    public int year;
    
    public void showDate(){
        System.out.println(+day+"/"+month+"/"+year+".");
    }
}
class Customer {
    public String name;
    public MyDate DOB;
    public Account acct;
}
public class Main {
    public static void main(String[] args) {
        Customer c = new Customer(); 
        c.name = "Taravichet"; 

        MyDate dob = new MyDate(); 
        dob.day = 8; 
        dob.month = 11; 
        dob.year = 2023; 
         
        Account acct = new Account(); 
        acct.name = c.name; 
        acct.balance = 500; 
         
        c.DOB = dob; 
        c.acct = acct; 
         
        System.out.println("My name is " + c.name + "."); 
         
        c.acct.showInfo(); 
        c.DOB.showDate(); 
         
        c.acct.deposit(500);
        c.acct.showInfo();
        c.acct.withdraw(3000); 
        c.acct.showInfo();
    }
}

