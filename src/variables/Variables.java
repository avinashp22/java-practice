package variables;

public class Variables {

    int h = 100;                //create variable and assign value outside main method
    String programme;           //create variable and do not assign value outside main method

    public static void main(String[] args) {

        //variable has to be declared with a data type
        int h;                  // declare variable first, but assign value later
        int x = 100;
        int y = 200;            // declare variable with value at same time
        h = 50;                 // assign value later on
        System.out.println(h);

        //variable variations define all then assign all
        int a,b,c;
        a=1; b=2; c=3;
        int ans = (a*b)/2; //area for trianlge

        String name = "Prime";      // declare variable with value at same time
        System.out.println(a+b+c);  // program  System.out.println, then call (a+b+c)
        System.out.println(name);   // program  System.out.println, then call name

        Variables obj = new Variables();
        System.out.println(obj.h);
        System.out.println(obj.programme = "java");

    }

}
