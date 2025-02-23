import java.util.Scanner;
public class Exercise20 {
    public static void main(String[] args) {
        double hours, mins, secs;
        Scanner input = new Scanner(System.in);
        hours = input.nextDouble();
        mins = input.nextDouble();
        secs = (hours*3600)+(mins*60);
        System.out.println(secs);
    }
}
