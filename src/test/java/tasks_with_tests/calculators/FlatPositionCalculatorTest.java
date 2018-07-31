package tasks_with_tests.calculators;

import org.junit.Before;
import org.junit.Test;
import tasks_with_tests.exceptions.MyException;

import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

public class FlatPositionCalculatorTest {

    private FlatPositionCalculator calculator;

    @Before
    public void initTest(){
        calculator = new FlatPositionCalculator();
    }

    @Test
    public void testValidValuesWithDifferentApproaches() throws MyException {

        //1 floor house with 1 flats on the floor
        test(1,1,1,1,1);
        test(1,1,2,1,2);
        test(1,1,3,1,3);
        test(1,1,4,1,4);
        test(1,1,9,1,9);
        test(1,1,64,1,64);
        test(1,1,125,1,125);

        //2 floor house with 2 flats on the floor
        test(2,2,1,1,1);
        test(2,2,2,1,1);
        test(2,2,3,2,1);
        test(2,2,4,2,1);
        test(2,2,9,1,3);
        test(2,2,64,2,16);
        test(2,2,125,1,32);

        //3 floor house with 3 flats on the floor
        test(3,3,1,1,1);
        test(3,3,3,1,1);
        test(3,3,4,2,1);
        test(3,3,9,3,1);
        test(3,3,10,1,2);
        test(3,3,63,3,7);
        test(3,3,64,1,8);
        test(3,3,125,3,14);

        //4 floor house with 4 flats on the floor
        test(4,4,1,1,1);
        test(4,4,4,1,1);
        test(4,4,5,2,1);
        test(4,4,9,3,1);
        test(4,4,64,4,4);
        test(4,4,65,1,5);
        test(4,4,125,4,8);
        test(4,4,129,1,9);

        //5 floor house with 5 flats on the floor
        test(5,5,3,1,1);
        test(5,5,8,2,1);
        test(5,5,13,3,1);
        test(5,5,18,4,1);
        test(5,5,23,5,1);
        test(5,5,28,1,2);
        test(5,5,33,2,2);
        test(5,5,38,3,2);
        test(5,5,43,4,2);
        test(5,5,48,5,2);

        //9 floor house with 4 flats on the floor
        test(9,4,1,1,1);
        test(9,4,6,2,1);
        test(9,4,11,3,1);
        test(9,4,16,4,1);
        test(9,4,21,6,1);
        test(9,4,26,7,1);
        test(9,4,31,8,1);
        test(9,4,36,9,1);
        test(9,4,41,2,2);
        test(9,4,46,3,2);
        test(9,4,51,4,2);
        test(9,4,55,5,2);
        test(9,4,61,7,2);
        test(9,4,66,8,2);
        test(9,4,71,9,2);

        //12 floor house with 6 flats on the floor
        test(12,6,6,1,1);
        test(12,6,11,2,1);
        test(12,6,16,3,1);
        test(12,6,21,4,1);
        test(12,6,26,5,1);
        test(12,6,31,6,1);
        test(12,6,36,6,1);
        test(12,6,41,7,1);
        test(12,6,46,8,1);
        test(12,6,51,9,1);
        test(12,6,56,10,1);
        test(12,6,61,11,1);
        test(12,6,66,11,1);
        test(12,6,71,12,1);
        test(12,6,76,1,2);
        test(12,6,81,2,2);
        test(12,6,86,3,2);
        test(12,6,91,4,2);
        test(12,6,96,4,2);
        test(12,6,101,5,2);
        test(12,6,106,6,2);
        test(12,6,111,7,2);
        test(12,6,116,8,2);
        test(12,6,121,9,2);
        test(12,6,126,9,2);
        test(12,6,131,10,2);
        test(12,6,136,11,2);
        test(12,6,141,12,2);

        //12 floor house with 8 flats on the floor
        test(16,8,5,1,1);
        test(16,8,15,2,1);
        test(16,8,30,4,1);
        test(16,8,45,6,1);
        test(16,8,75,10,1);
        test(16,8,120,15,1);
        test(16,8,195,9,2);
        test(16,8,315,8,3);
        test(16,8,510,16,4);
    }
    @Test
    public void testValidValuesByMaxValues() throws Exception {

        //1 floor house with 1 flat on the floor
        test(1,1,1,1,1);
        test(1,1,2,1,2);
        test(1,1,Integer.MAX_VALUE - 1,1,Integer.MAX_VALUE - 1);
        test(1,1,Integer.MAX_VALUE,1,Integer.MAX_VALUE);
        test(1,1,Integer.MAX_VALUE + 1L,1,Integer.MAX_VALUE + 1L);
        test(1,1,Long.MAX_VALUE - 1,1,Long.MAX_VALUE - 1);
        test(1,1,Long.MAX_VALUE,1,Long.MAX_VALUE);
        test("1","1","9223372036854775808","1","9223372036854775808");

        //1 floor house with 2 flat on the floor
        test(1,2,1,1,1);
        test(1,2,2,1,1);
        test(1,2,3,1,2);
        test(1,2,Integer.MAX_VALUE - 1,1,1073741823);
        test(1,2,Integer.MAX_VALUE,1,1073741824);
        test(1,2,Integer.MAX_VALUE + 1L,1,1073741824);
        test(1,2,Long.MAX_VALUE - 1,1,4611686018427387903L);
        test(1,2,Long.MAX_VALUE,1,4611686018427387904L);
        test("1","2","9223372036854775808","1","4611686018427387904");

        //1 floor house with Integer.MAX_INT - 1 flat on the floor
        test(1,Integer.MAX_VALUE - 1,1,1,1);
        test(1,Integer.MAX_VALUE - 1,2,1,1);
        test(1,Integer.MAX_VALUE - 1,Integer.MAX_VALUE - 2,1,1);
        test(1,Integer.MAX_VALUE - 1,Integer.MAX_VALUE - 1,1,1);
        test(1,Integer.MAX_VALUE - 1,Integer.MAX_VALUE,1,2);
        test(1,Integer.MAX_VALUE - 1,Long.MAX_VALUE - 1,1,4294967301L);
        test(1,Integer.MAX_VALUE - 1,Long.MAX_VALUE,1,4294967301L);
        test("1",Integer.MAX_VALUE - 1+"","9223372036854775808","1","4294967301");

        //1 floor house with Integer.MAX_VALUE flat on the floor
        test(1,Integer.MAX_VALUE,1,1,1);
        test(1,Integer.MAX_VALUE,2,1,1);
        test(1,Integer.MAX_VALUE,Integer.MAX_VALUE - 1,1,1);
        test(1,Integer.MAX_VALUE,Integer.MAX_VALUE ,1,1);
        test(1,Integer.MAX_VALUE,Integer.MAX_VALUE+1L,1,2);
        test(1,Integer.MAX_VALUE,Long.MAX_VALUE - 1,1,4294967298L);
        test(1,Integer.MAX_VALUE,Long.MAX_VALUE,1,4294967299L);
        test("1",Integer.MAX_VALUE+"","9223372036854775808","1","4294967299");

        //1 floor house with Integer.MAX_VALUE +1 flat on the floor
        test(1,Integer.MAX_VALUE +1L,1,1,1);
        test(1,Integer.MAX_VALUE +1L,2,1,1);
        test(1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE,1,1);
        test(1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,1,1);
        test(1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,1,2);
        test(1,Integer.MAX_VALUE +1L,Long.MAX_VALUE - 1,1,4294967296L);
        test(1,Integer.MAX_VALUE +1L,Long.MAX_VALUE,1,4294967296L);
        test("1","2147483648","9223372036854775808","1","4294967296");

        //1 floor house with Long.MAX_VALUE -1 flat on the floor
        test(1,Long.MAX_VALUE - 1,1,1,1);
        test(1,Long.MAX_VALUE - 1,2,1,1);
        test(1,Long.MAX_VALUE - 1,Integer.MAX_VALUE,1,1);
        test(1,Long.MAX_VALUE - 1,Integer.MAX_VALUE+1L,1,1);
        test(1,Long.MAX_VALUE - 1,Integer.MAX_VALUE+2L,1,1);
        test(1,Long.MAX_VALUE - 1,Long.MAX_VALUE - 2,1,1);
        test(1,Long.MAX_VALUE - 1,Long.MAX_VALUE - 1,1,1);
        test(1,Long.MAX_VALUE - 1,Long.MAX_VALUE,1,2);

        //1 floor house with Long.MAX_VALUE flat on the floor
        test("1",Long.MAX_VALUE+"","1","1","1");
        test("1",Long.MAX_VALUE+"","2","1","1");
        test("1",Long.MAX_VALUE+"",Integer.MAX_VALUE+"","1","1");
        test("1",Long.MAX_VALUE+"","2147483648","1","1");
        test("1",Long.MAX_VALUE+"","2147483649","1","1");
        test("1",Long.MAX_VALUE+"",Long.MAX_VALUE - 1+"","1","1");
        test("1",Long.MAX_VALUE+"",Long.MAX_VALUE +"","1","1");
        test("1",Long.MAX_VALUE+"","9223372036854775808","1","2");

        //1 floor house with Long.MAX_VALUE +1 flat on the floor
        test("1","9223372036854775808","1","1","1");
        test("1","9223372036854775808","2","1","1");
        test("1","9223372036854775808",Integer.MAX_VALUE+"","1","1");
        test("1","9223372036854775808","2147483648","1","1");
        test("1","9223372036854775808","2147483649","1","1");
        test("1","9223372036854775808",Long.MAX_VALUE - 1+"","1","1");
        test("1","9223372036854775808",Long.MAX_VALUE +"","1","1");
        test("1","9223372036854775808","9223372036854775808","1","1");

        //2 floor house with 1 flat on the floor
        test(2,1,1,1,1);
        test(2,1,2,2,1);
        test(2,1,Integer.MAX_VALUE - 1,2,1073741823);
        test(2,1,Integer.MAX_VALUE,1,1073741824);
        test(2,1,Integer.MAX_VALUE +1L,2,1073741824);
        test(2,1,Long.MAX_VALUE - 1,2,4611686018427387903L);
        test(2,1,Long.MAX_VALUE,1,4611686018427387904L);
        test("2","1","9223372036854775808","2","4611686018427387904");

        //2 floor house with 2 flat on the floor
        test(2,2,1,1,1);
        test(2,2,2,1,1);
        test(2,2,Integer.MAX_VALUE - 1,1,536870912);
        test(2,2,Integer.MAX_VALUE,2,536870912);
        test(2,2,Integer.MAX_VALUE +1L,2,536870912);
        test(2,2,Long.MAX_VALUE - 1,1,2305843009213693952L);
        test(2,2,Long.MAX_VALUE,2,2305843009213693952L);
        test("2","2","9223372036854775808","2","2305843009213693952");

        //2 floor house with Integer.MAX_VALUE -1 flat on the floor
        test(2,Integer.MAX_VALUE -1,1,1,1);
        test(2,Integer.MAX_VALUE -1,2,1,1);
        test(2,Integer.MAX_VALUE -1,Integer.MAX_VALUE - 1,1,1);
        test(2,Integer.MAX_VALUE -1,Integer.MAX_VALUE,2,1);
        test(2,Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,2,1);
        test(2,Integer.MAX_VALUE -1,Long.MAX_VALUE - 1,1,2147483651L);
        test(2,Integer.MAX_VALUE -1,Long.MAX_VALUE,1,2147483651L);
        test("2",Integer.MAX_VALUE -1 +"","9223372036854775808","1","2147483651");

        //2 floor house with Integer.MAX_VALUE flat on the floor
        test(2,Integer.MAX_VALUE,1,1,1);
        test(2,Integer.MAX_VALUE,2,1,1);
        test(2,Integer.MAX_VALUE,Integer.MAX_VALUE - 1,1,1);
        test(2,Integer.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(2,Integer.MAX_VALUE,Integer.MAX_VALUE +1L,2,1);
        test(2,Integer.MAX_VALUE,Long.MAX_VALUE - 1,2,2147483649L);
        test(2,Integer.MAX_VALUE,Long.MAX_VALUE,1,2147483650L);
        test("2",Integer.MAX_VALUE +"","9223372036854775808","1","2147483650");

        //2 floor house with Integer.MAX_VALUE +1 flat on the floor
        test(2,Integer.MAX_VALUE +1L,1,1,1);
        test(2,Integer.MAX_VALUE +1L,2,1,1);
        test(2,Integer.MAX_VALUE +1L,Integer.MAX_VALUE,1,1);
        test(2,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,1,1);
        test(2,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,2,1);
        test(2,Integer.MAX_VALUE +1L,Long.MAX_VALUE - 1,2,2147483648L);
        test(2,Integer.MAX_VALUE +1L,Long.MAX_VALUE ,2,2147483648L);
        test("2",Integer.MAX_VALUE +1L+"","9223372036854775808","2","2147483648");
        test("2",Integer.MAX_VALUE +1L+"","9223372036854775809","1","2147483649");

        //2 floor house with Long.MAX_VALUE -1 flat on the floor
        test(2,Long.MAX_VALUE -1,1,1,1);
        test(2,Long.MAX_VALUE -1,2,1,1);
        test(2,Long.MAX_VALUE -1,Integer.MAX_VALUE -1,1,1);
        test(2,Long.MAX_VALUE -1,Integer.MAX_VALUE,1,1);
        test(2,Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,1,1);
        test(2,Long.MAX_VALUE -1,Long.MAX_VALUE - 2,1,1);
        test(2,Long.MAX_VALUE -1,Long.MAX_VALUE - 1,1,1);
        test(2,Long.MAX_VALUE -1,Long.MAX_VALUE,2,1);

        //2 floor house with Long.MAX_VALUE flat on the floor
        test(2,Long.MAX_VALUE,1,1,1);
        test(2,Long.MAX_VALUE,2,1,1);
        test(2,Long.MAX_VALUE,Integer.MAX_VALUE -1,1,1);
        test(2,Long.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(2,Long.MAX_VALUE,Integer.MAX_VALUE +1L,1,1);
        test(2,Long.MAX_VALUE,Long.MAX_VALUE - 1,1,1);
        test(2,Long.MAX_VALUE,Long.MAX_VALUE,1,1);
        test("2",Long.MAX_VALUE +"","9223372036854775808","2","1");

        //2 floor house with Long.MAX_VALUE +1 flat on the floor
        test("2","9223372036854775808","1","1","1");
        test("2","9223372036854775808","2","1","1");
        test("2","9223372036854775808",Integer.MAX_VALUE -1+"","1","1");
        test("2","9223372036854775808",Integer.MAX_VALUE+"","1","1");
        test("2","9223372036854775808",Integer.MAX_VALUE +1L+"","1","1");
        test("2","9223372036854775808",Long.MAX_VALUE+"","1","1");
        test("2","9223372036854775808","9223372036854775809","2","1");

        //Integer.MAX_VALUE -1 floor house with 1 flat on the floor
        test(Integer.MAX_VALUE -1,1,1,1,1);
        test(Integer.MAX_VALUE -1,1,2,2,1);
        test(Integer.MAX_VALUE -1,1,Integer.MAX_VALUE -2,2147483645,1);
        test(Integer.MAX_VALUE -1,1,Integer.MAX_VALUE -1,2147483646,1);
        test(Integer.MAX_VALUE -1,1,Integer.MAX_VALUE,1,2);
        test(Integer.MAX_VALUE -1,1,Long.MAX_VALUE - 1,6,4294967301L);
        test(Integer.MAX_VALUE -1,1,Long.MAX_VALUE,7,4294967301L);
        test(Integer.MAX_VALUE -1+"","1","9223372036854775808","8","4294967301");
        test(Integer.MAX_VALUE -1+"","1","9223372036854775809","9","4294967301");


        //Integer.MAX_VALUE -1 floor house with 2 flat on the floor
        test(Integer.MAX_VALUE -1,2,1,1,1);
        test(Integer.MAX_VALUE -1,2,2,1,1);
        test(Integer.MAX_VALUE -1,2,Integer.MAX_VALUE - 1,1073741823,1);
        test(Integer.MAX_VALUE -1,2,Integer.MAX_VALUE,1073741824,1);
        test(Integer.MAX_VALUE -1,2,Integer.MAX_VALUE +1L,1073741824,1);
        test(Integer.MAX_VALUE -1,2,Long.MAX_VALUE - 1,3,2147483651L);
        test(Integer.MAX_VALUE -1,2,Long.MAX_VALUE,4,2147483651L);
        test(Integer.MAX_VALUE -1 +"","2","9223372036854775808","4","2147483651");

        //Integer.MAX_VALUE -1 floor house with Integer.MAX_VALUE -1 flat on the floor
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE -1,1,1,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE -1,2,1,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE -1,Integer.MAX_VALUE - 1,1,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE -1,Integer.MAX_VALUE,2,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,2,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE -1,Long.MAX_VALUE - 1,9,3);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE -1,Long.MAX_VALUE,9,3);
        test(Integer.MAX_VALUE -1 +"",Integer.MAX_VALUE -1 +"","9223372036854775808","9","3");

        //Integer.MAX_VALUE -1 floor house with Integer.MAX_VALUE flat on the floor
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE,1,1,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE,2,1,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE,Integer.MAX_VALUE - 1,1,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE,Integer.MAX_VALUE +1L,2,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE,Long.MAX_VALUE - 1,6,3);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE,Long.MAX_VALUE,7,3);
        test(Integer.MAX_VALUE -1 +"",Integer.MAX_VALUE +"","9223372036854775808","7","3");

        //Integer.MAX_VALUE -1 floor house with Integer.MAX_VALUE +1 flat on the floor
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,1,1,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,2,1,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,1,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,2,1);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,Long.MAX_VALUE - 1,4,3);
        test(Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,Long.MAX_VALUE ,4,3);
        test(Integer.MAX_VALUE -1 +"",Integer.MAX_VALUE +1L+"","9223372036854775808","4","3");

        //Integer.MAX_VALUE -1 floor house with Long.MAX_VALUE -1 flat on the floor
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE -1,1,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE -1,2,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE -1,Integer.MAX_VALUE -1,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE -1,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE -1,Long.MAX_VALUE - 2,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE -1,Long.MAX_VALUE - 1,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE -1,Long.MAX_VALUE,2,1);

        //Integer.MAX_VALUE -1 floor house with Long.MAX_VALUE flat on the floor
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE,1,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE,2,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE,Integer.MAX_VALUE -1,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE,Integer.MAX_VALUE +1L,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE,Long.MAX_VALUE - 1,1,1);
        test(Integer.MAX_VALUE -1,Long.MAX_VALUE,Long.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE -1+"",Long.MAX_VALUE +"","9223372036854775808","2","1");

        //Integer.MAX_VALUE -1 floor house with Long.MAX_VALUE +1 flat on the floor
        test(Integer.MAX_VALUE -1+"","9223372036854775808","1","1","1");
        test(Integer.MAX_VALUE -1+"","9223372036854775808","2","1","1");
        test(Integer.MAX_VALUE -1+"","9223372036854775808",Integer.MAX_VALUE -1+"","1","1");
        test(Integer.MAX_VALUE -1+"","9223372036854775808",Integer.MAX_VALUE+"","1","1");
        test(Integer.MAX_VALUE -1+"","9223372036854775808",Integer.MAX_VALUE +1L+"","1","1");
        test(Integer.MAX_VALUE -1+"","9223372036854775808",Long.MAX_VALUE - 1+"","1","1");
        test(Integer.MAX_VALUE -1+"","9223372036854775808",Long.MAX_VALUE+"","1","1");
        test(Integer.MAX_VALUE -1+"","9223372036854775808","9223372036854775808","1","1");

        //Integer.MAX_VALUE floor house with 1 flat on the floor
        test(Integer.MAX_VALUE,1,1,1,1);
        test(Integer.MAX_VALUE,1,2,2,1);
        test(Integer.MAX_VALUE,1,Integer.MAX_VALUE -1,Integer.MAX_VALUE -1,1);
        test(Integer.MAX_VALUE,1,Integer.MAX_VALUE,Integer.MAX_VALUE,1);
        test(Integer.MAX_VALUE,1,Integer.MAX_VALUE +1L,1,2);
        test(Integer.MAX_VALUE,1,Long.MAX_VALUE - 1,Integer.MAX_VALUE,4294967298L);
        test(Integer.MAX_VALUE,1,Long.MAX_VALUE,1,4294967299L);
        test(Integer.MAX_VALUE +"","1","9223372036854775808","2","4294967299");
        test(Integer.MAX_VALUE +"","1","9223372036854775809","3","4294967299");

        //Integer.MAX_VALUE floor house with 2 flat on the floor
        test(Integer.MAX_VALUE,2,1,1,1);
        test(Integer.MAX_VALUE,2,2,1,1);
        test(Integer.MAX_VALUE,2,Integer.MAX_VALUE - 1,1073741823,1);
        test(Integer.MAX_VALUE,2,Integer.MAX_VALUE,1073741824,1);
        test(Integer.MAX_VALUE,2,Integer.MAX_VALUE +1L,1073741824,1);
        test(Integer.MAX_VALUE,2,Long.MAX_VALUE - 1,Integer.MAX_VALUE,2147483649L);
        test(Integer.MAX_VALUE,2,Long.MAX_VALUE,1,2147483650L);
        test(Integer.MAX_VALUE +"","2","9223372036854775808","1","2147483650");

        //Integer.MAX_VALUE floor house with Integer.MAX_VALUE -1 flat on the floor
        test(Integer.MAX_VALUE,Integer.MAX_VALUE -1,1,1,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE -1,2,1,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE -1,Integer.MAX_VALUE - 1,1,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE -1,Integer.MAX_VALUE,2,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,2,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE -1,Long.MAX_VALUE - 1,7,3);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE -1,Long.MAX_VALUE,7,3);
        test(Integer.MAX_VALUE +"",Integer.MAX_VALUE -1 +"","9223372036854775808","7","3");

        //Integer.MAX_VALUE floor house with Integer.MAX_VALUE flat on the floor
        test(Integer.MAX_VALUE,Integer.MAX_VALUE,1,1,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE,2,1,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE - 1,1,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE +1L,2,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE,Long.MAX_VALUE - 1,4,3);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE,Long.MAX_VALUE,5,3);
        test(Integer.MAX_VALUE +"",Integer.MAX_VALUE +"","9223372036854775808","5","3");

        //Integer.MAX_VALUE floor house with Integer.MAX_VALUE +1 flat on the floor
        test(Integer.MAX_VALUE,Integer.MAX_VALUE +1L,1,1,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE +1L,2,1,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE +1L,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,1,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,2,1);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE +1L,Long.MAX_VALUE - 1,2,3);
        test(Integer.MAX_VALUE,Integer.MAX_VALUE +1L,Long.MAX_VALUE ,2,3);
        test(Integer.MAX_VALUE +"",Integer.MAX_VALUE +1L+"","9223372036854775808","2","3");

        //Integer.MAX_VALUE floor house with Long.MAX_VALUE -1 flat on the floor
        test(Integer.MAX_VALUE,Long.MAX_VALUE -1,1,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE -1,2,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE -1,Integer.MAX_VALUE -1,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE -1,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE -1,Long.MAX_VALUE - 2,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE -1,Long.MAX_VALUE - 1,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE -1,Long.MAX_VALUE,2,1);

        //Integer.MAX_VALUE floor house with Long.MAX_VALUE flat on the floor
        test(Integer.MAX_VALUE,Long.MAX_VALUE,1,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE,2,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE,Integer.MAX_VALUE -1,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE,Integer.MAX_VALUE +1L,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE,Long.MAX_VALUE - 1,1,1);
        test(Integer.MAX_VALUE,Long.MAX_VALUE,Long.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE +"",Long.MAX_VALUE +"","9223372036854775808","2","1");

        //Integer.MAX_VALUE floor house with Long.MAX_VALUE +1 flat on the floor
        test(Integer.MAX_VALUE+"","9223372036854775808","1","1","1");
        test(Integer.MAX_VALUE+"","9223372036854775808","2","1","1");
        test(Integer.MAX_VALUE+"","9223372036854775808",Integer.MAX_VALUE -1+"","1","1");
        test(Integer.MAX_VALUE+"","9223372036854775808",Integer.MAX_VALUE+"","1","1");
        test(Integer.MAX_VALUE+"","9223372036854775808",Integer.MAX_VALUE +1L+"","1","1");
        test(Integer.MAX_VALUE+"","9223372036854775808",Long.MAX_VALUE - 1+"","1","1");
        test(Integer.MAX_VALUE+"","9223372036854775808",Long.MAX_VALUE+"","1","1");
        test(Integer.MAX_VALUE+"","9223372036854775808","9223372036854775808","1","1");

        //Integer.MAX_VALUE +1 floor house with 1 flat on the floor
        test(Integer.MAX_VALUE +1L,1,1,1,1);
        test(Integer.MAX_VALUE +1L,1,2,2,1);
        test(Integer.MAX_VALUE +1L,1,Integer.MAX_VALUE -1,Integer.MAX_VALUE -1,1);
        test(Integer.MAX_VALUE +1L,1,Integer.MAX_VALUE,Integer.MAX_VALUE,1);
        test(Integer.MAX_VALUE +1L,1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,1);
        test(Integer.MAX_VALUE +1L,1,Long.MAX_VALUE - 1,Integer.MAX_VALUE -1,4294967296L);
        test(Integer.MAX_VALUE +1L,1,Long.MAX_VALUE,Integer.MAX_VALUE,4294967296L);
        test(Integer.MAX_VALUE +1L +"","1","9223372036854775808",Integer.MAX_VALUE +1L+"","4294967296");

        //Integer.MAX_VALUE +1 floor house with 2 flat on the floor
        test(Integer.MAX_VALUE +1L,2,1,1,1);
        test(Integer.MAX_VALUE +1L,2,2,1,1);
        test(Integer.MAX_VALUE +1L,2,Integer.MAX_VALUE - 1,1073741823,1);
        test(Integer.MAX_VALUE +1L,2,Integer.MAX_VALUE,1073741824,1);
        test(Integer.MAX_VALUE +1L,2,Integer.MAX_VALUE +1L,1073741824,1);
        test(Integer.MAX_VALUE +1L,2,Long.MAX_VALUE - 1,2147483647L,2147483648L);
        test(Integer.MAX_VALUE +1L,2,Long.MAX_VALUE,2147483648L,2147483648L);
        test(Integer.MAX_VALUE  +1L +"","2","9223372036854775808","2147483648","2147483648");

        //Integer.MAX_VALUE +1 floor house with Integer.MAX_VALUE flat on the floor
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE,1,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE,2,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE,Integer.MAX_VALUE - 1,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE,Integer.MAX_VALUE +1L,2,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE,Long.MAX_VALUE - 1,2,3);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE,Long.MAX_VALUE,3,3);
        test(Integer.MAX_VALUE +1L +"",Integer.MAX_VALUE +"","9223372036854775808","3","3");

        //Integer.MAX_VALUE +1 floor house with Integer.MAX_VALUE +1 flat on the floor
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,1,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,2,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,2,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,Long.MAX_VALUE - 1,2147483648L,2);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,Long.MAX_VALUE ,2147483648L,2);
        test(Integer.MAX_VALUE +1L+"",Integer.MAX_VALUE +1L+"","9223372036854775808","2147483648","2");

        //Integer.MAX_VALUE +1 floor house with Integer.MAX_VALUE +2 flat on the floor
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,1,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,2,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,Integer.MAX_VALUE +1L,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,Integer.MAX_VALUE +2L,1,1);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,Long.MAX_VALUE - 1,2147483646,2);
        test(Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,Long.MAX_VALUE ,2147483647,2);
        test(Integer.MAX_VALUE +1L+"",Integer.MAX_VALUE +2L+"","9223372036854775808","2147483647","2");

        //Integer.MAX_VALUE +1 floor house with Long.MAX_VALUE -1 flat on the floor
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE -1,1,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE -1,2,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE -1,Integer.MAX_VALUE -1,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE -1,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE -1,Long.MAX_VALUE - 2,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE -1,Long.MAX_VALUE - 1,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE -1,Long.MAX_VALUE,2,1);

        //Integer.MAX_VALUE +1 floor house with Long.MAX_VALUE flat on the floor
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE,1,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE,2,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE,Integer.MAX_VALUE -1,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE,Integer.MAX_VALUE +1L,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE,Long.MAX_VALUE - 1,1,1);
        test(Integer.MAX_VALUE +1L,Long.MAX_VALUE,Long.MAX_VALUE,1,1);
        test(Integer.MAX_VALUE +1L +"",Long.MAX_VALUE +"","9223372036854775808","2","1");

        //Integer.MAX_VALUE +1 floor house with Long.MAX_VALUE +1 flat on the floor
        test(Integer.MAX_VALUE+1L+"","9223372036854775808","1","1","1");
        test(Integer.MAX_VALUE+1L+"","9223372036854775808","2","1","1");
        test(Integer.MAX_VALUE+1L+"","9223372036854775808",Integer.MAX_VALUE -1+"","1","1");
        test(Integer.MAX_VALUE+1L+"","9223372036854775808",Integer.MAX_VALUE+"","1","1");
        test(Integer.MAX_VALUE+1L+"","9223372036854775808",Integer.MAX_VALUE +1L+"","1","1");
        test(Integer.MAX_VALUE+1L+"","9223372036854775808",Long.MAX_VALUE - 1+"","1","1");
        test(Integer.MAX_VALUE+1L+"","9223372036854775808",Long.MAX_VALUE+"","1","1");
        test(Integer.MAX_VALUE+1L+"","9223372036854775808","9223372036854775808","1","1");

        //Long.MAX_VALUE -1 floor house with 1 flat on the floor
        test(Long.MAX_VALUE -1,1,1,1,1);
        test(Long.MAX_VALUE -1,1,2,2,1);
        test(Long.MAX_VALUE -1,1,Integer.MAX_VALUE -1,Integer.MAX_VALUE -1,1);
        test(Long.MAX_VALUE -1,1,Integer.MAX_VALUE,Integer.MAX_VALUE,1);
        test(Long.MAX_VALUE -1,1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,1);
        test(Long.MAX_VALUE -1,1,Long.MAX_VALUE - 2,Long.MAX_VALUE -2,1);
        test(Long.MAX_VALUE -1,1,Long.MAX_VALUE - 1,Long.MAX_VALUE -1,1);
        test(Long.MAX_VALUE -1,1,Long.MAX_VALUE,1,2);

        //Long.MAX_VALUE -1 floor house with 2 flat on the floor
        test(Long.MAX_VALUE -1,2,1,1,1);
        test(Long.MAX_VALUE -1,2,2,1,1);
        test(Long.MAX_VALUE -1,2,Integer.MAX_VALUE - 1,1073741823,1);
        test(Long.MAX_VALUE -1,2,Integer.MAX_VALUE,1073741824,1);
        test(Long.MAX_VALUE -1,2,Integer.MAX_VALUE +1L,1073741824,1);
        test(Long.MAX_VALUE -1,2,Long.MAX_VALUE - 2,4611686018427387903L,1);
        test(Long.MAX_VALUE -1,2,Long.MAX_VALUE - 1,4611686018427387903L,1);
        test(Long.MAX_VALUE -1,2,Long.MAX_VALUE,4611686018427387904L,1);

        //Long.MAX_VALUE -1 floor house with Integer.MAX_VALUE -1 flat on the floor
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE -1,1,1,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE -1,2,1,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE -1,Integer.MAX_VALUE - 1,1,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE -1,Integer.MAX_VALUE,2,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,2,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE -1,Long.MAX_VALUE - 1,4294967301L,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE -1,Long.MAX_VALUE - 2,4294967301L,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE -1,Long.MAX_VALUE,4294967301L,1);

        //Long.MAX_VALUE -1 floor house with Integer.MAX_VALUE flat on the floor
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE,1,1,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE,2,1,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE,Integer.MAX_VALUE +1L,2,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE,Integer.MAX_VALUE +2L,2,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE,Long.MAX_VALUE - 1,4294967298L,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE,Long.MAX_VALUE ,4294967299L,1);
        test(Long.MAX_VALUE -1+"",Integer.MAX_VALUE+"","9223372036854775808","4294967299","1");

        //Long.MAX_VALUE -1 floor house with Integer.MAX_VALUE +1 flat on the floor
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,1,1,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,2,1,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE,1,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,1,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,2,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,Long.MAX_VALUE - 1,4294967296L,1);
        test(Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,Long.MAX_VALUE ,4294967296L,1);
        test(Long.MAX_VALUE -1+"",Integer.MAX_VALUE +1L+"","9223372036854775808","4294967296","1");

        //Long.MAX_VALUE -1 floor house with Long.MAX_VALUE -2 flat on the floor
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -2,1,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -2,2,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -2,Integer.MAX_VALUE -1,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -2,Integer.MAX_VALUE,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -2,Integer.MAX_VALUE +1L,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -2,Long.MAX_VALUE - 2,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -2,Long.MAX_VALUE - 1,2,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -2,Long.MAX_VALUE,2,1);

        //Long.MAX_VALUE -1 floor house with Long.MAX_VALUE -1 flat on the floor
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -1,1,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -1,2,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -1,Integer.MAX_VALUE -1,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -1,Integer.MAX_VALUE,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -1,Long.MAX_VALUE - 2,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -1,Long.MAX_VALUE - 1,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE -1,Long.MAX_VALUE,2,1);

        //Long.MAX_VALUE -1 floor house with Long.MAX_VALUE flat on the floor
        test(Long.MAX_VALUE -1,Long.MAX_VALUE,1,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE,2,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE,Integer.MAX_VALUE -1,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE,Integer.MAX_VALUE +1L,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE,Long.MAX_VALUE - 1,1,1);
        test(Long.MAX_VALUE -1,Long.MAX_VALUE,Long.MAX_VALUE,1,1);
        test(Long.MAX_VALUE -1+"",Long.MAX_VALUE+"","9223372036854775808","2","1");


        //Long.MAX_VALUE floor house with 1 flat on the floor
        test(Long.MAX_VALUE,1,1,1,1);
        test(Long.MAX_VALUE,1,2,2,1);
        test(Long.MAX_VALUE,1,Integer.MAX_VALUE -1,Integer.MAX_VALUE -1,1);
        test(Long.MAX_VALUE,1,Integer.MAX_VALUE,Integer.MAX_VALUE,1);
        test(Long.MAX_VALUE,1,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,1);
        test(Long.MAX_VALUE,1,Long.MAX_VALUE -1,Long.MAX_VALUE -1,1);
        test(Long.MAX_VALUE,1,Long.MAX_VALUE,Long.MAX_VALUE,1);
        test(Long.MAX_VALUE+"","1","9223372036854775808","1","2");

        //Long.MAX_VALUE floor house with 2 flat on the floor
        test(Long.MAX_VALUE,2,1,1,1);
        test(Long.MAX_VALUE,2,2,1,1);
        test(Long.MAX_VALUE,2,Integer.MAX_VALUE - 1,1073741823,1);
        test(Long.MAX_VALUE,2,Integer.MAX_VALUE,1073741824,1);
        test(Long.MAX_VALUE,2,Integer.MAX_VALUE +1L,1073741824,1);
        test(Long.MAX_VALUE,2,Long.MAX_VALUE - 1,4611686018427387903L,1);
        test(Long.MAX_VALUE,2,Long.MAX_VALUE,4611686018427387904L,1);
        test(Long.MAX_VALUE +"","2","9223372036854775808","4611686018427387904","1");

        //Long.MAX_VALUE -1 floor house with Integer.MAX_VALUE -1 flat on the floor
        test(Long.MAX_VALUE,Integer.MAX_VALUE -1,1,1,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE -1,2,1,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE -1,Integer.MAX_VALUE - 1,1,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE -1,Integer.MAX_VALUE,2,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE -1,Integer.MAX_VALUE +1L,2,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE -1,Long.MAX_VALUE - 1,4294967301L,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE -1,Long.MAX_VALUE,4294967301L,1);
        test(Long.MAX_VALUE+"",Integer.MAX_VALUE -1+"","9223372036854775808","4294967301","1");

        //Long.MAX_VALUE -1 floor house with Integer.MAX_VALUE flat on the floor
        test(Long.MAX_VALUE,Integer.MAX_VALUE,1,1,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE,2,1,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE +1L,2,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE +2L,2,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE,Long.MAX_VALUE - 1,4294967298L,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE,Long.MAX_VALUE ,4294967299L,1);
        test(Long.MAX_VALUE+"",Integer.MAX_VALUE+"","9223372036854775808","4294967299","1");

        //Long.MAX_VALUE -1 floor house with Integer.MAX_VALUE +1 flat on the floor
        test(Long.MAX_VALUE,Integer.MAX_VALUE +1L,1,1,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE +1L,2,1,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE +1L,Integer.MAX_VALUE,1,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +1L,1,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE +1L,Integer.MAX_VALUE +2L,2,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE +1L,Long.MAX_VALUE - 1,4294967296L,1);
        test(Long.MAX_VALUE,Integer.MAX_VALUE +1L,Long.MAX_VALUE ,4294967296L,1);
        test(Long.MAX_VALUE+"",Integer.MAX_VALUE +1L+"","9223372036854775808","4294967296","1");

        //Long.MAX_VALUE floor house with Long.MAX_VALUE flat on the floor
        test(Long.MAX_VALUE,Long.MAX_VALUE -1,1,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE -1,2,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE -1,Integer.MAX_VALUE -1,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE -1,Integer.MAX_VALUE,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE -1,Integer.MAX_VALUE +1L,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE -1,Long.MAX_VALUE - 2,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE -1,Long.MAX_VALUE - 1,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE -1,Long.MAX_VALUE,2,1);

        //Long.MAX_VALUE floor house with Long.MAX_VALUE flat on the floor
        test(Long.MAX_VALUE,Long.MAX_VALUE,1,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE,2,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE,Integer.MAX_VALUE -1,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE,Integer.MAX_VALUE,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE,Integer.MAX_VALUE +1L,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE,Long.MAX_VALUE,1,1);
        test(Long.MAX_VALUE,Long.MAX_VALUE,Long.MAX_VALUE - 1,1,1);
        test(Long.MAX_VALUE+"",Long.MAX_VALUE+"","9223372036854775808","2","1");

        //Long.MAX_VALUE floor house with Long.MAX_VALUE +1 flat on the floor
        test(Long.MAX_VALUE+"","9223372036854775808","1","1","1");
        test(Long.MAX_VALUE+"","9223372036854775808","2","1","1");
        test(Long.MAX_VALUE+"","9223372036854775808",Integer.MAX_VALUE -1+"","1","1");
        test(Long.MAX_VALUE+"","9223372036854775808",Integer.MAX_VALUE+"","1","1");
        test(Long.MAX_VALUE+"","9223372036854775808",Integer.MAX_VALUE +1L+"","1","1");
        test(Long.MAX_VALUE+"","9223372036854775808",Long.MAX_VALUE - 1+"","1","1");
        test(Long.MAX_VALUE+"","9223372036854775808",Long.MAX_VALUE+"","1","1");
        test(Long.MAX_VALUE+"","9223372036854775808","9223372036854775808","1","1");
    }

    @Test
    public void testInvalidValues(){

        testEx(0,1,1);
        testEx(1,0,1);
        testEx(1,1,0);
        testEx(1,-1,1);
        testEx(-1,1,1);
        testEx(1,1,-1);

        assertThrows(MyException.class,()->calculator.calculate(null,BigInteger.ONE,BigInteger.ONE));
        assertThrows(MyException.class,()->calculator.calculate(BigInteger.ONE,null,BigInteger.ONE));
        assertThrows(MyException.class,()->calculator.calculate(BigInteger.ONE,BigInteger.ONE,null));
        assertThrows(MyException.class,()->calculator.calculate(null,null,null));
    }

    private void test(String floors,String flats, String flatNum,String floor,String enter) throws MyException{

        BigInteger[] result = {new BigInteger(floor),new BigInteger(enter)};
        assertThat(calculator.calculate(new BigInteger(floors),new BigInteger(flats),new BigInteger(flatNum)),is(result));
    }
    private void test(long floors,long flats, long flatNum,long floor,long enter) throws MyException{

        test(floors + "",flats + "",flatNum + "",floor + "",enter + "");
    }

    private void testEx(long floors,long flats, long flatNum){

        assertThrows(MyException.class,()->calculator.calculate(BigInteger.valueOf(floors),BigInteger.valueOf(flats),BigInteger.valueOf(flatNum)));
    }
}