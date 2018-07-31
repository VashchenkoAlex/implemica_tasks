package tasks_with_tests.calculators;

import org.junit.Before;
import org.junit.Test;
import tasks_with_tests.exceptions.MyException;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class MaxDivisorCalculatorTest {

    private GCDCalculator calculator;
    private static final String CRAZY_VALUE = "43466557686937456435688527675040625802564660517371780";
    private static final String OVER_LONG_MAX_VALUE = "9223372036854775808";

    @Before
    public void initTest(){

        calculator = new GCDCalculator();
    }

    @Test
    public void testValidValues()throws Exception{

        //test 1 for all values
        test(1,1,1,1,1);

        //test -1 values
        test(-1,-1,-1,-1,1);
        test(-1,1,1,1,1);
        test(1,-1,1,1,1);
        test(1,1,-1,1,1);
        test(1,1,1,-1,1);
        test(-1,-1,1,1,1);
        test(1,-1,-1,1,1);
        test(1,1,-1,-1,1);
        test(-1,1,1,-1,1);
        test(1,-1,-1,-1,1);
        test(-1,1,-1,-1,1);
        test(-1,-1,1,-1,1);
        test(-1,-1,-1,1,1);


        //test numbers in 4 degrees
        test(2,4,8,16,2);
        test(4,2,8,16,2);
        test(4,8,2,16,2);
        test(4,8,16,2,2);
        test(16,8,4,2,2);
        test(8,16,4,2,2);
        test(8,4,16,2,2);
        test(8,4,2,16,2);

        test(3,9,27,81,3);
        test(9,3,27,81,3);
        test(9,27,3,81,3);
        test(9,27,81,3,3);
        test(81,27,9,3,3);
        test(27,81,9,3,3);
        test(27,9,81,3,3);
        test(27,9,3,81,3);

        test(5,25,125,625,5);
        test(25,5,125,625,5);
        test(25,125,5,625,5);
        test(25,125,625,5,5);
        test(625,125,25,5,5);
        test(125,625,25,5,5);
        test(125,25,625,5,5);
        test(125,25,5,625,5);

        test(16,256,4096,65536,16);
        test(256,16,4096,65536,16);
        test(256,4096,65536,16,16);
        test(256,4096,16,65536,16);
        test(65536,4096,256,16,16);
        test(4096,65536,256,16,16);
        test(4096,256,65536,16,16);
        test(4096,256,16,65536,16);

        //test with simple values
        test(7,11,13,19,1);
        test(17,23,29,31,1);
        test(47,43,41,37,1);
        test(67,61,59,53,1);
        test(71,73,79,83,1);
        test(97,101,103,107,1);

        //test with mutually simple values
        test(25,39,16,49,1);
        test(39,25,16,49,1);
        test(39,16,25,49,1);
        test(39,16,49,25,1);
        test(49,16,39,25,1);
        test(16,49,39,25,1);
        test(16,39,49,25,1);
        test(16,39,25,49,1);

        //test values with different dividers
        test(4000,2528,1376,416,32);
        test(2528,4000,1376,416,32);
        test(2528,1376,4000,416,32);
        test(2528,1376,416,4000,32);
        test(4000,2528,1376,416,32);
        test(2528,4000,1376,416,32);
        test(2528,1376,4000,416,32);
        test(2528,1376,416,4000,32);

        test(4736,1073,4625,2997,37);
        test(1073,4736,4625,2997,37);
        test(1073,4625,4736,2997,37);
        test(1073,4625,2997,4736,37);
        test(2997,4625,1073,4736,37);
        test(4625,2997,1073,4736,37);
        test(4625,1073,2997,4736,37);
        test(4625,1073,4736,2997,37);

        //test numbers in 4 degrees with negative value
        test(-2,4,8,16,2);
        test(4,-2,8,16,2);
        test(4,8,-2,16,2);
        test(4,8,16,-2,2);
        test(-16,8,4,2,2);
        test(8,-16,4,2,2);
        test(8,4,-16,2,2);
        test(8,4,2,-16,2);

        test(-3,9,27,81,3);
        test(9,-3,27,81,3);
        test(9,27,-3,81,3);
        test(9,27,81,-3,3);
        test(-81,27,9,3,3);
        test(27,-81,9,3,3);
        test(27,9,-81,3,3);
        test(27,9,3,-81,3);

        test(-5,25,125,625,5);
        test(25,-5,125,625,5);
        test(25,125,-5,625,5);
        test(25,125,625,-5,5);
        test(-625,125,25,5,5);
        test(125,-625,25,5,5);
        test(125,25,-625,5,5);
        test(125,25,5,-625,5);

        test(-16,256,4096,65536,16);
        test(256,-16,4096,65536,16);
        test(256,4096,65536,-16,16);
        test(256,4096,-16,65536,16);
        test(-65536,4096,256,16,16);
        test(4096,-65536,256,16,16);
        test(4096,256,-65536,16,16);
        test(4096,256,16,-65536,16);

        //test values with different dividers
        test(-4000,2528,1376,416,32);
        test(2528,-4000,1376,416,32);
        test(2528,1376,-4000,416,32);
        test(2528,1376,416,-4000,32);
        test(-416,1376,2528,4000,32);
        test(1376,-416,2528,4000,32);
        test(1376,2528,-416,4000,32);
        test(1376,2528,4000,-416,32);

        test(-4736,1073,4625,2997,37);
        test(1073,-4736,4625,2997,37);
        test(1073,4625,-4736,2997,37);
        test(1073,4625,2997,-4736,37);
        test(-2997,4625,1073,4736,37);
        test(4625,-2997,1073,4736,37);
        test(4625,1073,-2997,4736,37);
        test(4625,1073,4736,-2997,37);

        //test values with common divider 1
        test(25,27,16,29,1);
        test(27,25,16,29,1);
        test(27,16,25,29,1);
        test(27,16,29,25,1);
        test(29,16,27,25,1);
        test(16,29,27,25,1);
        test(16,27,29,25,1);
        test(16,27,25,29,1);

        //test Long.MAX_VALUE for 1 parameter
        test(Long.MAX_VALUE+"","1","1","1","1");
        test("1",Long.MAX_VALUE+"","1","1","1");
        test("1","1",Long.MAX_VALUE+"","1","1");
        test("1","1", "1",Long.MAX_VALUE+"","1");

        //test Long.MAX_VALUE for 2 parameters
        test(Long.MAX_VALUE+"",Long.MAX_VALUE+"","1","1","1");
        test("1",Long.MAX_VALUE+"",Long.MAX_VALUE+"","1","1");
        test("1","1",Long.MAX_VALUE+"",Long.MAX_VALUE+"","1");
        test(Long.MAX_VALUE+"","1", "1",Long.MAX_VALUE+"","1");

        //test Long.MAX_VALUE for 3 parameters
        test(Long.MAX_VALUE+"",Long.MAX_VALUE+"",Long.MAX_VALUE+"","1","1");
        test("1",Long.MAX_VALUE+"",Long.MAX_VALUE+"",Long.MAX_VALUE+"","1");
        test(Long.MAX_VALUE+"","1",Long.MAX_VALUE+"",Long.MAX_VALUE+"","1");
        test(Long.MAX_VALUE+"",Long.MAX_VALUE+"","1",Long.MAX_VALUE+"","1");
        test(Long.MAX_VALUE+"",Long.MAX_VALUE+"",Long.MAX_VALUE+"","1","1");

        //test Long.MAX_VALUE for all parameters
        test(Long.MAX_VALUE+"",Long.MAX_VALUE+"",Long.MAX_VALUE+"",Long.MAX_VALUE+"",Long.MAX_VALUE+"");

        //test OVER_LONG_MAX_VALUE for 1 parameter
        test(OVER_LONG_MAX_VALUE,"1","1","1","1");
        test("1",OVER_LONG_MAX_VALUE,"1","1","1");
        test("1","1",OVER_LONG_MAX_VALUE,"1","1");
        test("1","1", "1",OVER_LONG_MAX_VALUE,"1");

        //test Long.MAX_VALUE +1 for 2 parameters
        test(OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,"1","1","1");
        test("1",OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,"1","1");
        test("1","1",OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,"1");
        test(OVER_LONG_MAX_VALUE,"1", "1",OVER_LONG_MAX_VALUE,"1");

        //test Long.MAX_VALUE +1 for 3 parameters
        test(OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,"1","1");
        test("1",OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,"1");
        test(OVER_LONG_MAX_VALUE,"1",OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,"1");
        test(OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,"1",OVER_LONG_MAX_VALUE,"1");

        //test Long.MAX_VALUE +1 for all parameters
        test(OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE,OVER_LONG_MAX_VALUE);

        //test CRAZY_VALUE for 1 parameter
        test(CRAZY_VALUE +"","1","1","1","1");
        test("1",CRAZY_VALUE,"1","1","1");
        test("1","1",CRAZY_VALUE,"1","1");
        test("1","1", "1",CRAZY_VALUE,"1");

        //test CRAZY_VALUE for 2 parameters
        test(CRAZY_VALUE,CRAZY_VALUE,"1","1","1");
        test("1",CRAZY_VALUE,CRAZY_VALUE,"1","1");
        test("1","1",CRAZY_VALUE,CRAZY_VALUE,"1");
        test(CRAZY_VALUE,"1", "1",CRAZY_VALUE,"1");

        //test CRAZY_VALUE for 3 parameters
        test(CRAZY_VALUE,CRAZY_VALUE,CRAZY_VALUE,"1","1");
        test("1",CRAZY_VALUE,CRAZY_VALUE,CRAZY_VALUE,"1");
        test(CRAZY_VALUE,"1",CRAZY_VALUE,CRAZY_VALUE,"1");
        test(CRAZY_VALUE,CRAZY_VALUE,"1",CRAZY_VALUE,"1");

        //test CRAZY_VALUE for all parameters
        test(CRAZY_VALUE,CRAZY_VALUE,CRAZY_VALUE,CRAZY_VALUE,CRAZY_VALUE);

    }
    @Test
    public void testInvalidValues(){

        //test 0 for all values
        testEx(0,0,0,0);
        testEx(0,1,1,1);
        testEx(1,0,1,1);
        testEx(1,1,0,1);
        testEx(1,1,1,0);

        assertThrows(MyException.class,()->calculator.calculate(null,BigInteger.ONE,BigInteger.ONE,BigInteger.ONE));
        assertThrows(MyException.class,()->calculator.calculate(BigInteger.ONE,null,BigInteger.ONE,BigInteger.ONE));
        assertThrows(MyException.class,()->calculator.calculate(BigInteger.ONE,BigInteger.ONE,null,BigInteger.ONE));
        assertThrows(MyException.class,()->calculator.calculate(BigInteger.ONE,BigInteger.ONE,BigInteger.ONE,null));
    }

    private void test(String first, String second, String third, String fourth,String result) throws MyException {

        assertEquals(new BigInteger(result),calculator.calculate(new BigInteger(first),new BigInteger(second),new BigInteger(third),new BigInteger(fourth)));
    }

    private void test(long first,long second,long third,long fourth,long result) throws Exception {

        test(first + "",second + "", third + "", fourth + "", result + "");
    }

    private void testEx(long first,long second,long third,long fourth){

        assertThrows(MyException.class,()->calculator.calculate(BigInteger.valueOf(first),BigInteger.valueOf(second),BigInteger.valueOf(third),BigInteger.valueOf(fourth)));
    }
}
