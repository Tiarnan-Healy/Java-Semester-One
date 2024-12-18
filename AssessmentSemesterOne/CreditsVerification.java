package AssessmentSemesterOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CreditsVerification {
    private static int total = 0;
    public static void creditsVerification(JTextField tf, JTextField tfTotal) {
        // Document listener was causing numbers to be added as each digit was added
        // Focus listener seemed to be the solution coming up when googling
        tf.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // When making a change this eliminates the old value
                if (!tf.getText().isEmpty()) {
                    total -= GradesCalculatorGUI.numberToParse(tf);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                validateInput();
            }

            // add credits and show to user it needs to be 120
            public void validateInput() {
                total += GradesCalculatorGUI.numberToParse(tf);

                tfTotal.setText(total + "/120");
                if (total < 120) {
                  tfTotal.setBackground(Color.white);
                } else if (total == 120) {
                    tfTotal.setBackground(Color.green);
                } else if (total > 120) {
                    tfTotal.setBackground(Color.PINK);
                }
            }
        });
    }
}
