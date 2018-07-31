package tasks_with_tests.week_day;

import org.junit.Before;
import org.junit.Test;
import tasks_with_tests.exceptions.MyException;

import java.time.DayOfWeek;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;
import static java.time.DayOfWeek.*;
import static java.time.Month.*;

public class WeekDayGetterTest {

    private static final String MONDAY_RUS = "Понедельник";
    private static final String TUESDAY_RUS = "Вторник";
    private static final String WEDNESDAY_RUS = "Среда";
    private static final String THURSDAY_RUS = "Четверг";
    private static final String FRIDAY_RUS = "Пятница";
    private static final String SATURDAY_RUS = "Суббота";
    private static final String SUNDAY_RUS = "Воскресение";
    private WeekDayGetter getter;
    @Before
    public void initTest(){
        getter = new WeekDayGetter();
    }

    @Test()
    public void testValidValues() throws MyException {
        //test MONDAY_RUS n.w.day 1 number
        test(MONDAY,1,JANUARY, MONDAY_RUS);
        test(MONDAY,1,FEBRUARY, THURSDAY_RUS);
        test(MONDAY,1,MARCH, THURSDAY_RUS);
        test(MONDAY,1,APRIL, SUNDAY_RUS);
        test(MONDAY,1,MAY, TUESDAY_RUS);
        test(MONDAY,1,JUNE, FRIDAY_RUS);
        test(MONDAY,1,JULY, SUNDAY_RUS);
        test(MONDAY,1,AUGUST, WEDNESDAY_RUS);
        test(MONDAY,1,SEPTEMBER, SATURDAY_RUS);
        test(MONDAY,1,OCTOBER, MONDAY_RUS);
        test(MONDAY,1,NOVEMBER, THURSDAY_RUS);
        test(MONDAY,1,DECEMBER, SATURDAY_RUS);

        //test MONDAY_RUS n.w.day 2 number
        test(MONDAY,2,JANUARY, TUESDAY_RUS);
        test(MONDAY,2,FEBRUARY, FRIDAY_RUS);
        test(MONDAY,2,MARCH, FRIDAY_RUS);
        test(MONDAY,2,APRIL, MONDAY_RUS);
        test(MONDAY,2,MAY, WEDNESDAY_RUS);
        test(MONDAY,2,JUNE, SATURDAY_RUS);
        test(MONDAY,2,JULY, MONDAY_RUS);
        test(MONDAY,2,AUGUST, THURSDAY_RUS);
        test(MONDAY,2,SEPTEMBER, SUNDAY_RUS);
        test(MONDAY,2,OCTOBER, TUESDAY_RUS);
        test(MONDAY,2,NOVEMBER, FRIDAY_RUS);
        test(MONDAY,2,DECEMBER, SUNDAY_RUS);

        //test 1 n.w.day 15 number
        test(MONDAY,15,JANUARY, MONDAY_RUS);
        test(MONDAY,15,FEBRUARY, THURSDAY_RUS);
        test(MONDAY,15,MARCH, THURSDAY_RUS);
        test(MONDAY,15,APRIL, SUNDAY_RUS);
        test(MONDAY,15,MAY, TUESDAY_RUS);
        test(MONDAY,15,JUNE, FRIDAY_RUS);
        test(MONDAY,15,JULY, SUNDAY_RUS);
        test(MONDAY,15,AUGUST, WEDNESDAY_RUS);
        test(MONDAY,15,SEPTEMBER, SATURDAY_RUS);
        test(MONDAY,15,OCTOBER, MONDAY_RUS);
        test(MONDAY,15,NOVEMBER, THURSDAY_RUS);
        test(MONDAY,15,DECEMBER, SATURDAY_RUS);

        //test 1 n.w.day 27 number
        test(MONDAY,27,JANUARY, SATURDAY_RUS);
        test(MONDAY,27,FEBRUARY, TUESDAY_RUS);
        test(MONDAY,27,MARCH, TUESDAY_RUS);
        test(MONDAY,27,APRIL, FRIDAY_RUS);
        test(MONDAY,27,MAY, SUNDAY_RUS);
        test(MONDAY,27,JUNE, WEDNESDAY_RUS);
        test(MONDAY,27,JULY, FRIDAY_RUS);
        test(MONDAY,27,AUGUST, MONDAY_RUS);
        test(MONDAY,27,SEPTEMBER, THURSDAY_RUS);
        test(MONDAY,27,OCTOBER, SATURDAY_RUS);
        test(MONDAY,27,NOVEMBER, TUESDAY_RUS);
        test(MONDAY,27,DECEMBER, THURSDAY_RUS);

        //test 1 n.w.day 28 number
        test(MONDAY,28,JANUARY, SUNDAY_RUS);
        test(MONDAY,28,FEBRUARY, WEDNESDAY_RUS);
        test(MONDAY,28,MARCH, WEDNESDAY_RUS);
        test(MONDAY,28,APRIL, SATURDAY_RUS);
        test(MONDAY,28,MAY, MONDAY_RUS);
        test(MONDAY,28,JUNE, THURSDAY_RUS);
        test(MONDAY,28,JULY, SATURDAY_RUS);
        test(MONDAY,28,AUGUST, TUESDAY_RUS);
        test(MONDAY,28,SEPTEMBER, FRIDAY_RUS);
        test(MONDAY,28,OCTOBER, SUNDAY_RUS);
        test(MONDAY,28,NOVEMBER, WEDNESDAY_RUS);
        test(MONDAY,28,DECEMBER, FRIDAY_RUS);

        //test 1 n.w.day 29 number
        test(MONDAY,29,JANUARY, MONDAY_RUS);
        test(MONDAY,29,MARCH, THURSDAY_RUS);
        test(MONDAY,29,APRIL, SUNDAY_RUS);
        test(MONDAY,29,MAY, TUESDAY_RUS);
        test(MONDAY,29,JUNE, FRIDAY_RUS);
        test(MONDAY,29,JULY, SUNDAY_RUS);
        test(MONDAY,29,AUGUST, WEDNESDAY_RUS);
        test(MONDAY,29,SEPTEMBER, SATURDAY_RUS);
        test(MONDAY,29,OCTOBER, MONDAY_RUS);
        test(MONDAY,29,NOVEMBER, THURSDAY_RUS);
        test(MONDAY,29,DECEMBER, SATURDAY_RUS);

        //test 1 n.w.day 30 number
        test(MONDAY,30,JANUARY, TUESDAY_RUS);
        test(MONDAY,30,MARCH, FRIDAY_RUS);
        test(MONDAY,30,APRIL, MONDAY_RUS);
        test(MONDAY,30,MAY, WEDNESDAY_RUS);
        test(MONDAY,30,JUNE, SATURDAY_RUS);
        test(MONDAY,30,JULY, MONDAY_RUS);
        test(MONDAY,30,AUGUST, THURSDAY_RUS);
        test(MONDAY,30,SEPTEMBER, SUNDAY_RUS);
        test(MONDAY,30,OCTOBER, TUESDAY_RUS);
        test(MONDAY,30,NOVEMBER, FRIDAY_RUS);
        test(MONDAY,30,DECEMBER, SUNDAY_RUS);

        //test 1 n.w.day 31 number
        test(MONDAY,31,JANUARY, WEDNESDAY_RUS);
        test(MONDAY,31,MARCH, SATURDAY_RUS);
        test(MONDAY,31,MAY, THURSDAY_RUS);
        test(MONDAY,31,JULY, TUESDAY_RUS);
        test(MONDAY,31,AUGUST, FRIDAY_RUS);
        test(MONDAY,31,OCTOBER, WEDNESDAY_RUS);
        test(MONDAY,31,DECEMBER, MONDAY_RUS);

        //test 2 n.w.day 1 number
        test(TUESDAY,1,JANUARY, TUESDAY_RUS);
        test(TUESDAY,1,FEBRUARY, FRIDAY_RUS);
        test(TUESDAY,1,MARCH, FRIDAY_RUS);
        test(TUESDAY,1,APRIL, MONDAY_RUS);
        test(TUESDAY,1,MAY, WEDNESDAY_RUS);
        test(TUESDAY,1,JUNE, SATURDAY_RUS);
        test(TUESDAY,1,JULY, MONDAY_RUS);
        test(TUESDAY,1,AUGUST, THURSDAY_RUS);
        test(TUESDAY,1,SEPTEMBER, SUNDAY_RUS);
        test(TUESDAY,1,OCTOBER, TUESDAY_RUS);
        test(TUESDAY,1,NOVEMBER, FRIDAY_RUS);
        test(TUESDAY,1,DECEMBER, SUNDAY_RUS);

        //test 2 n.w.day 2 number
        test(TUESDAY,2,JANUARY, WEDNESDAY_RUS);
        test(TUESDAY,2,FEBRUARY, SATURDAY_RUS);
        test(TUESDAY,2,MARCH, SATURDAY_RUS);
        test(TUESDAY,2,APRIL, TUESDAY_RUS);
        test(TUESDAY,2,MAY, THURSDAY_RUS);
        test(TUESDAY,2,JUNE, SUNDAY_RUS);
        test(TUESDAY,2,JULY, TUESDAY_RUS);
        test(TUESDAY,2,AUGUST, FRIDAY_RUS);
        test(TUESDAY,2,SEPTEMBER, MONDAY_RUS);
        test(TUESDAY,2,OCTOBER, WEDNESDAY_RUS);
        test(TUESDAY,2,NOVEMBER, SATURDAY_RUS);
        test(TUESDAY,2,DECEMBER, MONDAY_RUS);

        //test 2 n.w.day 15 number
        test(TUESDAY,15,JANUARY, TUESDAY_RUS);
        test(TUESDAY,15,FEBRUARY, FRIDAY_RUS);
        test(TUESDAY,15,MARCH, FRIDAY_RUS);
        test(TUESDAY,15,APRIL, MONDAY_RUS);
        test(TUESDAY,15,MAY, WEDNESDAY_RUS);
        test(TUESDAY,15,JUNE, SATURDAY_RUS);
        test(TUESDAY,15,JULY, MONDAY_RUS);
        test(TUESDAY,15,AUGUST, THURSDAY_RUS);
        test(TUESDAY,15,SEPTEMBER, SUNDAY_RUS);
        test(TUESDAY,15,OCTOBER, TUESDAY_RUS);
        test(TUESDAY,15,NOVEMBER, FRIDAY_RUS);
        test(TUESDAY,15,DECEMBER, SUNDAY_RUS);

        //test 2 n.w.day 27 number
        test(TUESDAY,27,JANUARY, SUNDAY_RUS);
        test(TUESDAY,27,FEBRUARY, WEDNESDAY_RUS);
        test(TUESDAY,27,MARCH, WEDNESDAY_RUS);
        test(TUESDAY,27,APRIL, SATURDAY_RUS);
        test(TUESDAY,27,MAY, MONDAY_RUS);
        test(TUESDAY,27,JUNE, THURSDAY_RUS);
        test(TUESDAY,27,JULY, SATURDAY_RUS);
        test(TUESDAY,27,AUGUST, TUESDAY_RUS);
        test(TUESDAY,27,SEPTEMBER, FRIDAY_RUS);
        test(TUESDAY,27,OCTOBER, SUNDAY_RUS);
        test(TUESDAY,27,NOVEMBER, WEDNESDAY_RUS);
        test(TUESDAY,27,DECEMBER, FRIDAY_RUS);

        //test 2 n.w.day 28 number
        test(TUESDAY,28,JANUARY, MONDAY_RUS);
        test(TUESDAY,28,FEBRUARY, THURSDAY_RUS);
        test(TUESDAY,28,MARCH, THURSDAY_RUS);
        test(TUESDAY,28,APRIL, SUNDAY_RUS);
        test(TUESDAY,28,MAY, TUESDAY_RUS);
        test(TUESDAY,28,JUNE, FRIDAY_RUS);
        test(TUESDAY,28,JULY, SUNDAY_RUS);
        test(TUESDAY,28,AUGUST, WEDNESDAY_RUS);
        test(TUESDAY,28,SEPTEMBER, SATURDAY_RUS);
        test(TUESDAY,28,OCTOBER, MONDAY_RUS);
        test(TUESDAY,28,NOVEMBER, THURSDAY_RUS);
        test(TUESDAY,28,DECEMBER, SATURDAY_RUS);

        //test 2 n.w.day 29 number
        test(TUESDAY,29,JANUARY, TUESDAY_RUS);
        test(TUESDAY,29,MARCH, FRIDAY_RUS);
        test(TUESDAY,29,APRIL, MONDAY_RUS);
        test(TUESDAY,29,MAY, WEDNESDAY_RUS);
        test(TUESDAY,29,JUNE, SATURDAY_RUS);
        test(TUESDAY,29,JULY, MONDAY_RUS);
        test(TUESDAY,29,AUGUST, THURSDAY_RUS);
        test(TUESDAY,29,SEPTEMBER, SUNDAY_RUS);
        test(TUESDAY,29,OCTOBER, TUESDAY_RUS);
        test(TUESDAY,29,NOVEMBER, FRIDAY_RUS);
        test(TUESDAY,29,DECEMBER, SUNDAY_RUS);

        //test 2 n.w.day 30 number
        test(TUESDAY,30,JANUARY, WEDNESDAY_RUS);
        test(TUESDAY,30,MARCH, SATURDAY_RUS);
        test(TUESDAY,30,APRIL, TUESDAY_RUS);
        test(TUESDAY,30,MAY, THURSDAY_RUS);
        test(TUESDAY,30,JUNE, SUNDAY_RUS);
        test(TUESDAY,30,JULY, TUESDAY_RUS);
        test(TUESDAY,30,AUGUST, FRIDAY_RUS);
        test(TUESDAY,30,SEPTEMBER, MONDAY_RUS);
        test(TUESDAY,30,OCTOBER, WEDNESDAY_RUS);
        test(TUESDAY,30,NOVEMBER, SATURDAY_RUS);
        test(TUESDAY,30,DECEMBER, MONDAY_RUS);

        //test 2 n.w.day 31 number
        test(TUESDAY,31,JANUARY, THURSDAY_RUS);
        test(TUESDAY,31,MARCH, SUNDAY_RUS);
        test(TUESDAY,31,MAY, FRIDAY_RUS);
        test(TUESDAY,31,JULY, WEDNESDAY_RUS);
        test(TUESDAY,31,AUGUST, SATURDAY_RUS);
        test(TUESDAY,31,OCTOBER, THURSDAY_RUS);
        test(TUESDAY,31,DECEMBER, TUESDAY_RUS);

        //test 3 n.w.day 1 number
        test(WEDNESDAY,1,JANUARY, WEDNESDAY_RUS);
        test(WEDNESDAY,1,FEBRUARY, SATURDAY_RUS);
        test(WEDNESDAY,1,MARCH, SATURDAY_RUS);
        test(WEDNESDAY,1,APRIL, TUESDAY_RUS);
        test(WEDNESDAY,1,MAY, THURSDAY_RUS);
        test(WEDNESDAY,1,JUNE, SUNDAY_RUS);
        test(WEDNESDAY,1,JULY, TUESDAY_RUS);
        test(WEDNESDAY,1,AUGUST, FRIDAY_RUS);
        test(WEDNESDAY,1,SEPTEMBER, MONDAY_RUS);
        test(WEDNESDAY,1,OCTOBER, WEDNESDAY_RUS);
        test(WEDNESDAY,1,NOVEMBER, SATURDAY_RUS);
        test(WEDNESDAY,1,DECEMBER, MONDAY_RUS);

        //test 3 n.w.day 2 number
        test(WEDNESDAY,2,JANUARY, THURSDAY_RUS);
        test(WEDNESDAY,2,FEBRUARY, SUNDAY_RUS);
        test(WEDNESDAY,2,MARCH, SUNDAY_RUS);
        test(WEDNESDAY,2,APRIL, WEDNESDAY_RUS);
        test(WEDNESDAY,2,MAY, FRIDAY_RUS);
        test(WEDNESDAY,2,JUNE, MONDAY_RUS);
        test(WEDNESDAY,2,JULY, WEDNESDAY_RUS);
        test(WEDNESDAY,2,AUGUST, SATURDAY_RUS);
        test(WEDNESDAY,2,SEPTEMBER, TUESDAY_RUS);
        test(WEDNESDAY,2,OCTOBER, THURSDAY_RUS);
        test(WEDNESDAY,2,NOVEMBER, SUNDAY_RUS);
        test(WEDNESDAY,2,DECEMBER, TUESDAY_RUS);

        //test 3 n.w.day 15 number
        test(WEDNESDAY,15,JANUARY, WEDNESDAY_RUS);
        test(WEDNESDAY,15,FEBRUARY, SATURDAY_RUS);
        test(WEDNESDAY,15,MARCH, SATURDAY_RUS);
        test(WEDNESDAY,15,APRIL, TUESDAY_RUS);
        test(WEDNESDAY,15,MAY, THURSDAY_RUS);
        test(WEDNESDAY,15,JUNE, SUNDAY_RUS);
        test(WEDNESDAY,15,JULY, TUESDAY_RUS);
        test(WEDNESDAY,15,AUGUST, FRIDAY_RUS);
        test(WEDNESDAY,15,SEPTEMBER, MONDAY_RUS);
        test(WEDNESDAY,15,OCTOBER, WEDNESDAY_RUS);
        test(WEDNESDAY,15,NOVEMBER, SATURDAY_RUS);
        test(WEDNESDAY,15,DECEMBER, MONDAY_RUS);

        //test 3 n.w.day 27 number
        test(WEDNESDAY,27,JANUARY, MONDAY_RUS);
        test(WEDNESDAY,27,FEBRUARY, THURSDAY_RUS);
        test(WEDNESDAY,27,MARCH, THURSDAY_RUS);
        test(WEDNESDAY,27,APRIL, SUNDAY_RUS);
        test(WEDNESDAY,27,MAY, TUESDAY_RUS);
        test(WEDNESDAY,27,JUNE, FRIDAY_RUS);
        test(WEDNESDAY,27,JULY, SUNDAY_RUS);
        test(WEDNESDAY,27,AUGUST, WEDNESDAY_RUS);
        test(WEDNESDAY,27,SEPTEMBER, SATURDAY_RUS);
        test(WEDNESDAY,27,OCTOBER, MONDAY_RUS);
        test(WEDNESDAY,27,NOVEMBER, THURSDAY_RUS);
        test(WEDNESDAY,27,DECEMBER, SATURDAY_RUS);

        //test 3 n.w.day 28 number
        test(WEDNESDAY,28,JANUARY, TUESDAY_RUS);
        test(WEDNESDAY,28,FEBRUARY, FRIDAY_RUS);
        test(WEDNESDAY,28,MARCH, FRIDAY_RUS);
        test(WEDNESDAY,28,APRIL, MONDAY_RUS);
        test(WEDNESDAY,28,MAY, WEDNESDAY_RUS);
        test(WEDNESDAY,28,JUNE, SATURDAY_RUS);
        test(WEDNESDAY,28,JULY, MONDAY_RUS);
        test(WEDNESDAY,28,AUGUST, THURSDAY_RUS);
        test(WEDNESDAY,28,SEPTEMBER, SUNDAY_RUS);
        test(WEDNESDAY,28,OCTOBER, TUESDAY_RUS);
        test(WEDNESDAY,28,NOVEMBER, FRIDAY_RUS);
        test(WEDNESDAY,28,DECEMBER, SUNDAY_RUS);

        //test 3 n.w.day 29 number
        test(WEDNESDAY,29,JANUARY, WEDNESDAY_RUS);
        test(WEDNESDAY,29,MARCH, SATURDAY_RUS);
        test(WEDNESDAY,29,APRIL, TUESDAY_RUS);
        test(WEDNESDAY,29,MAY, THURSDAY_RUS);
        test(WEDNESDAY,29,JUNE, SUNDAY_RUS);
        test(WEDNESDAY,29,JULY, TUESDAY_RUS);
        test(WEDNESDAY,29,AUGUST, FRIDAY_RUS);
        test(WEDNESDAY,29,SEPTEMBER, MONDAY_RUS);
        test(WEDNESDAY,29,OCTOBER, WEDNESDAY_RUS);
        test(WEDNESDAY,29,NOVEMBER, SATURDAY_RUS);
        test(WEDNESDAY,29,DECEMBER, MONDAY_RUS);

        //test 3 n.w.day 30 number
        test(WEDNESDAY,30,JANUARY, THURSDAY_RUS);
        test(WEDNESDAY,30,MARCH, SUNDAY_RUS);
        test(WEDNESDAY,30,APRIL, WEDNESDAY_RUS);
        test(WEDNESDAY,30,MAY, FRIDAY_RUS);
        test(WEDNESDAY,30,JUNE, MONDAY_RUS);
        test(WEDNESDAY,30,JULY, WEDNESDAY_RUS);
        test(WEDNESDAY,30,AUGUST, SATURDAY_RUS);
        test(WEDNESDAY,30,SEPTEMBER, TUESDAY_RUS);
        test(WEDNESDAY,30,OCTOBER, THURSDAY_RUS);
        test(WEDNESDAY,30,NOVEMBER, SUNDAY_RUS);
        test(WEDNESDAY,30,DECEMBER, TUESDAY_RUS);

        //test 3 n.w.day 31 number
        test(WEDNESDAY,31,JANUARY, FRIDAY_RUS);
        test(WEDNESDAY,31,MARCH, MONDAY_RUS);
        test(WEDNESDAY,31,MAY, SATURDAY_RUS);
        test(WEDNESDAY,31,JULY, THURSDAY_RUS);
        test(WEDNESDAY,31,AUGUST, SUNDAY_RUS);
        test(WEDNESDAY,31,OCTOBER, FRIDAY_RUS);
        test(WEDNESDAY,31,DECEMBER, WEDNESDAY_RUS);

        //test 4 n.w.day 1 number
        test(THURSDAY,1,JANUARY, THURSDAY_RUS);
        test(THURSDAY,1,FEBRUARY, SUNDAY_RUS);
        test(THURSDAY,1,MARCH, SUNDAY_RUS);
        test(THURSDAY,1,APRIL, WEDNESDAY_RUS);
        test(THURSDAY,1,MAY, FRIDAY_RUS);
        test(THURSDAY,1,JUNE, MONDAY_RUS);
        test(THURSDAY,1,JULY, WEDNESDAY_RUS);
        test(THURSDAY,1,AUGUST, SATURDAY_RUS);
        test(THURSDAY,1,SEPTEMBER, TUESDAY_RUS);
        test(THURSDAY,1,OCTOBER, THURSDAY_RUS);
        test(THURSDAY,1,NOVEMBER, SUNDAY_RUS);
        test(THURSDAY,1,DECEMBER, TUESDAY_RUS);

        //test 4 n.w.day 2 number
        test(THURSDAY,2,JANUARY, FRIDAY_RUS);
        test(THURSDAY,2,FEBRUARY, MONDAY_RUS);
        test(THURSDAY,2,MARCH, MONDAY_RUS);
        test(THURSDAY,2,APRIL, THURSDAY_RUS);
        test(THURSDAY,2,MAY, SATURDAY_RUS);
        test(THURSDAY,2,JUNE, TUESDAY_RUS);
        test(THURSDAY,2,JULY, THURSDAY_RUS);
        test(THURSDAY,2,AUGUST, SUNDAY_RUS);
        test(THURSDAY,2,SEPTEMBER, WEDNESDAY_RUS);
        test(THURSDAY,2,OCTOBER, FRIDAY_RUS);
        test(THURSDAY,2,NOVEMBER, MONDAY_RUS);
        test(THURSDAY,2,DECEMBER, WEDNESDAY_RUS);

        //test 4 n.w.day 15 number
        test(THURSDAY,15,JANUARY, THURSDAY_RUS);
        test(THURSDAY,15,FEBRUARY, SUNDAY_RUS);
        test(THURSDAY,15,MARCH, SUNDAY_RUS);
        test(THURSDAY,15,APRIL, WEDNESDAY_RUS);
        test(THURSDAY,15,MAY, FRIDAY_RUS);
        test(THURSDAY,15,JUNE, MONDAY_RUS);
        test(THURSDAY,15,JULY, WEDNESDAY_RUS);
        test(THURSDAY,15,AUGUST, SATURDAY_RUS);
        test(THURSDAY,15,SEPTEMBER, TUESDAY_RUS);
        test(THURSDAY,15,OCTOBER, THURSDAY_RUS);
        test(THURSDAY,15,NOVEMBER, SUNDAY_RUS);
        test(THURSDAY,15,DECEMBER, TUESDAY_RUS);

        //test 4 n.w.day 27 number
        test(THURSDAY,27,JANUARY, TUESDAY_RUS);
        test(THURSDAY,27,FEBRUARY, FRIDAY_RUS);
        test(THURSDAY,27,MARCH, FRIDAY_RUS);
        test(THURSDAY,27,APRIL, MONDAY_RUS);
        test(THURSDAY,27,MAY, WEDNESDAY_RUS);
        test(THURSDAY,27,JUNE, SATURDAY_RUS);
        test(THURSDAY,27,JULY, MONDAY_RUS);
        test(THURSDAY,27,AUGUST, THURSDAY_RUS);
        test(THURSDAY,27,SEPTEMBER, SUNDAY_RUS);
        test(THURSDAY,27,OCTOBER, TUESDAY_RUS);
        test(THURSDAY,27,NOVEMBER, FRIDAY_RUS);
        test(THURSDAY,27,DECEMBER, SUNDAY_RUS);

        //test 4 n.w.day 28 number
        test(THURSDAY,28,JANUARY, WEDNESDAY_RUS);
        test(THURSDAY,28,FEBRUARY, SATURDAY_RUS);
        test(THURSDAY,28,MARCH, SATURDAY_RUS);
        test(THURSDAY,28,APRIL, TUESDAY_RUS);
        test(THURSDAY,28,MAY, THURSDAY_RUS);
        test(THURSDAY,28,JUNE, SUNDAY_RUS);
        test(THURSDAY,28,JULY, TUESDAY_RUS);
        test(THURSDAY,28,AUGUST, FRIDAY_RUS);
        test(THURSDAY,28,SEPTEMBER, MONDAY_RUS);
        test(THURSDAY,28,OCTOBER, WEDNESDAY_RUS);
        test(THURSDAY,28,NOVEMBER, SATURDAY_RUS);
        test(THURSDAY,28,DECEMBER, MONDAY_RUS);

        //test 4 n.w.day 29 number
        test(THURSDAY,29,JANUARY, THURSDAY_RUS);
        test(THURSDAY,29,MARCH, SUNDAY_RUS);
        test(THURSDAY,29,APRIL, WEDNESDAY_RUS);
        test(THURSDAY,29,MAY, FRIDAY_RUS);
        test(THURSDAY,29,JUNE, MONDAY_RUS);
        test(THURSDAY,29,JULY, WEDNESDAY_RUS);
        test(THURSDAY,29,AUGUST, SATURDAY_RUS);
        test(THURSDAY,29,SEPTEMBER, TUESDAY_RUS);
        test(THURSDAY,29,OCTOBER, THURSDAY_RUS);
        test(THURSDAY,29,NOVEMBER, SUNDAY_RUS);
        test(THURSDAY,29,DECEMBER, TUESDAY_RUS);

        //test 4 n.w.day 30 number
        test(THURSDAY,30,JANUARY, FRIDAY_RUS);
        test(THURSDAY,30,MARCH, MONDAY_RUS);
        test(THURSDAY,30,APRIL, THURSDAY_RUS);
        test(THURSDAY,30,MAY, SATURDAY_RUS);
        test(THURSDAY,30,JUNE, TUESDAY_RUS);
        test(THURSDAY,30,JULY, THURSDAY_RUS);
        test(THURSDAY,30,AUGUST, SUNDAY_RUS);
        test(THURSDAY,30,SEPTEMBER, WEDNESDAY_RUS);
        test(THURSDAY,30,OCTOBER, FRIDAY_RUS);
        test(THURSDAY,30,NOVEMBER, MONDAY_RUS);
        test(THURSDAY,30,DECEMBER, WEDNESDAY_RUS);

        //test 4 n.w.day 31 number
        test(THURSDAY,31,JANUARY, SATURDAY_RUS);
        test(THURSDAY,31,MARCH, TUESDAY_RUS);
        test(THURSDAY,31,MAY, SUNDAY_RUS);
        test(THURSDAY,31,JULY, FRIDAY_RUS);
        test(THURSDAY,31,AUGUST, MONDAY_RUS);
        test(THURSDAY,31,OCTOBER, SATURDAY_RUS);
        test(THURSDAY,31,DECEMBER, THURSDAY_RUS);

        //test 5 n.w.day 1 number
        test(FRIDAY,1,JANUARY, FRIDAY_RUS);
        test(FRIDAY,1,FEBRUARY, MONDAY_RUS);
        test(FRIDAY,1,MARCH, MONDAY_RUS);
        test(FRIDAY,1,APRIL, THURSDAY_RUS);
        test(FRIDAY,1,MAY, SATURDAY_RUS);
        test(FRIDAY,1,JUNE, TUESDAY_RUS);
        test(FRIDAY,1,JULY, THURSDAY_RUS);
        test(FRIDAY,1,AUGUST, SUNDAY_RUS);
        test(FRIDAY,1,SEPTEMBER, WEDNESDAY_RUS);
        test(FRIDAY,1,OCTOBER, FRIDAY_RUS);
        test(FRIDAY,1,NOVEMBER, MONDAY_RUS);
        test(FRIDAY,1,DECEMBER, WEDNESDAY_RUS);

        //test 5 n.w.day 2 number
        test(FRIDAY,2,JANUARY, SATURDAY_RUS);
        test(FRIDAY,2,FEBRUARY, TUESDAY_RUS);
        test(FRIDAY,2,MARCH, TUESDAY_RUS);
        test(FRIDAY,2,APRIL, FRIDAY_RUS);
        test(FRIDAY,2,MAY, SUNDAY_RUS);
        test(FRIDAY,2,JUNE, WEDNESDAY_RUS);
        test(FRIDAY,2,JULY, FRIDAY_RUS);
        test(FRIDAY,2,AUGUST, MONDAY_RUS);
        test(FRIDAY,2,SEPTEMBER, THURSDAY_RUS);
        test(FRIDAY,2,OCTOBER, SATURDAY_RUS);
        test(FRIDAY,2,NOVEMBER, TUESDAY_RUS);
        test(FRIDAY,2,DECEMBER, THURSDAY_RUS);

        //test 5 n.w.day 15 number
        test(FRIDAY,15,JANUARY, FRIDAY_RUS);
        test(FRIDAY,15,FEBRUARY, MONDAY_RUS);
        test(FRIDAY,15,MARCH, MONDAY_RUS);
        test(FRIDAY,15,APRIL, THURSDAY_RUS);
        test(FRIDAY,15,MAY, SATURDAY_RUS);
        test(FRIDAY,15,JUNE, TUESDAY_RUS);
        test(FRIDAY,15,JULY, THURSDAY_RUS);
        test(FRIDAY,15,AUGUST, SUNDAY_RUS);
        test(FRIDAY,15,SEPTEMBER, WEDNESDAY_RUS);
        test(FRIDAY,15,OCTOBER, FRIDAY_RUS);
        test(FRIDAY,15,NOVEMBER, MONDAY_RUS);
        test(FRIDAY,15,DECEMBER, WEDNESDAY_RUS);

        //test 5 n.w.day 27 number
        test(FRIDAY,27,JANUARY, WEDNESDAY_RUS);
        test(FRIDAY,27,FEBRUARY, SATURDAY_RUS);
        test(FRIDAY,27,MARCH, SATURDAY_RUS);
        test(FRIDAY,27,APRIL, TUESDAY_RUS);
        test(FRIDAY,27,MAY, THURSDAY_RUS);
        test(FRIDAY,27,JUNE, SUNDAY_RUS);
        test(FRIDAY,27,JULY, TUESDAY_RUS);
        test(FRIDAY,27,AUGUST, FRIDAY_RUS);
        test(FRIDAY,27,SEPTEMBER, MONDAY_RUS);
        test(FRIDAY,27,OCTOBER, WEDNESDAY_RUS);
        test(FRIDAY,27,NOVEMBER, SATURDAY_RUS);
        test(FRIDAY,27,DECEMBER, MONDAY_RUS);

        //test 5 n.w.day 28 number
        test(FRIDAY,28,JANUARY, THURSDAY_RUS);
        test(FRIDAY,28,FEBRUARY, SUNDAY_RUS);
        test(FRIDAY,28,MARCH, SUNDAY_RUS);
        test(FRIDAY,28,APRIL, WEDNESDAY_RUS);
        test(FRIDAY,28,MAY, FRIDAY_RUS);
        test(FRIDAY,28,JUNE, MONDAY_RUS);
        test(FRIDAY,28,JULY, WEDNESDAY_RUS);
        test(FRIDAY,28,AUGUST, SATURDAY_RUS);
        test(FRIDAY,28,SEPTEMBER, TUESDAY_RUS);
        test(FRIDAY,28,OCTOBER, THURSDAY_RUS);
        test(FRIDAY,28,NOVEMBER, SUNDAY_RUS);
        test(FRIDAY,28,DECEMBER, TUESDAY_RUS);

        //test 5 n.w.day 29 number
        test(FRIDAY,29,JANUARY, FRIDAY_RUS);
        test(FRIDAY,29,MARCH, MONDAY_RUS);
        test(FRIDAY,29,APRIL, THURSDAY_RUS);
        test(FRIDAY,29,MAY, SATURDAY_RUS);
        test(FRIDAY,29,JUNE, TUESDAY_RUS);
        test(FRIDAY,29,JULY, THURSDAY_RUS);
        test(FRIDAY,29,AUGUST, SUNDAY_RUS);
        test(FRIDAY,29,SEPTEMBER, WEDNESDAY_RUS);
        test(FRIDAY,29,OCTOBER, FRIDAY_RUS);
        test(FRIDAY,29,NOVEMBER, MONDAY_RUS);
        test(FRIDAY,29,DECEMBER, WEDNESDAY_RUS);

        //test 5 n.w.day 30 number
        test(FRIDAY,30,JANUARY, SATURDAY_RUS);
        test(FRIDAY,30,MARCH, TUESDAY_RUS);
        test(FRIDAY,30,APRIL, FRIDAY_RUS);
        test(FRIDAY,30,MAY, SUNDAY_RUS);
        test(FRIDAY,30,JUNE, WEDNESDAY_RUS);
        test(FRIDAY,30,JULY, FRIDAY_RUS);
        test(FRIDAY,30,AUGUST, MONDAY_RUS);
        test(FRIDAY,30,SEPTEMBER, THURSDAY_RUS);
        test(FRIDAY,30,OCTOBER, SATURDAY_RUS);
        test(FRIDAY,30,NOVEMBER, TUESDAY_RUS);
        test(FRIDAY,30,DECEMBER, THURSDAY_RUS);

        //test 5 n.w.day 31 number
        test(FRIDAY,31,JANUARY, SUNDAY_RUS);
        test(FRIDAY,31,MARCH, WEDNESDAY_RUS);
        test(FRIDAY,31,MAY, MONDAY_RUS);
        test(FRIDAY,31,JULY, SATURDAY_RUS);
        test(FRIDAY,31,AUGUST, TUESDAY_RUS);
        test(FRIDAY,31,OCTOBER, SUNDAY_RUS);
        test(FRIDAY,31,DECEMBER, FRIDAY_RUS);

        //test 6 n.w.day 1 number
        test(SATURDAY,1,JANUARY, SATURDAY_RUS);
        test(SATURDAY,1,FEBRUARY, TUESDAY_RUS);
        test(SATURDAY,1,MARCH, TUESDAY_RUS);
        test(SATURDAY,1,APRIL, FRIDAY_RUS);
        test(SATURDAY,1,MAY, SUNDAY_RUS);
        test(SATURDAY,1,JUNE, WEDNESDAY_RUS);
        test(SATURDAY,1,JULY, FRIDAY_RUS);
        test(SATURDAY,1,AUGUST, MONDAY_RUS);
        test(SATURDAY,1,SEPTEMBER, THURSDAY_RUS);
        test(SATURDAY,1,OCTOBER, SATURDAY_RUS);
        test(SATURDAY,1,NOVEMBER, TUESDAY_RUS);
        test(SATURDAY,1,DECEMBER, THURSDAY_RUS);

        //test 6 n.w.day 2 number
        test(SATURDAY,2,JANUARY, SUNDAY_RUS);
        test(SATURDAY,2,FEBRUARY, WEDNESDAY_RUS);
        test(SATURDAY,2,MARCH, WEDNESDAY_RUS);
        test(SATURDAY,2,APRIL, SATURDAY_RUS);
        test(SATURDAY,2,MAY, MONDAY_RUS);
        test(SATURDAY,2,JUNE, THURSDAY_RUS);
        test(SATURDAY,2,JULY, SATURDAY_RUS);
        test(SATURDAY,2,AUGUST, TUESDAY_RUS);
        test(SATURDAY,2,SEPTEMBER, FRIDAY_RUS);
        test(SATURDAY,2,OCTOBER, SUNDAY_RUS);
        test(SATURDAY,2,NOVEMBER, WEDNESDAY_RUS);
        test(SATURDAY,2,DECEMBER, FRIDAY_RUS);

        //test 6 n.w.day 15 number
        test(SATURDAY,15,JANUARY, SATURDAY_RUS);
        test(SATURDAY,15,FEBRUARY, TUESDAY_RUS);
        test(SATURDAY,15,MARCH, TUESDAY_RUS);
        test(SATURDAY,15,APRIL, FRIDAY_RUS);
        test(SATURDAY,15,MAY, SUNDAY_RUS);
        test(SATURDAY,15,JUNE, WEDNESDAY_RUS);
        test(SATURDAY,15,JULY, FRIDAY_RUS);
        test(SATURDAY,15,AUGUST, MONDAY_RUS);
        test(SATURDAY,15,SEPTEMBER, THURSDAY_RUS);
        test(SATURDAY,15,OCTOBER, SATURDAY_RUS);
        test(SATURDAY,15,NOVEMBER, TUESDAY_RUS);
        test(SATURDAY,15,DECEMBER, THURSDAY_RUS);

        //test 6 n.w.day 27 number
        test(SATURDAY,27,JANUARY, THURSDAY_RUS);
        test(SATURDAY,27,FEBRUARY, SUNDAY_RUS);
        test(SATURDAY,27,MARCH, SUNDAY_RUS);
        test(SATURDAY,27,APRIL, WEDNESDAY_RUS);
        test(SATURDAY,27,MAY, FRIDAY_RUS);
        test(SATURDAY,27,JUNE, MONDAY_RUS);
        test(SATURDAY,27,JULY, WEDNESDAY_RUS);
        test(SATURDAY,27,AUGUST, SATURDAY_RUS);
        test(SATURDAY,27,SEPTEMBER, TUESDAY_RUS);
        test(SATURDAY,27,OCTOBER, THURSDAY_RUS);
        test(SATURDAY,27,NOVEMBER, SUNDAY_RUS);
        test(SATURDAY,27,DECEMBER, TUESDAY_RUS);

        //test 6 n.w.day 28 number
        test(SATURDAY,28,JANUARY, FRIDAY_RUS);
        test(SATURDAY,28,FEBRUARY, MONDAY_RUS);
        test(SATURDAY,28,MARCH, MONDAY_RUS);
        test(SATURDAY,28,APRIL, THURSDAY_RUS);
        test(SATURDAY,28,MAY, SATURDAY_RUS);
        test(SATURDAY,28,JUNE, TUESDAY_RUS);
        test(SATURDAY,28,JULY, THURSDAY_RUS);
        test(SATURDAY,28,AUGUST, SUNDAY_RUS);
        test(SATURDAY,28,SEPTEMBER, WEDNESDAY_RUS);
        test(SATURDAY,28,OCTOBER, FRIDAY_RUS);
        test(SATURDAY,28,NOVEMBER, MONDAY_RUS);
        test(SATURDAY,28,DECEMBER, WEDNESDAY_RUS);

        //test 6 n.w.day 29 number
        test(SATURDAY,29,JANUARY, SATURDAY_RUS);
        test(SATURDAY,29,MARCH, TUESDAY_RUS);
        test(SATURDAY,29,APRIL, FRIDAY_RUS);
        test(SATURDAY,29,MAY, SUNDAY_RUS);
        test(SATURDAY,29,JUNE, WEDNESDAY_RUS);
        test(SATURDAY,29,JULY, FRIDAY_RUS);
        test(SATURDAY,29,AUGUST, MONDAY_RUS);
        test(SATURDAY,29,SEPTEMBER, THURSDAY_RUS);
        test(SATURDAY,29,OCTOBER, SATURDAY_RUS);
        test(SATURDAY,29,NOVEMBER, TUESDAY_RUS);
        test(SATURDAY,29,DECEMBER, THURSDAY_RUS);

        //test 6 n.w.day 30 number
        test(SATURDAY,30,JANUARY, SUNDAY_RUS);
        test(SATURDAY,30,MARCH, WEDNESDAY_RUS);
        test(SATURDAY,30,APRIL, SATURDAY_RUS);
        test(SATURDAY,30,MAY, MONDAY_RUS);
        test(SATURDAY,30,JUNE, THURSDAY_RUS);
        test(SATURDAY,30,JULY, SATURDAY_RUS);
        test(SATURDAY,30,AUGUST, TUESDAY_RUS);
        test(SATURDAY,30,SEPTEMBER, FRIDAY_RUS);
        test(SATURDAY,30,OCTOBER, SUNDAY_RUS);
        test(SATURDAY,30,NOVEMBER, WEDNESDAY_RUS);
        test(SATURDAY,30,DECEMBER, FRIDAY_RUS);

        //test 6 n.w.day 31 number
        test(SATURDAY,31,JANUARY, MONDAY_RUS);
        test(SATURDAY,31,MARCH, THURSDAY_RUS);
        test(SATURDAY,31,MAY, TUESDAY_RUS);
        test(SATURDAY,31,JULY, SUNDAY_RUS);
        test(SATURDAY,31,AUGUST, WEDNESDAY_RUS);
        test(SATURDAY,31,OCTOBER, MONDAY_RUS);
        test(SATURDAY,31,DECEMBER, SATURDAY_RUS);

        //test 7 n.w.day 1 number
        test(SUNDAY,1,JANUARY, SUNDAY_RUS);
        test(SUNDAY,1,FEBRUARY, WEDNESDAY_RUS);
        test(SUNDAY,1,MARCH, WEDNESDAY_RUS);
        test(SUNDAY,1,APRIL, SATURDAY_RUS);
        test(SUNDAY,1,MAY, MONDAY_RUS);
        test(SUNDAY,1,JUNE, THURSDAY_RUS);
        test(SUNDAY,1,JULY, SATURDAY_RUS);
        test(SUNDAY,1,AUGUST, TUESDAY_RUS);
        test(SUNDAY,1,SEPTEMBER, FRIDAY_RUS);
        test(SUNDAY,1,OCTOBER, SUNDAY_RUS);
        test(SUNDAY,1,NOVEMBER, WEDNESDAY_RUS);
        test(SUNDAY,1,DECEMBER, FRIDAY_RUS);

        //test 7 n.w.day 2 number
        test(SUNDAY,2,JANUARY, MONDAY_RUS);
        test(SUNDAY,2,FEBRUARY, THURSDAY_RUS);
        test(SUNDAY,2,MARCH, THURSDAY_RUS);
        test(SUNDAY,2,APRIL, SUNDAY_RUS);
        test(SUNDAY,2,MAY, TUESDAY_RUS);
        test(SUNDAY,2,JUNE, FRIDAY_RUS);
        test(SUNDAY,2,JULY, SUNDAY_RUS);
        test(SUNDAY,2,AUGUST, WEDNESDAY_RUS);
        test(SUNDAY,2,SEPTEMBER, SATURDAY_RUS);
        test(SUNDAY,2,OCTOBER, MONDAY_RUS);
        test(SUNDAY,2,NOVEMBER, THURSDAY_RUS);
        test(SUNDAY,2,DECEMBER, SATURDAY_RUS);

        //test 7 n.w.day 15 number
        test(SUNDAY,15,JANUARY, SUNDAY_RUS);
        test(SUNDAY,15,FEBRUARY, WEDNESDAY_RUS);
        test(SUNDAY,15,MARCH, WEDNESDAY_RUS);
        test(SUNDAY,15,APRIL, SATURDAY_RUS);
        test(SUNDAY,15,MAY, MONDAY_RUS);
        test(SUNDAY,15,JUNE, THURSDAY_RUS);
        test(SUNDAY,15,JULY, SATURDAY_RUS);
        test(SUNDAY,15,AUGUST, TUESDAY_RUS);
        test(SUNDAY,15,SEPTEMBER, FRIDAY_RUS);
        test(SUNDAY,15,OCTOBER, SUNDAY_RUS);
        test(SUNDAY,15,NOVEMBER, WEDNESDAY_RUS);
        test(SUNDAY,15,DECEMBER, FRIDAY_RUS);

        //test 7 n.w.day 27 number
        test(SUNDAY,27,JANUARY, FRIDAY_RUS);
        test(SUNDAY,27,FEBRUARY, MONDAY_RUS);
        test(SUNDAY,27,MARCH, MONDAY_RUS);
        test(SUNDAY,27,APRIL, THURSDAY_RUS);
        test(SUNDAY,27,MAY, SATURDAY_RUS);
        test(SUNDAY,27,JUNE, TUESDAY_RUS);
        test(SUNDAY,27,JULY, THURSDAY_RUS);
        test(SUNDAY,27,AUGUST, SUNDAY_RUS);
        test(SUNDAY,27,SEPTEMBER, WEDNESDAY_RUS);
        test(SUNDAY,27,OCTOBER, FRIDAY_RUS);
        test(SUNDAY,27,NOVEMBER, MONDAY_RUS);
        test(SUNDAY,27,DECEMBER, WEDNESDAY_RUS);

        //test 7 n.w.day 28 number
        test(SUNDAY,28,JANUARY, SATURDAY_RUS);
        test(SUNDAY,28,FEBRUARY, TUESDAY_RUS);
        test(SUNDAY,28,MARCH, TUESDAY_RUS);
        test(SUNDAY,28,APRIL, FRIDAY_RUS);
        test(SUNDAY,28,MAY, SUNDAY_RUS);
        test(SUNDAY,28,JUNE, WEDNESDAY_RUS);
        test(SUNDAY,28,JULY, FRIDAY_RUS);
        test(SUNDAY,28,AUGUST, MONDAY_RUS);
        test(SUNDAY,28,SEPTEMBER, THURSDAY_RUS);
        test(SUNDAY,28,OCTOBER, SATURDAY_RUS);
        test(SUNDAY,28,NOVEMBER, TUESDAY_RUS);
        test(SUNDAY,28,DECEMBER, THURSDAY_RUS);

        //test 7 n.w.day 29 number
        test(SUNDAY,29,JANUARY, SUNDAY_RUS);
        test(SUNDAY,29,MARCH, WEDNESDAY_RUS);
        test(SUNDAY,29,APRIL, SATURDAY_RUS);
        test(SUNDAY,29,MAY, MONDAY_RUS);
        test(SUNDAY,29,JUNE, THURSDAY_RUS);
        test(SUNDAY,29,JULY, SATURDAY_RUS);
        test(SUNDAY,29,AUGUST, TUESDAY_RUS);
        test(SUNDAY,29,SEPTEMBER, FRIDAY_RUS);
        test(SUNDAY,29,OCTOBER, SUNDAY_RUS);
        test(SUNDAY,29,NOVEMBER, WEDNESDAY_RUS);
        test(SUNDAY,29,DECEMBER, FRIDAY_RUS);

        //test 7 n.w.day 30 number
        test(SUNDAY,30,JANUARY, MONDAY_RUS);
        test(SUNDAY,30,MARCH, THURSDAY_RUS);
        test(SUNDAY,30,APRIL, SUNDAY_RUS);
        test(SUNDAY,30,MAY, TUESDAY_RUS);
        test(SUNDAY,30,JUNE, FRIDAY_RUS);
        test(SUNDAY,30,JULY, SUNDAY_RUS);
        test(SUNDAY,30,AUGUST, WEDNESDAY_RUS);
        test(SUNDAY,30,SEPTEMBER, SATURDAY_RUS);
        test(SUNDAY,30,OCTOBER, MONDAY_RUS);
        test(SUNDAY,30,NOVEMBER, THURSDAY_RUS);
        test(SUNDAY,30,DECEMBER, SATURDAY_RUS);

        //test 7 n.w.day 31 number
        test(SUNDAY,31,JANUARY, TUESDAY_RUS);
        test(SUNDAY,31,MARCH, FRIDAY_RUS);
        test(SUNDAY,31,MAY, WEDNESDAY_RUS);
        test(SUNDAY,31,JULY, MONDAY_RUS);
        test(SUNDAY,31,AUGUST, THURSDAY_RUS);
        test(SUNDAY,31,OCTOBER, TUESDAY_RUS);
        test(SUNDAY,31,DECEMBER, SUNDAY_RUS);

    }

    @Test
    public void testInvalidValues(){
        //test zero value
        testMyEx(FRIDAY,0,MAY);

        //test negative values
        testMyEx(WEDNESDAY,-1,JANUARY);
        testMyEx(THURSDAY,-2,MARCH);

        //test over values for numbers
        testMyEx(FRIDAY,32,JANUARY);
        testMyEx(SATURDAY,33,JANUARY);
        testMyEx(MONDAY,29,FEBRUARY);
        testMyEx(MONDAY,30,FEBRUARY);
        testMyEx(MONDAY,32,MARCH);
        testMyEx(SATURDAY,31,APRIL);
        testMyEx(SUNDAY,32,APRIL);
        testMyEx(SUNDAY,32,MAY);
        testMyEx(WEDNESDAY,31,JUNE);
        testMyEx(THURSDAY,32,JUNE);
        testMyEx(THURSDAY,32,JULY);
        testMyEx(THURSDAY,32,AUGUST);
        testMyEx(MONDAY,31,SEPTEMBER);
        testMyEx(TUESDAY,32,SEPTEMBER);
        testMyEx(TUESDAY,32,OCTOBER);
        testMyEx(SUNDAY,32,NOVEMBER);
        testMyEx(SUNDAY,31,NOVEMBER);
        testMyEx(SUNDAY,32,DECEMBER);
    }

    private void test(DayOfWeek newYearDay,int number, Month month,String result) throws MyException {
        assertEquals(result,getter.countDaysTillDate(newYearDay,number,month));
    }

    private void testMyEx(DayOfWeek newYearDay,int number, Month month){
        assertThrows(MyException.class,()->getter.countDaysTillDate(newYearDay,number,month));
    }
}