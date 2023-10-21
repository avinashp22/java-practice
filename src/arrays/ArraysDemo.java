package arrays;
//used to declare multiple variables
public class ArraysDemo {

//Array declaration - note stored value
    int a[];
    int []num1;
    String studentName[];


    public static void main(String[] args) {
        //Approach 1
        int x[] = {10,20,30,40,50}; //index 0 is 10, index 1 is 20
        System.out.println(x[3]); // index for 40 would be 3
        System.out.println(x.length);

        // to check length of array
        //   for (int i = 0; i <x.length ; i++) {
        //   System.out.println(x[i]);  //10,

            // Approach 2
           int z[] = new int[5];
           z[0] = 100;
           z[1] = 200;
           z[2] = 300;
           z[3] = 400;
           z[4] = 500;

        System.out.println(z[4]);

        String names[] = {"Java", "C++", "Python"};
        System.out.println(names[1]);

    }

}
