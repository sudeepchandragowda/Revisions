package collectionsAndGenerics.collections;

import java.util.Set;

public class SetDemo {
    Set<Integer> set;

    public SetDemo(Set<Integer> set) {
        this.set = set;
    }
    public void setActions() {
        set.add(null);
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("SET : " + set);
        System.out.println(set.size());
    }
}
