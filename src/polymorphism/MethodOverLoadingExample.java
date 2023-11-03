package polymorphism;

/**
 * compile time polymorphism
 * early binding
 * static binding
 */

public class MethodOverLoadingExample {
    // overload methods using below in 1 class
    // different data types
    // different no of arguments using, comma (parameters)
    // different sequence of arguments

    public void m1 (int a){
    }

    public void m1 (String name){   // different data types
    }

    public void m1 (String name, int a){ // different no of arguments using, comma (parameters)
    }

    public void m1 (int a, String name){ // different sequence of arguments
    }
}
