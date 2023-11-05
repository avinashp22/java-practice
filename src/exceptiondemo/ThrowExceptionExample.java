package exceptiondemo;

import java.util.ArrayList;
import java.util.List;

public class ThrowExceptionExample {
    private static List<Integer> integers = new ArrayList<>();

    public static void addInteger(Integer value) throws IllegalArgumentException{
        if (integers.contains(value)){
            throw new IllegalArgumentException("Integer already added.");
        }
        integers.add(value);
    }

    public static void main(String[] args) {
        System.out.println("Before Exception");
        for (int i = 0; i < 2; i++) {
            try {
                addInteger(1);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("After Exception");
    }
}
