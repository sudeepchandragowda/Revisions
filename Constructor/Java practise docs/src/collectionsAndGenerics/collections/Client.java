package collectionsAndGenerics.collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListDemo listDemo = new ListDemo(arrayList);
        listDemo.listActions();
        Set<Integer> set = new HashSet<>();
        SetDemo setDemo = new SetDemo(set);
        setDemo.setActions();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Sudeep");
        map.put(2, "Dhruthi");
        map.put(3, "Varsha");
        map.put(4, "Varsha");
        // HashSet is basically the map with key and dummy value of Object.

        System.out.println(map);

        Set<Integer> linkedset = new LinkedHashSet<>();
        linkedset.add(100);
        linkedset.add(200);
        linkedset.add(300);
        linkedset.add(400);
        System.out.println("Linked Set : " + linkedset);


    }
}
