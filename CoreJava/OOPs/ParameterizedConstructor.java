class Human {

    String name;
    int age;


    // This is a constructor, and it is called everytime when an object is instantiated.
    public Human() {

        System.out.println("In constructor");
        name = "Default Name";
        age = 18;
    }


    // This is a parameterized constructor. It is called when object is created and values are passed.
    public Human(String name, int age) {

        System.out.println("In parameterized constructor");
        this.name = name;           // This is a keyword used to refer the instance of current class.
        this.age = age;
    }

    public void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ParameterizedConstructor {
    
    public static void main(String[] args) {

        Human obj1 = new Human();    // Calls default constructor. Object created 1.

        obj1.name = "Thor";
        obj1.age = 3000;

        Human obj2 = new Human();   // Object created 2.
        
        obj2.name = "Loki";
        obj2.age = 2600;

        System.out.println();

        obj1.show();
        obj2.show();

        System.out.println();

        Human myObj3 = new Human("Hela", 5000);  // Calls parameterized constructor.
        myObj3.show();
        
    }
}
