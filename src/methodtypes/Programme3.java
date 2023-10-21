package methodtypes;

public class Programme3 {


    public int square(int num){
        int result = num*num;
        return result;
    }

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        int squareOfNumber = obj.square(10); //or directly like below
        System.out.println(squareOfNumber);

        //or when stored in int like above
        System.out.println(obj.square(300));
    }


}
