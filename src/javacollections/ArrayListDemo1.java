package javacollections;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        list.add ("python");
        list.add ("python");
        list.add (50);
        list.add (true);
        list.add('H');
        list.add(2.5);

        for ( Object name  : list   )
        {System.out.print(name + " , ");

    }
        ArrayList <Integer> number = new ArrayList();
        number.add (10);
        number.add (20);
        System.out.print(number.get(0));

    }
}