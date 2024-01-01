package collectionsAndGenerics.genericsDemo;

public class Client {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(100000);
        integerPrinter.print();
        Printer<Double> doublePrinter = new Printer<>(57.25);
        doublePrinter.print();
        Student sudeep = new Student("Sudeep", 94);
        Printer<Student> sudeepChandraBS = new Printer<>(sudeep);
        sudeepChandraBS.print();
        Printer<Student> dhruthiGowdaA = new Printer<>(new Student("Dhruthi", 93));
        dhruthiGowdaA.print();

        Printer<Student> madeForEachOther = new Printer<>(new Student("Made for each other", 100));
        madeForEachOther.print();
    }
}
