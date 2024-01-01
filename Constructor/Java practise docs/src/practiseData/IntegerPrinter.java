package practiseData;

public class IntegerPrinter {
    Integer intToPrint;

    public IntegerPrinter(Integer intToPrint) {
        this.intToPrint = intToPrint;
    }
    public void print() {
        System.out.println(intToPrint);
    }
    public void printSquare() {
        System.out.println(intToPrint*intToPrint);
    }
}
