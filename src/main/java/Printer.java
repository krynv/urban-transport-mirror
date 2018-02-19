public class Printer {

    private int printerID;

    public Printer(int printerID) {
        this.printerID = printerID;
    }

    public boolean printDocument() {
        return true;
    }

    public int getPrinterID() {
        return this.printerID;
    }
}
