class Animal {

    public void speak() {
        System.out.println("Wild animal sounds");
    }
}

class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }
}

public class MethodOverriding {
    
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.speak();

        Cat cat = new Cat();
        cat.speak();    
    }
}
