import java.util.Stack;

public class StackExample {
    
    public static void main(String[] args) {
        
        Stack<Integer> box = new Stack<>();
        box.push(1);    // First element
        box.push(2);
        box.push(3);
        box.push(5);    // Top element

        System.out.println("Top Element before popping: " + box.peek()); // Gives top element.
        box.pop();  // Removes the top element.

        for(int item : box) {
            System.out.println(item);
        }

        System.out.println("Top Element after popping: " + box.peek());  

    }
}
