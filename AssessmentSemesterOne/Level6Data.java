package AssessmentSemesterOne;

import java.util.ArrayList;
import java.util.Scanner;

public class Level6Data {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> Level6Grades = new ArrayList<>();
    static ArrayList<Integer> Level6Credits = new ArrayList<>();

    public static ArrayList<Integer> getLevel6Credits() {
        return Level6Credits;
    }

    public static ArrayList<Integer> getLevel6Grades() {
        return Level6Grades;
    }

    public static void setLevel6Credits(ArrayList<Integer> level6Credits) {
        Level6Credits = level6Credits;
    }

    public static void setLevel6Grades(ArrayList<Integer> level6Grades) {
        Level6Grades = level6Grades;
    }
}
