import java.io.*;

public class Student implements Serializable{
    private String name;
    private int ID;
    private int money;
    
    public Student(){}
    public Student(String name, int ID, int money){
        this.name = name;
        this.ID = ID;
        this.money = money;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return ID;
    }
    public void setId(int ID){
        this.ID = ID;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money = money;
    }
}
