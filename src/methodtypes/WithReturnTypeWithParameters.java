package methodtypes;

public class WithReturnTypeWithParameters {

public int addition(int a , int b){   //method signature
int result = a+b;
return result;
}




    public static void main(String[] args) {
    WithReturnTypeWithParameters obj = new WithReturnTypeWithParameters();
    obj.addition(10,20);
    int result = obj.addition(10,20);
        System.out.println(result); // result is 30
        System.out.println(obj.addition(50,100));
        System.out.println(obj.name("Avinash"));
    }

    String name(String name){ //method with no syntax - default, no public, no private, no protected


        return name;
    }

}
