package variables;
public class LocalVariables {

    /**
     *  local variable   - variables which are declared inside the method or inside constructors are called
     *                    local variables
     *  Scope             - within the method
     *  Memory allocation - when method starts
     *  Memory            - stack
     */

    public static void main(String[] args) {

        // a is a local variable because its inside the method
        int a = 2;
        System.out.println(a);
        a=5;  // not used
        a=3;
        System.out.println(a);
        // must be in order , if a=2 in line 1 then in line 2 a=4 , then 4 will show after line2

    }

}
