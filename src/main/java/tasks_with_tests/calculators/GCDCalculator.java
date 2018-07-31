package tasks_with_tests.calculators;

import tasks_with_tests.exceptions.MyException;

import java.math.BigInteger;

/**
 * Greatest Common Divisor(GCD) Calculator.
 * Find GCD for four numbers. Greatest Common Divisor(GCD) is the greatest number for two or more
 * numbers, each numbers will be divide on that without reminder
 */
class GCDCalculator {

    /**
     * Messages about wrong values into console
     */
    private static final String NULL_AT_PARAMETER = "Null at parameter";
    private static final String ZERO_VALUE = "Zero value";

    /**
     * Calculates max divisor for given 4 parameters
     * @param firstNumber - first given parameter
     * @param secondNumber - second given parameter
     * @param thirdNumber - third given parameter
     * @param fourthNumber - fourth given parameter
     * @return BigInteger - max divisor;
     * @throws MyException when some of parameter is null or 0
     */
    BigInteger calculate(BigInteger firstNumber, BigInteger secondNumber,
                         BigInteger thirdNumber, BigInteger fourthNumber) throws MyException{

        if (firstNumber == null || secondNumber == null ||
                thirdNumber == null || fourthNumber == null) {
            throw new MyException(NULL_AT_PARAMETER);
        }
        if ((firstNumber.compareTo(BigInteger.ZERO) == 0) || (secondNumber.compareTo(BigInteger.ZERO) == 0) ||
                (thirdNumber.compareTo(BigInteger.ZERO) == 0) || (fourthNumber.compareTo(BigInteger.ZERO) == 0)){
            throw new MyException(ZERO_VALUE);
        }
        if (firstNumber.compareTo(BigInteger.ZERO)<0) {
            firstNumber = firstNumber.negate();
        }
        if (secondNumber.compareTo(BigInteger.ZERO)<0) {
            secondNumber = secondNumber.negate();
        }
        if (thirdNumber.compareTo(BigInteger.ZERO)<0) {
            thirdNumber = thirdNumber.negate();
        }
        if (fourthNumber.compareTo(BigInteger.ZERO)<0) {
            fourthNumber = fourthNumber.negate();
        }

        BigInteger result;
        if (firstNumber.equals(secondNumber) && secondNumber.equals(thirdNumber) &&
                thirdNumber.equals(fourthNumber)) {
            result = firstNumber;
        }else {
            BigInteger currentDivisor = firstNumber;
            if (currentDivisor.compareTo(secondNumber)>0){
                currentDivisor = secondNumber;
            }
            if (currentDivisor.compareTo(thirdNumber)>0){
                currentDivisor = thirdNumber;
            }
            if (currentDivisor.compareTo(fourthNumber)>0){
                currentDivisor = fourthNumber;
            }

            BigInteger maxDivisor = BigInteger.ONE;
            for (BigInteger i = BigInteger.ONE; i.compareTo(currentDivisor) <= 0 ; i=i.add(BigInteger.ONE)) {
                if(firstNumber.mod(i).equals(BigInteger.ZERO) && secondNumber.mod(i).equals(BigInteger.ZERO) &&
                        thirdNumber.mod(i).equals(BigInteger.ZERO) && fourthNumber.mod(i).equals(BigInteger.ZERO)){
                    if (maxDivisor.compareTo(i)<0){
                        maxDivisor=i;
                    }
                }
            }
            result = maxDivisor;
        }
        return result;
    }
}
