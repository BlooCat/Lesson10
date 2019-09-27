import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("H");
        arrayList.add("E");
        arrayList.add("L");
        arrayList.add("L");
        arrayList.add("O");
        System.out.println(arrayList);
        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}
