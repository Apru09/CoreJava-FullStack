class Human {

    String name;
    int age;


    // This is a constructor, and it is called everytime when an object is instantiated.
    public Human() {

        System.out.println("In constructor");
        name = "Default Name";
        age = 18;
    }

    public void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor {
    
    public static void main(String[] args) {

        Human obj1 = new Human();    // Object created.

        obj1.name = "Thor";
        obj1.age = 3000;

        Human obj2 = new Human();   // Object created.
        
        obj2.name = "Loki";
        obj2.age = 2600;

        System.out.println();

        obj1.show();
        obj2.show();

        System.out.println();

        Human myObj3 = new Human();   // Notice constructor begin called whenever new object is created.
        
    }
}
