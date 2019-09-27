import java.util.ArrayList;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        for (int i : arrayList) {
            System.out.println(i);
        }
    }
}
