package encapsulation;

public class Test {

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();

        obj.setId(50);
        System.out.println(obj.getId());

        obj.setId(70);
        System.out.println(obj.getId());

        obj.setName("Prime");
        System.out.println(obj.getName());

        obj.setName("Testing");
        System.out.println(obj.getName());
    }


}
