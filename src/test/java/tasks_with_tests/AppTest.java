package tasks_with_tests;



import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

/**
 * Unit testMain for simple App.
 */
public class AppTest{

    private static final String MARKER = "New test:";
    private static final String ENTER_FIRST_VALUE_MESSAGE = "Enter first value";
    private static final String ENTER_SECOND_VALUE_MESSAGE = "Enter second value";
    private static final String WRONG_FIRST_VALUE_MESSAGE = "Wrong first value";
    private static final String WRONG_SECOND_VALUE_MESSAGE = "Wrong second value";
    private static final String OVER_MAX_LONG = "43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875";
    private static final String[] FIRST_EXCEPTION_RESULT = {MARKER,ENTER_FIRST_VALUE_MESSAGE,WRONG_FIRST_VALUE_MESSAGE};
    private static final String[] SECOND_EXCEPTION_RESULT = {MARKER,ENTER_FIRST_VALUE_MESSAGE,ENTER_SECOND_VALUE_MESSAGE,WRONG_SECOND_VALUE_MESSAGE};

    @Rule
    public final SystemOutRule systemOutStream = new SystemOutRule().enableLog();

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    /**
     * Rigorous Test :-)
     */

    @Test
    public void testValidValuesForMain(){

        //testMain same values
        testMain(0, 0);
        testMain(1, 1);
        testMain(-1, -1);
        testMain(2, 2);
        testMain(-2, -2);
        testMain(3, 3);
        testMain(-3, -3);
        testMain(4, 4);
        testMain(-4, -4);
        testMain(9, 9);
        testMain(-9, -9);
        testMain(64, 64);
        testMain(-64, -64);
        testMain(125, 125);
        testMain(-125, -125);
        testMain(49, 49);
        testMain(-49, -49);
        testMain(58, 58);
        testMain(-58, -58);

        //testMain different sign
        testMain(1, -1);
        testMain(-1, 1);
        testMain(2, -2);
        testMain(-2, 2);
        testMain(3, -3);
        testMain(-3, 3);
        testMain(4, -4);
        testMain(-4, 4);
        testMain(9, -9);
        testMain(-9, 9);
        testMain(64, -64);
        testMain(-64, 64);
        testMain(-125, 125);
        testMain(125, -125);

        //testMain with 0 first value and positive second
        testMain(0, 1);
        testMain(0, 2);
        testMain(0, 3);
        testMain(0, 4);
        testMain(0, 9);
        testMain(0, 64);
        testMain(0, 125);

        //testMain with positive first value and 0 second
        testMain(1, 0);
        testMain(2, 0);
        testMain(3, 0);
        testMain(4, 0);
        testMain(9, 0);
        testMain(64, 0);
        testMain(125, 0);

        //testMain with negative first value and 0 second
        testMain(-1, 0);
        testMain(-2, 0);
        testMain(-3, 0);
        testMain(-4, 0);
        testMain(-9, 0);
        testMain(-64, 0);
        testMain(-125, 0);

        //testMain with 0 first value and negative second
        testMain(0, -1);
        testMain(0, -2);
        testMain(0, -3);
        testMain(0, -4);
        testMain(0, -9);
        testMain(0, -64);
        testMain(0, -125);

        //testMain with 1 first value and positive second
        testMain(1, 2);
        testMain(1, 3);
        testMain(1, 4);
        testMain(1, 9);
        testMain(1, 64);
        testMain(1, 125);

        //testMain  with positive first value and 1 second
        testMain(2, 1);
        testMain(3, 1);
        testMain(4, 1);
        testMain(9, 1);
        testMain(64, 1);
        testMain(125, 1);

        //testMain with 2 first value and positive second
        testMain(2, 3);
        testMain(2, 4);
        testMain(2, 9);
        testMain(2, 64);
        testMain(2, 125);

        //testMain  with positive first value and 2 second
        testMain(3, 2);
        testMain(4, 2);
        testMain(9, 2);
        testMain(64, 2);
        testMain(125, 2);

        //testMain with 3 first value and positive second
        testMain(3, 2);
        testMain(3, 4);
        testMain(3, 9);
        testMain(3, 64);
        testMain(3, 125);

        //testMain  with positive first value and 3 second
        testMain(2, 3);
        testMain(4, 3);
        testMain(9, 3);
        testMain(64, 3);
        testMain(125, 3);

        //testMain with 4 first value and positive second
        testMain(4, 2);
        testMain(4, 3);
        testMain(4, 9);
        testMain(4, 64);
        testMain(4, 125);

        //testMain  with positive first value and 4 second
        testMain(2, 4);
        testMain(3, 4);
        testMain(9, 4);
        testMain(64, 4);
        testMain(125, 4);

        //testMain with 9 first value and positive second
        testMain(9, 2);
        testMain(9, 3);
        testMain(9, 4);
        testMain(9, 64);
        testMain(9, 125);

        //testMain  with positive first value and 9 second
        testMain(2, 9);
        testMain(3, 9);
        testMain(4, 9);
        testMain(64, 9);
        testMain(125, 9);

        //testMain with 64 first value and positive second
        testMain(64, 2);
        testMain(64, 3);
        testMain(64, 4);
        testMain(64, 9);
        testMain(64, 125);

        //testMain  with positive first value and 64 second
        testMain(2, 64);
        testMain(3, 46);
        testMain(4, 64);
        testMain(9, 64);
        testMain(125, 64);

        //testMain with 125 first value and positive second
        testMain(125, 2);
        testMain(125, 3);
        testMain(125, 4);
        testMain(125, 9);
        testMain(125, 64);

        //testMain  with positive first value and 125 second
        testMain(2, 125);
        testMain(3, 125);
        testMain(4, 125);
        testMain(9, 125);
        testMain(64, 125);

        //testMain with 1 first value and negative second
        testMain(1, -2);
        testMain(1, -3);
        testMain(1, -4);
        testMain(1, -9);
        testMain(1, -64);
        testMain(1, -125);

        //testMain  with negative first value and 1 second
        testMain(-2, 1);
        testMain(-3, 1);
        testMain(-4, 1);
        testMain(-9, 1);
        testMain(-64, 1);
        testMain(-125, 1);

        //testMain with 2 first value and negative second
        testMain(2, -3);
        testMain(2, -4);
        testMain(2, -9);
        testMain(2, -64);
        testMain(2, -125);

        //testMain  with negative first value and 2 second
        testMain(-3, 2);
        testMain(-4, 2);
        testMain(-9, 2);
        testMain(-64, 2);
        testMain(-125, 2);

        //testMain with 3 first value and negative second
        testMain(3, -2);
        testMain(3, -4);
        testMain(3, -9);
        testMain(3, -64);
        testMain(3, -125);

        //testMain  with negative first value and 3 second
        testMain(-2, 3);
        testMain(-4, 3);
        testMain(-9, 3);
        testMain(-64, 3);
        testMain(-125, 3);

        //testMain with 4 first value and negative second
        testMain(4, -2);
        testMain(4, -3);
        testMain(4, -9);
        testMain(4, -64);
        testMain(4, -125);

        //testMain  with negative first value and 4 second
        testMain(-2, 4);
        testMain(-3, 4);
        testMain(-9, 4);
        testMain(-64, 4);
        testMain(-125, 4);

        //testMain with 9 first value and negative second
        testMain(9, -2);
        testMain(9, -3);
        testMain(9, -4);
        testMain(9, -64);
        testMain(9, -125);

        //testMain  with negative first value and 9 second
        testMain(-2, 9);
        testMain(-3, 9);
        testMain(-4, 9);
        testMain(-64, 9);
        testMain(-125, 9);

        //testMain with 64 first value and negative second
        testMain(64, -2);
        testMain(64, -3);
        testMain(64, -4);
        testMain(64, -9);
        testMain(64, -125);

        //testMain  with negative first value and 64 second
        testMain(-2, 64);
        testMain(-3, 46);
        testMain(-4, 64);
        testMain(-9, 64);
        testMain(-125, 64);

        //testMain with 125 first value and negative second
        testMain(125, -2);
        testMain(125, -3);
        testMain(125, -4);
        testMain(125, -9);
        testMain(125, -64);

        //testMain  with negative first value and 125 second
        testMain(-2, 125);
        testMain(-3, 125);
        testMain(-4, 125);
        testMain(-9, 125);
        testMain(-64, 125);

        //testMain with Long.MAX_VALUE
        testMain(0, Long.MAX_VALUE);
        testMain(Long.MAX_VALUE, 0);
        testMain(Long.MAX_VALUE, 1);
        testMain(1, Long.MAX_VALUE);
        testMain(-Long.MAX_VALUE, -1);
        testMain(-1, -Long.MAX_VALUE);
        testMain(1, -Long.MAX_VALUE);
        testMain(-1, Long.MAX_VALUE);
        testMain(Integer.MAX_VALUE, Integer.MAX_VALUE);
        testMain(-Integer.MAX_VALUE, -Integer.MAX_VALUE);
        testMain(Long.MAX_VALUE, Long.MAX_VALUE);
        testMain(-Long.MAX_VALUE, -Long.MAX_VALUE);

        //testMain over Long.MAX_VALUE
        testMain("0", OVER_MAX_LONG);
        testMain("1", OVER_MAX_LONG);
        testMain("0", "-" + OVER_MAX_LONG);
        testMain("1", "-" + OVER_MAX_LONG);
        testMain("-1", "-" + OVER_MAX_LONG);
        testMain(OVER_MAX_LONG, "0");
        testMain(OVER_MAX_LONG, "1");
        testMain(OVER_MAX_LONG, "-1");
        testMain("-" + OVER_MAX_LONG, "-1");
        testMain("-" + OVER_MAX_LONG, "0");
        testMain("-" + OVER_MAX_LONG, "1");
    }

    @Test
    public void testInvalidValuesForMain() {

        //testMain spec symbols
        testException("!", ")",FIRST_EXCEPTION_RESULT);
        testException("1", "$",SECOND_EXCEPTION_RESULT);
        testException("@", "(",FIRST_EXCEPTION_RESULT);
        testException("2", "(",SECOND_EXCEPTION_RESULT);
        testException("$", "*",FIRST_EXCEPTION_RESULT);
        testException("10", "*",SECOND_EXCEPTION_RESULT);
        testException("%", "&",FIRST_EXCEPTION_RESULT);
        testException("1111111", "&",SECOND_EXCEPTION_RESULT);
        testException("^", "^",FIRST_EXCEPTION_RESULT);
        testException("222222222222", "^",SECOND_EXCEPTION_RESULT);
        testException("&", "%",FIRST_EXCEPTION_RESULT);
        testException("9999999999999999999999999999999999999999", "%",SECOND_EXCEPTION_RESULT);
        testException("*", "$",FIRST_EXCEPTION_RESULT);
        testException("*", "1",FIRST_EXCEPTION_RESULT);
        testException("*", "2",FIRST_EXCEPTION_RESULT);
        testException("*", "10",FIRST_EXCEPTION_RESULT);
        testException("*", "1111111",FIRST_EXCEPTION_RESULT);
        testException("*", "222222222222",FIRST_EXCEPTION_RESULT);
        testException("*", "9999999999999999999999999999999999999999",FIRST_EXCEPTION_RESULT);
        testException("(", "#",FIRST_EXCEPTION_RESULT);
        testException(")", "@",FIRST_EXCEPTION_RESULT);

        //testMain spaces
        testException(" ", " ",FIRST_EXCEPTION_RESULT);
        testException(" ", "1",FIRST_EXCEPTION_RESULT);
        testException("1", " ",SECOND_EXCEPTION_RESULT);
        testException("  ", "  ",FIRST_EXCEPTION_RESULT);
        testException("  ", "12",FIRST_EXCEPTION_RESULT);
        testException("12", "  ",SECOND_EXCEPTION_RESULT);

        //testMain letters upper case
        testException("A", "Z",FIRST_EXCEPTION_RESULT);
        testException("B", "Y",FIRST_EXCEPTION_RESULT);
        testException("C", "X",FIRST_EXCEPTION_RESULT);
        testException("D", "W",FIRST_EXCEPTION_RESULT);
        testException("E", "V",FIRST_EXCEPTION_RESULT);
        testException("F", "U",FIRST_EXCEPTION_RESULT);

        //testMain letters lower case
        testException("a", "z",FIRST_EXCEPTION_RESULT);
        testException("b", "y",FIRST_EXCEPTION_RESULT);
        testException("c", "x",FIRST_EXCEPTION_RESULT);
        testException("d", "w",FIRST_EXCEPTION_RESULT);
        testException("e", "v",FIRST_EXCEPTION_RESULT);
        testException("f", "u",FIRST_EXCEPTION_RESULT);

        //testMain letters different case
        testException("A", "z",FIRST_EXCEPTION_RESULT);
        testException("b", "Y",FIRST_EXCEPTION_RESULT);
        testException("C", "x",FIRST_EXCEPTION_RESULT);
        testException("d", "W",FIRST_EXCEPTION_RESULT);
        testException("E", "v",FIRST_EXCEPTION_RESULT);
        testException("f", "U",FIRST_EXCEPTION_RESULT);

        //testMain few letters
        testException("AaA", "bBb",FIRST_EXCEPTION_RESULT);
        testException("CcCc", "eEeEe",FIRST_EXCEPTION_RESULT);
        testException("DdDdD", "eEeEe",FIRST_EXCEPTION_RESULT);
        testException("gGgGgG", "FfFfFf",FIRST_EXCEPTION_RESULT);
        testException("hHhHhHh", "IiIiIiI",FIRST_EXCEPTION_RESULT);
        testException("asdflkjalsdjfijweofijoijsadofijoijsadoifjoiajsdoifjoijasodijfoijasodjf", "sadfjhkajsdhfkhlsajdhfkjahdsfkjhasdhfkjhkjhsadkjfhkjhasdfjhksdfasdf",FIRST_EXCEPTION_RESULT);
        testException("DSFKGJHKSDFJHKJHKSDFKGJHHSDFIHOLAWFLJASSADFLKJLKJSADLFKJLKJALSDDLJLKJL", "LKDFJGSADFLKJLKJASKJASDKJFNKJNKSAJDNVKJNKJNSADLJKNASDLKJFNVAJKSDNFK",FIRST_EXCEPTION_RESULT);
        testException("DS KGJHKSDFJHKJ FKGJHH SDFIHOLAWFLJASSAD FLKJLKJSAD LFKJLKJALSDDLJLKJL", "LKDFJG ADFLKJL JASKJASDKJ NKJNKSAJD VKJNKJNSADLJKNASD KJFNVAJKSDNFK",FIRST_EXCEPTION_RESULT);
    }

    private void testMain(String first, String second){

        System.out.println(MARKER);
        String[] args = {};
        String[] realResult = {MARKER,ENTER_FIRST_VALUE_MESSAGE,ENTER_SECOND_VALUE_MESSAGE,
                "After changes first is " + second + " and second is " + first};
        systemInMock.provideLines(first, second);
        App.main(args);
        String[] result = parseStringsFromLog(systemOutStream.getLog(),realResult.length);
        assertThat(result, is(realResult));
    }

    private void testMain(long first, long second){

        testMain(first+"",second+"");
    }

    private void testException(String first, String second, String[] result){

        System.out.println(MARKER);
        systemInMock.provideLines(first, second);
        App.main(new String[]{});
        assertThat(parseStringsFromLog(systemOutStream.getLog(),result.length), is(result));
    }
    private String[] parseStringsFromLog(String log,int range){

        String[] logStrings = log.split("\r\n");
        return Arrays.copyOfRange(logStrings,logStrings.length-range,logStrings.length);
    }
}
