@FunctionalInterface
interface A {

    void method();
}

class B implements A {

    @Override
    public void method() {
        System.out.println("Implemented..");
    }
}

public class FunctionalInterfaceExample {
    
    public static void main(String[] args) {

        A obj = new B();
        obj.method();
        
    }
}
