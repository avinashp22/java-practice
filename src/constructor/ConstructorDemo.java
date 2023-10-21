package constructor;
public class ConstructorDemo {

    public ConstructorDemo(){    //not a method, constructor always starts with class name, t0 object
    System.out.println("Zero args constructors");
    }

    public ConstructorDemo(int a) {  //t1 object / only 1 type allowed, cant make another int type or string type
        System.out.println("1 args constructor " + a);
    }

    public ConstructorDemo(String name) {  //t3 object , only 1 type allowed, cant make another int type or string type
        System.out.println(name);
    }

    public ConstructorDemo(int a, int b) {  //t4 object , only 1 type allowed, cant make another int type or string type
        System.out.println("2 args constructor");
    }

    public void addition(){  //method
        System.out.println("this is a zero arg , no return method");
    }

    public static void main(String[] args) {
    // constructor is called when object is created
    ConstructorDemo t0= new ConstructorDemo();
    ConstructorDemo t1 = new ConstructorDemo(2); // need new object for each tpe
    ConstructorDemo t3 = new ConstructorDemo("Prime");
    ConstructorDemo t4 = new ConstructorDemo(1520);
        t1.addition(); // method calling
    }
}
