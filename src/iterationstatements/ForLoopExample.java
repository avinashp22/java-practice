package iterationstatements;

public class ForLoopExample {


    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May"};

        String [] cars ={"BMW", "AUDI"};
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        for (String carName:cars)  {  //call all array data in 1 command using array name like datatype varialbe:arrayname
            System.out.println(carName);

        }
    }
}
