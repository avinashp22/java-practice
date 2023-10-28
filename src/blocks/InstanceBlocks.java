package blocks;

public class InstanceBlocks {

    String eName;
    int eId;

    {  // instance block is just curly brackets only
        System.out.println("I am in instance block");
eName = "Vijay";


    }

    public static void main(String[] args) {

        InstanceBlocks obj = new InstanceBlocks();


    }

public InstanceBlocks () {

    System.out.println("i am in constructor");

}









}
