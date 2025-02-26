import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    
    public static void main(String[] args) {

        // Keys are unique, values can be repeated.
        Map<String, Integer> map = new HashMap<>();
        map.put("Prudhvi", 69);
        map.put("Komal", 89);
        map.put("Varmam", 88);
        map.put("Pavan", 90);
        map.put("Karthik", 70);

        System.out.println(map.get("Pavan"));

        for(String name : map.keySet()) {
            System.out.println(name + ": " + map.get(name));
        }

    }
}
