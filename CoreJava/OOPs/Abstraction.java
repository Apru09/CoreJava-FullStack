abstract class Shape {

    // Abstract methods are written to maintain confidentiality, and can be implemented elsewhere.
    // A class containing an abstract method must be abstract.
    public abstract void info();
}

class Square extends Shape {

    @Override
    public void info() {
        System.out.println("All sides are equal");
    }
}

class Rectangle extends Shape {

    @Override
    public void info() {
        System.out.println("Opposite sides are equal");
    }
}

public class Abstraction {
    
    public static void main(String[] args) {

        Square square = new Square();
        square.info();

        Rectangle rectangle = new Rectangle();
        rectangle.info();
        
    }
}
