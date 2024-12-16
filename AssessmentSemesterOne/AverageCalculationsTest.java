package AssessmentSemesterOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AverageCalculationsTest {
    private AssessmentSemesterOne.Level5Data Level5Data;
    private AssessmentSemesterOne.Level6Data Level6Data;

    // Scenario data from "Degree Classification Calculator
    // - Validation Rules and Test Cases" pdf provided on Moodle
    // Scenario 1
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

    // Scenario 2
    private Level5Data test5B() {
        Level5Data testData5B = new Level5Data();

        // test credits
        ArrayList<Integer> testCredits5 = new ArrayList<>();
        testCredits5.add(30);
        testCredits5.add(30);
        testCredits5.add(30);
        testCredits5.add(30);
        testData5B.setLevel5Credits(testCredits5);

        // test grades
        ArrayList<Integer> testGrades5 = new ArrayList<>();
        testGrades5.add(68);
        testGrades5.add(65);
        testGrades5.add(62);
        testGrades5.add(68);
        testData5B.setLevel5Grades(testGrades5);

        return testData5B;
    }
    private Level6Data test6B() {
        Level6Data testData6B = new Level6Data();
        // test credits
        ArrayList<Integer> testCredits6 = new ArrayList<>();
        testCredits6.add(30);
        testCredits6.add(30);
        testCredits6.add(30);
        testCredits6.add(30);
        testData6B.setLevel6Credits(testCredits6);

        // test grades
        ArrayList<Integer> testGrades6 = new ArrayList<>();
        testGrades6.add(78);
        testGrades6.add(75);
        testGrades6.add(68);
        testGrades6.add(68);
        testData6B.setLevel6Grades(testGrades6);

        return testData6B;
    }

    // Scenario 3
    private Level5Data test5C() {
        Level5Data testData5C = new Level5Data();

        // test credits
        ArrayList<Integer> testCredits5 = new ArrayList<>();
        testCredits5.add(15);
        testCredits5.add(15);
        testCredits5.add(30);
        testCredits5.add(30);
        testCredits5.add(30);
        testData5C.setLevel5Credits(testCredits5);

        // test grades
        ArrayList<Integer> testGrades5 = new ArrayList<>();
        testGrades5.add(55);
        testGrades5.add(52);
        testGrades5.add(55);
        testGrades5.add(52);
        testGrades5.add(55);
        testData5C.setLevel5Grades(testGrades5);

        return testData5C;
    }
    private Level6Data test6C() {
        Level6Data testData6C = new Level6Data();
        // test credits
        ArrayList<Integer> testCredits6 = new ArrayList<>();
        testCredits6.add(15);
        testCredits6.add(15);
        testCredits6.add(30);
        testCredits6.add(30);
        testCredits6.add(30);
        testData6C.setLevel6Credits(testCredits6);

        // test grades
        ArrayList<Integer> testGrades6 = new ArrayList<>();
        testGrades6.add(55);
        testGrades6.add(52);
        testGrades6.add(68);
        testGrades6.add(65);
        testGrades6.add(62);
        testData6C.setLevel6Grades(testGrades6);

        return testData6C;
    }

    // Scenario 4
    private Level6Data test6D() {
        Level6Data testData6D = new Level6Data();

        // test credits
        ArrayList<Integer> testCredits6 = new ArrayList<>();
        testCredits6.add(60);
        testCredits6.add(30);
        testCredits6.add(30);
        testData6D.setLevel6Credits(testCredits6);

        // test grades
        ArrayList<Integer> testGrades6 = new ArrayList<>();
        testGrades6.add(58);
        testGrades6.add(58);
        testGrades6.add(68);
        testData6D.setLevel6Grades(testGrades6);

        return testData6D;
    }

    // Scenario 5
    private Level6Data test6E() {
        Level6Data testData6E = new Level6Data();

        // test credits
        ArrayList<Integer> testCredits6 = new ArrayList<>();
        testCredits6.add(30);
        testCredits6.add(30);
        testCredits6.add(30);
        testCredits6.add(30);
        testData6E.setLevel6Credits(testCredits6);

        // test grades
        ArrayList<Integer> testGrades6 = new ArrayList<>();
        testGrades6.add(68);
        testGrades6.add(65);
        testGrades6.add(62);
        testGrades6.add(42);
        testData6E.setLevel6Grades(testGrades6);

        return testData6E;
    }

    // Method A test
    private double testEvenAverage(Level5Data x, Level6Data y) {
        this.Level5Data = x;
        this.Level6Data = y;

        double evenResult = testCalculationA.EqualAverage();
        return evenResult;
    }

    // Method B test
    private double testWeightedAverage(Level5Data x, Level6Data y) {
        this.Level5Data = x;
        this.Level6Data = y;

        double weightedResult = testCalculationA.WeightedAverage();
        return weightedResult;
    }


    // Method C test
    private double testLevel6Average(Level6Data y) {
        this.Level6Data = y;

        double advanceEntryResult = testCalculationA.Level6Average();
        return advanceEntryResult;
    }

    @Test // Method A Average 1 for Scenario 1
            public void evenAverageA() {
                double evenResult = testEvenAverage(test5A(), test6A());
                Assertions.assertEquals("70.17", String.format("%.2f", evenResult));
    }

    @Test // Method B Average 2 for Scenario 1
            public void weightedAverageA() {
                double weightedResult = testWeightedAverage(test5A(), test6A());
                Assertions.assertEquals("68.44", String.format("%.2f", weightedResult));
    }

    @Test // Method A Average 1 for Scenario 2
            public void evenAverageB() {
                double evenResult = testEvenAverage(test5B(), test6B());
                Assertions.assertEquals("69.00", String.format("%.2f", evenResult));
    }

    @Test // Method B Average 2 for Scenario 2
            public void weightedAverageB() {
                double weightedResult = testWeightedAverage(test5B(), test6B());
                Assertions.assertEquals("70.08", String.format("%.2f", weightedResult));
    }
    @Test // Method A Average 1 for Scenario 3
            public void evenAverageC() {
                double evenResult = testEvenAverage(test5C(), test6C());
                Assertions.assertEquals("58.00", String.format("%.2f", evenResult));
    }

    @Test // Method B Average 2 for Scenario 3
            public void weightedAverageC() {
                double weightedResult = testWeightedAverage(test5C(), test6C());
                Assertions.assertEquals("59.38", String.format("%.2f", weightedResult));
    }
    @Test // Method C Average for Scenario 4
            public void evenAverageD() {
                double evenResult = testLevel6Average(test6D());
                Assertions.assertEquals("60.50", String.format("%.2f", evenResult));
    }

    @Test // Method C Average for Scenario 5
            public void evenAverageE() {
                double evenResult = testLevel6Average(test6E());
                Assertions.assertEquals("59.25", String.format("%.2f", evenResult));
    }


    AverageCalculations testCalculationA = new AverageCalculations(test5A(), test6A());
//        // double evenResult = testCalculationA.EqualAverage();
//        // String.format("%.2f", evenResult);
//        // double weightedResult = testCalculationA.WeightedAverage();
//        // String.format("%.2f", weightedResult);
//        // String markProfilingResult = testCalculationA.MarkProfiling();
//
//        Assertions.assertEquals("70.17", String.format("%.2f", evenResult)); // Comparing as strings for sake of ease
//        Assertions.assertEquals("68.44", String.format("%.2f", weightedResult));
//        Assertions.assertEquals("2.1", markProfilingResult);
//    }
}
