package Week7.SwingGUIExampleTemps;

import javax.swing.*;

public class CelsiusConverterGUI extends JFrame {
    private JPanel mainPanel;

    public CelsiusConverterGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("My Converter");
        frame.setVisible(true);
    }
}
