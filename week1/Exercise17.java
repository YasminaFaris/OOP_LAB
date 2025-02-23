import java.util.Scanner;
public class Exercise17 {
    public static void main(String[] args) {
        double litr, price;
        Scanner input = new Scanner(System.in);
        litr = input.nextDouble();
        price = litr * 30;
        System.out.println(price);
    }
}
