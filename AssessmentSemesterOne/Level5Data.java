package AssessmentSemesterOne;

import java.util.ArrayList;
import java.util.Scanner;

// Creating ArrayLists for the level 5 results and credits
// I want the boxes that are filled in by the user to populate these arraylists
// Can then use the data from the ArrayLists to calculate the average

public class Level5Data {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> Level5Grades = new ArrayList<>();
    static ArrayList<Integer> Level5Credits = new ArrayList<>();

    public static java.util.ArrayList<Integer> getLevel5Grades() {
        return Level5Grades;
    }

    public static ArrayList<Integer> getLevel5Credits() {
        return Level5Credits;
    }

    // setters. Can use these for testing logic as well
    public static void setLevel5Grades(ArrayList<Integer> level5Grades) {
        Level5Grades = level5Grades;
    }

    public static void setLevel5Credits(ArrayList<Integer> level5Credits) {
        Level5Credits = level5Credits;
    }

}


