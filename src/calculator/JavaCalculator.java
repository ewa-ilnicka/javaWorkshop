package calculator;

import javax.swing.*;
import java.awt.*;

public class JavaCalculator {
    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnTwo;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnThree;
    private JButton btnSix;
    private JButton btnPlus;
    private JButton btnDivide;
    private JButton btnNine;
    private JButton btnMinus;
    private JButton btnClear;
    private JButton btnMultiply;
    private JButton btnEquals;

    public void createAndShowWindow() {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
