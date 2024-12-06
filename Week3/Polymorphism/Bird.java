package Week3.Polymorphism;

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }
    // Specific method for Bird
    public void tweet() {
        System.out.println(name + " is tweeting.");
    }
    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Bird's Name: " +
                name + ", Age: " + age);
    }
}