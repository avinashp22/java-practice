package morningchallenge;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name2 = scanner.nextLine();;
        System.out.println("Enter message");
        String message2 = scanner.nextLine();;
        System.out.println("Hi "+ name2);
        System.out.println(message2);
        scanner.close();
    }

    public static void printMessage (String name3, String message3){
        System.out.println("Hi "+ name3);
        System.out.println(message3);

    }

}
