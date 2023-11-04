package javacollections;

import java.util.ArrayList;

public class ArrayListDemo {
    //array
    int []a  = new int [5];

    public static void main(String[] args) {

        ArrayList<String> carList = new ArrayList();   //declaration of error list

        carList.add("Audi");
        carList.add("BMW");
        carList.add("Ford");
        carList.add("Toyota");
             carList.add(null);

        System.out.println(carList.size());
        System.out.println(carList.get(1));


        for( String car  :  carList  ){
            System.out.println(car);

    }

        carList.remove("Toyota");
        for( String car  :  carList  ){
            System.out.println(car);

        }

    } }