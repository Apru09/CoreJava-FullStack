class Example {

    public void display() {
        System.out.println("In class Example's display method.");
    }

}

// A class file can contain only one public class.

// To call methods from another class, the methods need to be public and we need an
// object of the same class.

/* Refer notes for better clarification on the topic. */

public class ClassesObjects {

    public static void main(String[] args) {

        // We need to instantiate the object of A's class here.

        Example obj = new Example();    // new Example() creates an object of type Example.

                                        // obj is the reference variable to access the object.
        
        // This is how you call methods using objects.

        obj.display();

        // This calls the display method from Example class and exectes the statement.

        
    }
}