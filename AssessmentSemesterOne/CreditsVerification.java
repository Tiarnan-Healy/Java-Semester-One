package AssessmentSemesterOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CreditsVerification {
    private static int total5 = 0;
    private static int total6 = 0;
    public static void creditsVerification5(JTextField tf, JTextField tfTotal) {
        // Document listener was causing numbers to be added as each digit was added
        // Focus listener seemed to be the solution coming up when googling
        tf.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // When making a change this eliminates the old value
                if (!tf.getText().isEmpty()) {
                    total5 -= GradesCalculatorGUI.creditParse(tf);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                validateInput();
            }

            // add credits and show to user it needs to be 120
            public void validateInput() {
                total5 += GradesCalculatorGUI.creditParse(tf);

                tfTotal.setText(total5 + "/120");
                if (total5 < 120) {
                  tfTotal.setBackground(Color.white);
                } else if (total5 == 120) {
                    tfTotal.setBackground(Color.green);
                } else if (total5 > 120) {
                    tfTotal.setBackground(Color.PINK);
                }
            }
        });
    }

    public static void creditsVerification6(JTextField tf, JTextField tfTotal) {
        // Document listener was causing numbers to be added as each digit was added
        // Focus listener seemed to be the solution coming up when googling
        tf.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                // When making a change this eliminates the old value
                if (!tf.getText().isEmpty()) {
                    total6 -= GradesCalculatorGUI.creditParse(tf);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                validateInput();
            }

            // add credits and show to user it needs to be 120
            public void validateInput() {
                total6 += GradesCalculatorGUI.creditParse(tf);

                tfTotal.setText(total6 + "/120");
                if (total6 < 120) {
                    tfTotal.setBackground(Color.white);
                } else if (total6 == 120) {
                    tfTotal.setBackground(Color.green);
                } else if (total6 > 120) {
                    tfTotal.setBackground(Color.PINK);
                }
            }
        });
    }

}
