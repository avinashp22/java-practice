package methodtypes;

public class Programme1 {

    //method with return and no parameters method

    public double areaCircle(){
        double r=16.0;
        double area=(Math.PI * r *r);
        return area;
    }




    public static void main(String[] args) {
    Programme1 obj = new Programme1();
        System.out.println(obj.areaCircle());


    }



}
