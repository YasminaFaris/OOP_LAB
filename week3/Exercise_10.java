import java.util.*;
public class Exercise_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int odd = 0;
        int even = 0;
        while (num != -1) {
            if (num % 2 == 0) {
                even += 1;
            }else {
                odd += 1;
            }
        }
        System.out.println("Odd number = "+odd+"and Even number = "+even);
    }
}
