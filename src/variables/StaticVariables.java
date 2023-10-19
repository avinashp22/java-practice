package variables;
public class StaticVariables {

    /** adding static infront of Intance/global will make it static variable
     * outside the method
     * inside class - scope is within the class
     * with static keyword
     * memory allocation - when class is loaded, stored in non heap memory
     * static variable no need for object, call direct or class name
     */

    static int a = 10;
    static String name = "Prime Tester";
    public static void main(String[] args) {
        System.out.println(a);  //static variable no need for object, call direct or class name
        System.out.println(StaticVariables.name);
        int a = 11111;
        System.out.println(a);
    }

    public void m1(){
        System.out.println(a);
        System.out.println(StaticVariables.a);
    }
}
