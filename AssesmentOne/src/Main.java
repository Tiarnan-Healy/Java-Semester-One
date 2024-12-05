import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataInput test = new DataInput();
        Scanner sc = new Scanner(System.in);

        test.Level5GradesInput();
        test.Level6GradesInput();

        BalancedAverage average = new BalancedAverage();
        System.out.print(average.Level5Average());
        System.out.print(average.Level6Average());
        System.out.println(average.EqualAverage());
        System.out.println(average.WeightedAverage());
    }
}
