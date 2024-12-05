import java.util.ArrayList;

public class MarkProfiling {
    private DataInput data;
    // Mark profiling. Weighted in favour of year 2, what is the classification
    // achieved by the highest graded half of credits earned

    // Double credits for Level 6 for weighting
    // Establish if 1.1 modules cross threshold of half credits (weighted 2:1)
    // If not, add 2:1 credits and check if it's over half and so on until >50%
    // of credits are accounted for.
    // Easiest way to do this is sort grades into descending order
    // Cycle through sorted list, adding grades from 1.1 only the first time
    // Add also from 2.1 the second time and so on.
    // Break the loop and the award is determined by the lowest mark needed to cross 50%

    public MarkProfiling(DataInput data) {
        this.data = data;
    }

    public double MarkProfilingAward() {
        double averageGrade = 0;
        double thresholdCredits = 0;


        ArrayList<Integer> grades5 = data.getLevel5Grades();
        ArrayList<Integer> credits5 = data.getLevel5Credits();
        ArrayList<Integer> grades6 = data.getLevel6Grades();
        ArrayList<Integer> credits6 = data.getLevel6Credits();
        // Double the value of Level 6 credits for weighting
        credits6.replaceAll(n -> n * 2);

        // Creating a new arraylist for grades and credits
        // Using Level 5 as base and adding Level 6 data to it
        ArrayList<Integer> gradesAll = data.getLevel5Grades();
        ArrayList<Integer> creditsAll = data.getLevel5Credits();

        gradesAll.addAll(grades6);
        creditsAll.addAll(credits6);



        // testing
        System.out.println(gradesAll);
        System.out.println(creditsAll);

        return averageGrade;
    }

}
