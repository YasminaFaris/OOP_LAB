import java.util.*;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        if (salary > 50000){
            System.out.println(salary*0.1);
        }else {
            System.out.println(salary*0.05);
        }
        
    }
}
