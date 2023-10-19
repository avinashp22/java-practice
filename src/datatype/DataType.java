package datatype;

public class DataType {    //create a class

    public static void main(String[] args) {    // main method

        //byte, short, int, long - for numerical values
        int a = -5;
        int b = 8;
        int c = 128;
        int result = a+b*c;
        System.out.println(result);  // print statements - new line

        //double and float - for decimal values
        double z = 5.55; // more precise than float
        float  d = 5.57f;  // float needs f on the end
        System.out.println(z);
        System.out.println(d);

        //character - for single character
        char e = 'K'; //char for single letter with single commas
        System.out.println(e);

        //boolean - used for true or false
        boolean f =true;
        System.out.print(f);  // print statements

        //String - used for words, capital S
        String name = "prime testing";// double speech marks for multiple words
        System.out.println(name);
    }  //end of main method curly bracket always needed - automatic - do not remove

} //end of class curly bracket always needed - automatic - do not remove
