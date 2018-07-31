package tasks_with_tests.calculators;

import tasks_with_tests.exceptions.MyException;

import java.math.BigInteger;

/**
 * Fibonacci number finder.
 * Release program, that will count Fibonacci number by N.
 * Fibonacci chain - each N-member equals sum of (N-1)-member and (N-2)-member.
 * Special conditions:
 * if n = 0 returns 0
 * if n = 1 returns 1
 */
class FibCalculator {

    /**
     * Wrong value messages
     */
    private static final String NULL_AT_PARAMETER = "Null at parameter";
    private static final String VALUE_IS_OVER_MAX = "Value is over max value";
    private static final String NEGATIVE_VALUE = "Negative value";

    /**
     * The max index of Fibonacci chain for the program
     */
    private static final int MAX_VALUE = 10000;

    /**
     * Calculates the Fibonacci number by it index.
     * Fibonacci chain formula: fib(i-1) + fib(i-2)
     * @param n is index of required number
     * @return BigInteger Fibonacci number
     * @throws MyException for illegal value of N (if it less than 0 and bigger than max value)
     */
    BigInteger calculate(BigInteger n) throws MyException{
        if (n==null){
            throw new MyException(NULL_AT_PARAMETER);
        }
        if (n.compareTo(BigInteger.valueOf(MAX_VALUE))>0){
            throw new MyException(VALUE_IS_OVER_MAX);
        }
        if (n.compareTo(BigInteger.ZERO)<0){
            throw new MyException(NEGATIVE_VALUE);
        }

        BigInteger secondNumber = BigInteger.ONE;
        BigInteger fibonacci = BigInteger.ZERO;
        for (BigInteger i = BigInteger.ZERO; i.compareTo(n)<0 ; i=i.add(BigInteger.ONE)) {
            BigInteger firstNumber = fibonacci;
            fibonacci = firstNumber.add(secondNumber);
            secondNumber=firstNumber;
        }
        return fibonacci;
    }
}
