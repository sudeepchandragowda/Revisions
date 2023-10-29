package interfaceAndAbstractClasses;

public class Crow extends Bird implements IFlyable {


    public void fly() {

         System.out.println("Crow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow is eating");
    }
}
