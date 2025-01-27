class Man {

    public void info() {
        System.out.println("Male");
    }
}

class Father extends Man {

    @Override
    public void info() {
        System.out.println("Male, also a father");
    }
}

class Husband extends Man {

    @Override
    public void info() {
        System.out.println("Male, also a husband");
    }
}

public class Polymorphism {
    
    public static void main(String[] args) {

        Man man = new Man();
        man.info();

        Husband husband = new Husband();    // Man husband = new Husband(); (Can be written like this)
        husband.info();

        Man father = new Father();
        father.info();
    }
}
