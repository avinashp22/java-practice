package methodtypes;

public class NoReturnNoParameters {

    public static void main(String[] args) {
    addition();
    NoReturnNoParameters obj = new NoReturnNoParameters();
    obj.subtraction();

    }

    public static void addition (){ // if void is use and nothing in brackets then its noreturn/noparemeters
    int a = 5;
    int b = 10;
    int ans = a+b;
        System.out.println("Addition of two numbers " + a + " and " +b + " is "+ ans);

    }

    public void subtraction () {
        int a = 5;
        int b = 10;
        int ans = b-a;
        System.out.println("Subtraction of two numbers " + b + " and " +a + " is "+ ans);

    }

}
