import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "H");
        hashtable.put(2, "E");
        hashtable.put(3, "L");
        hashtable.put(4, "L");
        hashtable.put(5, "O");
        System.out.println(hashtable);
        hashtable.clear();
        System.out.println(hashtable);
    }
}
