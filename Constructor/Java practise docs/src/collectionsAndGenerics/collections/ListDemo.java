package collectionsAndGenerics.collections;

import java.util.List;

public class ListDemo {
    List<Integer> numberList;

    public ListDemo(List<Integer> numberList) {
        this.numberList = numberList;
    }


    public void listActions() {
        numberList.add(11); //0
        numberList.add(30); //2
        numberList.add(45); //3
        numberList.add(30);
        numberList.add(30);
        numberList.add(30);

        System.out.println(numberList);
        System.out.println("SIZE : " + numberList.size());
        System.out.println("CONTAINS 50 : " + numberList.contains(50));
        System.out.println("CONTAINS 30 : " + numberList.contains(30));
        int currentVal = numberList.set(2, 40);
        numberList.add(3, 50);
        System.out.println("CURRENT VAL : " + currentVal);
        System.out.println(numberList);
    }
}
