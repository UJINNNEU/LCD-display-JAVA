import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void TestPrintNumber()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int s = 2;
        String number = "546";
        Main.logicProgram(s,number);
        String string = "--          --   \n|     |  |  |     \n|     |  |  |     \n" +
                " --    --    --   \n   |     |  |  |  \n   |     |  |  |  \n --          --";

        assertEquals(string,outContent.toString().trim());

    }

    @Test
    void Test2() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int s = 3;
        String number = "111";
        Main.logicProgram(s,number);
        String string = "|  |  |  \n" +
                "|  |  |  \n" +
                "|  |  |  \n" +
                "         \n" +
                "|  |  |  \n" +
                "|  |  |  \n" +
                "|  |  |";

        assertEquals(string,outContent.toString().trim());

    }

    @Test
    void Test3() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int s = 2;
        String number = "111";
        Main.logicProgram(s,number);
        String string = "|  |  |  \n" +
                "|  |  |  \n" +
                "         \n" +
                "|  |  |  \n" +
                "|  |  |";
        assertEquals(string,outContent.toString().trim());
    }

    @Test
    void Test4() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int s = 2;
        String number = "411";
        Main.logicProgram(s,number);
        String string = "|  |  |  |  \n" +
                "|  |  |  |  \n" +
                " --         \n" +
                "   |  |  |  \n" +
                "   |  |  |";
        assertEquals(string,outContent.toString().trim());
    }

    @Test
    void Test() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String string = "2   1 3  4";

    }

}