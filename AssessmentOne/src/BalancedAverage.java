import java.util.ArrayList;

public class BalancedAverage {
    private DataInput data;
    // Average grade calculation, weighted evenly

    public BalancedAverage(DataInput data) {
        this.data = data;
    }
    public double Level5Average() {
        double averageGrade = 0;
        double totalCredits = 0;
        int totalGrade = 0;
        double proportionalGrade = 0;

        ArrayList<Integer> grades5 = data.getLevel5Grades();
        ArrayList<Integer> credits5 = data.getLevel5Credits();

        // multiply credits by grades to apportion weighting
        // will then divide by the sum of the credits earned for a percentage figure
        for (int i = 0; i < grades5.size(); i++) {
            totalGrade += grades5.get(i);
            //System.out.print("Total grade" + totalGrade + "\t");
            totalCredits += credits5.get(i);
            //System.out.print("Total credits" + totalCredits + "\t");
            proportionalGrade += grades5.get(i) * credits5.get(i);
            //System.out.println("Proportional grade" + proportionalGrade);
        }

        // assign credit portions

        averageGrade = proportionalGrade / totalCredits;
        //System.out.println("Average grade" + averageGrade);
        // data.getLevel5Credits();

        return averageGrade;
    }

    public double Level6Average() {
        double averageGrade = 0;
        double totalCredits = 0;
        int totalGrade = 0;
        double proportionalGrade = 0;

        ArrayList<Integer> grades6 = data.getLevel6Grades();
        ArrayList<Integer> credits6 = data.getLevel6Credits();

        for (int i = 0; i < grades6.size(); i++) {
            totalGrade += grades6.get(i);
            //System.out.print("Total grade" + totalGrade + "\t");
            totalCredits += credits6.get(i);
            //System.out.print("Total credits" + totalCredits + "\t");
            proportionalGrade += grades6.get(i) * credits6.get(i);
            //System.out.println("Proportional grade" + proportionalGrade);
        }

        averageGrade = proportionalGrade / totalCredits;

        return averageGrade;
    }

    public double EqualAverage() {
        return (Level5Average() + Level6Average())/2;
    }

    public double WeightedAverage() {
        return (Level5Average() + Level6Average() + Level6Average()) / 3;
    }
}
