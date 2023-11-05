package abstraction;

public class ChildClass extends Prime2 {

    public boolean m2(char ch) {return true;}

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
    }
    //if you take all child class abstract methods, then class does not need to be abstract
    //if you take 1 only then class must be abstract.


}
