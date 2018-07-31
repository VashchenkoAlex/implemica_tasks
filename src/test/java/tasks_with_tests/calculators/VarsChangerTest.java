package tasks_with_tests.calculators;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import tasks_with_tests.changer.VarsChanger;
import tasks_with_tests.exceptions.MyException;

import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VarsChangerTest {

    private VarsChanger calculator;

    private static final String OVER_MAX_LONG = "43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875";

    @Rule
    public final SystemOutRule systemOutStream = new SystemOutRule().enableLog();

    @Before
    public void initTest() {
        calculator = new VarsChanger();
    }

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Test
    public void testValidValues() throws MyException {

        //test same values
        test(0, 0);
        test(1, 1);
        test(-1, -1);
        test(2, 2);
        test(-2, -2);
        test(3, 3);
        test(-3, -3);
        test(4, 4);
        test(-4, -4);
        test(9, 9);
        test(-9, -9);
        test(64, 64);
        test(-64, -64);
        test(125, 125);
        test(-125, -125);
        test(49, 49);
        test(-49, -49);
        test(58, 58);
        test(-58, -58);

        //test different sign
        test(1, -1);
        test(-1, 1);
        test(2, -2);
        test(-2, 2);
        test(3, -3);
        test(-3, 3);
        test(4, -4);
        test(-4, 4);
        test(9, -9);
        test(-9, 9);
        test(64, -64);
        test(-64, 64);
        test(-125, 125);
        test(125, -125);

        //test with 0 first value and positive second
        test(0, 1);
        test(0, 2);
        test(0, 3);
        test(0, 4);
        test(0, 9);
        test(0, 64);
        test(0, 125);

        //test with positive first value and 0 second
        test(1, 0);
        test(2, 0);
        test(3, 0);
        test(4, 0);
        test(9, 0);
        test(64, 0);
        test(125, 0);

        //test with negative first value and 0 second
        test(-1, 0);
        test(-2, 0);
        test(-3, 0);
        test(-4, 0);
        test(-9, 0);
        test(-64, 0);
        test(-125, 0);

        //test with 0 first value and negative second
        test(0, -1);
        test(0, -2);
        test(0, -3);
        test(0, -4);
        test(0, -9);
        test(0, -64);
        test(0, -125);

        //test with 1 first value and positive second
        test(1, 2);
        test(1, 3);
        test(1, 4);
        test(1, 9);
        test(1, 64);
        test(1, 125);

        //test  with positive first value and 1 second
        test(2, 1);
        test(3, 1);
        test(4, 1);
        test(9, 1);
        test(64, 1);
        test(125, 1);

        //test with 2 first value and positive second
        test(2, 3);
        test(2, 4);
        test(2, 9);
        test(2, 64);
        test(2, 125);

        //test  with positive first value and 2 second
        test(3, 2);
        test(4, 2);
        test(9, 2);
        test(64, 2);
        test(125, 2);

        //test with 3 first value and positive second
        test(3, 2);
        test(3, 4);
        test(3, 9);
        test(3, 64);
        test(3, 125);

        //test  with positive first value and 3 second
        test(2, 3);
        test(4, 3);
        test(9, 3);
        test(64, 3);
        test(125, 3);

        //test with 4 first value and positive second
        test(4, 2);
        test(4, 3);
        test(4, 9);
        test(4, 64);
        test(4, 125);

        //test  with positive first value and 4 second
        test(2, 4);
        test(3, 4);
        test(9, 4);
        test(64, 4);
        test(125, 4);

        //test with 9 first value and positive second
        test(9, 2);
        test(9, 3);
        test(9, 4);
        test(9, 64);
        test(9, 125);

        //test  with positive first value and 9 second
        test(2, 9);
        test(3, 9);
        test(4, 9);
        test(64, 9);
        test(125, 9);

        //test with 64 first value and positive second
        test(64, 2);
        test(64, 3);
        test(64, 4);
        test(64, 9);
        test(64, 125);

        //test  with positive first value and 64 second
        test(2, 64);
        test(3, 46);
        test(4, 64);
        test(9, 64);
        test(125, 64);

        //test with 125 first value and positive second
        test(125, 2);
        test(125, 3);
        test(125, 4);
        test(125, 9);
        test(125, 64);

        //test  with positive first value and 125 second
        test(2, 125);
        test(3, 125);
        test(4, 125);
        test(9, 125);
        test(64, 125);

        //test with 1 first value and negative second
        test(1, -2);
        test(1, -3);
        test(1, -4);
        test(1, -9);
        test(1, -64);
        test(1, -125);

        //test  with negative first value and 1 second
        test(-2, 1);
        test(-3, 1);
        test(-4, 1);
        test(-9, 1);
        test(-64, 1);
        test(-125, 1);

        //test with 2 first value and negative second
        test(2, -3);
        test(2, -4);
        test(2, -9);
        test(2, -64);
        test(2, -125);

        //test  with negative first value and 2 second
        test(-3, 2);
        test(-4, 2);
        test(-9, 2);
        test(-64, 2);
        test(-125, 2);

        //test with 3 first value and negative second
        test(3, -2);
        test(3, -4);
        test(3, -9);
        test(3, -64);
        test(3, -125);

        //test  with negative first value and 3 second
        test(-2, 3);
        test(-4, 3);
        test(-9, 3);
        test(-64, 3);
        test(-125, 3);

        //test with 4 first value and negative second
        test(4, -2);
        test(4, -3);
        test(4, -9);
        test(4, -64);
        test(4, -125);

        //test  with negative first value and 4 second
        test(-2, 4);
        test(-3, 4);
        test(-9, 4);
        test(-64, 4);
        test(-125, 4);

        //test with 9 first value and negative second
        test(9, -2);
        test(9, -3);
        test(9, -4);
        test(9, -64);
        test(9, -125);

        //test  with negative first value and 9 second
        test(-2, 9);
        test(-3, 9);
        test(-4, 9);
        test(-64, 9);
        test(-125, 9);

        //test with 64 first value and negative second
        test(64, -2);
        test(64, -3);
        test(64, -4);
        test(64, -9);
        test(64, -125);

        //test  with negative first value and 64 second
        test(-2, 64);
        test(-3, 46);
        test(-4, 64);
        test(-9, 64);
        test(-125, 64);

        //test with 125 first value and negative second
        test(125, -2);
        test(125, -3);
        test(125, -4);
        test(125, -9);
        test(125, -64);

        //test  with negative first value and 125 second
        test(-2, 125);
        test(-3, 125);
        test(-4, 125);
        test(-9, 125);
        test(-64, 125);

        //test with Long.MAX_VALUE
        test(0, Long.MAX_VALUE);
        test(Long.MAX_VALUE, 0);
        test(Long.MAX_VALUE, 1);
        test(1, Long.MAX_VALUE);
        test(-Long.MAX_VALUE, -1);
        test(-1, -Long.MAX_VALUE);
        test(1, -Long.MAX_VALUE);
        test(-1, Long.MAX_VALUE);
        test(Integer.MAX_VALUE, Integer.MAX_VALUE);
        test(-Integer.MAX_VALUE, -Integer.MAX_VALUE);
        test(Long.MAX_VALUE, Long.MAX_VALUE);
        test(-Long.MAX_VALUE, -Long.MAX_VALUE);

        //test over Long.MAX_VALUE
        test("0", OVER_MAX_LONG);
        test("1", OVER_MAX_LONG);
        test("0", "-" + OVER_MAX_LONG);
        test("1", "-" + OVER_MAX_LONG);
        test("-1", "-" + OVER_MAX_LONG);
        test(OVER_MAX_LONG, "0");
        test(OVER_MAX_LONG, "1");
        test(OVER_MAX_LONG, "-1");
        test("-" + OVER_MAX_LONG, "-1");
        test("-" + OVER_MAX_LONG, "0");
        test("-" + OVER_MAX_LONG, "1");
    }

    @Test
    public void testValidValuesForConsole() throws MyException {

        //test same values
        testConsole(0, 0);
        testConsole(1, 1);
        testConsole(-1, -1);
        testConsole(2, 2);
        testConsole(-2, -2);
        testConsole(3, 3);
        testConsole(-3, -3);
        testConsole(4, 4);
        testConsole(-4, -4);
        testConsole(9, 9);
        testConsole(-9, -9);
        testConsole(64, 64);
        testConsole(-64, -64);
        testConsole(125, 125);
        testConsole(-125, -125);
        testConsole(49, 49);
        testConsole(-49, -49);
        testConsole(58, 58);
        testConsole(-58, -58);

        //test different sign
        testConsole(1, -1);
        testConsole(-1, 1);
        testConsole(2, -2);
        testConsole(-2, 2);
        testConsole(3, -3);
        testConsole(-3, 3);
        testConsole(4, -4);
        testConsole(-4, 4);
        testConsole(9, -9);
        testConsole(-9, 9);
        testConsole(64, -64);
        testConsole(-64, 64);
        testConsole(-125, 125);
        testConsole(125, -125);

        //test with 0 first value and positive second
        testConsole(0, 1);
        testConsole(0, 2);
        testConsole(0, 3);
        testConsole(0, 4);
        testConsole(0, 9);
        testConsole(0, 64);
        testConsole(0, 125);

        //test with positive first value and 0 second
        testConsole(1, 0);
        testConsole(2, 0);
        testConsole(3, 0);
        testConsole(4, 0);
        testConsole(9, 0);
        testConsole(64, 0);
        testConsole(125, 0);

        //test with negative first value and 0 second
        testConsole(-1, 0);
        testConsole(-2, 0);
        testConsole(-3, 0);
        testConsole(-4, 0);
        testConsole(-9, 0);
        testConsole(-64, 0);
        testConsole(-125, 0);

        //test with 0 first value and negative second
        testConsole(0, -1);
        testConsole(0, -2);
        testConsole(0, -3);
        testConsole(0, -4);
        testConsole(0, -9);
        testConsole(0, -64);
        testConsole(0, -125);

        //test with 1 first value and positive second
        testConsole(1, 2);
        testConsole(1, 3);
        testConsole(1, 4);
        testConsole(1, 9);
        testConsole(1, 64);
        testConsole(1, 125);

        //test  with positive first value and 1 second
        testConsole(2, 1);
        testConsole(3, 1);
        testConsole(4, 1);
        testConsole(9, 1);
        testConsole(64, 1);
        testConsole(125, 1);

        //test with 2 first value and positive second
        testConsole(2, 3);
        testConsole(2, 4);
        testConsole(2, 9);
        testConsole(2, 64);
        testConsole(2, 125);

        //test  with positive first value and 2 second
        testConsole(3, 2);
        testConsole(4, 2);
        testConsole(9, 2);
        testConsole(64, 2);
        testConsole(125, 2);

        //test with 3 first value and positive second
        testConsole(3, 2);
        testConsole(3, 4);
        testConsole(3, 9);
        testConsole(3, 64);
        testConsole(3, 125);

        //test  with positive first value and 3 second
        testConsole(2, 3);
        testConsole(4, 3);
        testConsole(9, 3);
        testConsole(64, 3);
        testConsole(125, 3);

        //test with 4 first value and positive second
        testConsole(4, 2);
        testConsole(4, 3);
        testConsole(4, 9);
        testConsole(4, 64);
        testConsole(4, 125);

        //test  with positive first value and 4 second
        testConsole(2, 4);
        testConsole(3, 4);
        testConsole(9, 4);
        testConsole(64, 4);
        testConsole(125, 4);

        //test with 9 first value and positive second
        testConsole(9, 2);
        testConsole(9, 3);
        testConsole(9, 4);
        testConsole(9, 64);
        testConsole(9, 125);

        //test  with positive first value and 9 second
        testConsole(2, 9);
        testConsole(3, 9);
        testConsole(4, 9);
        testConsole(64, 9);
        testConsole(125, 9);

        //test with 64 first value and positive second
        testConsole(64, 2);
        testConsole(64, 3);
        testConsole(64, 4);
        testConsole(64, 9);
        testConsole(64, 125);

        //test  with positive first value and 64 second
        testConsole(2, 64);
        testConsole(3, 46);
        testConsole(4, 64);
        testConsole(9, 64);
        testConsole(125, 64);

        //test with 125 first value and positive second
        testConsole(125, 2);
        testConsole(125, 3);
        testConsole(125, 4);
        testConsole(125, 9);
        testConsole(125, 64);

        //test  with positive first value and 125 second
        testConsole(2, 125);
        testConsole(3, 125);
        testConsole(4, 125);
        testConsole(9, 125);
        testConsole(64, 125);

        //test with 1 first value and negative second
        testConsole(1, -2);
        testConsole(1, -3);
        testConsole(1, -4);
        testConsole(1, -9);
        testConsole(1, -64);
        testConsole(1, -125);

        //test  with negative first value and 1 second
        testConsole(-2, 1);
        testConsole(-3, 1);
        testConsole(-4, 1);
        testConsole(-9, 1);
        testConsole(-64, 1);
        testConsole(-125, 1);

        //test with 2 first value and negative second
        testConsole(2, -3);
        testConsole(2, -4);
        testConsole(2, -9);
        testConsole(2, -64);
        testConsole(2, -125);

        //test  with negative first value and 2 second
        testConsole(-3, 2);
        testConsole(-4, 2);
        testConsole(-9, 2);
        testConsole(-64, 2);
        testConsole(-125, 2);

        //test with 3 first value and negative second
        testConsole(3, -2);
        testConsole(3, -4);
        testConsole(3, -9);
        testConsole(3, -64);
        testConsole(3, -125);

        //test  with negative first value and 3 second
        testConsole(-2, 3);
        testConsole(-4, 3);
        testConsole(-9, 3);
        testConsole(-64, 3);
        testConsole(-125, 3);

        //test with 4 first value and negative second
        testConsole(4, -2);
        testConsole(4, -3);
        testConsole(4, -9);
        testConsole(4, -64);
        testConsole(4, -125);

        //test  with negative first value and 4 second
        testConsole(-2, 4);
        testConsole(-3, 4);
        testConsole(-9, 4);
        testConsole(-64, 4);
        testConsole(-125, 4);

        //test with 9 first value and negative second
        testConsole(9, -2);
        testConsole(9, -3);
        testConsole(9, -4);
        testConsole(9, -64);
        testConsole(9, -125);

        //test  with negative first value and 9 second
        testConsole(-2, 9);
        testConsole(-3, 9);
        testConsole(-4, 9);
        testConsole(-64, 9);
        testConsole(-125, 9);

        //test with 64 first value and negative second
        testConsole(64, -2);
        testConsole(64, -3);
        testConsole(64, -4);
        testConsole(64, -9);
        testConsole(64, -125);

        //test  with negative first value and 64 second
        testConsole(-2, 64);
        testConsole(-3, 46);
        testConsole(-4, 64);
        testConsole(-9, 64);
        testConsole(-125, 64);

        //test with 125 first value and negative second
        testConsole(125, -2);
        testConsole(125, -3);
        testConsole(125, -4);
        testConsole(125, -9);
        testConsole(125, -64);

        //test  with negative first value and 125 second
        testConsole(-2, 125);
        testConsole(-3, 125);
        testConsole(-4, 125);
        testConsole(-9, 125);
        testConsole(-64, 125);

        //test with Long.MAX_VALUE
        testConsole(0, Long.MAX_VALUE);
        testConsole(Long.MAX_VALUE, 0);
        testConsole(Long.MAX_VALUE, 1);
        testConsole(1, Long.MAX_VALUE);
        testConsole(-Long.MAX_VALUE, -1);
        testConsole(-1, -Long.MAX_VALUE);
        testConsole(1, -Long.MAX_VALUE);
        testConsole(-1, Long.MAX_VALUE);
        testConsole(Integer.MAX_VALUE, Integer.MAX_VALUE);
        testConsole(-Integer.MAX_VALUE, -Integer.MAX_VALUE);
        testConsole(Long.MAX_VALUE, Long.MAX_VALUE);
        testConsole(-Long.MAX_VALUE, -Long.MAX_VALUE);

        //test over Long.MAX_VALUE
        testConsole("0", OVER_MAX_LONG);
        testConsole("1", OVER_MAX_LONG);
        testConsole("0", "-" + OVER_MAX_LONG);
        testConsole("1", "-" + OVER_MAX_LONG);
        testConsole("-1", "-" + OVER_MAX_LONG);
        testConsole(OVER_MAX_LONG, "0");
        testConsole(OVER_MAX_LONG, "1");
        testConsole(OVER_MAX_LONG, "-1");
        testConsole("-" + OVER_MAX_LONG, "-1");
        testConsole("-" + OVER_MAX_LONG, "0");
        testConsole("-" + OVER_MAX_LONG, "1");
    }

    @Test
    public void testInvalidValuesForCalculate() {

        assertThrows(MyException.class, () -> calculator.swap(null, null));
        assertThrows(MyException.class, () -> calculator.swap(BigInteger.ONE, null));
        assertThrows(MyException.class, () -> calculator.swap(null, BigInteger.ONE));
    }

    @Test
    public void testInvalidValuesForConsole() {

        //test spec symbols
        testConsoleEx("!", ")");
        testConsoleEx("@", "(");
        testConsoleEx("$", "*");
        testConsoleEx("%", "&");
        testConsoleEx("^", "^");
        testConsoleEx("&", "%");
        testConsoleEx("*", "$");
        testConsoleEx("(", "#");
        testConsoleEx(")", "@");

        //test spaces
        testConsoleEx(" ", " ");
        testConsoleEx(" ", "1");
        testConsoleEx("1", " ");
        testConsoleEx("  ", "  ");
        testConsoleEx("  ", "12");
        testConsoleEx("12", "  ");

        //test letters upper case
        testConsoleEx("A", "Z");
        testConsoleEx("B", "Y");
        testConsoleEx("C", "X");
        testConsoleEx("D", "W");
        testConsoleEx("E", "V");
        testConsoleEx("F", "U");

        //test letters lower case
        testConsoleEx("a", "z");
        testConsoleEx("b", "y");
        testConsoleEx("c", "x");
        testConsoleEx("d", "w");
        testConsoleEx("e", "v");
        testConsoleEx("f", "u");

        //test letters different case
        testConsoleEx("A", "z");
        testConsoleEx("b", "Y");
        testConsoleEx("C", "x");
        testConsoleEx("d", "W");
        testConsoleEx("E", "v");
        testConsoleEx("f", "U");

        //test few letters
        testConsoleEx("AaA", "bBb");
        testConsoleEx("CcCc", "eEeEe");
        testConsoleEx("DdDdD", "eEeEe");
        testConsoleEx("gGgGgG", "FfFfFf");
        testConsoleEx("hHhHhHh", "IiIiIiI");
        testConsoleEx("asdflkjalsdjfijweofijoijsadofijoijsadoifjoiajsdoifjoijasodijfoijasodjf", "sadfjhkajsdhfkhlsajdhfkjahdsfkjhasdhfkjhkjhsadkjfhkjhasdfjhksdfasdf");
        testConsoleEx("DSFKGJHKSDFJHKJHKSDFKGJHHSDFIHOLAWFLJASSADFLKJLKJSADLFKJLKJALSDDLJLKJL", "LKDFJGSADFLKJLKJASKJASDKJFNKJNKSAJDNVKJNKJNSADLJKNASDLKJFNVAJKSDNFK");
        testConsoleEx("DS KGJHKSDFJHKJ FKGJHH SDFIHOLAWFLJASSAD FLKJLKJSAD LFKJLKJALSDDLJLKJL", "LKDFJG ADFLKJL JASKJASDKJ NKJNKSAJD VKJNKJNSADLJKNASD KJFNVAJKSDNFK");
    }

    private void testConsole(String first, String second) throws MyException {

        BigInteger[] rightResult = {new BigInteger(first), new BigInteger(second)};
        systemInMock.provideLines(first, second);
        assertThat(calculator.readFromConsole(), is(rightResult));
    }

    private void testConsole(long first, long second) throws MyException {

        testConsole(first + "", second + "");

    }

    private void testConsoleEx(String first, String second) {

        systemInMock.provideLines(first, second);
        assertThrows(MyException.class, () -> calculator.readFromConsole());
    }

    private void test(String first, String second) throws MyException {

        BigInteger[] result = {new BigInteger(second), new BigInteger(first)};
        assertThat(calculator.swap(new BigInteger(first), new BigInteger(second)), is(result));
    }

    private void test(long first, long second) throws MyException {

        test(first + "",second + "");
    }









}
