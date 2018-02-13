import gui.GUI;
import logic.journey.JourneyDaoJson;
import logic.journey.JourneyHistory;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI gui = new GUI();
                gui.setVisible(true);
            }
        });
    }
}
