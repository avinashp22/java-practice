package inheritance_example.with_inheritance;


public class Person {
    private String name;
    private int age;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String toString()
    {
        return String.format(
                "Person :- name : %s , age : %d", name, age);
    }
}
