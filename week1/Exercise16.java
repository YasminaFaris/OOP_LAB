import java.util.Scanner;
public class Exercise16 {
    public static void main(String[] args) {
        double x, y, z, all;
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
        z = input.nextDouble();
        all = ((x+y+z)/3);
        System.out.println(all);
    }
}
