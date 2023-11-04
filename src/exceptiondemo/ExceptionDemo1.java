package exceptiondemo;

public class ExceptionDemo1 {

    public static void division() {

        int a = 10, b = 0;

        System.out.println("code before error");

        try {
            System.out.println(a / b + "risky code");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("code after  error");
    }

    public static void calculation() {
        division();
    }

    public static void main(String[] args) {
        calculation();
    }

}