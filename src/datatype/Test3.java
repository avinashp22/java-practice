package datatype;

public class Test3 {

    int a = 5;

    static int b = 10;

    public void method1(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void method2(){
   Test3 obj = new Test3();
        System.out.println(obj.a);
        System.out.println(b);
    }


    public static void main(String[] args) {
        method2();
        Test3 obj1 = new Test3();
        obj1.method1();
    }





}
