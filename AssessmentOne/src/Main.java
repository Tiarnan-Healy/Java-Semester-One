import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataInput test = new DataInput();
        Scanner sc = new Scanner(System.in);

        // test.Level5GradesInput();
        // test.Level6GradesInput();

        test.loadData();

        BalancedAverage average = new BalancedAverage(test);
        System.out.println("Average Level 5 grade:\t" + average.Level5Average());
        System.out.println("Average level 6 grade:\t" + average.Level6Average());
        System.out.println("Average balanced grade:\t" + average.EqualAverage());
        System.out.println("Average weighted grade:\t" + average.WeightedAverage());
    }
}
