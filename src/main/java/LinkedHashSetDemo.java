import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("My");
        linkedHashSet.add("Name");
        linkedHashSet.add("Is");
        linkedHashSet.add("Is");
        linkedHashSet.add("Lam");
        System.out.println(linkedHashSet);
        for (String str : linkedHashSet) {
            System.out.println(str);
        }
    }
}
