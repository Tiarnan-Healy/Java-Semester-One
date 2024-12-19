package AssessmentSemesterOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

public class GradesCalculatorGUI extends JFrame {
    // Automatically populated from drag and drop on the .form file
    // It can be awkward so some elements here are not in a logical order.
    private JPanel mainPanel;
    private JTextField welcomeTextField;
    private JLabel level5ResultsLabel;
    private JLabel level6ResultsLabel;
    private JPanel gradeCalculationPanel;
    private JLabel gradeCalculationLabel;
    private JPanel level5ResultsPanel;
    private JPanel level6ResultsPanel;
    private JSpinner level5Grade1;
    private JSpinner level5Grade2;
    private JSpinner level5Grade3;
    private JSpinner level5Grade4;
    private JSpinner level5Grade5;
    private JSpinner level5Grade6;
    private JSpinner level5Grade7;
    private JSpinner level5Grade8;
    private JTextField level5Credits1;
    private JTextField level5Credits2;
    private JTextField level5Credits3;
    private JTextField level5Credits4;
    private JTextField level5Credits5;
    private JTextField level5Credits6;
    private JTextField level5Credits7;
    private JTextField level5Credits8;
    private JSpinner level6Grade1;
    private JSpinner level6Grade2;
    private JSpinner level6Grade3;
    private JSpinner level6Grade4;
    private JSpinner level6Grade5;
    private JSpinner level6Grade6;
    private JSpinner level6Grade7;
    private JSpinner level6Grade8;
    private JTextField level6Credits1;
    private JTextField level6Credits2;
    private JTextField level6Credits3;
    private JTextField level6Credits4;
    private JTextField level6Credits5;
    private JTextField level6Credits6;
    private JTextField level6Credits7;
    private JTextField level6Credits8;
    private JTextField evenWeightingTextField;
    private JTextField weightedTextField;
    private JTextField markProfilingTextField;
    private JTextField level5AverageTextField;
    private JLabel level5AverageLabel;
    private JLabel evenWeightingLabel;
    private JLabel weightedLabel;
    private JLabel markProfilingLabel;
    private JTextField level6AverageTextField;
    private JLabel level6AverageLabel;
    private JButton calculateButton;
    private JTextField overallAwardTextField;
    private JComboBox courseComboBox;
    private JComboBox module5TextField1;
    private JComboBox module5TextField2;
    private JComboBox module5TextField3;
    private JComboBox module5TextField4;
    private JComboBox module5TextField5;
    private JComboBox module5TextField6;
    private JComboBox module5TextField7;
    private JComboBox module5TextField8;
    private JComboBox module6TextField1;
    private JComboBox module6TextField2;
    private JComboBox module6TextField3;
    private JComboBox module6TextField4;
    private JComboBox module6TextField5;
    private JComboBox module6TextField6;
    private JComboBox module6TextField7;
    private JComboBox module6TextField8;
    private JCheckBox advancedEntryCheckBox;
    private JTextField level5CreditTotalTextField;
    private JTextField level6CreditTotalTextField;
    private JButton clearButton;
    private JButton quitButton;
    private JTextField advancedEntryTextField;
    private JLabel advancedEntryLabel;

    public Level5Data level5Data = new Level5Data();
    public Level6Data level6Data = new Level6Data();
    public AverageCalculations averageCalculations = new AverageCalculations(level5Data, level6Data);

    public GradesCalculatorGUI(String title) {
        super(title);

        // Credits input validation
        $$$setupUI$$$();

        CreditsVerify();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Level5DataCollection();
                Level6DataCollection();
                showResults();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                level5Credits1.setText(null);
                level5Credits2.setText(null);
                level5Credits3.setText(null);
                level5Credits4.setText(null);
                level5Credits5.setText(null);
                level5Credits6.setText(null);
                level5Credits7.setText(null);
                level5Credits8.setText(null);
                level5Grade1.setValue(40);
                level5Grade2.setValue(40);
                level5Grade3.setValue(40);
                level5Grade4.setValue(40);
                level5Grade5.setValue(40);
                level5Grade6.setValue(40);
                level5Grade7.setValue(40);
                level5Grade8.setValue(40);
                module5TextField1.removeAllItems();
                module5TextField2.removeAllItems();
                module5TextField3.removeAllItems();
                module5TextField4.removeAllItems();
                module5TextField5.removeAllItems();
                module5TextField6.removeAllItems();
                module5TextField7.removeAllItems();
                module5TextField8.removeAllItems();
                level5AverageTextField.setText(null);
                level5CreditTotalTextField.setText(null);
                level6Credits1.setText(null);
                level6Credits2.setText(null);
                level6Credits3.setText(null);
                level6Credits4.setText(null);
                level6Credits5.setText(null);
                level6Credits6.setText(null);
                level6Credits7.setText(null);
                level6Credits8.setText(null);
                level6Grade1.setValue(40);
                level6Grade2.setValue(40);
                level6Grade3.setValue(40);
                level6Grade4.setValue(40);
                level6Grade5.setValue(40);
                level6Grade6.setValue(40);
                level6Grade7.setValue(40);
                level6Grade8.setValue(40);
                module6TextField1.removeAllItems();
                module6TextField2.removeAllItems();
                module6TextField3.removeAllItems();
                module6TextField4.removeAllItems();
                module6TextField5.removeAllItems();
                module6TextField6.removeAllItems();
                module6TextField7.removeAllItems();
                module6TextField8.removeAllItems();
                level6AverageTextField.setText(null);
                level6CreditTotalTextField.setText(null);
                level5CreditTotalTextField.setBackground(Color.WHITE);
                level6CreditTotalTextField.setBackground(Color.WHITE);
                weightedTextField.setText(null);
                evenWeightingTextField.setText(null);
                advancedEntryTextField.setText(null);
                overallAwardTextField.setText(null);
                markProfilingTextField.setText(null);

            }
        });


        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

//        courseComboBox.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String x = String.valueOf(courseComboBox.getSelectedItem());
//                if (x == "Business Management") {
//                    for
//                    module5TextField1.setText("BMM5123");
//                    module5TextField2.setText("BMM5015");
//                    module5TextField3.setText("BMM5133");
//                    module5TextField4.setText("BMM5143");
//                    module5TextField5.setText("BMM5005");
//                } else if (x == "Criminology") {
//
//                } else if (x == "Film") {
//
//                } else {
//
//                }
//            }
//        });

        advancedEntryCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Clear relevant information first
                    level5Credits1.setText(null);
                    level5Credits2.setText(null);
                    level5Credits3.setText(null);
                    level5Credits4.setText(null);
                    level5Credits5.setText(null);
                    level5Credits6.setText(null);
                    level5Credits7.setText(null);
                    level5Credits8.setText(null);
                    level5Grade1.setValue(40);
                    level5Grade2.setValue(40);
                    level5Grade3.setValue(40);
                    level5Grade4.setValue(40);
                    level5Grade5.setValue(40);
                    level5Grade6.setValue(40);
                    level5Grade7.setValue(40);
                    level5Grade8.setValue(40);
                    module5TextField1.removeAllItems();
                    module5TextField2.removeAllItems();
                    module5TextField3.removeAllItems();
                    module5TextField4.removeAllItems();
                    module5TextField5.removeAllItems();
                    module5TextField6.removeAllItems();
                    module5TextField7.removeAllItems();
                    module5TextField8.removeAllItems();
                    level5AverageTextField.setText(null);
                    level5CreditTotalTextField.setText(null);
                    Level5Data.Level5Grades.clear();
                    Level5Data.Level5Credits.clear();

                    // Set Level 5 elements to disabled
                    level5Credits1.setEnabled(false);
                    level5Credits2.setEnabled(false);
                    level5Credits3.setEnabled(false);
                    level5Credits4.setEnabled(false);
                    level5Credits5.setEnabled(false);
                    level5Credits6.setEnabled(false);
                    level5Credits7.setEnabled(false);
                    level5Credits8.setEnabled(false);
                    level5Grade1.setEnabled(false);
                    level5Grade2.setEnabled(false);
                    level5Grade3.setEnabled(false);
                    level5Grade4.setEnabled(false);
                    level5Grade5.setEnabled(false);
                    level5Grade6.setEnabled(false);
                    level5Grade7.setEnabled(false);
                    level5Grade8.setEnabled(false);
                    module5TextField1.setEnabled(false);
                    module5TextField2.setEnabled(false);
                    module5TextField3.setEnabled(false);
                    module5TextField4.setEnabled(false);
                    module5TextField5.setEnabled(false);
                    module5TextField6.setEnabled(false);
                    module5TextField7.setEnabled(false);
                    module5TextField8.setEnabled(false);
                    advancedEntryTextField.setEnabled(true);
                    level5CreditTotalTextField.setBackground(Color.WHITE);
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    level5Credits1.setEnabled(true);
                    level5Credits2.setEnabled(true);
                    level5Credits3.setEnabled(true);
                    level5Credits4.setEnabled(true);
                    level5Credits5.setEnabled(true);
                    level5Credits6.setEnabled(true);
                    level5Credits7.setEnabled(true);
                    level5Credits8.setEnabled(true);
                    level5Grade1.setEnabled(true);
                    level5Grade2.setEnabled(true);
                    level5Grade3.setEnabled(true);
                    level5Grade4.setEnabled(true);
                    level5Grade5.setEnabled(true);
                    level5Grade6.setEnabled(true);
                    level5Grade7.setEnabled(true);
                    level5Grade8.setEnabled(true);
                    module5TextField1.setEnabled(true);
                    module5TextField2.setEnabled(true);
                    module5TextField3.setEnabled(true);
                    module5TextField4.setEnabled(true);
                    module5TextField5.setEnabled(true);
                    module5TextField6.setEnabled(true);
                    module5TextField7.setEnabled(true);
                    module5TextField8.setEnabled(true);
                    advancedEntryTextField.setEnabled(false);
                }
            }
        });
    }

    // Adding input from user to ArrayLists
    // Collecting all data. Will initialise all relevant input fields to 0, so I get no null data.
    // I think this will work around issues that would come up if people filled out boxes in an unexpected order.
    public void Level5DataCollection() {
        // Clearing old data
        Level5Data.Level5Credits.clear();
        Level5Data.Level5Grades.clear();

        // Adding level 5 grades from the form into the Level5Data ArrayList
        Level5Data.Level5Grades.add(gradeParse(level5Grade1));
        Level5Data.Level5Grades.add(gradeParse(level5Grade2));
        Level5Data.Level5Grades.add(gradeParse(level5Grade3));
        Level5Data.Level5Grades.add(gradeParse(level5Grade4));
        Level5Data.Level5Grades.add(gradeParse(level5Grade5));
        Level5Data.Level5Grades.add(gradeParse(level5Grade6));
        Level5Data.Level5Grades.add(gradeParse(level5Grade7));
        Level5Data.Level5Grades.add(gradeParse(level5Grade8));

        // Adding level 5 credits
        Level5Data.Level5Credits.add(creditParse(level5Credits1));
        Level5Data.Level5Credits.add(creditParse(level5Credits2));
        Level5Data.Level5Credits.add(creditParse(level5Credits3));
        Level5Data.Level5Credits.add(creditParse(level5Credits4));
        Level5Data.Level5Credits.add(creditParse(level5Credits5));
        Level5Data.Level5Credits.add(creditParse(level5Credits6));
        Level5Data.Level5Credits.add(creditParse(level5Credits7));
        Level5Data.Level5Credits.add(creditParse(level5Credits8));
    }

    public void Level6DataCollection() {
        Level6Data.Level6Grades.clear();
        Level6Data.Level6Credits.clear();

        // level 6 grades
        Level6Data.Level6Grades.add(gradeParse(level6Grade1));
        Level6Data.Level6Grades.add(gradeParse(level6Grade2));
        Level6Data.Level6Grades.add(gradeParse(level6Grade3));
        Level6Data.Level6Grades.add(gradeParse(level6Grade4));
        Level6Data.Level6Grades.add(gradeParse(level6Grade5));
        Level6Data.Level6Grades.add(gradeParse(level6Grade6));
        Level6Data.Level6Grades.add(gradeParse(level6Grade7));
        Level6Data.Level6Grades.add(gradeParse(level6Grade8));

        // Level 6 credits
        Level6Data.Level6Credits.add(creditParse(level6Credits1));
        Level6Data.Level6Credits.add(creditParse(level6Credits2));
        Level6Data.Level6Credits.add(creditParse(level6Credits3));
        Level6Data.Level6Credits.add(creditParse(level6Credits4));
        Level6Data.Level6Credits.add(creditParse(level6Credits5));
        Level6Data.Level6Credits.add(creditParse(level6Credits6));
        Level6Data.Level6Credits.add(creditParse(level6Credits7));
        Level6Data.Level6Credits.add(creditParse(level6Credits8));
    }

    // Setting input to 0 with a try catch instead of defaulting all values to 0
    // Credit values of 0 will be discarded from the average calculations
    // I will try to alter things later to account for numbers over 100 and non integers.
    public static int creditParse(JTextField textField) {
        String text = textField.getText();
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {

            return 0;
        }
    }

    public void CreditsVerify() {
        CreditsVerification.creditsVerification5(level5Credits1, level5CreditTotalTextField);
        CreditsVerification.creditsVerification5(level5Credits2, level5CreditTotalTextField);
        CreditsVerification.creditsVerification5(level5Credits3, level5CreditTotalTextField);
        CreditsVerification.creditsVerification5(level5Credits4, level5CreditTotalTextField);
        CreditsVerification.creditsVerification5(level5Credits5, level5CreditTotalTextField);
        CreditsVerification.creditsVerification5(level5Credits6, level5CreditTotalTextField);
        CreditsVerification.creditsVerification5(level5Credits7, level5CreditTotalTextField);
        CreditsVerification.creditsVerification5(level5Credits8, level5CreditTotalTextField);
        CreditsVerification.creditsVerification6(level6Credits1, level6CreditTotalTextField);
        CreditsVerification.creditsVerification6(level6Credits2, level6CreditTotalTextField);
        CreditsVerification.creditsVerification6(level6Credits3, level6CreditTotalTextField);
        CreditsVerification.creditsVerification6(level6Credits4, level6CreditTotalTextField);
        CreditsVerification.creditsVerification6(level6Credits5, level6CreditTotalTextField);
        CreditsVerification.creditsVerification6(level6Credits6, level6CreditTotalTextField);
        CreditsVerification.creditsVerification6(level6Credits7, level6CreditTotalTextField);
        CreditsVerification.creditsVerification6(level6Credits8, level6CreditTotalTextField);

    }

    public static char moduleInfoParse(JComboBox box) {
        String module = box.getSelectedItem().toString();
        char levelChar = module.charAt(3); // get the digit that indicates level the module is at
        return levelChar;
    }

    public void ModuleVerify5() {
        moduleInfoParse(module5TextField1);
        moduleInfoParse(module5TextField2);
        moduleInfoParse(module5TextField3);
        moduleInfoParse(module5TextField4);
        moduleInfoParse(module5TextField5);
        moduleInfoParse(module5TextField6);
        moduleInfoParse(module5TextField7);
        moduleInfoParse(module5TextField8);
    }

    public void ModuleVerify6() {
        moduleInfoParse(module6TextField1);
        moduleInfoParse(module6TextField2);
        moduleInfoParse(module6TextField3);
        moduleInfoParse(module6TextField4);
        moduleInfoParse(module6TextField5);
        moduleInfoParse(module6TextField6);
        moduleInfoParse(module6TextField7);
        moduleInfoParse(module6TextField8);
    }

    public static int gradeParse(JSpinner spinner) {
        int grade = (Integer) spinner.getValue(); // https://stackoverflow.com/questions/15400781/how-to-get-int-value-from-spinner
        return grade;
    }

    public void showResults() {
        // delete empty entries
        Level5Data.Level5Credits.removeIf(n -> n < 1);
        Level6Data.Level6Credits.removeIf(n -> n < 1);

        int limit5 = Level5Data.Level5Credits.size();
        for (int i = limit5; i < 8; i++) {
            Level5Data.Level5Grades.removeLast();
        }

        int limit6 = Level6Data.Level6Credits.size();
        for (int i = limit6; i < 8; i++) {
            Level6Data.Level6Grades.removeLast();
        }


        try {
            // Call the calculations with user data
            double level5Average = averageCalculations.LevelAverage(Level5Data.Level5Grades, Level5Data.Level5Credits);
            level5AverageTextField.setText(formatResult(level5Average));
            double level6Average = averageCalculations.LevelAverage(Level6Data.Level6Grades, Level6Data.Level6Credits);
            level6AverageTextField.setText(formatResult(level6Average));

            // Also adding advanced entry result here
            advancedEntryCheckBox.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        advancedEntryTextField.setText(formatResult(level6Average));
                    } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                        advancedEntryTextField.setText("N/A");
                    }
                }
            });

            double equalAverage = averageCalculations.EqualAverage(Level5Data.Level5Grades, Level5Data.Level5Credits, Level6Data.Level6Grades, Level6Data.Level6Credits);
            evenWeightingTextField.setText(formatResult(equalAverage));
            double weightedAverage = averageCalculations.WeightedAverage(Level5Data.Level5Grades, Level5Data.Level5Credits, Level6Data.Level6Grades, Level6Data.Level6Credits);
            weightedTextField.setText(formatResult(weightedAverage));
            String markProfiling = averageCalculations.MarkProfiling();
            markProfilingTextField.setText(String.format(markProfiling));
            String overallAward = averageCalculations.overallClassification(Level5Data.Level5Grades, Level5Data.Level5Credits, Level6Data.Level6Grades, Level6Data.Level6Credits);
            overallAwardTextField.setText(String.format(overallAward));
        } catch (Exception e) {
            System.out.println("Error occurred in showResults\n" + e);
        }

    }

    public String formatResult(double result) {
        // If value is NaN I want to display N/A instead
        if (Double.isNaN(result)) {
            return "N/A";
        } else {
            return String.format("%.2f", result);
        }
    }

    // Using document listener to give input warnings in real time
//    public void resultsVerification(JSpinner tf) {
//        // Got rid of dialog box as it was too annoying
//        tf.getDocument().addDocumentListener(new DocumentListener() {
//            @Override
//            public void insertUpdate(DocumentEvent e) {
//                validateInput();
//            }
//
//            @Override
//            public void removeUpdate(DocumentEvent e) {
//                validateInput();
//            }
//
//            @Override
//            public void changedUpdate(DocumentEvent e) {
//                validateInput();
//            }
//
//            // Using colors to indicate valid input
//            public void validateInput() {
//                String text = tf.getText();
//                int result = Integer.parseInt(text);
//                if (result <= 100 || result >= 40) {
//                    tf.setBackground(Color.GREEN);
//                } else if (result > 100 || result < 40) {
//                    tf.setBackground(Color.PINK);
//                }
//            }
//        });
//    }

    // Tried to write a function to apply resultsVerification, but I can't get it to work
//    public void applyResultsVerification() {
//        JTextField result = new JTextField();
//        for (int i = 5; i <= 6; i++) {
//            String result = ("level" + i);
//            for (int j = 1; j <= 8; i++) {
//                result = result + "Grade" + j;
//                result.resultsVerification();
//            }
//        }
//    }

    // using Swing in IntelliJ, have to add this in manually
    public static void main(String[] args) {
        JFrame frame = new GradesCalculatorGUI("LTU Grades Calculator");
        frame.setVisible(true);
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        mainPanel = new JPanel();
        mainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(7, 2, new Insets(5, 5, 5, 5), -1, -1));
        mainPanel.setEnabled(false);
        mainPanel.setForeground(new Color(-1741197));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        welcomeTextField = new JTextField();
        welcomeTextField.setEditable(false);
        welcomeTextField.setText("LTU Grades Calculator");
        panel2.add(welcomeTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel3, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        advancedEntryCheckBox = new JCheckBox();
        advancedEntryCheckBox.setText("Advanced Entry");
        advancedEntryCheckBox.setToolTipText("Tick thos box if you did Level 6 ONLY");
        panel3.add(advancedEntryCheckBox, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel4, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Course");
        panel4.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        courseComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Select Course...");
        defaultComboBoxModel1.addElement("Business Management");
        defaultComboBoxModel1.addElement("Criminology");
        defaultComboBoxModel1.addElement("Film");
        defaultComboBoxModel1.addElement("N/A");
        courseComboBox.setModel(defaultComboBoxModel1);
        courseComboBox.setToolTipText("Please select from the list of courses");
        panel4.add(courseComboBox, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel5.setEnabled(false);
        mainPanel.add(panel5, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        level5ResultsPanel = new JPanel();
        level5ResultsPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel5.add(level5ResultsPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        level5ResultsLabel = new JLabel();
        level5ResultsLabel.setText("Level 5 Results");
        level5ResultsPanel.add(level5ResultsLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel5.add(panel6, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel6.add(level5Grade5, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel6.add(level5Grade8, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel6.add(level5Grade6, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel6.add(level5Grade7, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level5Credits5 = new JTextField();
        panel6.add(level5Credits5, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level5Credits6 = new JTextField();
        level5Credits6.setText("");
        panel6.add(level5Credits6, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level5Credits7 = new JTextField();
        panel6.add(level5Credits7, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level5Credits8 = new JTextField();
        panel6.add(level5Credits8, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Credits");
        panel6.add(label2, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Result");
        panel6.add(label3, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Module");
        panel6.add(label4, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        module5TextField5 = new JComboBox();
        module5TextField5.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("");
        defaultComboBoxModel2.addElement("BMM5123");
        defaultComboBoxModel2.addElement("BMM5015");
        defaultComboBoxModel2.addElement("BMM5133");
        defaultComboBoxModel2.addElement("BMM5143");
        defaultComboBoxModel2.addElement("BMM5005");
        defaultComboBoxModel2.addElement("SOC5043");
        defaultComboBoxModel2.addElement("SOC5093");
        defaultComboBoxModel2.addElement("SOC5083");
        defaultComboBoxModel2.addElement("SOC5053");
        defaultComboBoxModel2.addElement("MFC5003");
        defaultComboBoxModel2.addElement("MFC5083");
        defaultComboBoxModel2.addElement("MFC5013");
        defaultComboBoxModel2.addElement("MFC5033");
        defaultComboBoxModel2.addElement("MFC5203");
        defaultComboBoxModel2.addElement("MFC5023");
        module5TextField5.setModel(defaultComboBoxModel2);
        panel6.add(module5TextField5, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module5TextField6 = new JComboBox();
        module5TextField6.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel();
        defaultComboBoxModel3.addElement("");
        defaultComboBoxModel3.addElement("BMM5123");
        defaultComboBoxModel3.addElement("BMM5015");
        defaultComboBoxModel3.addElement("BMM5133");
        defaultComboBoxModel3.addElement("BMM5143");
        defaultComboBoxModel3.addElement("BMM5005");
        defaultComboBoxModel3.addElement("SOC5043");
        defaultComboBoxModel3.addElement("SOC5093");
        defaultComboBoxModel3.addElement("SOC5083");
        defaultComboBoxModel3.addElement("SOC5053");
        defaultComboBoxModel3.addElement("MFC5003");
        defaultComboBoxModel3.addElement("MFC5083");
        defaultComboBoxModel3.addElement("MFC5013");
        defaultComboBoxModel3.addElement("MFC5033");
        defaultComboBoxModel3.addElement("MFC5203");
        defaultComboBoxModel3.addElement("MFC5023");
        module5TextField6.setModel(defaultComboBoxModel3);
        panel6.add(module5TextField6, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module5TextField7 = new JComboBox();
        module5TextField7.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel4 = new DefaultComboBoxModel();
        defaultComboBoxModel4.addElement("");
        defaultComboBoxModel4.addElement("BMM5123");
        defaultComboBoxModel4.addElement("BMM5015");
        defaultComboBoxModel4.addElement("BMM5133");
        defaultComboBoxModel4.addElement("BMM5143");
        defaultComboBoxModel4.addElement("BMM5005");
        defaultComboBoxModel4.addElement("SOC5043");
        defaultComboBoxModel4.addElement("SOC5093");
        defaultComboBoxModel4.addElement("SOC5083");
        defaultComboBoxModel4.addElement("SOC5053");
        defaultComboBoxModel4.addElement("MFC5003");
        defaultComboBoxModel4.addElement("MFC5083");
        defaultComboBoxModel4.addElement("MFC5013");
        defaultComboBoxModel4.addElement("MFC5033");
        defaultComboBoxModel4.addElement("MFC5203");
        defaultComboBoxModel4.addElement("MFC5023");
        module5TextField7.setModel(defaultComboBoxModel4);
        panel6.add(module5TextField7, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module5TextField8 = new JComboBox();
        module5TextField8.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel5 = new DefaultComboBoxModel();
        defaultComboBoxModel5.addElement("");
        defaultComboBoxModel5.addElement("BMM5123");
        defaultComboBoxModel5.addElement("BMM5015");
        defaultComboBoxModel5.addElement("BMM5133");
        defaultComboBoxModel5.addElement("BMM5143");
        defaultComboBoxModel5.addElement("BMM5005");
        defaultComboBoxModel5.addElement("SOC5043");
        defaultComboBoxModel5.addElement("SOC5093");
        defaultComboBoxModel5.addElement("SOC5083");
        defaultComboBoxModel5.addElement("SOC5053");
        defaultComboBoxModel5.addElement("MFC5003");
        defaultComboBoxModel5.addElement("MFC5083");
        defaultComboBoxModel5.addElement("MFC5013");
        defaultComboBoxModel5.addElement("MFC5033");
        defaultComboBoxModel5.addElement("MFC5203");
        defaultComboBoxModel5.addElement("MFC5023");
        module5TextField8.setModel(defaultComboBoxModel5);
        panel6.add(module5TextField8, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel5.add(panel7, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        level5Grade1.setEnabled(true);
        panel7.add(level5Grade1, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel7.add(level5Grade2, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel7.add(level5Grade3, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel7.add(level5Grade4, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level5Credits1 = new JTextField();
        level5Credits1.setEnabled(true);
        panel7.add(level5Credits1, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level5Credits2 = new JTextField();
        panel7.add(level5Credits2, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level5Credits3 = new JTextField();
        panel7.add(level5Credits3, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level5Credits4 = new JTextField();
        panel7.add(level5Credits4, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Credits");
        panel7.add(label5, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Result");
        panel7.add(label6, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label7 = new JLabel();
        label7.setText("Module");
        panel7.add(label7, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        module5TextField1 = new JComboBox();
        module5TextField1.setEditable(true);
        module5TextField1.setEnabled(true);
        final DefaultComboBoxModel defaultComboBoxModel6 = new DefaultComboBoxModel();
        defaultComboBoxModel6.addElement("");
        defaultComboBoxModel6.addElement("BMM5123");
        defaultComboBoxModel6.addElement("BMM5015");
        defaultComboBoxModel6.addElement("BMM5133");
        defaultComboBoxModel6.addElement("BMM5143");
        defaultComboBoxModel6.addElement("BMM5005");
        defaultComboBoxModel6.addElement("SOC5043");
        defaultComboBoxModel6.addElement("SOC5093");
        defaultComboBoxModel6.addElement("SOC5083");
        defaultComboBoxModel6.addElement("SOC5053");
        defaultComboBoxModel6.addElement("MFC5003");
        defaultComboBoxModel6.addElement("MFC5083");
        defaultComboBoxModel6.addElement("MFC5013");
        defaultComboBoxModel6.addElement("MFC5033");
        defaultComboBoxModel6.addElement("MFC5203");
        defaultComboBoxModel6.addElement("MFC5023");
        module5TextField1.setModel(defaultComboBoxModel6);
        panel7.add(module5TextField1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module5TextField2 = new JComboBox();
        module5TextField2.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel7 = new DefaultComboBoxModel();
        defaultComboBoxModel7.addElement("");
        defaultComboBoxModel7.addElement("BMM5123");
        defaultComboBoxModel7.addElement("BMM5015");
        defaultComboBoxModel7.addElement("BMM5133");
        defaultComboBoxModel7.addElement("BMM5143");
        defaultComboBoxModel7.addElement("BMM5005");
        defaultComboBoxModel7.addElement("SOC5043");
        defaultComboBoxModel7.addElement("SOC5093");
        defaultComboBoxModel7.addElement("SOC5083");
        defaultComboBoxModel7.addElement("SOC5053");
        defaultComboBoxModel7.addElement("MFC5003");
        defaultComboBoxModel7.addElement("MFC5083");
        defaultComboBoxModel7.addElement("MFC5013");
        defaultComboBoxModel7.addElement("MFC5033");
        defaultComboBoxModel7.addElement("MFC5203");
        defaultComboBoxModel7.addElement("MFC5023");
        module5TextField2.setModel(defaultComboBoxModel7);
        panel7.add(module5TextField2, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module5TextField3 = new JComboBox();
        module5TextField3.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel8 = new DefaultComboBoxModel();
        defaultComboBoxModel8.addElement("");
        defaultComboBoxModel8.addElement("BMM5123");
        defaultComboBoxModel8.addElement("BMM5015");
        defaultComboBoxModel8.addElement("BMM5133");
        defaultComboBoxModel8.addElement("BMM5143");
        defaultComboBoxModel8.addElement("BMM5005");
        defaultComboBoxModel8.addElement("SOC5043");
        defaultComboBoxModel8.addElement("SOC5093");
        defaultComboBoxModel8.addElement("SOC5083");
        defaultComboBoxModel8.addElement("SOC5053");
        defaultComboBoxModel8.addElement("MFC5003");
        defaultComboBoxModel8.addElement("MFC5083");
        defaultComboBoxModel8.addElement("MFC5013");
        defaultComboBoxModel8.addElement("MFC5033");
        defaultComboBoxModel8.addElement("MFC5203");
        defaultComboBoxModel8.addElement("MFC5023");
        module5TextField3.setModel(defaultComboBoxModel8);
        panel7.add(module5TextField3, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module5TextField4 = new JComboBox();
        module5TextField4.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel9 = new DefaultComboBoxModel();
        defaultComboBoxModel9.addElement("");
        defaultComboBoxModel9.addElement("BMM5123");
        defaultComboBoxModel9.addElement("BMM5015");
        defaultComboBoxModel9.addElement("BMM5133");
        defaultComboBoxModel9.addElement("BMM5143");
        defaultComboBoxModel9.addElement("BMM5005");
        defaultComboBoxModel9.addElement("SOC5043");
        defaultComboBoxModel9.addElement("SOC5093");
        defaultComboBoxModel9.addElement("SOC5083");
        defaultComboBoxModel9.addElement("SOC5053");
        defaultComboBoxModel9.addElement("MFC5003");
        defaultComboBoxModel9.addElement("MFC5083");
        defaultComboBoxModel9.addElement("MFC5013");
        defaultComboBoxModel9.addElement("MFC5033");
        defaultComboBoxModel9.addElement("MFC5203");
        defaultComboBoxModel9.addElement("MFC5023");
        module5TextField4.setModel(defaultComboBoxModel9);
        panel7.add(module5TextField4, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel8, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        level6ResultsPanel = new JPanel();
        level6ResultsPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel8.add(level6ResultsPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        level6ResultsLabel = new JLabel();
        level6ResultsLabel.setText("Level 6 Results");
        level6ResultsPanel.add(level6ResultsLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel8.add(panel9, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        level6Credits5 = new JTextField();
        panel9.add(level6Credits5, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level6Credits8 = new JTextField();
        panel9.add(level6Credits8, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level6Credits7 = new JTextField();
        panel9.add(level6Credits7, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level6Credits6 = new JTextField();
        panel9.add(level6Credits6, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel9.add(level6Grade5, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel9.add(level6Grade6, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel9.add(level6Grade7, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel9.add(level6Grade8, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label8 = new JLabel();
        label8.setText("Credits");
        panel9.add(label8, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label9 = new JLabel();
        label9.setText("Result");
        panel9.add(label9, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label10 = new JLabel();
        label10.setText("Module");
        panel9.add(label10, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        module6TextField5 = new JComboBox();
        module6TextField5.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel10 = new DefaultComboBoxModel();
        defaultComboBoxModel10.addElement("");
        defaultComboBoxModel10.addElement("BMM6542");
        defaultComboBoxModel10.addElement("BMM6582");
        defaultComboBoxModel10.addElement("BMM6422");
        defaultComboBoxModel10.addElement("BMM6552");
        defaultComboBoxModel10.addElement("BMM6452");
        defaultComboBoxModel10.addElement("BMM6402");
        defaultComboBoxModel10.addElement("BMM6482");
        defaultComboBoxModel10.addElement("SOC6302");
        defaultComboBoxModel10.addElement("SOC6502");
        defaultComboBoxModel10.addElement("SOC6045");
        defaultComboBoxModel10.addElement("SOC6015");
        defaultComboBoxModel10.addElement("SOC6033");
        defaultComboBoxModel10.addElement("SOC6053");
        defaultComboBoxModel10.addElement("SOC6063");
        defaultComboBoxModel10.addElement("SOC6073");
        defaultComboBoxModel10.addElement("SOC6025");
        defaultComboBoxModel10.addElement("SOC6035");
        defaultComboBoxModel10.addElement("SOC6055");
        defaultComboBoxModel10.addElement("MFC6013");
        defaultComboBoxModel10.addElement("MFC6003");
        defaultComboBoxModel10.addElement("MFC6403");
        defaultComboBoxModel10.addElement("MFC6043");
        defaultComboBoxModel10.addElement("MFC6033");
        defaultComboBoxModel10.addElement("MFC6193");
        defaultComboBoxModel10.addElement("MFC6005");
        defaultComboBoxModel10.addElement("MFC6015");
        defaultComboBoxModel10.addElement("MFC6035");
        module6TextField5.setModel(defaultComboBoxModel10);
        panel9.add(module6TextField5, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module6TextField6 = new JComboBox();
        module6TextField6.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel11 = new DefaultComboBoxModel();
        defaultComboBoxModel11.addElement("");
        defaultComboBoxModel11.addElement("BMM6542");
        defaultComboBoxModel11.addElement("BMM6582");
        defaultComboBoxModel11.addElement("BMM6422");
        defaultComboBoxModel11.addElement("BMM6552");
        defaultComboBoxModel11.addElement("BMM6452");
        defaultComboBoxModel11.addElement("BMM6402");
        defaultComboBoxModel11.addElement("BMM6482");
        defaultComboBoxModel11.addElement("SOC6302");
        defaultComboBoxModel11.addElement("SOC6502");
        defaultComboBoxModel11.addElement("SOC6045");
        defaultComboBoxModel11.addElement("SOC6015");
        defaultComboBoxModel11.addElement("SOC6033");
        defaultComboBoxModel11.addElement("SOC6053");
        defaultComboBoxModel11.addElement("SOC6063");
        defaultComboBoxModel11.addElement("SOC6073");
        defaultComboBoxModel11.addElement("SOC6025");
        defaultComboBoxModel11.addElement("SOC6035");
        defaultComboBoxModel11.addElement("SOC6055");
        defaultComboBoxModel11.addElement("MFC6013");
        defaultComboBoxModel11.addElement("MFC6003");
        defaultComboBoxModel11.addElement("MFC6403");
        defaultComboBoxModel11.addElement("MFC6043");
        defaultComboBoxModel11.addElement("MFC6033");
        defaultComboBoxModel11.addElement("MFC6193");
        defaultComboBoxModel11.addElement("MFC6005");
        defaultComboBoxModel11.addElement("MFC6015");
        defaultComboBoxModel11.addElement("MFC6035");
        module6TextField6.setModel(defaultComboBoxModel11);
        panel9.add(module6TextField6, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module6TextField7 = new JComboBox();
        module6TextField7.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel12 = new DefaultComboBoxModel();
        defaultComboBoxModel12.addElement("");
        defaultComboBoxModel12.addElement("BMM6542");
        defaultComboBoxModel12.addElement("BMM6582");
        defaultComboBoxModel12.addElement("BMM6422");
        defaultComboBoxModel12.addElement("BMM6552");
        defaultComboBoxModel12.addElement("BMM6452");
        defaultComboBoxModel12.addElement("BMM6402");
        defaultComboBoxModel12.addElement("BMM6482");
        defaultComboBoxModel12.addElement("SOC6302");
        defaultComboBoxModel12.addElement("SOC6502");
        defaultComboBoxModel12.addElement("SOC6045");
        defaultComboBoxModel12.addElement("SOC6015");
        defaultComboBoxModel12.addElement("SOC6033");
        defaultComboBoxModel12.addElement("SOC6053");
        defaultComboBoxModel12.addElement("SOC6063");
        defaultComboBoxModel12.addElement("SOC6073");
        defaultComboBoxModel12.addElement("SOC6025");
        defaultComboBoxModel12.addElement("SOC6035");
        defaultComboBoxModel12.addElement("SOC6055");
        defaultComboBoxModel12.addElement("MFC6013");
        defaultComboBoxModel12.addElement("MFC6003");
        defaultComboBoxModel12.addElement("MFC6403");
        defaultComboBoxModel12.addElement("MFC6043");
        defaultComboBoxModel12.addElement("MFC6033");
        defaultComboBoxModel12.addElement("MFC6193");
        defaultComboBoxModel12.addElement("MFC6005");
        defaultComboBoxModel12.addElement("MFC6015");
        defaultComboBoxModel12.addElement("MFC6035");
        module6TextField7.setModel(defaultComboBoxModel12);
        panel9.add(module6TextField7, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module6TextField8 = new JComboBox();
        module6TextField8.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel13 = new DefaultComboBoxModel();
        defaultComboBoxModel13.addElement("");
        defaultComboBoxModel13.addElement("BMM6542");
        defaultComboBoxModel13.addElement("BMM6582");
        defaultComboBoxModel13.addElement("BMM6422");
        defaultComboBoxModel13.addElement("BMM6552");
        defaultComboBoxModel13.addElement("BMM6452");
        defaultComboBoxModel13.addElement("BMM6402");
        defaultComboBoxModel13.addElement("BMM6482");
        defaultComboBoxModel13.addElement("SOC6302");
        defaultComboBoxModel13.addElement("SOC6502");
        defaultComboBoxModel13.addElement("SOC6045");
        defaultComboBoxModel13.addElement("SOC6015");
        defaultComboBoxModel13.addElement("SOC6033");
        defaultComboBoxModel13.addElement("SOC6053");
        defaultComboBoxModel13.addElement("SOC6063");
        defaultComboBoxModel13.addElement("SOC6073");
        defaultComboBoxModel13.addElement("SOC6025");
        defaultComboBoxModel13.addElement("SOC6035");
        defaultComboBoxModel13.addElement("SOC6055");
        defaultComboBoxModel13.addElement("MFC6013");
        defaultComboBoxModel13.addElement("MFC6003");
        defaultComboBoxModel13.addElement("MFC6403");
        defaultComboBoxModel13.addElement("MFC6043");
        defaultComboBoxModel13.addElement("MFC6033");
        defaultComboBoxModel13.addElement("MFC6193");
        defaultComboBoxModel13.addElement("MFC6005");
        defaultComboBoxModel13.addElement("MFC6015");
        defaultComboBoxModel13.addElement("MFC6035");
        module6TextField8.setModel(defaultComboBoxModel13);
        panel9.add(module6TextField8, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JPanel panel10 = new JPanel();
        panel10.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel8.add(panel10, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        level6Credits1 = new JTextField();
        panel10.add(level6Credits1, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level6Credits2 = new JTextField();
        panel10.add(level6Credits2, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level6Credits3 = new JTextField();
        panel10.add(level6Credits3, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        level6Credits4 = new JTextField();
        panel10.add(level6Credits4, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel10.add(level6Grade1, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel10.add(level6Grade2, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel10.add(level6Grade3, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        panel10.add(level6Grade4, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label11 = new JLabel();
        label11.setText("Credits");
        panel10.add(label11, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label12 = new JLabel();
        label12.setText("Result");
        panel10.add(label12, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label13 = new JLabel();
        label13.setText("Module");
        panel10.add(label13, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        module6TextField1 = new JComboBox();
        module6TextField1.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel14 = new DefaultComboBoxModel();
        defaultComboBoxModel14.addElement("");
        defaultComboBoxModel14.addElement("BMM6542");
        defaultComboBoxModel14.addElement("BMM6582");
        defaultComboBoxModel14.addElement("BMM6422");
        defaultComboBoxModel14.addElement("BMM6552");
        defaultComboBoxModel14.addElement("BMM6452");
        defaultComboBoxModel14.addElement("BMM6402");
        defaultComboBoxModel14.addElement("BMM6482");
        defaultComboBoxModel14.addElement("SOC6302");
        defaultComboBoxModel14.addElement("SOC6502");
        defaultComboBoxModel14.addElement("SOC6045");
        defaultComboBoxModel14.addElement("SOC6015");
        defaultComboBoxModel14.addElement("SOC6033");
        defaultComboBoxModel14.addElement("SOC6053");
        defaultComboBoxModel14.addElement("SOC6063");
        defaultComboBoxModel14.addElement("SOC6073");
        defaultComboBoxModel14.addElement("SOC6025");
        defaultComboBoxModel14.addElement("SOC6035");
        defaultComboBoxModel14.addElement("SOC6055");
        defaultComboBoxModel14.addElement("MFC6013");
        defaultComboBoxModel14.addElement("MFC6003");
        defaultComboBoxModel14.addElement("MFC6403");
        defaultComboBoxModel14.addElement("MFC6043");
        defaultComboBoxModel14.addElement("MFC6033");
        defaultComboBoxModel14.addElement("MFC6193");
        defaultComboBoxModel14.addElement("MFC6005");
        defaultComboBoxModel14.addElement("MFC6015");
        defaultComboBoxModel14.addElement("MFC6035");
        module6TextField1.setModel(defaultComboBoxModel14);
        panel10.add(module6TextField1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module6TextField2 = new JComboBox();
        module6TextField2.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel15 = new DefaultComboBoxModel();
        defaultComboBoxModel15.addElement("");
        defaultComboBoxModel15.addElement("BMM6542");
        defaultComboBoxModel15.addElement("BMM6582");
        defaultComboBoxModel15.addElement("BMM6422");
        defaultComboBoxModel15.addElement("BMM6552");
        defaultComboBoxModel15.addElement("BMM6452");
        defaultComboBoxModel15.addElement("BMM6402");
        defaultComboBoxModel15.addElement("BMM6482");
        defaultComboBoxModel15.addElement("SOC6302");
        defaultComboBoxModel15.addElement("SOC6502");
        defaultComboBoxModel15.addElement("SOC6045");
        defaultComboBoxModel15.addElement("SOC6015");
        defaultComboBoxModel15.addElement("SOC6033");
        defaultComboBoxModel15.addElement("SOC6053");
        defaultComboBoxModel15.addElement("SOC6063");
        defaultComboBoxModel15.addElement("SOC6073");
        defaultComboBoxModel15.addElement("SOC6025");
        defaultComboBoxModel15.addElement("SOC6035");
        defaultComboBoxModel15.addElement("SOC6055");
        defaultComboBoxModel15.addElement("MFC6013");
        defaultComboBoxModel15.addElement("MFC6003");
        defaultComboBoxModel15.addElement("MFC6403");
        defaultComboBoxModel15.addElement("MFC6043");
        defaultComboBoxModel15.addElement("MFC6033");
        defaultComboBoxModel15.addElement("MFC6193");
        defaultComboBoxModel15.addElement("MFC6005");
        defaultComboBoxModel15.addElement("MFC6015");
        defaultComboBoxModel15.addElement("MFC6035");
        module6TextField2.setModel(defaultComboBoxModel15);
        panel10.add(module6TextField2, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module6TextField3 = new JComboBox();
        module6TextField3.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel16 = new DefaultComboBoxModel();
        defaultComboBoxModel16.addElement("");
        defaultComboBoxModel16.addElement("BMM6542");
        defaultComboBoxModel16.addElement("BMM6582");
        defaultComboBoxModel16.addElement("BMM6422");
        defaultComboBoxModel16.addElement("BMM6552");
        defaultComboBoxModel16.addElement("BMM6452");
        defaultComboBoxModel16.addElement("BMM6402");
        defaultComboBoxModel16.addElement("BMM6482");
        defaultComboBoxModel16.addElement("SOC6302");
        defaultComboBoxModel16.addElement("SOC6502");
        defaultComboBoxModel16.addElement("SOC6045");
        defaultComboBoxModel16.addElement("SOC6015");
        defaultComboBoxModel16.addElement("SOC6033");
        defaultComboBoxModel16.addElement("SOC6053");
        defaultComboBoxModel16.addElement("SOC6063");
        defaultComboBoxModel16.addElement("SOC6073");
        defaultComboBoxModel16.addElement("SOC6025");
        defaultComboBoxModel16.addElement("SOC6035");
        defaultComboBoxModel16.addElement("SOC6055");
        defaultComboBoxModel16.addElement("MFC6013");
        defaultComboBoxModel16.addElement("MFC6003");
        defaultComboBoxModel16.addElement("MFC6403");
        defaultComboBoxModel16.addElement("MFC6043");
        defaultComboBoxModel16.addElement("MFC6033");
        defaultComboBoxModel16.addElement("MFC6193");
        defaultComboBoxModel16.addElement("MFC6005");
        defaultComboBoxModel16.addElement("MFC6015");
        defaultComboBoxModel16.addElement("MFC6035");
        module6TextField3.setModel(defaultComboBoxModel16);
        panel10.add(module6TextField3, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        module6TextField4 = new JComboBox();
        module6TextField4.setEditable(true);
        final DefaultComboBoxModel defaultComboBoxModel17 = new DefaultComboBoxModel();
        defaultComboBoxModel17.addElement("");
        defaultComboBoxModel17.addElement("BMM6542");
        defaultComboBoxModel17.addElement("BMM6582");
        defaultComboBoxModel17.addElement("BMM6422");
        defaultComboBoxModel17.addElement("BMM6552");
        defaultComboBoxModel17.addElement("BMM6452");
        defaultComboBoxModel17.addElement("BMM6402");
        defaultComboBoxModel17.addElement("BMM6482");
        defaultComboBoxModel17.addElement("SOC6302");
        defaultComboBoxModel17.addElement("SOC6502");
        defaultComboBoxModel17.addElement("SOC6045");
        defaultComboBoxModel17.addElement("SOC6015");
        defaultComboBoxModel17.addElement("SOC6033");
        defaultComboBoxModel17.addElement("SOC6053");
        defaultComboBoxModel17.addElement("SOC6063");
        defaultComboBoxModel17.addElement("SOC6073");
        defaultComboBoxModel17.addElement("SOC6025");
        defaultComboBoxModel17.addElement("SOC6035");
        defaultComboBoxModel17.addElement("SOC6055");
        defaultComboBoxModel17.addElement("MFC6013");
        defaultComboBoxModel17.addElement("MFC6003");
        defaultComboBoxModel17.addElement("MFC6403");
        defaultComboBoxModel17.addElement("MFC6043");
        defaultComboBoxModel17.addElement("MFC6033");
        defaultComboBoxModel17.addElement("MFC6193");
        defaultComboBoxModel17.addElement("MFC6005");
        defaultComboBoxModel17.addElement("MFC6015");
        defaultComboBoxModel17.addElement("MFC6035");
        module6TextField4.setModel(defaultComboBoxModel17);
        panel10.add(module6TextField4, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JPanel panel11 = new JPanel();
        panel11.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel11, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        gradeCalculationPanel = new JPanel();
        gradeCalculationPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel11.add(gradeCalculationPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, true));
        gradeCalculationLabel = new JLabel();
        gradeCalculationLabel.setText("Grade Calculation");
        gradeCalculationPanel.add(gradeCalculationLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        calculateButton = new JButton();
        calculateButton.setFocusable(false);
        calculateButton.setText("Calculate");
        gradeCalculationPanel.add(calculateButton, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel12 = new JPanel();
        panel12.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel11.add(panel12, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label14 = new JLabel();
        label14.setText("Overall Award");
        panel12.add(label14, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        overallAwardTextField = new JTextField();
        overallAwardTextField.setEditable(false);
        overallAwardTextField.setHorizontalAlignment(0);
        panel12.add(overallAwardTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel13 = new JPanel();
        panel13.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel13.setToolTipText("Average of all marks awarded in Level 5 and 6");
        panel11.add(panel13, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        evenWeightingTextField = new JTextField();
        evenWeightingTextField.setEditable(false);
        panel13.add(evenWeightingTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        weightedTextField = new JTextField();
        weightedTextField.setEditable(false);
        panel13.add(weightedTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        evenWeightingLabel = new JLabel();
        evenWeightingLabel.setText("Even Weighting");
        panel13.add(evenWeightingLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        weightedLabel = new JLabel();
        weightedLabel.setText("Level 6 Weighted");
        weightedLabel.setToolTipText("Average of all marks awarded in Level 5 and 6, with a 2:1 weighting for Level 6");
        panel13.add(weightedLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        markProfilingTextField = new JTextField();
        markProfilingTextField.setEditable(false);
        panel13.add(markProfilingTextField, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        markProfilingLabel = new JLabel();
        markProfilingLabel.setText("Mark Profiling");
        markProfilingLabel.setToolTipText("Mark profiling sums the credits achieved in each classification leavel (1, 2.1 etc). With a 2:1 weighting in favour of level 6, the credits are summed from highest classification to lowest. The lowest grade classification required to account for 50% of overall credits is the awarded classification. i.e. if 50%+ of credits are awarded at 1, then the mark profiling classification is 1.");
        panel13.add(markProfilingLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        advancedEntryTextField = new JTextField();
        advancedEntryTextField.setEditable(false);
        advancedEntryTextField.setEnabled(false);
        panel13.add(advancedEntryTextField, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        advancedEntryLabel = new JLabel();
        advancedEntryLabel.setEnabled(true);
        advancedEntryLabel.setText("Advanced Entry");
        advancedEntryLabel.setToolTipText("Level 6 only average for students who did not do Level 5");
        panel13.add(advancedEntryLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel14 = new JPanel();
        panel14.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel14, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        level5AverageLabel = new JLabel();
        level5AverageLabel.setText("Level 5 Average");
        panel14.add(level5AverageLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        level5AverageTextField = new JTextField();
        level5AverageTextField.setEditable(false);
        panel14.add(level5AverageTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label15 = new JLabel();
        label15.setText("Credits");
        panel14.add(label15, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        level5CreditTotalTextField = new JTextField();
        level5CreditTotalTextField.setEditable(false);
        panel14.add(level5CreditTotalTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JPanel panel15 = new JPanel();
        panel15.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel15, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        level6AverageLabel = new JLabel();
        level6AverageLabel.setText("Level 6 Average");
        panel15.add(level6AverageLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        level6AverageTextField = new JTextField();
        level6AverageTextField.setEditable(false);
        panel15.add(level6AverageTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JLabel label16 = new JLabel();
        label16.setText("Credits");
        panel15.add(label16, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        level6CreditTotalTextField = new JTextField();
        level6CreditTotalTextField.setEditable(false);
        panel15.add(level6CreditTotalTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(50, -1), null, 0, false));
        clearButton = new JButton();
        clearButton.setFocusable(false);
        clearButton.setForeground(new Color(-9742107));
        clearButton.setText("Clear");
        clearButton.setToolTipText("Clear previously entered information");
        mainPanel.add(clearButton, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        quitButton = new JButton();
        quitButton.setFocusable(false);
        quitButton.setForeground(new Color(-1761478));
        quitButton.setText("Quit");
        mainPanel.add(quitButton, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

    private void createUIComponents() {
        SpinnerNumberModel gradesLimit5_1 = new SpinnerNumberModel(40, 40, 100, 1);
        level5Grade1 = new JSpinner(gradesLimit5_1);
        SpinnerNumberModel gradesLimit5_2 = new SpinnerNumberModel(40, 40, 100, 1);
        level5Grade2 = new JSpinner(gradesLimit5_2);
        SpinnerNumberModel gradesLimit5_3 = new SpinnerNumberModel(40, 40, 100, 1);
        level5Grade3 = new JSpinner(gradesLimit5_3);
        SpinnerNumberModel gradesLimit5_4 = new SpinnerNumberModel(40, 40, 100, 1);
        level5Grade4 = new JSpinner(gradesLimit5_4);
        SpinnerNumberModel gradesLimit5_5 = new SpinnerNumberModel(40, 40, 100, 1);
        level5Grade5 = new JSpinner(gradesLimit5_5);
        SpinnerNumberModel gradesLimit5_6 = new SpinnerNumberModel(40, 40, 100, 1);
        level5Grade6 = new JSpinner(gradesLimit5_6);
        SpinnerNumberModel gradesLimit5_7 = new SpinnerNumberModel(40, 40, 100, 1);
        level5Grade7 = new JSpinner(gradesLimit5_7);
        SpinnerNumberModel gradesLimit5_8 = new SpinnerNumberModel(40, 40, 100, 1);
        level5Grade8 = new JSpinner(gradesLimit5_8);
        SpinnerNumberModel gradesLimit6_1 = new SpinnerNumberModel(40, 40, 100, 1);
        level6Grade1 = new JSpinner(gradesLimit6_1);
        SpinnerNumberModel gradesLimit6_2 = new SpinnerNumberModel(40, 40, 100, 1);
        level6Grade2 = new JSpinner(gradesLimit6_2);
        SpinnerNumberModel gradesLimit6_3 = new SpinnerNumberModel(40, 40, 100, 1);
        level6Grade3 = new JSpinner(gradesLimit6_3);
        SpinnerNumberModel gradesLimit6_4 = new SpinnerNumberModel(40, 40, 100, 1);
        level6Grade4 = new JSpinner(gradesLimit6_4);
        SpinnerNumberModel gradesLimit6_5 = new SpinnerNumberModel(40, 40, 100, 1);
        level6Grade5 = new JSpinner(gradesLimit6_5);
        SpinnerNumberModel gradesLimit6_6 = new SpinnerNumberModel(40, 40, 100, 1);
        level6Grade6 = new JSpinner(gradesLimit6_6);
        SpinnerNumberModel gradesLimit6_7 = new SpinnerNumberModel(40, 40, 100, 1);
        level6Grade7 = new JSpinner(gradesLimit6_7);
        SpinnerNumberModel gradesLimit6_8 = new SpinnerNumberModel(40, 40, 100, 1);
        level6Grade8 = new JSpinner(gradesLimit6_8);
    }
}
