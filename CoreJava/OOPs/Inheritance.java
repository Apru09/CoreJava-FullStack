class Base {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

}

class Derived extends Base {      // extends is a keyword.

    // All properties (methods, instance variables) of base class are available here too.

}

public class Inheritance {
    
    public static void main(String[] args) {

        Derived obj = new Derived();    // Creating object of derived class.
        System.out.println(obj.add(3,4));         // Accessing method of base class.
        
    }
}
