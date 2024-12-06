package Week3.InheritanceBasics;


public class Vehicle {
    // Attributes
    private String make;
    private String model;
    private int year;
    private int horsePower;
    private int passengerCapacity;
    private int topSpeed;
    private String color;
    private double engineSize;
    private String engineType;
    public Vehicle(String make, String model, int year, int horsePower, int passengerCapacity,
                   int topSpeed, String color, double engineSize, String engineType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;
        this.passengerCapacity = passengerCapacity;
        this.topSpeed = topSpeed;
        this.color = color;
        this.engineSize = engineSize;
        this.engineType = engineType;
    }

    // getters
    public String getMake() { return make;}
    public String getModel() {return model;}
    public int getYear() { return year; }
    public int getHorsePower() { return horsePower; }
    public int getPassengerCapacity() { return passengerCapacity; }
    public int getTopSpeed() { return topSpeed; }
    public String getColor() { return color; }
    public double getEngineSize() { return engineSize; }
    public String getEngineType() { return engineType; }

    // setters
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }
    public void setPassengerCapacity(int passengerCapacity) {this.passengerCapacity = passengerCapacity;}
    public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }
    public void setColor(String color) { this.color = color; }
    public void setEngineSize(double engineSize) { this.engineSize = engineSize; }
    public void setEngineType(String engineType) { this.engineType = engineType; }

    // methods
}