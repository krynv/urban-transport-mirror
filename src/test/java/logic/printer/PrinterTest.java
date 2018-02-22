package logic.printer;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PrinterTest {

    private Printer printer;
    @Test
    public void addPrinter() {
        this.printer = new Printer(1);
        if (this.printer != null) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkPrintDoc() {
        this.printer = new Printer(1);
        if (this.printer.printDocument()) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }

    @Test
    public void checkPrintID() {
        this.printer = new Printer(1);
        if (this.printer.getPrinterID() == 1) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
}

