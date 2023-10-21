package methodtypes;

public class WithReturnTypeWithNoParameters {

    public static void main(String[] args) {

        int result = addition();    //needs same data type, int, String, boolean, double etc
        System.out.println(result);

        WithReturnTypeWithNoParameters obj = new WithReturnTypeWithNoParameters();
        obj.myName();
        String fullName = obj.myName();

        System.out.println(fullName);

        isRight();
        System.out.println(isRight());
    }

    /**
     * This is with return with no parameters method
     *
     * @return - it returns int data eg ans 30
     */
    public static int addition() {  //needs data type, int, String, boolean, double etc
        int a = 10, b = 20, ans = a + b;
        return ans; //last line, cannot add more lines
    }

    public String myName() { //needs data type, int, String, boolean, double etc
        String firstName = "Avinash";
        String lastName = "Patel";
        return firstName + " " + lastName;
    }

    public static boolean isRight() { //needs data type, int, String, boolean, double etc
        boolean a = true, b = false;
        return a; //value is true , return type has to be same data type and method opening
    }
}
