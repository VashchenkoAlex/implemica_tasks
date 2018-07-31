package tasks_with_tests.week_day;

import tasks_with_tests.exceptions.MyException;

import java.time.DayOfWeek;
import java.time.Month;

/**
 * Week Day Finder.
 *Release program that will calculate current day of week by given New Year Day.
 * Just for non leap-year
 */
class WeekDayGetter {

    /**
     * Wrong value messages
     */
    private static final String WRONG_NUMBER = "Wrong number";

    /**
     * The week days names
     */
    private static final String[] WEEK_DAYS = {"Понедельник","Вторник","Среда","Четверг","Пятница","Суббота","Воскресение"};

    /**
     * The max number for February
     */
    private static final int END_OF_FEBRUARY = 28;

    /**
     * The max number for January, March, May, July, August, October and December
     */
    private static final int MAX_MONTH_NUMBER_THIRTY_ONE = 31;

    /**
     * The max number for April, June, September, November
     */
    private static final int MAX_MONTH_NUMBER_THIRTY = 30;

    /**
     * Count the week day number by the given New Year day
     * @param newYearDay - number of given New Year day
     * @param number - number of current month
     * @param month - month's index
     * @return String - Current day of week for the given number
     * @throws MyException when entered illegal month's day for current month
     */
    String countDaysTillDate(DayOfWeek newYearDay, int number, Month month) throws MyException{

        if (number < 1 ||(month == Month.FEBRUARY && number > END_OF_FEBRUARY)
                || number > MAX_MONTH_NUMBER_THIRTY_ONE){
            throw new MyException(WRONG_NUMBER);
        }
        if ((month == Month.APRIL || month == Month.JUNE || month == Month.SEPTEMBER
                || month == Month.NOVEMBER) && number > MAX_MONTH_NUMBER_THIRTY){
            throw new MyException(WRONG_NUMBER);
        }

        int daysTillTheDate = 0;

        for (Month theMonth = Month.JANUARY; theMonth.compareTo(month) < 0; theMonth = theMonth.plus(1)) {
            if (theMonth.equals(Month.FEBRUARY)){
                daysTillTheDate += END_OF_FEBRUARY;
                continue;
            }
            if(theMonth.equals(Month.APRIL) || theMonth.equals(Month.JUNE) ||
                    theMonth.equals(Month.SEPTEMBER) || theMonth.equals(Month.NOVEMBER)){
                daysTillTheDate += MAX_MONTH_NUMBER_THIRTY;
            }
            else {
                daysTillTheDate += MAX_MONTH_NUMBER_THIRTY_ONE;
            }
        }
        daysTillTheDate += number - 1;
        int result = (daysTillTheDate+newYearDay.getValue()) % DayOfWeek.values().length;
        if (result == 0) {
            result = DayOfWeek.values().length;
        }
        return WEEK_DAYS[result-1];
    }
}
