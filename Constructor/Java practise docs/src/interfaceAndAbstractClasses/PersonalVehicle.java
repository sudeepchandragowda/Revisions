package interfaceAndAbstractClasses;

public class PersonalVehicle implements IBike, ICar{
    @Override
    public void run() {
        System.out.println("My personal vehicle is running");
    }
}
