package interfaceAndAbstractClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Crow());
        birds.add(new Sparrow());
        birds.add(new Penguin());

        for(Bird b : birds) {
            b.breathe();
        }

        List<IFlyable> flyableBirds = new ArrayList<>();
        flyableBirds.add(new Crow());
        flyableBirds.add(new Sparrow());

        for(IFlyable b : flyableBirds) {
            b.fly();
        }

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(100, 100000));
        cars.add(new Car(200, 1000000));
        cars.add(new Car(50, 25000));
        cars.add(new Car(250, 1500000));
        cars.add(new Car(125, 200000));
        System.out.print("Unsorted Cars : ");
        System.out.println(cars);
        Collections.sort(cars);
        System.out.print("Sorted cars : ");
        System.out.println(cars);


        PersonalVehicle pv = new PersonalVehicle();
        ICar pvCar = new PersonalVehicle();
        IBike pvBike = new PersonalVehicle();

        pv.run();
        pvCar.run();
        pvBike.run();
        }
    }
