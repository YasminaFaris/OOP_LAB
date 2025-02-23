import java.util.*;
public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double size = 0;
        double total = 375.99;
        double comp = 375.99;
        double rom = 65.99;
        double print = 125.00;
        System.out.println("please insert your monitor size 38 or 43 only");
        int monitor = sc.nextInt();
        System.out.println("Do you want DVD-ROM? 1 is Yes/0 is No");
        int dvd = sc.nextInt();
        System.out.println("Do you want printer? 1 is Yes/0 is No");
        int printer = sc.nextInt();
        if (monitor == 38){
            size += 75.99;
            total += size;
        }else {
            size += 99.99;
            total += size;
        }
        System.out.println("=======Your order=======");
        System.out.println("*computer >>> "+comp+"$");
        System.out.println("*"+monitor+"'Monitor >>> "+size+"$");
        if (dvd == 1){
            System.out.println("*DVD-ROM >>> "+rom+"$");
            total += rom;
        }
        if (printer == 1){
            System.out.println("printer >>> "+print+"$");
            total += print;
        }
        System.out.println("=======Total price >>> "+total+"=======");
        
    }
}
