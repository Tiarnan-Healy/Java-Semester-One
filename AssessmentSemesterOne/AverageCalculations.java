package AssessmentSemesterOne;

import java.util.ArrayList;

public class AverageCalculations {
    private static Level5Data data5;
    private static Level6Data data6;

    // Average grade calculation, weighted evenly
    public AverageCalculations(Level5Data data5, Level6Data data6) {
        this.data5 = data5;
        this.data6 = data6;
    }

    public static double Level5Average() {
        double averageGrade = 0;
        double totalCredits = 0;
        int totalGrade = 0;
        double proportionalGrade = 0;

        ArrayList<Integer> grades5 = data5.getLevel5Grades();
        ArrayList<Integer> credits5 = data5.getLevel5Credits();

        // cleaning up bad inputs
        grades5.removeIf(n -> n <= 0);
        credits5.removeIf(n -> n <= 0);

        // multiply credits by grades to apportion weighting
        // will then divide by the sum of the credits earned for a percentage figure
        for (int i = 0; i < grades5.size(); i++) {
            totalGrade += grades5.get(i);
            totalCredits += credits5.get(i);
            proportionalGrade += grades5.get(i) * credits5.get(i);
        }

        // assign credit portions

        averageGrade = proportionalGrade / totalCredits;

        return averageGrade;
    }

    public static double Level6Average() {
        double averageGrade = 0;
        double totalCredits = 0;
        int totalGrade = 0;
        double proportionalGrade = 0;

        ArrayList<Integer> grades6 = data6.getLevel6Grades();
        ArrayList<Integer> credits6 = data6.getLevel6Credits();

        grades6.removeIf(n -> n <= 0);
        credits6.removeIf(n -> n <= 0);

        for (int i = 0; i < grades6.size(); i++) {
            totalGrade += grades6.get(i);
            totalCredits += credits6.get(i);
            proportionalGrade += grades6.get(i) * credits6.get(i);
        }

        averageGrade = proportionalGrade / totalCredits;

        return averageGrade;
    }

    public static double EqualAverage() {
        return (Level5Average() + Level6Average())/2;
    }

    public static double WeightedAverage() {
        return (Level5Average() + Level6Average() + Level6Average()) / 3;
    }
}