package AssessmentSemesterOne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {
    public static List<String[]> readFile(){
        int count = 0;
        String file = "C:/Users/Aerocool/Documents/COM5003 Further Software Development/Java-Semester-One/AssessmentSemesterOne/CourseDetails.csv";
        List<String[]> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
            }
        } catch (IOException e) {
            //Some error logging
        }
        return content;
    }

    public static void moduleInformation(){
        List<String[]> moduleInfo = readFile();

        // int dataPoints = moduleInfo.size();
        for (String [] row : moduleInfo) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void moduleAssignment() {
        List<String[]> moduleInfo = readFile();

        for (String [] row : moduleInfo) {
            for (int i= 0; i < row.length; i++){

            }
        }
    }

}
