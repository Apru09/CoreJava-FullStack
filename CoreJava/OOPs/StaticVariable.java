class Mobile {

    String brandName;    // Unique value to all objects.  (Instance variable)
    int price;
    static String type;   // Common to all objects. (Static variable)

    public void show() {
        System.out.println("Brand: " + brandName + ", Type: " + type + ", Price: " + price);
    }
}

/* By making a variable static, we make the variable as a class member and a single copy
 * of it is used by all instances of the class.
 * 
 * If the data is unique, then use instance variable. (Brand name and price are different)
 * If the data is common, then use static variable. (Apple and Samsung are same type {Smart Phone})
 */

public class StaticVariable {
    
    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        
        obj1.brandName = "Apple";
        obj1.price = 80000;
        Mobile.type = "Smart Phone";         // Static members should be referenced with class name.

        Mobile obj2 = new Mobile();

        obj2.brandName = "Samsung";
        obj2.price = 85000;
        Mobile.type = "Smart Phone";

        obj1.show();
        obj2.show();               // Notice type of mobiles here.

        System.out.println();
        System.out.println("After changing static member: ");
        System.out.println();

        Mobile obj3 = new Mobile();

        obj3.brandName = "Nokia Button Phone";
        obj3.price = 3000;
        Mobile.type = "Cell Phone";      

        obj1.show();                // Notice type of mobiles changing to cell phones.
        obj2.show();
        obj3.show();


        // Changing the data of a static member affects all the instances accessing that member.

    }
}
