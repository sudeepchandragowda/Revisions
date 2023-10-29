package interfaceAndAbstractClasses;

public class Sparrow extends Bird implements IFlyable {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void eat() {
        System.out.println("Sparrow is eating");
    }
}
