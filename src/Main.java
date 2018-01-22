import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args, Container mainPanel) {
        System.out.println("Hello World!");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                test GUI = new test(mainPanel);
                GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI.setVisible(true);
            }
        });
    }
}
