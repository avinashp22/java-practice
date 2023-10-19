package variables;

public class VariableCalling {

    String name = "Prime"; //instance - need object, make object - instance to instance can be direct
    static int number = 100;  //static - no need for object, related to class, static to static - direct
    public static void main(String[] args) {  // static - direct

        System.out.println(number);
        System.out.println(VariableCalling.number);
        VariableCalling obj = new VariableCalling();
        System.out.println(obj.name);
        obj.m1(); // call other methods outside of main method
        obj.m2();
        m3();
    }


    // below are outside of main method, other methods - non static method(Instance method)
    public void m1() {   // non static - instance to static
        VariableCalling obj2 = new VariableCalling();
        System.out.println(obj2.name);
        System.out.println(name);
        System.out.println(VariableCalling.number);
        System.out.println(number);
    }

    protected void m2() {
        System.out.println(name);m3();
    }

    public static void m3(){
        System.out.println(number);
    }

}
