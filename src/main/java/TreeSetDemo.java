import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("My");
        treeSet.add("Name");
        treeSet.add("Is");
        treeSet.add("Is");
        treeSet.add("Lam");
        Iterator<String> itr=treeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
