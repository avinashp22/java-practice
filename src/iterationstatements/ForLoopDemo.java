package iterationstatements;

public class ForLoopDemo {

    public static void main(String[] args) {


          for (int t=1; t<=10; t++)  {
              System.out.println("hello");// will repeat hello 10 times
               System.out.println(t); // will print numbers in ascending order up to 10
           }

        for (int i=5; i<=10; i++)  {
           System.out.println(i); // will print numbers in ascending order up to 10
        }


        for (int i=10; i>=1; i--)  {  // will print numbers in descending order down to 1
            System.out.println(i);
        }

        for (int i=1; i<=10; i++)  {  // will print numbers odd numbers

            if (i%2==1){System.out.println(i);}

        }

        for (int i=1; i<=20; i++)  {  // will print numbers even numbers

            if (i%2==0){System.out.println(i);}

        }


        for (int i=1; i <= 10; i++) {

            if (i!=5 && i!=7) {
                System.out.println(i);
            } else {
                System.out.println("This is not a required number");

            }
        }
    }
}



