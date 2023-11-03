package datatype;

import java.util.Scanner;

public class Test6 {

    public static void addition(double a, double b) {
        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
    }

    public static void subtraction(double a, double b) {
        System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
    }

    public void multiplication(double a, double b) {
        System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
    }

    public void division(double a, double b) {
        System.out.println("Division of " + a + " and " + b + " is =" + (a / b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number");
        double a = scanner.nextDouble();
        System.out.println("Enter Second number");
        double b = scanner.nextDouble();
        Test6 obj = new Test6();

        addition(a, b);
        subtraction(a, b);
        obj.multiplication(a, b);
        obj.division(a, b);
        scanner.close();
    }


}
