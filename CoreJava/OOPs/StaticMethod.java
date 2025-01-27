class Mobile {

    String brandName;    // Unique value to all objects.  (Instance variable)
    int price;
    static String type;   // Common to all objects. (Static variable)

    public void show() {
        System.out.println("Brand: " + brandName + ", Type: " + type + ", Price: " + price);
    }

    public static void display(Mobile obj) {
        
        // As we refer the static members with class name, JVM cannot decide between instance 
        // variables. So, we need to specify the instance name we want to execute.

        System.out.println("Brand: " + obj.brandName + ", Type: " + type + ", Price: " + obj.price);
    }
}



public class StaticMethod {
    
    public static void main(String[] args) {

        System.out.println("Calling a normal method of the class: ");
        System.out.println();
        
        Mobile obj1 = new Mobile();
        
        obj1.brandName = "Apple";
        obj1.price = 80000;
        Mobile.type = "Smart Phone";         // Static members should be referenced with class name.

        Mobile obj2 = new Mobile();

        obj2.brandName = "Samsung";
        obj2.price = 85000;
        Mobile.type = "Smart Phone";

        obj1.show();
        obj2.show();               

        System.out.println();

        System.out.println("Calling static method of the same class: ");
        System.out.println();

        Mobile obj3 = new Mobile();

        obj3.brandName = "Nokia Button Phone";
        obj3.price = 3000;
        Mobile.type = "Cell Phone";

        Mobile.display(obj3);    // Notice that we used class name to call the method, not obj3. (Static method)
        



    }
}
