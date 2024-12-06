package Week3.InheritanceBasics;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Yamaha", "MTB", 2, 2022, 200, 1, 160, "Red", 250, "2 stroke", 26);
        Car car = new Car("Mazda", "MX-5", 4, 2016, 150, 2, 160, "Blue", 1600, "v4");
        Truck truck = new Truck("Volvo", "C16", 6, 2019, 450, 3, 135, "Black", 4000, "v6");

        car.go();
        bike.go();
        truck.go();
        car.sound();
        bike.sound();
        truck.sound();
        car.stop();
        truck.stop();
        bike.stop();
    }
}
