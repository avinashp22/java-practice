package exceptiondemo;

public class ArrayExceptionDemo {

    public static void example() {

        int[] a = new int[3];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        try {
            System.out.println(a[5]);  // risky code
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error code -use correct index");

        }

        System.out.println("code after error");


    }


    public static void main(String[] args) {
        example();
    }


}
