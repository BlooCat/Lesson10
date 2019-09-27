import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("My");
        linkedList.add("Name");
        linkedList.add("Is");
        linkedList.add("Is");
        linkedList.add("Lam");
        System.out.println(linkedList);
        for (String str : linkedList) {
            System.out.println(str);
        }
    }
}
