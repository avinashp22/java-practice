package polymorphism.overriding;


public class Child extends Parent {

    @Override
    public void marry() {
        System.out.println("Red Girl");
    }

    public static void staticExample() {
        System.out.println("Child class static method");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        c.marry();
        staticExample();
        Parent.staticExample();
    }
}
