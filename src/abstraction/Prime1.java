package abstraction;

public abstract class Prime1 {

    public abstract void m1();

    public abstract boolean m2(char ch);

    public void m3() {
        System.out.println("this is normal method");

    }


    public static void main(String[] args) {

       // Prime1 obj = new Prime1();  // cannot create objects in abstract class
        // if the class has a private constructor you can not make an object either


    }

}
