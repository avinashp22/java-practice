package encapsulation;

public class EncapsulationDemo {

    private int id;
    private String name;

    public int getId() {   // getter method are return methods use to access private data
        return id;
    }

    public void setId(int id) {this.id = id;}      //setter method are to set the id value, provide value to data type
    // if you are setting the value then need to put (datatype variable) name in brackets


    public String getName() {return name;}     // getter method are return methods use to access private data,


    public void setName(String name) {this.name = name;}     //setter method are to set the id value, provide value to data type
    // if you are setting the value then need to put (datatype variable) name in brackets


}
