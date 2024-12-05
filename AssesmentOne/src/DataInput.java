import java.util.ArrayList;
import java.util.Scanner;

public class DataInput {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> Level5Grades = new ArrayList<Integer>();
    ArrayList<Integer> Level5Credits = new ArrayList<Integer>();
    ArrayList<Integer> Level6Grades = new ArrayList<Integer>();
    ArrayList<Integer> Level6Credits = new ArrayList<Integer>();


    // Level 5 marks
    public void Level5GradesInput() {
        System.out.println(" ");
        int modules5 = sc.nextInt();
        for (int i = 0; i < modules5; i++) {
            System.out.println("Enter the credits for module " + modules5 + ": ");
            Level5Credits.add(sc.nextInt());
            System.out.println("Enter the grades for module " + modules5 + ": ");
            Level5Grades.add(sc.nextInt());
        }
    }

    // Get Level 5 grades
    public ArrayList<Integer> getLevel5Grades() {
        return Level5Grades;
    }

    // Get level 5 credits
    public ArrayList<Integer> getLevel5Credits() {
        return Level5Credits;
    }

    // Level 6 marks
    public void Level6GradesInput() {
        System.out.println("Enter the number of Level 6 modules: ");
        int modules6 = sc.nextInt();
        for (int i = 0; i < modules6; i++) {
            System.out.println("Enter the credits for module " + modules6 + ": ");
            Level6Credits.add(sc.nextInt());
            System.out.println("Enter the grades for module " + modules6 + ": ");
            Level6Grades.add(sc.nextInt());
        }
    }

    // Get level 6 grades
    public ArrayList<Integer> getLevel6Grades() {
        return Level6Grades;
    }

    // get level 6 credits
    public ArrayList<Integer> getLevel6Credits() {
        return Level6Credits;
    }

}
