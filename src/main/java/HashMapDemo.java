import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "H");
        hashMap.put(2, "E");
        hashMap.put(3, "L");
        hashMap.put(4, "L");
        hashMap.put(5, "O");
        System.out.println(hashMap);
        hashMap.clear();
        System.out.println(hashMap);
    }
}
