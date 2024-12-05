public class BalancedAverage {
    // Average grade calculation, weighted evenly

    public double Level5Average() {
        double average = 0;
        int credits = 0;
        DataInput data = new DataInput();

        // data.getLevel5Grades();
        int modules5 = data.Level5Grades.size();
        for (int i = 0; i < modules5; i++) {
            average += data.Level5Grades.get(i);
        }
        for (int i = 0; i < modules5; i++) {
            credits += data.Level5Credits.get(i);
        }

        average /= modules5;
        // data.getLevel5Credits();

        return average;
    }

    public double Level6Average() {
        double average = 0;
        int credits = 0;
        DataInput data = new DataInput();

        int modules6 = data.Level6Grades.size();
        for (int i = 0; i < modules6; i++) {
            average += data.Level6Grades.get(i);
        }
        for (int i = 0; i < modules6; i++) {
            credits += data.Level6Credits.get(i);
        }

        average /= modules6;

        return average;
    }

    public double EqualAverage() {
        return (Level5Average() + Level6Average())/2;
    }

    public double WeightedAverage() {
       return (Level5Average() + Level6Average() + Level6Average()) / 3;
    }
}
