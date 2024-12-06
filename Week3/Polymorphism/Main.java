package Week3.Polymorphism;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Rex", 55);
        Animal myCat = new Cat("Patch", 45);
        Animal myBird = new Bird("Damo", 25);

        myDog.displayInfo();
        myDog.eat();
        myCat.displayInfo();
        myBird.displayInfo();
    }
}