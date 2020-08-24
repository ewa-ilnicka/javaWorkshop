package calculator.controller;

import calculator.JavaCalculator;

public class Controller {
    private JavaCalculator gui = new JavaCalculator();


    public void run() {
        gui.createAndShowWindow();

    }
}
