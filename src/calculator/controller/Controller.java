package calculator.controller;

import calculator.JavaCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static calculator.model.Config.ONE;

public class Controller implements ActionListener {
    private JavaCalculator gui = new JavaCalculator();


    public void run() {
        gui.createAndShowWindow();
        gui.addListeners(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case ONE:
                handleOneEvent();
                break;
        }
    }

    private void handleOneEvent() {
        String btnOneText = gui.getTextDisplay().getText() + gui.getBtnOne().getText();
        gui.getTextDisplay().setText(btnOneText);
        System.out.println("Jeden");

    }
}
