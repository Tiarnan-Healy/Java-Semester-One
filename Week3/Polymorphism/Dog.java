package Week3.Polymorphism;

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    // Specific method for Dog
    public void bark() {
        System.out.println(name + " is barking.");
    }
    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Dog's Name: " +
                name + ", Age: " + age);
    }
}