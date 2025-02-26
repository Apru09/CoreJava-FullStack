@FunctionalInterface
interface A {

    void method();
}

// Instead of making another class just for simple task, anonymous class has been used.

public class LambdaExpression {
    public static void main(String[] args) {

        A obj = new A(){

            @Override
            public void method() {
                System.out.println("Implemented using anonymous class..");
            }
        };

        obj.method();



        // Now, can the code be reduced even further? Yes, by using lambda expressions.

        A obj1 = () -> System.out.println("Implemented using lambda expression..");
        
        obj1.method();
    }
}
