package exceptiondemo;

public class FinallyExample {

    public static void division(){

        int a = 10;
        int b =5;

        try
        {
            System.out.println(a/b+ " - i am risky code)");
        }
        catch (Exception e)   //unknown errors use exception class instead of ArithmeticException class
        {
            System.out.println(e.getMessage());
            System.out.println("i am in catch block - i execute in error");
        }
        finally
        {
            System.out.println("i am in finally block -  i always execute");
        }

        System.out.println("text after risky code - i am outside i will always print");

    }
    public static void main(String[] args) {division();}

}
