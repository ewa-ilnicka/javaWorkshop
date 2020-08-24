package calculator.model;

import calculator.controller.Controller;

import javax.swing.*;

public class Launcher {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Controller controller = new Controller();
            controller.run();
        });
    }
}
