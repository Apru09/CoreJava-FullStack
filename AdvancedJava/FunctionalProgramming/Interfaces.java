interface A {

    // public and abstract keywords are implicitly added. [public abstract void method1();]
    void method1();
    void method2();

    // final and static keywords are implicitly added. [final static int length = 10;]
    int length = 10;
    int breadth = 10;
}

class B implements A {

    // A class implementing an interface must give implementation of the method declared in the interface.

    public void method1() {
        System.out.println("In method one.");
    }

    public void method2() {
        System.out.println("In method two.");
    }

}

public class Interfaces {
    
    public static void main(String[] args) {

        B obj = new B();
        obj.method1();
        obj.method2();
        
    }
}
