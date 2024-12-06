package Week3.InheritanceBasics;


public class Vehicle {
    // Attributes
    private String make;
    private String model;
    private int wheels;
    private int year;
    private int horsePower;
    private int passengerCapacity;
    private int topSpeed;
    private String colour;
    private double engineSize;
    private String engineType;
    public Vehicle(String make, String model, int wheels, int year, int horsePower, int passengerCapacity,
                   int topSpeed, String colour, double engineSize, String engineType) {
        this.make = make;
        this.model = model;
        this.wheels = wheels;
        this.year = year;
        this.horsePower = horsePower;
        this.passengerCapacity = passengerCapacity;
        this.topSpeed = topSpeed;
        this.colour = colour;
        this.engineSize = engineSize;
        this.engineType = engineType;
    }

    // getters
    public String getMake() { return make;}
    public String getModel() {return model;}
    public int getWheels() {return wheels;}
    public int getYear() { return year; }
    public int getHorsePower() { return horsePower; }
    public int getPassengerCapacity() { return passengerCapacity; }
    public int getTopSpeed() { return topSpeed; }
    public String getColour() { return colour; }
    public double getEngineSize() { return engineSize; }
    public String getEngineType() { return engineType; }

    // setters
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setWheels(int wheels) { this.wheels = wheels; }
    public void setYear(int year) { this.year = year; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }
    public void setPassengerCapacity(int passengerCapacity) {this.passengerCapacity = passengerCapacity;}
    public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }
    public void setColour(String colour) { this.colour = colour; }
    public void setEngineSize(double engineSize) { this.engineSize = engineSize; }
    public void setEngineType(String engineType) { this.engineType = engineType; }

    // methods
    public void go() {
        System.out.println(make + " is moving.");
    }

    public void stop() {
        System.out.println(make + " is stopping.");
    }

    public void sound() {
        System.out.println(make + " is beeping.");
    }
}