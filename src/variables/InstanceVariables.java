package variables;
public class InstanceVariables {

    /**
     * Scope - within the class
     * Memory allocation - when object is created
     * memory - heap
     */
    int a = 10; // a is an instance or global variable outside the method
    String name = "Prime Testing"; //name is an instance or global variable

    public static void main(String[] args) {

        InstanceVariables obj = new InstanceVariables();  // need an object to call a global variable
        System.out.println(obj.a);
    } // main method finishes here

    public void myMethod (){  //wont be executed as its outside main method
        InstanceVariables v1 = new InstanceVariables();
        System.out.println(v1.a);
        System.out.println(v1.name);

}

}
