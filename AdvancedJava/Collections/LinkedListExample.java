import java.util.LinkedList;

public class LinkedListExample {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(200);  // addLast() method is equivalent to add(). So, it got added as second element.
        linkedList.add(10);
        linkedList.add(9);
        linkedList.add(8);
        linkedList.add(7);
        linkedList.add(6);
        linkedList.add(9);
        linkedList.addFirst(100);

        for(int item : linkedList) {
            System.out.println(item);
        }

    }
}
