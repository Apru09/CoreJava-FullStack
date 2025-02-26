class Outer {

    public void display() {
        System.out.println("In outer class.");
    }
}


public class AnonymousInnerClass {
    
    public static void main(String[] args) {

        Outer obj = new Outer(){

            public void display() {
                System.out.println("In anonymous inner class.");
            }
        };

        obj.display();
        
    }
}
