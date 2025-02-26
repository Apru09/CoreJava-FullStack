import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    
    public static void main(String[] args) {


        // Sorted, no duplicates.
        Set<Integer> tSet = new TreeSet<>();
        tSet.add(290);
        tSet.add(1);
        tSet.add(40);
        tSet.add(56);
        tSet.add(1);


        System.out.println("USING FOR EACH: ");
        for(int item : tSet) {
            System.out.println(item);
        }

        System.out.println("USING ITERATOR: ");

        
        Iterator<Integer> values = tSet.iterator();

        while(values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
