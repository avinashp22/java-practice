package javacollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet <String>  courseSet = new HashSet();
        courseSet.add ("java");
        courseSet.add ("api");
        courseSet.add ("sql");
        courseSet.add ("selenium");

        System.out.println(courseSet);

        for ( String name  :    courseSet);{
            System.out.println(courseSet + " ");
    }

        Iterator<String> list = courseSet.iterator();
        while (list.hasNext())
        {
            System.out.println(list.next() + " ");
        }
    }
}
