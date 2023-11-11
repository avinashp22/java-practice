package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {


    public static void readFile(String fileName) throws FileNotFoundException {
        FileReader reader = new FileReader(fileName);

//    try
//    {FileReader reader = new FileReader(fileName);}
//    catch (Exception e)
//    {System.out.println(e.getMessage());}

    }

    public static void readJungleBook(String fileName) throws FileNotFoundException {
        readFile(fileName);
    }

    public static void main(String[] args) {
        try {
            readJungleBook("MyBook");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}