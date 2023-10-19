package methodtypes;

public class NoReturnWithParameters {

    //no return with parameters (arguments)
    public static void addition(int a, int b) {
        int answer = a + b;
        System.out.println(answer);
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public  void printCourse(String course) {
        System.out.println(course);
    }

    public static void main(String[] args) {
        addition(5, 10);
        addition(20, 44);

        printName("java");
        printName("Python");

        NoReturnWithParameters c1=new NoReturnWithParameters();
        c1.printCourse("Java Script");

    }


}
