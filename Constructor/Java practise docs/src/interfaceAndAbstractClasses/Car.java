package interfaceAndAbstractClasses;
// Car is something that is comparable, since we have comparable interface
public class Car implements Comparable<Car>{
    int speed;
    int price;

    public Car(int speed, int price) {
        this.speed = speed;
        this.price = price;
    }

    @Override //[OPTIONAL] showcases that the method is overridden but it has no logic/functionality
    public int compareTo(Car c) {
        return this.price - c.price;
        // if current object price is more -> +ve
        // if the car (c) price is more -> -ve
        // if the prices are same -> 0
        // c1.compareTo(c2) : +ve -> c1 is costlier
        // c1.compareTo(C2) : -ve -> c2 is costlier
        // c1.compareTo(C2) : 0 -> both are equally priced
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                '}';
    }
}
