package AssessmentSemesterOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AverageCalculationsTest {
    private AssessmentSemesterOne.Level5Data Level5Data;
    private AssessmentSemesterOne.Level6Data Level6Data;

    private Level5Data test5A() {
        Level5Data testData5A = new Level5Data();

        // test credits
        ArrayList<Integer> testCredits5 = new ArrayList<>();
        testCredits5.add(20);
        testCredits5.add(20);
        testCredits5.add(20);
        testCredits5.add(20);
        testCredits5.add(20);
        testCredits5.add(20);
        testData5A.setLevel5Credits(testCredits5);

        // test grades
        ArrayList<Integer> testGrades5 = new ArrayList<>();
        testGrades5.add(78);
        testGrades5.add(75);
        testGrades5.add(78);
        testGrades5.add(75);
        testGrades5.add(78);
        testGrades5.add(68);
        testData5A.setLevel5Grades(testGrades5);

        return testData5A;
    }

    private Level6Data test6A() {
        Level6Data testData6a = new Level6Data();
        // test credits
        ArrayList<Integer> testCredits6 = new ArrayList<>();
        testCredits6.add(20);
        testCredits6.add(20);
        testCredits6.add(20);
        testCredits6.add(20);
        testCredits6.add(20);
        testCredits6.add(20);
        testData6a.setLevel6Credits(testCredits6);

        // test grades
        ArrayList<Integer> testGrades6 = new ArrayList<>();
        testGrades6.add(68);
        testGrades6.add(65);
        testGrades6.add(62);
        testGrades6.add(68);
        testGrades6.add(65);
        testGrades6.add(62);
        testData6a.setLevel6Grades(testGrades6);

        return testData6a;
    }

    private Level5Data test5B() {
        Level5Data testData5B = new Level5Data();

        // test credits
        ArrayList<Integer> testCredits5 = new ArrayList<>();
        testCredits5.add(20);
        testCredits5.add(20);
        testCredits5.add(20);
        testCredits5.add(20);
        testCredits5.add(20);
        testCredits5.add(20);
        testData5B.setLevel5Credits(testCredits5);

        // test grades
        ArrayList<Integer> testGrades5 = new ArrayList<>();
        testGrades5.add(78);
        testGrades5.add(75);
        testGrades5.add(78);
        testGrades5.add(75);
        testGrades5.add(78);
        testGrades5.add(68);
        testData5B.setLevel5Grades(testGrades5);

        return testData5B;
    }

    private Level6Data test6B() {
        Level6Data testData6B = new Level6Data();
        // test credits
        ArrayList<Integer> testCredits6 = new ArrayList<>();
        testCredits6.add(20);
        testCredits6.add(20);
        testCredits6.add(20);
        testCredits6.add(20);
        testCredits6.add(20);
        testCredits6.add(20);
        testData6B.setLevel6Credits(testCredits6);

        // test grades
        ArrayList<Integer> testGrades6 = new ArrayList<>();
        testGrades6.add(68);
        testGrades6.add(65);
        testGrades6.add(62);
        testGrades6.add(68);
        testGrades6.add(65);
        testGrades6.add(62);
        testData6B.setLevel6Grades(testGrades6);

        return testData6B;
    }

    private double testEvenAverage(Level5Data x, Level6Data y) {
        this.Level5Data = x;
        this.Level6Data = y;

        double evenResult = testCalculationA.EqualAverage();
        return evenResult;
    }

    @Test
    public void evenAverageA(Level5Data test5A, Level6Data test6A) {
        double evenResult = testEvenAverage(test5A, test6A);
        Assertions.assertEquals("70.17", String.format("%.2f", evenResult));
    }

    AverageCalculations testCalculationA = new AverageCalculations(test5A(), test6A());
        // double evenResult = testCalculationA.EqualAverage();
        // String.format("%.2f", evenResult);
        // double weightedResult = testCalculationA.WeightedAverage();
        // String.format("%.2f", weightedResult);
        // String markProfilingResult = testCalculationA.MarkProfiling();

        Assertions.assertEquals("70.17", String.format("%.2f", evenResult)); // Comparing as strings for sake of ease
        Assertions.assertEquals("68.44", String.format("%.2f", weightedResult));
        Assertions.assertEquals("2.1", markProfilingResult);
    }
}
