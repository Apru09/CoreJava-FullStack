import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    
    public static void main(String[] args) {
        

        // Not sorted, doesn't allow duplicates.
        Set<Integer> set = new HashSet<>();
        set.add(1009);
        set.add(9321);
        set.add(2000);
        set.add(1182);
        set.add(2000);

        for(int item : set) {
            System.out.println(item);
        }
    }
}
