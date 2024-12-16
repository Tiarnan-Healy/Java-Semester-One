package AssessmentSemesterOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import java.util.ArrayList;

public class AverageCalculationsTest {
    static Stream<Arguments> testDataA() {
        Level5Data testData5A = new Level5Data();

        // test credits
        ArrayList<Integer> testCredits5A = new ArrayList<>();
        testCredits5A.add(20);
        testCredits5A.add(20);
        testCredits5A.add(20);
        testCredits5A.add(20);
        testCredits5A.add(20);
        testCredits5A.add(20);
        testData5A.setLevel5Credits(testCredits5A);

        // test grades
        ArrayList<Integer> testGrades5A = new ArrayList<>();
        testGrades5A.add(78);
        testGrades5A.add(75);
        testGrades5A.add(78);
        testGrades5A.add(75);
        testGrades5A.add(78);
        testGrades5A.add(68);
        testData5A.setLevel5Grades(testGrades5A);

        Level6Data testData6A = new Level6Data();
        // test credits
        ArrayList<Integer> testCredits6A = new ArrayList<>();
        testCredits6A.add(20);
        testCredits6A.add(20);
        testCredits6A.add(20);
        testCredits6A.add(20);
        testCredits6A.add(20);
        testCredits6A.add(20);
        testData6A.setLevel6Credits(testCredits6A);

        // test grades
        ArrayList<Integer> testGrades6A = new ArrayList<>();
        testGrades6A.add(68);
        testGrades6A.add(65);
        testGrades6A.add(62);
        testGrades6A.add(68);
        testGrades6A.add(65);
        testGrades6A.add(62);
        testData6A.setLevel6Grades(testGrades6A);

        return Stream.of(
                Arguments.of(testData5A, testData6A, 70.17)
        );
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

//    private double testEvenAverage(Level5Data x, Level6Data y) {
//        this.Level5Data = x;
//        this.Level6Data = y;
//
//        double evenResult = testCalculationA.EqualAverage();
//        return evenResult;
//    }

    @ParameterizedTest

    @MethodSource("testDataA")
    public void evenAverageA(Level5Data test5A, Level6Data test6A) {
        AverageCalculations testCalculationA = new AverageCalculations(test5A, test6A);
        double evenResult = testCalculationA.EqualAverage();
        Assertions.assertEquals("70.17", String.format("%.2f", evenResult));
    }

//    AverageCalculations testCalculationA = new AverageCalculations(test5A(), test6A());
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
