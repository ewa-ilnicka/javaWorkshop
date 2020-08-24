package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import static calculator.model.Config.*;

public class JavaCalculator {
    private JPanel JavaCalculatorPanel;
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

    public JTextField getTextDisplay() {
        return textDisplay;
    }

    public JButton getBtnOne() {
        return btnOne;
    }

    public void createAndShowWindow() {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(this.JavaCalculatorPanel);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        btnOne.setActionCommand(ONE);
    }

    public void addListeners(ActionListener actionListener) {
        btnOne.addActionListener(actionListener);
    }
}
