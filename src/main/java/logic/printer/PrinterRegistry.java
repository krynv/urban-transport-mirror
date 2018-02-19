package logic.printer;

import logic.printer.Printer;

import java.util.ArrayList;

public class PrinterRegistry extends ArrayList<Printer> {

    public PrinterRegistry() {
        super();
        this.add(new Printer(7));
    }

    public boolean print(int printerID) {

        boolean printed = false;

        for(Printer aPrinter:this) {
            if (aPrinter.getPrinterID() == printerID) {
                aPrinter.printDocument();
                printed = true;
            }
        }

        return printed;
    }

}
