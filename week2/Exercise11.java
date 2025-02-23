import java.util.*;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        System.out.println("Input your money : ");
        double money = sc.nextDouble();
        System.out.println("Input your account type(Please type A B C or X in uppercase) : ");
        char type = sc.next().charAt(0);
        if (type == 'A' | type == 'C'){
            total = (money*0.015)+money;
        }else if (type == 'B'){
            total = (money*0.02)+money;
        }else if (type == 'X'){
            total = (money*0.05)+money;
        }
        System.out.println("Your total money in one year = "+total);
    }
}
