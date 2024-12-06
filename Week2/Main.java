package Week2;
import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {


        Employee emp1 = new Employee(
                "Dave Chambers",
                25,
                26000,
                37.5,
                "QA Tester",
                "Quality Control",
                2024,
                01,
                01,
                12345);

        Employee emp2 = new Employee(
                "Alexander Ten",
                30,
                30000,
                30,
                "Manager",
                "Development",
                2019,
                06,
                01,
                11890);

        System.out.println(emp1.getName() + "\n" + emp1.getSalary() + "\n" + emp1.getAge() + "\n" + emp1.getRole() + "\n");
        System.out.println(emp2.getName() + "\n" + emp2.getSalary() + "\n" + emp2.getAge() + "\n" + emp2.getRole() + "\n");
    }
}
