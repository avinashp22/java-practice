package inheritance;

public class ChildClass extends ParentClass {


    public void m3() {
        System.out.println("Childclass m3 method");

    }

    public void m4() {
        System.out.println("Childclass m4 method");

    }

    public static void main(String[] args) {

        ChildClass obj1 = new ChildClass(); //child class object - better to do this as can access both child and parent
        obj1.m3();
        obj1.m4();
        obj1.m1(); //called from parent class
        obj1.m2();  //called from parent class

        System.out.println(obj1.a);  //called from parent class
        System.out.println(obj1.name);  //called from parent class


        ParentClass obj2 = new ParentClass();   // parent class object
        obj2.m2();  // used to access parent class behaviours
        obj2.m1();// used to access parent class behaviours

        System.out.println(obj1.a); // used to access parent class behaviours
        System.out.println(obj2.name); // used to access parent class behaviours


    }


}
