package logic.report;

import org.junit.Test;

import java.time.LocalDateTime;

import static junit.framework.TestCase.assertTrue;

public class ReportTest {
    private Report report;
    @Test
    public void checkReport() {
        this.report = new Report("test",
                1,
                LocalDateTime.of(2018, 2, 4, 12, 0, 0),
                LocalDateTime.of(2018, 2, 4, 13, 0, 0));
        if(this.report != null) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkReportName() {
        this.report = new Report("test",
                1,
                LocalDateTime.of(2018, 2, 4, 12, 0, 0),
                LocalDateTime.of(2018, 2, 4, 13, 0, 0));
        if(this.report.getName().equals("test")) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkReportPrint() {
        this.report = new Report("1",
                1,
                LocalDateTime.of(2018, 2, 4, 12, 0, 0),
                LocalDateTime.of(2018, 2, 4, 13, 0, 0));
        if(this.report.print(1)) {
            assertTrue(false);
        } else {
            assertTrue(true);
        }
    }
}
