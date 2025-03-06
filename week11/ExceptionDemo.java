/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yasmina
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            if (args.length != 3){
                throw new IllegalArgumentException("Please enter 3 numbers as a, b, and c respectively.");
            }
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0){
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x1 = " + x1 + " , x2 = " + x2);
            }else if (discriminant == 0){
                double x1 = -b / (2 * a);
                System.out.println("x1 = x2 = " + x1);
            }else {
                System.out.println("Not real solutions");
            }
        }catch (NumberFormatException e){
            System.out.println("Please input data in number format only.");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
