package tasks_with_tests.calculators;

import tasks_with_tests.exceptions.MyException;

import java.math.BigInteger;

/**
 * Flat Position calculator.
 * We know floors count and flat's count at the staircase at apartment house.
 * Identify an enter and a floor by the flat's number.
 * Every enter has the same flat's count.
 */
class FlatPositionCalculator {

    /**
     * Wrong value messages
     */
    private static final String NULL_AT_PARAMETER = "Null at parameter";
    private static final String WRONG_FLOORS = "Wrong floors count";
    private static final String WRONG_FLATS_COUNT = "Wrong flats count";
    private static final String WRONG_FLATS_NUMBER = "Wrong flat's number";

    /**
     *Calculates flat position at floor and enter by given floors count, flats count on the floor and flat number
     * @param floors - floors count at the house
     * @param flats - flats count on the floor
     * @param flatNumber - flat number
     * @return BigInteger[] -  array of results: 0 - current floor; 1 - current enter
     * @throws MyException when some of parameter is null or less than 0
     */
    BigInteger[] calculate(BigInteger floors, BigInteger flats, BigInteger flatNumber) throws MyException{

        if (floors==null||flats==null||flatNumber==null) {
            throw new MyException(NULL_AT_PARAMETER);
        }
        if (floors.compareTo(BigInteger.ZERO)<=0) {
            throw new MyException(WRONG_FLOORS);
        }
        if (flats.compareTo(BigInteger.ZERO)<=0){
            throw new MyException(WRONG_FLATS_COUNT);
        }
        if (flatNumber.compareTo(BigInteger.ZERO)<=0){
            throw new MyException(WRONG_FLATS_NUMBER);
        }
        BigInteger enter = flatNumber.divide(floors.multiply(flats));
        BigInteger tempFlatNumber = flatNumber.mod(floors.multiply(flats));
        if (!tempFlatNumber.equals(BigInteger.ZERO)) {
            enter = enter.add(BigInteger.ONE);
        }
        BigInteger floor = tempFlatNumber.divide(flats);
        if (!tempFlatNumber.mod(flats).equals(BigInteger.ZERO)) {
            floor = floor.add(BigInteger.ONE);
        }
        if (floor.equals(BigInteger.ZERO)) floor = floors;

        return new BigInteger[]{floor,enter};
    }
}
