import java.util.ArrayList;
import java.util.Scanner;

public class DataInput {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> Level5Grades = new ArrayList<>();
    ArrayList<Integer> Level5Credits = new ArrayList<>();
    ArrayList<Integer> Level6Grades = new ArrayList<>();
    ArrayList<Integer> Level6Credits = new ArrayList<>();

    public void loadData() {
        // testing without having to repeatedly input results
        Level5Grades.add(72);
        Level5Grades.add(85);
        Level5Grades.add(58);
        Level5Grades.add(64);
        Level5Grades.add(79);

        Level5Credits.add(15);
        Level5Credits.add(15);
        Level5Credits.add(30);
        Level5Credits.add(30);
        Level5Credits.add(30);

        Level6Grades.add(65);
        Level6Grades.add(45);
        Level6Grades.add(72);
        Level6Grades.add(78);

        Level6Credits.add(30);
        Level6Credits.add(30);
        Level6Credits.add(60);
        Level6Credits.add(120);
    }

    // Level 5 marks
    public void Level5GradesInput() {
        System.out.println("Enter the number of Level 5 modules: ");
        int modules5 = sc.nextInt();
        for (int i = 0; i < modules5; i++) {
            System.out.println("Enter the credits for module " + (i + 1) + ": ");
            Level5Credits.add(sc.nextInt());
            System.out.println("Enter the grades for module " + (i + 1) + ": ");
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
            System.out.println("Enter the credits for module " + (i + 1) + ": ");
            Level6Credits.add(sc.nextInt());
            System.out.println("Enter the grades for module " + (i + 1) + ": ");
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

