import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                userBooking GUI = new userBooking();
                GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI.setVisible(true);
            }
        });
    }
}
