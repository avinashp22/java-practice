package methodtypes;

public class Programme2 {

    public static void main(String[] args) {
    Programme2 programme2 = getObject(); //calling object from programme2 method
    programme2.add();
    programme2.sub();
    //or
    getObject().sub();
    getObject().add();

    }
    public void add(){
    }
    public void sub(){
    }

    public static Programme2 getObject(){
        Programme2 obj = new Programme2();
        return obj;
    }
}
