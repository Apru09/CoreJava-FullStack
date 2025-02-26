class Outer {

    int age = 9;

    public void show() {
        System.out.println("Age is: " + age);
    }

    class Inner {

        public void config() {
            System.out.println("Inside inner class.");
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {

        Outer obj1 = new Outer();
        obj1.show();

        Outer.Inner obj2 = obj1.new Inner();  // Object of the class Inner.
        obj2.config();


        /*
         * To create the object of the inner class, we need the reference of the outer class,
         * and also the object of the outer class.
         */
        
    }
}