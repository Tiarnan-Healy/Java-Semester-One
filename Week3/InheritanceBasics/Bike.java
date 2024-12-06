package Week3.InheritanceBasics;

public class Bike extends Vehicle {
    private int wheelSize;
    public Bike(String make, String model, int year, int horsePower, int passengerCapacity,
                int topSpeed, String colour, double engineSize, String engineType, int wheelSize) {
        super(make, model, year, horsePower, passengerCapacity, topSpeed, colour, engineSize, engineType);
        this.wheelSize = wheelSize;
    }
}
