import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    
    public static void main(String[] args) {
        
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(2);

        for(int item : numList) {
            System.out.println(item);
        }
    }
}
