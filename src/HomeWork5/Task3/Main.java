package HomeWork5.Task3;

import HomeWork5.Task3.Classes.Car;
import HomeWork5.Task3.Classes.Garage;
import HomeWork5.Task3.Classes.Person;
import HomeWork5.Task3.Enum.Brand;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        ArrayList<Car> carsPark = new ArrayList<>(List.of(
                new Car(
                        Brand.FORD,
                        1400,
                        new Person("Andrii", 46, 12),
                        200000,
                        2006),
                new Car(
                        Brand.BMW,
                        2200,
                        new Person("Owner2", 21, 3),
                        800000,
                        2020),
                new Car(
                        Brand.AUDI,
                        1400,
                        new Person("Owner2", 23, 5),
                        500000,
                        2006),
                new Car(
                        Brand.TESLA,
                        1400,
                        new Person("Owner3", 35, 8),
                        200000,
                        2006),
                new Car(
                        Brand.TOYOTA,
                        2200,
                        new Person("Owner4", 38, 20),
                        200000,
                        2006),
                new Car(
                        Brand.FORD,
                        1400,
                        new Person("Owner5", 23, 2),
                        200000,
                        2006),
                new Car(
                        Brand.FORD,
                        1400,
                        new Person("Owner6", 38, 6),
                        200000,
                        2006)
        ));
        garage.setCars(carsPark);
        garage.getCars().stream()
                .limit(garage.getCars().size() / 2)
                .forEach(car -> car.setEnginePower((int) Math.round(car.getEnginePower() * 1.1))
                );
        garage.getCars().stream()
                .filter(car -> car.getOwner().getDrivingExperience() < 5 &&
                        car.getOwner().getAge() > 25)
                .forEach(car -> car.getOwner().setDrivingExperience(car.getOwner().getDrivingExperience() + 1)
                );
        System.out.println(garage.getCars());
        System.out.println("Sum: " + garage.getCars().stream()
                .map(Car::getPrice)
                .reduce(0.00, Double::sum)
        );
    }
}
