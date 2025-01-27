class Mobile {

    String brandName;
    int price;
    static String type;
    
    // As our variable "type" is static which is similar to all objects, don't you think it should be called only once? 
    // Maintain such code in static block.

    static {

        System.out.println("In static block.");
        type = "Smart Phone";     // same to all mobiles (objects)
        System.out.println();
    }

    public Mobile() {

        // This constructor is called everytime you create an object.
        System.out.println("In constructor");
        brandName = "Generic Brand";
        price = 500;
    }

    public void display() {
        System.out.println("Brand: " + brandName + ", Type: " + type + ", Price: " + price);
    }
}

public class StaticBlock {

    public static void main(String[] args) {

        Mobile myObj1 = new Mobile();
        myObj1.display();

        System.out.println();

        Mobile myObj2 = new Mobile();
        myObj2.display();


        // Notice that static block is called only once and constructor is called two times.
        // (As we created two objects)
    }
}
