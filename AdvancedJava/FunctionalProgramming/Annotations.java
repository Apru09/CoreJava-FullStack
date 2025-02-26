class Parent {

    public void show() {
        System.out.println("In parent show..");
    }
}

class Child extends Parent {

    @Override
    public void show() {
        System.out.println("In child show..");
    }
}


public class Annotations {
    
    public static void main(String[] args) {

        Child child = new Child();
        child.show();

        Parent parent = new Parent();
        parent.show();
        
    }
}
