package collectionsAndGenerics;

public class WrapperDemo {
    public static void main(String[] args) {
        int num = 2;
        Integer wrapperNum = num;

        Integer wrapperLong = 42;
        long primitiveLong = wrapperLong;

        System.out.println(primitiveLong);
        System.out.println(wrapperNum);
    }
}
