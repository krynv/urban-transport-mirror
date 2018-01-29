import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserBooking theUI = new UserBooking();
                theUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                theUI.setVisible(true);
            }
        });
    }
}
