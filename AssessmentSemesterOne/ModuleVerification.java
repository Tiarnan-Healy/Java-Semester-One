package AssessmentSemesterOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import static AssessmentSemesterOne.GradesCalculatorGUI.moduleInfoParse;

public class ModuleVerification {
    // I want to see that module codes in level 5 are for level 5 modules
    public static void moduleVerification5(JComboBox box5) {
        char levelChar = moduleInfoParse(box5);
        if (levelChar != '5') {
            box5.setBackground(Color.PINK);
        } else {
            box5.setBackground(Color.white);
        }
    }

    public static void moduleVerification6(JComboBox box6) {
        char levelChar = moduleInfoParse(box6);
        if (levelChar != '6') {
            box6.setBackground(Color.PINK);
        } else {
            box6.setBackground(Color.white);
        }
    }
}
