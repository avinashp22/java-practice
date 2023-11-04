package exceptiondemo;

public class ExceptionDemo {

    public static void division(){

        int a = 10;
        int b =0;

        try{System.out.println(a/b);}  // risky code
        catch (Exception e)   //unknown errors use exception class instead of ArithmeticException class
        {System.out.println(e.getMessage());
            System.out.println("i am in catch block");
            System.out.println("enter valid number");
        }


        System.out.println("text after risky code");

    }

    public static void main(String[] args) {
        division();
    }

}
