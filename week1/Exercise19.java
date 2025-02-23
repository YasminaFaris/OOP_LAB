import java.util.Scanner;
public class Exercise19 {
    public static void main(String[] args) {
        double price, vat;
        Scanner input = new Scanner(System.in);
        price = input.nextDouble();
        vat = ((price*(7.0/100.0)) + price);
        System.out.println(vat);
    }
}
