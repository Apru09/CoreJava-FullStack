
class Computer {

    public void info() {
        System.out.println("This is a generic computer");
    }
}

class AppleMacbook extends Computer {

    @Override
    public void info() {
        System.out.println("This is an Apple macbook");
    }
}

class AsusLaptop extends Computer {

    @Override
    public void info() {
        System.out.println("This is an Asus Laptop");
    }
}


public class DynamicMethodDispatch {
    
    public static void main(String[] args) {

        // Same instance of type Computer behaves differently with different object.
        // This is Dynamic Method Dispatch.
        // one out of three info() methods are executed and it is decided at runtime.

        Computer comp = new Computer();
        comp.info();

        comp = new AppleMacbook();
        comp.info();

        comp = new AsusLaptop();
        comp.info();
        
    }
}
