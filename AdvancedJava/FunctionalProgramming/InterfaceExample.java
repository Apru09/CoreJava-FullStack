interface Computer {
    void code();
}

class Laptop implements Computer {

    @Override
    public void code() {
        System.out.println("Code, compile and run..");
    }
}

class Desktop implements Computer {

    @Override
    public void code() {
        System.out.println("Code, compile and run faster..");
    }
}

class Developer {

    public void devApp(Computer obj) {
        obj.code();
    }
}


public class InterfaceExample {

    public static void main(String[] args) {

        Developer prudhvi = new Developer();
        
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        prudhvi.devApp(lap);
        prudhvi.devApp(desk);
        
    }

    

    
}
