package AssessmentSemesterOne;

import java.util.ArrayList;
import java.util.List;

public class ModuleInformation {

    private int moduleID;
    private String courseID;
    private int level;
    private String name;
    private int credits;
    private boolean isCore;

    public ModuleInformation(int moduleID, String courseID, int level, String name, int credits, boolean isCore){
        this.moduleID = moduleID;
        this.courseID = courseID;
        this.level = level;
        this.name = name;
        this.credits = credits;
        this.isCore = isCore;
    }

    //getters
    public int getModuleID() {
        return moduleID;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public boolean isCore() {
        return isCore;
    }

    public static List<ModuleInformation> parseInformation(){
        List<String[]> moduleInfo = ReadFile.readFile();
        List<ModuleInformation> modules = new ArrayList<>();

        for (String [] row : moduleInfo) {
            try {
                int moduleID = Integer.parseInt(row[0].trim());
                String courseID = row[1].trim();
                int level = Integer.parseInt(row[2].trim());
                String name = row[3].trim();
                int credits = Integer.parseInt(row[4].trim());
                boolean isCore = Boolean.parseBoolean(row[5].trim());

                ModuleInformation module = new ModuleInformation(moduleID, courseID, level, name, credits, isCore);
                modules.add(module);
            } catch (Exception e) {
                System.out.println("Error with CSV file");
            }
        }
        return modules;
    }
}