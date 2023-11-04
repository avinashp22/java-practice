package interfacedemo;

// for inheritance for interfaces use key word implements
// class can be abstract
public class Test implements InterfaceDemo, InterfaceDemo1 {


    // need to call all abstract methods OR change class type to abstract
    @Override
    public void m1() {} //from InterfaceDemo

    @Override
    public void m2() {} // from InterfaceDemo

    public void m3() {} //  from InterfaceDemo1

}
