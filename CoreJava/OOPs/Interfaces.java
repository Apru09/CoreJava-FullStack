
interface Car {

    // public and abstract keywords are implicit here. (Automatically applied)
    void details();
}

class Bmw implements Car {

    @Override
    public void details() {
        System.out.println("This is a S-class luxurious car.");
    }
}

class Alto implements Car {

    @Override
    public void details() {
        System.out.println("This is a D-class normal car.");
    }
}

public class Interfaces {
    
    public static void main(String[] args) {

        Alto alto = new Alto();
        alto.details();

        Bmw bmw = new Bmw();
        bmw.details();
        
    }
}
