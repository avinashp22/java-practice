package inheritance;

public class MainClass extends ChildClass {


    public void  m5 (){
        System.out.println("this is mainclass m5 method");


    }

    public static void main(String[] args) {
        MainClass obj = new MainClass();

        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        obj.m5();

    }

}
