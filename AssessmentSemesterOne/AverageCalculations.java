package AssessmentSemesterOne;

import java.util.ArrayList;
import java.util.Objects;

public class AverageCalculations {
    private Level5Data data5;
    private Level6Data data6;

    // Average grade calculation, weighted evenly
    public AverageCalculations(Level5Data data5, Level6Data data6) {
        this.data5 = data5;
        this.data6 = data6;
    }

    public double Level5Average() {
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

    public double Level6Average() {
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

    public double EqualAverage() {
        return (Level5Average() + Level6Average()) / 2;
    }

    public double WeightedAverage() {
        return (Level5Average() + Level6Average() + Level6Average()) / 3;
    }

    // I've decided not to write this in a separate file to keep things neater.
    // Pasting my thinking over from old version to explain my logic

    // Mark profiling. Weighted in favour of year 2, what is the classification
    // achieved by the highest graded half of credits earned

    // Double credits for Level 6 for weighting
    // Establish if 1.1 modules cross threshold of half credits (weighted 2:1)
    // If not, add 2:1 credits and check if it's over half and so on until >50%
    // of credits are accounted for.
    // Easiest way to do this is sort grades into descending order
    // Cycle through sorted list, adding grades from 1.1 only the first time
    // Add also from 2.1 the second time and so on.
    // Break the loop and award is determined by the lowest mark needed to cross 50%

    public String MarkProfiling() {
        String gradeClassification = "";
        ArrayList<Integer> grades5 = data5.getLevel5Grades();
        ArrayList<Integer> credits5 = data5.getLevel5Credits();
        ArrayList<Integer> grades6 = data6.getLevel6Grades();
        ArrayList<Integer> credits6 = data6.getLevel6Credits();

        int earnedCreditsFirst = 0;
        int earnedCreditsTwoOne = 0;
        int earnedCreditsTwoTwo = 0;
        int earnedCreditsThird = 0;
        int totalCredits = 0;


        for (int i = 0; i < grades5.size(); i++) {
            totalCredits += credits5.get(i);
            if (grades5.get(i) >= 70) {
                earnedCreditsFirst += credits5.get(i);
            } else if (grades5.get(i) >= 60 && grades5.get(i) < 70) {
                earnedCreditsTwoOne += credits5.get(i);
            } else if (grades5.get(i) >= 50 && grades5.get(i) < 60) {
                earnedCreditsTwoTwo += credits5.get(i);
            } else if (grades5.get(i) >= 40 && grades5.get(i) < 50) {
                earnedCreditsThird += credits5.get(i);
            }

        }

        for (int i = 0; i < grades6.size(); i++ ) {
            totalCredits += (2 * credits6.get(i));
            if (grades6.get(i) >= 70) {
                earnedCreditsFirst += (2 * credits6.get(i));
            } else if (grades6.get(i) >= 60 && grades6.get(i) < 70) {
                earnedCreditsTwoOne += (2 * credits6.get(i));
            } else if (grades6.get(i) >= 50 && grades6.get(i) < 60) {
                earnedCreditsTwoTwo += (2 * credits6.get(i));
            } else if (grades6.get(i) >= 40 && grades6.get(i) < 50) {
                earnedCreditsThird += (2 * credits6.get(i));
            }
        }


        // summing grades here so I have readable if statements
        earnedCreditsTwoOne += earnedCreditsFirst;
        earnedCreditsTwoTwo += earnedCreditsTwoOne;
        earnedCreditsThird += earnedCreditsTwoTwo;

        if (earnedCreditsFirst >= totalCredits / 2){
            gradeClassification = "1";
        } else if (earnedCreditsTwoOne >= totalCredits / 2){
            gradeClassification = "2.1";
        } else if (earnedCreditsTwoTwo >= totalCredits / 2) {
            gradeClassification = "2.2";
        } else if (earnedCreditsThird >= totalCredits / 2) {
            gradeClassification = "3";
        } else {
            gradeClassification = "Fail";
        }

        return gradeClassification;
    }

    public String overallClassification() {
        String gradeClassification = "";
        if (EqualAverage() >= 69.5 || WeightedAverage() >= 69.5 || Objects.equals(MarkProfiling(), "1")) {
            gradeClassification = "1";
        } else if (EqualAverage() >= 59.5 || WeightedAverage() >= 59.5 || Objects.equals(MarkProfiling(), "2.1")) {
            gradeClassification = "2.1";
        } else if (EqualAverage() >= 49.5 || WeightedAverage() >= 49.5 || Objects.equals(MarkProfiling(), "2.2")) {
            gradeClassification = "2.2";
        } else if (EqualAverage() >= 39.5 || WeightedAverage() >= 39.5 || Objects.equals(MarkProfiling(), "3")) {
            gradeClassification = "3";
        } else {
            gradeClassification = "Fail";
        }
        return gradeClassification;
    }
}

