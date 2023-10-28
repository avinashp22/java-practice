package blocks;

public class StaticBlocksExample {

    static String eName;
    static int eId;

    static {  //static block used to assign value to static varialbes
        eName = "Rajesh";
        eId = 101;
        System.out.println("class starts - executes first before main method");

    }

    public static void main(String[] args) {
        System.out.println("Employee Name is "+ eName + " and Employee ID is " + eId);
    }

    static {  //static block used to assign value to static varialbes
        System.out.println("i am in 2nd static block");

    }




}
