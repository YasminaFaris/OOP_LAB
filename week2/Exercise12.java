import java.util.*;
public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = 0;
        double bonus = 0;
        System.out.println("Please insert your name : ");
        String name = sc.nextLine();
        System.out.println("Please insert your age : ");
        int age = sc.nextInt();
        System.out.println("Plese insert number of working days: ");
        int work = sc.nextInt();
        System.out.println("Plese insert number of absent days: ");
        int absent = sc.nextInt();
        System.out.println("Plese insert your body weight : ");
        double weight = sc.nextDouble();
        
        if ( (21 <= age) && (age <= 30)) {
            salary = (work*300) - (absent*50);
        }else if ((31 <= age) && (age <= 40)) {
            salary = (work*500) - (absent *50) ;
        }else if ((41 <- age) && (age <= 50)) {
            salary = (work*1000) - (absent*25) ;
        }else if ((51 <= age) && (age <= 60)) {
            salary = (work*3000) ;
        }if ((weight >= 10) && (weight <= 60)) {
            bonus = salary + 5000;
        }else if ((weight >= 61) && (weight <= 90)) {
            bonus = salary+(5000-((weight-60)*10));
        }else
            bonus = salary;
        
        System.out.println("Hi, "+name);
        System.out.println("Your salary is "+salary+" Baht");
        System.out.println("Your salary and bonus is "+bonus+" Baht");
    }
}
