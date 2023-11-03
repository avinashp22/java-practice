package methodtypes;

public class MethodDeclaration {

    public void m1() { // void means return type is nothing
        System.out.println("This is M1 Method");
    }
    public void m2() {
        System.out.println("This is M2 Method");
    }

    public void m3( ) {
        m2();
    }



    public static void addition() {
        System.out.println("This is Addition Method");
    }
    public static void subtraction() {
        System.out.println("This is Subtraction Method");
    }
    public static void main(String[] args) {
    MethodDeclaration t1 = new MethodDeclaration();  //object creation
    t1.m1();
    t1.m2();
    t1.m3();
    addition();
    subtraction();

    }

}
