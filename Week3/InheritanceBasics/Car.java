package Week3.InheritanceBasics;

public class Car extends Vehicle {
    public Car(String make, String model, int wheels, int year, int horsePower, int passengerCapacity,
               int topSpeed, String colour, double engineSize, String engineType) {
        super(make, model, wheels, year, horsePower, passengerCapacity, topSpeed, colour, engineSize, engineType);
    }
     @Override
    public void sound() {
        System.out.println("Vroom");
     }
}
