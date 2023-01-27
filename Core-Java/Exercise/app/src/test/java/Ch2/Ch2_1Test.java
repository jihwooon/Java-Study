package Ch2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ch2_1Test {

    private static PrintStream originalOut;
    private ByteArrayOutputStream out;

    @BeforeAll
    static void saveOriginals() {
        originalOut = System.out;
    }

    @AfterAll
    static void restoreOriginals() {
        System.setOut(originalOut);
    }

    @BeforeEach
    void setupInput() {
        this.out = new ByteArrayOutputStream(50000);
        System.setOut(new PrintStream(this.out));
    }

    @Test
    void check() {
        var want = new StringBuilder();
        var today = LocalDate.now();
        var date = LocalDate.of(today.getYear(), today.getMonth(), 1);
        want.append(date.getMonth().toString()).append(" ").append(date.getYear()).append('\n');
        want.append("Sun\tMon\tTue\tWen\tThu\tFri\tSat\t\n");
        var pos = date.getDayOfWeek().getValue() == 7 ? 0 : date.getDayOfWeek().getValue();
        for (var i = 0; i < pos; i++) {
            want.append(" \t");
        }
        while (date.getMonthValue() == today.getMonthValue()) {
            var format = pos++ % 7 == 6 ? "%d\n" : "%d\t";
            want.append(String.format(format, date.getDayOfMonth()));
            date = date.plusDays(1);
        }
        Ch2_1.main(null);
        assertEquals(want.toString(), this.out.toString());
    }

}
