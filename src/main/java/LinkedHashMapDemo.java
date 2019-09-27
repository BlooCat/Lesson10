import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "My");
        linkedHashMap.put(2, "Name");
        linkedHashMap.put(3, "Is");
        linkedHashMap.put(4, "Is");
        linkedHashMap.put(5, "Lam");
        Set<Integer> keySet = linkedHashMap.keySet();

        for (Integer key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }

        linkedHashMap.remove(4);

        System.out.println("After remove: ");
        for (Integer key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
