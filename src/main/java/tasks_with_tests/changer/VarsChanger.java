package tasks_with_tests.changer;

import tasks_with_tests.exceptions.MyException;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * We have two whole variables x and y. Release program, that will swap their values without third
 * variable (or array) and without using special operators or functions
 */
public class VarsChanger {

    /**
     * Messages into console
     */
    private static final String FIRST_PART_RESULT_MESSAGE = "After changes first is ";
    private static final String SECOND_PART_RESULT_MESSAGE = " and second is ";
    private static final String NULL_AT_PARAMETER = "Null at parameter";
    private static final String ENTER_FIRST_VALUE = "Enter first value";
    private static final String ENTER_SECOND_VALUE = "Enter second value";
    private static final String WRONG_FIRST_VALUE = "Wrong first value";
    private static final String WRONG_SECOND_VALUE = "Wrong second value";

    /**
     * Runs method {@link #readFromConsole()} and init values for method {@link #swap(BigInteger, BigInteger)}
     * Runs method {@link #swap(BigInteger, BigInteger)} from the class and print result
     */
    public void run(){

        try {
            BigInteger[] values = readFromConsole();
            BigInteger[] result = swap(values[0],values[1]);
            System.out.println(FIRST_PART_RESULT_MESSAGE+result[0]+SECOND_PART_RESULT_MESSAGE+result[1]);
        }catch (MyException ex){
            System.out.println(ex.getMessage());//?
        }
    }

    /**
     * Swaps two BigInteger values
     * @param firstValue - first value
     * @param secondValue - second value
     * @return BigInteger[] - array of swapped values
     * @throws MyException when some of parameter is null
     */
    public BigInteger[] swap(BigInteger firstValue, BigInteger secondValue) throws MyException {

        if (firstValue == null || secondValue == null) {
            throw new MyException(NULL_AT_PARAMETER);
        }
        BigInteger[] result = new BigInteger[2];
        firstValue = firstValue.add(secondValue);
        secondValue = firstValue.subtract(secondValue);
        firstValue = firstValue.subtract(secondValue);
        result[0] = firstValue;
        result[1] = secondValue;
        return result;
    }

    /**
     * Reads two values from console
     * @return BigInteger[] - array of the values
     * @throws MyException if the method throws NumberFormatException
     */
    public BigInteger[] readFromConsole() throws MyException {

        Scanner scanner = new Scanner(System.in);
        BigInteger[] result = new BigInteger[2];

        System.out.println(ENTER_FIRST_VALUE);
        try {
            result[0] = new BigInteger(scanner.nextLine());
        }catch (NumberFormatException ex){
            throw new MyException(WRONG_FIRST_VALUE);
        }
        System.out.println(ENTER_SECOND_VALUE);
        try {
            result[1] = new BigInteger(scanner.nextLine());
        }catch (NumberFormatException ex){
            throw new MyException(WRONG_SECOND_VALUE);
        }
        return result;
    }
}
