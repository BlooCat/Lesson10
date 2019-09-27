import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "My");
        treeMap.put(2, "Name");
        treeMap.put(3, "Is");
        treeMap.put(4, "Is");
        treeMap.put(5, "Lam");
        for (Map.Entry m : treeMap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
