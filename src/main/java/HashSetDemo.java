import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("My");
        hashSet.add("Name");
        hashSet.add("Is");
        hashSet.add("Lam");
        hashSet.add("Lam");
        System.out.println(hashSet);
        for (String str : hashSet){
            System.out.println(str);
        }
    }
}
