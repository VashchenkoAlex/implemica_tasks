package tasks_with_tests.week_day;

import org.junit.Before;
import org.junit.Test;
import tasks_with_tests.exceptions.MyException;

import java.time.DayOfWeek;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class WeekDayGetterTest {

    private static final String MONDAY = "Понедельник";
    private static final String TUESDAY = "Вторник";
    private static final String WEDNESDAY = "Среда";
    private static final String THURSDAY = "Четверг";
    private static final String FRIDAY = "Пятница";
    private static final String SATURDAY = "Суббота";
    private static final String SUNDAY = "Воскресение";
    private WeekDayGetter getter;
    @Before
    public void initTest(){
        getter = new WeekDayGetter();
    }

    @Test()
    public void testValidValues() throws MyException {
        //test MONDAY n.w.day 1 number
        test(DayOfWeek.MONDAY,1,Month.JANUARY,MONDAY);
        test(DayOfWeek.MONDAY,1,Month.FEBRUARY,THURSDAY);
        test(DayOfWeek.MONDAY,1,Month.MARCH,THURSDAY);
        test(DayOfWeek.MONDAY,1,Month.APRIL,SUNDAY);
        test(DayOfWeek.MONDAY,1,Month.MAY,TUESDAY);
        test(DayOfWeek.MONDAY,1,Month.JUNE,FRIDAY);
        test(DayOfWeek.MONDAY,1,Month.JULY,SUNDAY);
        test(DayOfWeek.MONDAY,1,Month.AUGUST,WEDNESDAY);
        test(DayOfWeek.MONDAY,1,Month.SEPTEMBER,SATURDAY);
        test(DayOfWeek.MONDAY,1,Month.OCTOBER,MONDAY);
        test(DayOfWeek.MONDAY,1,Month.NOVEMBER,THURSDAY);
        test(DayOfWeek.MONDAY,1,Month.DECEMBER,SATURDAY);

        //test MONDAY n.w.day 2 number
        test(DayOfWeek.MONDAY,2,Month.JANUARY,TUESDAY);
        test(DayOfWeek.MONDAY,2,Month.FEBRUARY,FRIDAY);
        test(DayOfWeek.MONDAY,2,Month.MARCH,FRIDAY);
        test(DayOfWeek.MONDAY,2,Month.APRIL,MONDAY);
        test(DayOfWeek.MONDAY,2,Month.MAY,WEDNESDAY);
        test(DayOfWeek.MONDAY,2,Month.JUNE,SATURDAY);
        test(DayOfWeek.MONDAY,2,Month.JULY,MONDAY);
        test(DayOfWeek.MONDAY,2,Month.AUGUST,THURSDAY);
        test(DayOfWeek.MONDAY,2,Month.SEPTEMBER,SUNDAY);
        test(DayOfWeek.MONDAY,2,Month.OCTOBER,TUESDAY);
        test(DayOfWeek.MONDAY,2,Month.NOVEMBER,FRIDAY);
        test(DayOfWeek.MONDAY,2,Month.DECEMBER,SUNDAY);

        //test 1 n.w.day 15 number
        test(DayOfWeek.MONDAY,15,Month.JANUARY,MONDAY);
        test(DayOfWeek.MONDAY,15,Month.FEBRUARY,THURSDAY);
        test(DayOfWeek.MONDAY,15,Month.MARCH,THURSDAY);
        test(DayOfWeek.MONDAY,15,Month.APRIL,SUNDAY);
        test(DayOfWeek.MONDAY,15,Month.MAY,TUESDAY);
        test(DayOfWeek.MONDAY,15,Month.JUNE,FRIDAY);
        test(DayOfWeek.MONDAY,15,Month.JULY,SUNDAY);
        test(DayOfWeek.MONDAY,15,Month.AUGUST,WEDNESDAY);
        test(DayOfWeek.MONDAY,15,Month.SEPTEMBER,SATURDAY);
        test(DayOfWeek.MONDAY,15,Month.OCTOBER,MONDAY);
        test(DayOfWeek.MONDAY,15,Month.NOVEMBER,THURSDAY);
        test(DayOfWeek.MONDAY,15,Month.DECEMBER,SATURDAY);

        //test 1 n.w.day 27 number
        test(DayOfWeek.MONDAY,27,Month.JANUARY,SATURDAY);
        test(DayOfWeek.MONDAY,27,Month.FEBRUARY,TUESDAY);
        test(DayOfWeek.MONDAY,27,Month.MARCH,TUESDAY);
        test(DayOfWeek.MONDAY,27,Month.APRIL,FRIDAY);
        test(DayOfWeek.MONDAY,27,Month.MAY,SUNDAY);
        test(DayOfWeek.MONDAY,27,Month.JUNE,WEDNESDAY);
        test(DayOfWeek.MONDAY,27,Month.JULY,FRIDAY);
        test(DayOfWeek.MONDAY,27,Month.AUGUST,MONDAY);
        test(DayOfWeek.MONDAY,27,Month.SEPTEMBER,THURSDAY);
        test(DayOfWeek.MONDAY,27,Month.OCTOBER,SATURDAY);
        test(DayOfWeek.MONDAY,27,Month.NOVEMBER,TUESDAY);
        test(DayOfWeek.MONDAY,27,Month.DECEMBER,THURSDAY);

        //test 1 n.w.day 28 number
        test(DayOfWeek.MONDAY,28,Month.JANUARY,SUNDAY);
        test(DayOfWeek.MONDAY,28,Month.FEBRUARY,WEDNESDAY);
        test(DayOfWeek.MONDAY,28,Month.MARCH,WEDNESDAY);
        test(DayOfWeek.MONDAY,28,Month.APRIL,SATURDAY);
        test(DayOfWeek.MONDAY,28,Month.MAY,MONDAY);
        test(DayOfWeek.MONDAY,28,Month.JUNE,THURSDAY);
        test(DayOfWeek.MONDAY,28,Month.JULY,SATURDAY);
        test(DayOfWeek.MONDAY,28,Month.AUGUST,TUESDAY);
        test(DayOfWeek.MONDAY,28,Month.SEPTEMBER,FRIDAY);
        test(DayOfWeek.MONDAY,28,Month.OCTOBER,SUNDAY);
        test(DayOfWeek.MONDAY,28,Month.NOVEMBER,WEDNESDAY);
        test(DayOfWeek.MONDAY,28,Month.DECEMBER,FRIDAY);

        //test 1 n.w.day 29 number
        test(DayOfWeek.MONDAY,29,Month.JANUARY,MONDAY);
        test(DayOfWeek.MONDAY,29,Month.MARCH,THURSDAY);
        test(DayOfWeek.MONDAY,29,Month.APRIL,SUNDAY);
        test(DayOfWeek.MONDAY,29,Month.MAY,TUESDAY);
        test(DayOfWeek.MONDAY,29,Month.JUNE,FRIDAY);
        test(DayOfWeek.MONDAY,29,Month.JULY,SUNDAY);
        test(DayOfWeek.MONDAY,29,Month.AUGUST,WEDNESDAY);
        test(DayOfWeek.MONDAY,29,Month.SEPTEMBER,SATURDAY);
        test(DayOfWeek.MONDAY,29,Month.OCTOBER,MONDAY);
        test(DayOfWeek.MONDAY,29,Month.NOVEMBER,THURSDAY);
        test(DayOfWeek.MONDAY,29,Month.DECEMBER,SATURDAY);

        //test 1 n.w.day 30 number
        test(DayOfWeek.MONDAY,30,Month.JANUARY,TUESDAY);
        test(DayOfWeek.MONDAY,30,Month.MARCH,FRIDAY);
        test(DayOfWeek.MONDAY,30,Month.APRIL,MONDAY);
        test(DayOfWeek.MONDAY,30,Month.MAY,WEDNESDAY);
        test(DayOfWeek.MONDAY,30,Month.JUNE,SATURDAY);
        test(DayOfWeek.MONDAY,30,Month.JULY,MONDAY);
        test(DayOfWeek.MONDAY,30,Month.AUGUST,THURSDAY);
        test(DayOfWeek.MONDAY,30,Month.SEPTEMBER,SUNDAY);
        test(DayOfWeek.MONDAY,30,Month.OCTOBER,TUESDAY);
        test(DayOfWeek.MONDAY,30,Month.NOVEMBER,FRIDAY);
        test(DayOfWeek.MONDAY,30,Month.DECEMBER,SUNDAY);

        //test 1 n.w.day 31 number
        test(DayOfWeek.MONDAY,31,Month.JANUARY,WEDNESDAY);
        test(DayOfWeek.MONDAY,31,Month.MARCH,SATURDAY);
        test(DayOfWeek.MONDAY,31,Month.MAY,THURSDAY);
        test(DayOfWeek.MONDAY,31,Month.JULY,TUESDAY);
        test(DayOfWeek.MONDAY,31,Month.AUGUST,FRIDAY);
        test(DayOfWeek.MONDAY,31,Month.OCTOBER,WEDNESDAY);
        test(DayOfWeek.MONDAY,31,Month.DECEMBER,MONDAY);

        //test 2 n.w.day 1 number
        test(DayOfWeek.TUESDAY,1,Month.JANUARY,TUESDAY);
        test(DayOfWeek.TUESDAY,1,Month.FEBRUARY,FRIDAY);
        test(DayOfWeek.TUESDAY,1,Month.MARCH,FRIDAY);
        test(DayOfWeek.TUESDAY,1,Month.APRIL,MONDAY);
        test(DayOfWeek.TUESDAY,1,Month.MAY,WEDNESDAY);
        test(DayOfWeek.TUESDAY,1,Month.JUNE,SATURDAY);
        test(DayOfWeek.TUESDAY,1,Month.JULY,MONDAY);
        test(DayOfWeek.TUESDAY,1,Month.AUGUST,THURSDAY);
        test(DayOfWeek.TUESDAY,1,Month.SEPTEMBER,SUNDAY);
        test(DayOfWeek.TUESDAY,1,Month.OCTOBER,TUESDAY);
        test(DayOfWeek.TUESDAY,1,Month.NOVEMBER,FRIDAY);
        test(DayOfWeek.TUESDAY,1,Month.DECEMBER,SUNDAY);

        //test 2 n.w.day 2 number
        test(DayOfWeek.TUESDAY,2,Month.JANUARY,WEDNESDAY);
        test(DayOfWeek.TUESDAY,2,Month.FEBRUARY,SATURDAY);
        test(DayOfWeek.TUESDAY,2,Month.MARCH,SATURDAY);
        test(DayOfWeek.TUESDAY,2,Month.APRIL,TUESDAY);
        test(DayOfWeek.TUESDAY,2,Month.MAY,THURSDAY);
        test(DayOfWeek.TUESDAY,2,Month.JUNE,SUNDAY);
        test(DayOfWeek.TUESDAY,2,Month.JULY,TUESDAY);
        test(DayOfWeek.TUESDAY,2,Month.AUGUST,FRIDAY);
        test(DayOfWeek.TUESDAY,2,Month.SEPTEMBER,MONDAY);
        test(DayOfWeek.TUESDAY,2,Month.OCTOBER,WEDNESDAY);
        test(DayOfWeek.TUESDAY,2,Month.NOVEMBER,SATURDAY);
        test(DayOfWeek.TUESDAY,2,Month.DECEMBER,MONDAY);

        //test 2 n.w.day 15 number
        test(DayOfWeek.TUESDAY,15,Month.JANUARY,TUESDAY);
        test(DayOfWeek.TUESDAY,15,Month.FEBRUARY,FRIDAY);
        test(DayOfWeek.TUESDAY,15,Month.MARCH,FRIDAY);
        test(DayOfWeek.TUESDAY,15,Month.APRIL,MONDAY);
        test(DayOfWeek.TUESDAY,15,Month.MAY,WEDNESDAY);
        test(DayOfWeek.TUESDAY,15,Month.JUNE,SATURDAY);
        test(DayOfWeek.TUESDAY,15,Month.JULY,MONDAY);
        test(DayOfWeek.TUESDAY,15,Month.AUGUST,THURSDAY);
        test(DayOfWeek.TUESDAY,15,Month.SEPTEMBER,SUNDAY);
        test(DayOfWeek.TUESDAY,15,Month.OCTOBER,TUESDAY);
        test(DayOfWeek.TUESDAY,15,Month.NOVEMBER,FRIDAY);
        test(DayOfWeek.TUESDAY,15,Month.DECEMBER,SUNDAY);

        //test 2 n.w.day 27 number
        test(DayOfWeek.TUESDAY,27,Month.JANUARY,SUNDAY);
        test(DayOfWeek.TUESDAY,27,Month.FEBRUARY,WEDNESDAY);
        test(DayOfWeek.TUESDAY,27,Month.MARCH,WEDNESDAY);
        test(DayOfWeek.TUESDAY,27,Month.APRIL,SATURDAY);
        test(DayOfWeek.TUESDAY,27,Month.MAY,MONDAY);
        test(DayOfWeek.TUESDAY,27,Month.JUNE,THURSDAY);
        test(DayOfWeek.TUESDAY,27,Month.JULY,SATURDAY);
        test(DayOfWeek.TUESDAY,27,Month.AUGUST,TUESDAY);
        test(DayOfWeek.TUESDAY,27,Month.SEPTEMBER,FRIDAY);
        test(DayOfWeek.TUESDAY,27,Month.OCTOBER,SUNDAY);
        test(DayOfWeek.TUESDAY,27,Month.NOVEMBER,WEDNESDAY);
        test(DayOfWeek.TUESDAY,27,Month.DECEMBER,FRIDAY);

        //test 2 n.w.day 28 number
        test(DayOfWeek.TUESDAY,28,Month.JANUARY,MONDAY);
        test(DayOfWeek.TUESDAY,28,Month.FEBRUARY,THURSDAY);
        test(DayOfWeek.TUESDAY,28,Month.MARCH,THURSDAY);
        test(DayOfWeek.TUESDAY,28,Month.APRIL,SUNDAY);
        test(DayOfWeek.TUESDAY,28,Month.MAY,TUESDAY);
        test(DayOfWeek.TUESDAY,28,Month.JUNE,FRIDAY);
        test(DayOfWeek.TUESDAY,28,Month.JULY,SUNDAY);
        test(DayOfWeek.TUESDAY,28,Month.AUGUST,WEDNESDAY);
        test(DayOfWeek.TUESDAY,28,Month.SEPTEMBER,SATURDAY);
        test(DayOfWeek.TUESDAY,28,Month.OCTOBER,MONDAY);
        test(DayOfWeek.TUESDAY,28,Month.NOVEMBER,THURSDAY);
        test(DayOfWeek.TUESDAY,28,Month.DECEMBER,SATURDAY);

        //test 2 n.w.day 29 number
        test(DayOfWeek.TUESDAY,29,Month.JANUARY,TUESDAY);
        test(DayOfWeek.TUESDAY,29,Month.MARCH,FRIDAY);
        test(DayOfWeek.TUESDAY,29,Month.APRIL,MONDAY);
        test(DayOfWeek.TUESDAY,29,Month.MAY,WEDNESDAY);
        test(DayOfWeek.TUESDAY,29,Month.JUNE,SATURDAY);
        test(DayOfWeek.TUESDAY,29,Month.JULY,MONDAY);
        test(DayOfWeek.TUESDAY,29,Month.AUGUST,THURSDAY);
        test(DayOfWeek.TUESDAY,29,Month.SEPTEMBER,SUNDAY);
        test(DayOfWeek.TUESDAY,29,Month.OCTOBER,TUESDAY);
        test(DayOfWeek.TUESDAY,29,Month.NOVEMBER,FRIDAY);
        test(DayOfWeek.TUESDAY,29,Month.DECEMBER,SUNDAY);

        //test 2 n.w.day 30 number
        test(DayOfWeek.TUESDAY,30,Month.JANUARY,WEDNESDAY);
        test(DayOfWeek.TUESDAY,30,Month.MARCH,SATURDAY);
        test(DayOfWeek.TUESDAY,30,Month.APRIL,TUESDAY);
        test(DayOfWeek.TUESDAY,30,Month.MAY,THURSDAY);
        test(DayOfWeek.TUESDAY,30,Month.JUNE,SUNDAY);
        test(DayOfWeek.TUESDAY,30,Month.JULY,TUESDAY);
        test(DayOfWeek.TUESDAY,30,Month.AUGUST,FRIDAY);
        test(DayOfWeek.TUESDAY,30,Month.SEPTEMBER,MONDAY);
        test(DayOfWeek.TUESDAY,30,Month.OCTOBER,WEDNESDAY);
        test(DayOfWeek.TUESDAY,30,Month.NOVEMBER,SATURDAY);
        test(DayOfWeek.TUESDAY,30,Month.DECEMBER,MONDAY);

        //test 2 n.w.day 31 number
        test(DayOfWeek.TUESDAY,31,Month.JANUARY,THURSDAY);
        test(DayOfWeek.TUESDAY,31,Month.MARCH,SUNDAY);
        test(DayOfWeek.TUESDAY,31,Month.MAY,FRIDAY);
        test(DayOfWeek.TUESDAY,31,Month.JULY,WEDNESDAY);
        test(DayOfWeek.TUESDAY,31,Month.AUGUST,SATURDAY);
        test(DayOfWeek.TUESDAY,31,Month.OCTOBER,THURSDAY);
        test(DayOfWeek.TUESDAY,31,Month.DECEMBER,TUESDAY);

        //test 3 n.w.day 1 number
        test(DayOfWeek.WEDNESDAY,1,Month.JANUARY,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,1,Month.FEBRUARY,SATURDAY);
        test(DayOfWeek.WEDNESDAY,1,Month.MARCH,SATURDAY);
        test(DayOfWeek.WEDNESDAY,1,Month.APRIL,TUESDAY);
        test(DayOfWeek.WEDNESDAY,1,Month.MAY,THURSDAY);
        test(DayOfWeek.WEDNESDAY,1,Month.JUNE,SUNDAY);
        test(DayOfWeek.WEDNESDAY,1,Month.JULY,TUESDAY);
        test(DayOfWeek.WEDNESDAY,1,Month.AUGUST,FRIDAY);
        test(DayOfWeek.WEDNESDAY,1,Month.SEPTEMBER,MONDAY);
        test(DayOfWeek.WEDNESDAY,1,Month.OCTOBER,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,1,Month.NOVEMBER,SATURDAY);
        test(DayOfWeek.WEDNESDAY,1,Month.DECEMBER,MONDAY);

        //test 3 n.w.day 2 number
        test(DayOfWeek.WEDNESDAY,2,Month.JANUARY,THURSDAY);
        test(DayOfWeek.WEDNESDAY,2,Month.FEBRUARY,SUNDAY);
        test(DayOfWeek.WEDNESDAY,2,Month.MARCH,SUNDAY);
        test(DayOfWeek.WEDNESDAY,2,Month.APRIL,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,2,Month.MAY,FRIDAY);
        test(DayOfWeek.WEDNESDAY,2,Month.JUNE,MONDAY);
        test(DayOfWeek.WEDNESDAY,2,Month.JULY,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,2,Month.AUGUST,SATURDAY);
        test(DayOfWeek.WEDNESDAY,2,Month.SEPTEMBER,TUESDAY);
        test(DayOfWeek.WEDNESDAY,2,Month.OCTOBER,THURSDAY);
        test(DayOfWeek.WEDNESDAY,2,Month.NOVEMBER,SUNDAY);
        test(DayOfWeek.WEDNESDAY,2,Month.DECEMBER,TUESDAY);

        //test 3 n.w.day 15 number
        test(DayOfWeek.WEDNESDAY,15,Month.JANUARY,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,15,Month.FEBRUARY,SATURDAY);
        test(DayOfWeek.WEDNESDAY,15,Month.MARCH,SATURDAY);
        test(DayOfWeek.WEDNESDAY,15,Month.APRIL,TUESDAY);
        test(DayOfWeek.WEDNESDAY,15,Month.MAY,THURSDAY);
        test(DayOfWeek.WEDNESDAY,15,Month.JUNE,SUNDAY);
        test(DayOfWeek.WEDNESDAY,15,Month.JULY,TUESDAY);
        test(DayOfWeek.WEDNESDAY,15,Month.AUGUST,FRIDAY);
        test(DayOfWeek.WEDNESDAY,15,Month.SEPTEMBER,MONDAY);
        test(DayOfWeek.WEDNESDAY,15,Month.OCTOBER,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,15,Month.NOVEMBER,SATURDAY);
        test(DayOfWeek.WEDNESDAY,15,Month.DECEMBER,MONDAY);

        //test 3 n.w.day 27 number
        test(DayOfWeek.WEDNESDAY,27,Month.JANUARY,MONDAY);
        test(DayOfWeek.WEDNESDAY,27,Month.FEBRUARY,THURSDAY);
        test(DayOfWeek.WEDNESDAY,27,Month.MARCH,THURSDAY);
        test(DayOfWeek.WEDNESDAY,27,Month.APRIL,SUNDAY);
        test(DayOfWeek.WEDNESDAY,27,Month.MAY,TUESDAY);
        test(DayOfWeek.WEDNESDAY,27,Month.JUNE,FRIDAY);
        test(DayOfWeek.WEDNESDAY,27,Month.JULY,SUNDAY);
        test(DayOfWeek.WEDNESDAY,27,Month.AUGUST,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,27,Month.SEPTEMBER,SATURDAY);
        test(DayOfWeek.WEDNESDAY,27,Month.OCTOBER,MONDAY);
        test(DayOfWeek.WEDNESDAY,27,Month.NOVEMBER,THURSDAY);
        test(DayOfWeek.WEDNESDAY,27,Month.DECEMBER,SATURDAY);

        //test 3 n.w.day 28 number
        test(DayOfWeek.WEDNESDAY,28,Month.JANUARY,TUESDAY);
        test(DayOfWeek.WEDNESDAY,28,Month.FEBRUARY,FRIDAY);
        test(DayOfWeek.WEDNESDAY,28,Month.MARCH,FRIDAY);
        test(DayOfWeek.WEDNESDAY,28,Month.APRIL,MONDAY);
        test(DayOfWeek.WEDNESDAY,28,Month.MAY,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,28,Month.JUNE,SATURDAY);
        test(DayOfWeek.WEDNESDAY,28,Month.JULY,MONDAY);
        test(DayOfWeek.WEDNESDAY,28,Month.AUGUST,THURSDAY);
        test(DayOfWeek.WEDNESDAY,28,Month.SEPTEMBER,SUNDAY);
        test(DayOfWeek.WEDNESDAY,28,Month.OCTOBER,TUESDAY);
        test(DayOfWeek.WEDNESDAY,28,Month.NOVEMBER,FRIDAY);
        test(DayOfWeek.WEDNESDAY,28,Month.DECEMBER,SUNDAY);

        //test 3 n.w.day 29 number
        test(DayOfWeek.WEDNESDAY,29,Month.JANUARY,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,29,Month.MARCH,SATURDAY);
        test(DayOfWeek.WEDNESDAY,29,Month.APRIL,TUESDAY);
        test(DayOfWeek.WEDNESDAY,29,Month.MAY,THURSDAY);
        test(DayOfWeek.WEDNESDAY,29,Month.JUNE,SUNDAY);
        test(DayOfWeek.WEDNESDAY,29,Month.JULY,TUESDAY);
        test(DayOfWeek.WEDNESDAY,29,Month.AUGUST,FRIDAY);
        test(DayOfWeek.WEDNESDAY,29,Month.SEPTEMBER,MONDAY);
        test(DayOfWeek.WEDNESDAY,29,Month.OCTOBER,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,29,Month.NOVEMBER,SATURDAY);
        test(DayOfWeek.WEDNESDAY,29,Month.DECEMBER,MONDAY);

        //test 3 n.w.day 30 number
        test(DayOfWeek.WEDNESDAY,30,Month.JANUARY,THURSDAY);
        test(DayOfWeek.WEDNESDAY,30,Month.MARCH,SUNDAY);
        test(DayOfWeek.WEDNESDAY,30,Month.APRIL,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,30,Month.MAY,FRIDAY);
        test(DayOfWeek.WEDNESDAY,30,Month.JUNE,MONDAY);
        test(DayOfWeek.WEDNESDAY,30,Month.JULY,WEDNESDAY);
        test(DayOfWeek.WEDNESDAY,30,Month.AUGUST,SATURDAY);
        test(DayOfWeek.WEDNESDAY,30,Month.SEPTEMBER,TUESDAY);
        test(DayOfWeek.WEDNESDAY,30,Month.OCTOBER,THURSDAY);
        test(DayOfWeek.WEDNESDAY,30,Month.NOVEMBER,SUNDAY);
        test(DayOfWeek.WEDNESDAY,30,Month.DECEMBER,TUESDAY);

        //test 3 n.w.day 31 number
        test(DayOfWeek.WEDNESDAY,31,Month.JANUARY,FRIDAY);
        test(DayOfWeek.WEDNESDAY,31,Month.MARCH,MONDAY);
        test(DayOfWeek.WEDNESDAY,31,Month.MAY,SATURDAY);
        test(DayOfWeek.WEDNESDAY,31,Month.JULY,THURSDAY);
        test(DayOfWeek.WEDNESDAY,31,Month.AUGUST,SUNDAY);
        test(DayOfWeek.WEDNESDAY,31,Month.OCTOBER,FRIDAY);
        test(DayOfWeek.WEDNESDAY,31,Month.DECEMBER,WEDNESDAY);

        //test 4 n.w.day 1 number
        test(DayOfWeek.THURSDAY,1,Month.JANUARY,THURSDAY);
        test(DayOfWeek.THURSDAY,1,Month.FEBRUARY,SUNDAY);
        test(DayOfWeek.THURSDAY,1,Month.MARCH,SUNDAY);
        test(DayOfWeek.THURSDAY,1,Month.APRIL,WEDNESDAY);
        test(DayOfWeek.THURSDAY,1,Month.MAY,FRIDAY);
        test(DayOfWeek.THURSDAY,1,Month.JUNE,MONDAY);
        test(DayOfWeek.THURSDAY,1,Month.JULY,WEDNESDAY);
        test(DayOfWeek.THURSDAY,1,Month.AUGUST,SATURDAY);
        test(DayOfWeek.THURSDAY,1,Month.SEPTEMBER,TUESDAY);
        test(DayOfWeek.THURSDAY,1,Month.OCTOBER,THURSDAY);
        test(DayOfWeek.THURSDAY,1,Month.NOVEMBER,SUNDAY);
        test(DayOfWeek.THURSDAY,1,Month.DECEMBER,TUESDAY);

        //test 4 n.w.day 2 number
        test(DayOfWeek.THURSDAY,2,Month.JANUARY,FRIDAY);
        test(DayOfWeek.THURSDAY,2,Month.FEBRUARY,MONDAY);
        test(DayOfWeek.THURSDAY,2,Month.MARCH,MONDAY);
        test(DayOfWeek.THURSDAY,2,Month.APRIL,THURSDAY);
        test(DayOfWeek.THURSDAY,2,Month.MAY,SATURDAY);
        test(DayOfWeek.THURSDAY,2,Month.JUNE,TUESDAY);
        test(DayOfWeek.THURSDAY,2,Month.JULY,THURSDAY);
        test(DayOfWeek.THURSDAY,2,Month.AUGUST,SUNDAY);
        test(DayOfWeek.THURSDAY,2,Month.SEPTEMBER,WEDNESDAY);
        test(DayOfWeek.THURSDAY,2,Month.OCTOBER,FRIDAY);
        test(DayOfWeek.THURSDAY,2,Month.NOVEMBER,MONDAY);
        test(DayOfWeek.THURSDAY,2,Month.DECEMBER,WEDNESDAY);

        //test 4 n.w.day 15 number
        test(DayOfWeek.THURSDAY,15,Month.JANUARY,THURSDAY);
        test(DayOfWeek.THURSDAY,15,Month.FEBRUARY,SUNDAY);
        test(DayOfWeek.THURSDAY,15,Month.MARCH,SUNDAY);
        test(DayOfWeek.THURSDAY,15,Month.APRIL,WEDNESDAY);
        test(DayOfWeek.THURSDAY,15,Month.MAY,FRIDAY);
        test(DayOfWeek.THURSDAY,15,Month.JUNE,MONDAY);
        test(DayOfWeek.THURSDAY,15,Month.JULY,WEDNESDAY);
        test(DayOfWeek.THURSDAY,15,Month.AUGUST,SATURDAY);
        test(DayOfWeek.THURSDAY,15,Month.SEPTEMBER,TUESDAY);
        test(DayOfWeek.THURSDAY,15,Month.OCTOBER,THURSDAY);
        test(DayOfWeek.THURSDAY,15,Month.NOVEMBER,SUNDAY);
        test(DayOfWeek.THURSDAY,15,Month.DECEMBER,TUESDAY);

        //test 4 n.w.day 27 number
        test(DayOfWeek.THURSDAY,27,Month.JANUARY,TUESDAY);
        test(DayOfWeek.THURSDAY,27,Month.FEBRUARY,FRIDAY);
        test(DayOfWeek.THURSDAY,27,Month.MARCH,FRIDAY);
        test(DayOfWeek.THURSDAY,27,Month.APRIL,MONDAY);
        test(DayOfWeek.THURSDAY,27,Month.MAY,WEDNESDAY);
        test(DayOfWeek.THURSDAY,27,Month.JUNE,SATURDAY);
        test(DayOfWeek.THURSDAY,27,Month.JULY,MONDAY);
        test(DayOfWeek.THURSDAY,27,Month.AUGUST,THURSDAY);
        test(DayOfWeek.THURSDAY,27,Month.SEPTEMBER,SUNDAY);
        test(DayOfWeek.THURSDAY,27,Month.OCTOBER,TUESDAY);
        test(DayOfWeek.THURSDAY,27,Month.NOVEMBER,FRIDAY);
        test(DayOfWeek.THURSDAY,27,Month.DECEMBER,SUNDAY);

        //test 4 n.w.day 28 number
        test(DayOfWeek.THURSDAY,28,Month.JANUARY,WEDNESDAY);
        test(DayOfWeek.THURSDAY,28,Month.FEBRUARY,SATURDAY);
        test(DayOfWeek.THURSDAY,28,Month.MARCH,SATURDAY);
        test(DayOfWeek.THURSDAY,28,Month.APRIL,TUESDAY);
        test(DayOfWeek.THURSDAY,28,Month.MAY,THURSDAY);
        test(DayOfWeek.THURSDAY,28,Month.JUNE,SUNDAY);
        test(DayOfWeek.THURSDAY,28,Month.JULY,TUESDAY);
        test(DayOfWeek.THURSDAY,28,Month.AUGUST,FRIDAY);
        test(DayOfWeek.THURSDAY,28,Month.SEPTEMBER,MONDAY);
        test(DayOfWeek.THURSDAY,28,Month.OCTOBER,WEDNESDAY);
        test(DayOfWeek.THURSDAY,28,Month.NOVEMBER,SATURDAY);
        test(DayOfWeek.THURSDAY,28,Month.DECEMBER,MONDAY);

        //test 4 n.w.day 29 number
        test(DayOfWeek.THURSDAY,29,Month.JANUARY,THURSDAY);
        test(DayOfWeek.THURSDAY,29,Month.MARCH,SUNDAY);
        test(DayOfWeek.THURSDAY,29,Month.APRIL,WEDNESDAY);
        test(DayOfWeek.THURSDAY,29,Month.MAY,FRIDAY);
        test(DayOfWeek.THURSDAY,29,Month.JUNE,MONDAY);
        test(DayOfWeek.THURSDAY,29,Month.JULY,WEDNESDAY);
        test(DayOfWeek.THURSDAY,29,Month.AUGUST,SATURDAY);
        test(DayOfWeek.THURSDAY,29,Month.SEPTEMBER,TUESDAY);
        test(DayOfWeek.THURSDAY,29,Month.OCTOBER,THURSDAY);
        test(DayOfWeek.THURSDAY,29,Month.NOVEMBER,SUNDAY);
        test(DayOfWeek.THURSDAY,29,Month.DECEMBER,TUESDAY);

        //test 4 n.w.day 30 number
        test(DayOfWeek.THURSDAY,30,Month.JANUARY,FRIDAY);
        test(DayOfWeek.THURSDAY,30,Month.MARCH,MONDAY);
        test(DayOfWeek.THURSDAY,30,Month.APRIL,THURSDAY);
        test(DayOfWeek.THURSDAY,30,Month.MAY,SATURDAY);
        test(DayOfWeek.THURSDAY,30,Month.JUNE,TUESDAY);
        test(DayOfWeek.THURSDAY,30,Month.JULY,THURSDAY);
        test(DayOfWeek.THURSDAY,30,Month.AUGUST,SUNDAY);
        test(DayOfWeek.THURSDAY,30,Month.SEPTEMBER,WEDNESDAY);
        test(DayOfWeek.THURSDAY,30,Month.OCTOBER,FRIDAY);
        test(DayOfWeek.THURSDAY,30,Month.NOVEMBER,MONDAY);
        test(DayOfWeek.THURSDAY,30,Month.DECEMBER,WEDNESDAY);

        //test 4 n.w.day 31 number
        test(DayOfWeek.THURSDAY,31,Month.JANUARY,SATURDAY);
        test(DayOfWeek.THURSDAY,31,Month.MARCH,TUESDAY);
        test(DayOfWeek.THURSDAY,31,Month.MAY,SUNDAY);
        test(DayOfWeek.THURSDAY,31,Month.JULY,FRIDAY);
        test(DayOfWeek.THURSDAY,31,Month.AUGUST,MONDAY);
        test(DayOfWeek.THURSDAY,31,Month.OCTOBER,SATURDAY);
        test(DayOfWeek.THURSDAY,31,Month.DECEMBER,THURSDAY);

        //test 5 n.w.day 1 number
        test(DayOfWeek.FRIDAY,1,Month.JANUARY,FRIDAY);
        test(DayOfWeek.FRIDAY,1,Month.FEBRUARY,MONDAY);
        test(DayOfWeek.FRIDAY,1,Month.MARCH,MONDAY);
        test(DayOfWeek.FRIDAY,1,Month.APRIL,THURSDAY);
        test(DayOfWeek.FRIDAY,1,Month.MAY,SATURDAY);
        test(DayOfWeek.FRIDAY,1,Month.JUNE,TUESDAY);
        test(DayOfWeek.FRIDAY,1,Month.JULY,THURSDAY);
        test(DayOfWeek.FRIDAY,1,Month.AUGUST,SUNDAY);
        test(DayOfWeek.FRIDAY,1,Month.SEPTEMBER,WEDNESDAY);
        test(DayOfWeek.FRIDAY,1,Month.OCTOBER,FRIDAY);
        test(DayOfWeek.FRIDAY,1,Month.NOVEMBER,MONDAY);
        test(DayOfWeek.FRIDAY,1,Month.DECEMBER,WEDNESDAY);

        //test 5 n.w.day 2 number
        test(DayOfWeek.FRIDAY,2,Month.JANUARY,SATURDAY);
        test(DayOfWeek.FRIDAY,2,Month.FEBRUARY,TUESDAY);
        test(DayOfWeek.FRIDAY,2,Month.MARCH,TUESDAY);
        test(DayOfWeek.FRIDAY,2,Month.APRIL,FRIDAY);
        test(DayOfWeek.FRIDAY,2,Month.MAY,SUNDAY);
        test(DayOfWeek.FRIDAY,2,Month.JUNE,WEDNESDAY);
        test(DayOfWeek.FRIDAY,2,Month.JULY,FRIDAY);
        test(DayOfWeek.FRIDAY,2,Month.AUGUST,MONDAY);
        test(DayOfWeek.FRIDAY,2,Month.SEPTEMBER,THURSDAY);
        test(DayOfWeek.FRIDAY,2,Month.OCTOBER,SATURDAY);
        test(DayOfWeek.FRIDAY,2,Month.NOVEMBER,TUESDAY);
        test(DayOfWeek.FRIDAY,2,Month.DECEMBER,THURSDAY);

        //test 5 n.w.day 15 number
        test(DayOfWeek.FRIDAY,15,Month.JANUARY,FRIDAY);
        test(DayOfWeek.FRIDAY,15,Month.FEBRUARY,MONDAY);
        test(DayOfWeek.FRIDAY,15,Month.MARCH,MONDAY);
        test(DayOfWeek.FRIDAY,15,Month.APRIL,THURSDAY);
        test(DayOfWeek.FRIDAY,15,Month.MAY,SATURDAY);
        test(DayOfWeek.FRIDAY,15,Month.JUNE,TUESDAY);
        test(DayOfWeek.FRIDAY,15,Month.JULY,THURSDAY);
        test(DayOfWeek.FRIDAY,15,Month.AUGUST,SUNDAY);
        test(DayOfWeek.FRIDAY,15,Month.SEPTEMBER,WEDNESDAY);
        test(DayOfWeek.FRIDAY,15,Month.OCTOBER,FRIDAY);
        test(DayOfWeek.FRIDAY,15,Month.NOVEMBER,MONDAY);
        test(DayOfWeek.FRIDAY,15,Month.DECEMBER,WEDNESDAY);

        //test 5 n.w.day 27 number
        test(DayOfWeek.FRIDAY,27,Month.JANUARY,WEDNESDAY);
        test(DayOfWeek.FRIDAY,27,Month.FEBRUARY,SATURDAY);
        test(DayOfWeek.FRIDAY,27,Month.MARCH,SATURDAY);
        test(DayOfWeek.FRIDAY,27,Month.APRIL,TUESDAY);
        test(DayOfWeek.FRIDAY,27,Month.MAY,THURSDAY);
        test(DayOfWeek.FRIDAY,27,Month.JUNE,SUNDAY);
        test(DayOfWeek.FRIDAY,27,Month.JULY,TUESDAY);
        test(DayOfWeek.FRIDAY,27,Month.AUGUST,FRIDAY);
        test(DayOfWeek.FRIDAY,27,Month.SEPTEMBER,MONDAY);
        test(DayOfWeek.FRIDAY,27,Month.OCTOBER,WEDNESDAY);
        test(DayOfWeek.FRIDAY,27,Month.NOVEMBER,SATURDAY);
        test(DayOfWeek.FRIDAY,27,Month.DECEMBER,MONDAY);

        //test 5 n.w.day 28 number
        test(DayOfWeek.FRIDAY,28,Month.JANUARY,THURSDAY);
        test(DayOfWeek.FRIDAY,28,Month.FEBRUARY,SUNDAY);
        test(DayOfWeek.FRIDAY,28,Month.MARCH,SUNDAY);
        test(DayOfWeek.FRIDAY,28,Month.APRIL,WEDNESDAY);
        test(DayOfWeek.FRIDAY,28,Month.MAY,FRIDAY);
        test(DayOfWeek.FRIDAY,28,Month.JUNE,MONDAY);
        test(DayOfWeek.FRIDAY,28,Month.JULY,WEDNESDAY);
        test(DayOfWeek.FRIDAY,28,Month.AUGUST,SATURDAY);
        test(DayOfWeek.FRIDAY,28,Month.SEPTEMBER,TUESDAY);
        test(DayOfWeek.FRIDAY,28,Month.OCTOBER,THURSDAY);
        test(DayOfWeek.FRIDAY,28,Month.NOVEMBER,SUNDAY);
        test(DayOfWeek.FRIDAY,28,Month.DECEMBER,TUESDAY);

        //test 5 n.w.day 29 number
        test(DayOfWeek.FRIDAY,29,Month.JANUARY,FRIDAY);
        test(DayOfWeek.FRIDAY,29,Month.MARCH,MONDAY);
        test(DayOfWeek.FRIDAY,29,Month.APRIL,THURSDAY);
        test(DayOfWeek.FRIDAY,29,Month.MAY,SATURDAY);
        test(DayOfWeek.FRIDAY,29,Month.JUNE,TUESDAY);
        test(DayOfWeek.FRIDAY,29,Month.JULY,THURSDAY);
        test(DayOfWeek.FRIDAY,29,Month.AUGUST,SUNDAY);
        test(DayOfWeek.FRIDAY,29,Month.SEPTEMBER,WEDNESDAY);
        test(DayOfWeek.FRIDAY,29,Month.OCTOBER,FRIDAY);
        test(DayOfWeek.FRIDAY,29,Month.NOVEMBER,MONDAY);
        test(DayOfWeek.FRIDAY,29,Month.DECEMBER,WEDNESDAY);

        //test 5 n.w.day 30 number
        test(DayOfWeek.FRIDAY,30,Month.JANUARY,SATURDAY);
        test(DayOfWeek.FRIDAY,30,Month.MARCH,TUESDAY);
        test(DayOfWeek.FRIDAY,30,Month.APRIL,FRIDAY);
        test(DayOfWeek.FRIDAY,30,Month.MAY,SUNDAY);
        test(DayOfWeek.FRIDAY,30,Month.JUNE,WEDNESDAY);
        test(DayOfWeek.FRIDAY,30,Month.JULY,FRIDAY);
        test(DayOfWeek.FRIDAY,30,Month.AUGUST,MONDAY);
        test(DayOfWeek.FRIDAY,30,Month.SEPTEMBER,THURSDAY);
        test(DayOfWeek.FRIDAY,30,Month.OCTOBER,SATURDAY);
        test(DayOfWeek.FRIDAY,30,Month.NOVEMBER,TUESDAY);
        test(DayOfWeek.FRIDAY,30,Month.DECEMBER,THURSDAY);

        //test 5 n.w.day 31 number
        test(DayOfWeek.FRIDAY,31,Month.JANUARY,SUNDAY);
        test(DayOfWeek.FRIDAY,31,Month.MARCH,WEDNESDAY);
        test(DayOfWeek.FRIDAY,31,Month.MAY,MONDAY);
        test(DayOfWeek.FRIDAY,31,Month.JULY,SATURDAY);
        test(DayOfWeek.FRIDAY,31,Month.AUGUST,TUESDAY);
        test(DayOfWeek.FRIDAY,31,Month.OCTOBER,SUNDAY);
        test(DayOfWeek.FRIDAY,31,Month.DECEMBER,FRIDAY);

        //test 6 n.w.day 1 number
        test(DayOfWeek.SATURDAY,1,Month.JANUARY,SATURDAY);
        test(DayOfWeek.SATURDAY,1,Month.FEBRUARY,TUESDAY);
        test(DayOfWeek.SATURDAY,1,Month.MARCH,TUESDAY);
        test(DayOfWeek.SATURDAY,1,Month.APRIL,FRIDAY);
        test(DayOfWeek.SATURDAY,1,Month.MAY,SUNDAY);
        test(DayOfWeek.SATURDAY,1,Month.JUNE,WEDNESDAY);
        test(DayOfWeek.SATURDAY,1,Month.JULY,FRIDAY);
        test(DayOfWeek.SATURDAY,1,Month.AUGUST,MONDAY);
        test(DayOfWeek.SATURDAY,1,Month.SEPTEMBER,THURSDAY);
        test(DayOfWeek.SATURDAY,1,Month.OCTOBER,SATURDAY);
        test(DayOfWeek.SATURDAY,1,Month.NOVEMBER,TUESDAY);
        test(DayOfWeek.SATURDAY,1,Month.DECEMBER,THURSDAY);

        //test 6 n.w.day 2 number
        test(DayOfWeek.SATURDAY,2,Month.JANUARY,SUNDAY);
        test(DayOfWeek.SATURDAY,2,Month.FEBRUARY,WEDNESDAY);
        test(DayOfWeek.SATURDAY,2,Month.MARCH,WEDNESDAY);
        test(DayOfWeek.SATURDAY,2,Month.APRIL,SATURDAY);
        test(DayOfWeek.SATURDAY,2,Month.MAY,MONDAY);
        test(DayOfWeek.SATURDAY,2,Month.JUNE,THURSDAY);
        test(DayOfWeek.SATURDAY,2,Month.JULY,SATURDAY);
        test(DayOfWeek.SATURDAY,2,Month.AUGUST,TUESDAY);
        test(DayOfWeek.SATURDAY,2,Month.SEPTEMBER,FRIDAY);
        test(DayOfWeek.SATURDAY,2,Month.OCTOBER,SUNDAY);
        test(DayOfWeek.SATURDAY,2,Month.NOVEMBER,WEDNESDAY);
        test(DayOfWeek.SATURDAY,2,Month.DECEMBER,FRIDAY);

        //test 6 n.w.day 15 number
        test(DayOfWeek.SATURDAY,15,Month.JANUARY,SATURDAY);
        test(DayOfWeek.SATURDAY,15,Month.FEBRUARY,TUESDAY);
        test(DayOfWeek.SATURDAY,15,Month.MARCH,TUESDAY);
        test(DayOfWeek.SATURDAY,15,Month.APRIL,FRIDAY);
        test(DayOfWeek.SATURDAY,15,Month.MAY,SUNDAY);
        test(DayOfWeek.SATURDAY,15,Month.JUNE,WEDNESDAY);
        test(DayOfWeek.SATURDAY,15,Month.JULY,FRIDAY);
        test(DayOfWeek.SATURDAY,15,Month.AUGUST,MONDAY);
        test(DayOfWeek.SATURDAY,15,Month.SEPTEMBER,THURSDAY);
        test(DayOfWeek.SATURDAY,15,Month.OCTOBER,SATURDAY);
        test(DayOfWeek.SATURDAY,15,Month.NOVEMBER,TUESDAY);
        test(DayOfWeek.SATURDAY,15,Month.DECEMBER,THURSDAY);

        //test 6 n.w.day 27 number
        test(DayOfWeek.SATURDAY,27,Month.JANUARY,THURSDAY);
        test(DayOfWeek.SATURDAY,27,Month.FEBRUARY,SUNDAY);
        test(DayOfWeek.SATURDAY,27,Month.MARCH,SUNDAY);
        test(DayOfWeek.SATURDAY,27,Month.APRIL,WEDNESDAY);
        test(DayOfWeek.SATURDAY,27,Month.MAY,FRIDAY);
        test(DayOfWeek.SATURDAY,27,Month.JUNE,MONDAY);
        test(DayOfWeek.SATURDAY,27,Month.JULY,WEDNESDAY);
        test(DayOfWeek.SATURDAY,27,Month.AUGUST,SATURDAY);
        test(DayOfWeek.SATURDAY,27,Month.SEPTEMBER,TUESDAY);
        test(DayOfWeek.SATURDAY,27,Month.OCTOBER,THURSDAY);
        test(DayOfWeek.SATURDAY,27,Month.NOVEMBER,SUNDAY);
        test(DayOfWeek.SATURDAY,27,Month.DECEMBER,TUESDAY);

        //test 6 n.w.day 28 number
        test(DayOfWeek.SATURDAY,28,Month.JANUARY,FRIDAY);
        test(DayOfWeek.SATURDAY,28,Month.FEBRUARY,MONDAY);
        test(DayOfWeek.SATURDAY,28,Month.MARCH,MONDAY);
        test(DayOfWeek.SATURDAY,28,Month.APRIL,THURSDAY);
        test(DayOfWeek.SATURDAY,28,Month.MAY,SATURDAY);
        test(DayOfWeek.SATURDAY,28,Month.JUNE,TUESDAY);
        test(DayOfWeek.SATURDAY,28,Month.JULY,THURSDAY);
        test(DayOfWeek.SATURDAY,28,Month.AUGUST,SUNDAY);
        test(DayOfWeek.SATURDAY,28,Month.SEPTEMBER,WEDNESDAY);
        test(DayOfWeek.SATURDAY,28,Month.OCTOBER,FRIDAY);
        test(DayOfWeek.SATURDAY,28,Month.NOVEMBER,MONDAY);
        test(DayOfWeek.SATURDAY,28,Month.DECEMBER,WEDNESDAY);

        //test 6 n.w.day 29 number
        test(DayOfWeek.SATURDAY,29,Month.JANUARY,SATURDAY);
        test(DayOfWeek.SATURDAY,29,Month.MARCH,TUESDAY);
        test(DayOfWeek.SATURDAY,29,Month.APRIL,FRIDAY);
        test(DayOfWeek.SATURDAY,29,Month.MAY,SUNDAY);
        test(DayOfWeek.SATURDAY,29,Month.JUNE,WEDNESDAY);
        test(DayOfWeek.SATURDAY,29,Month.JULY,FRIDAY);
        test(DayOfWeek.SATURDAY,29,Month.AUGUST,MONDAY);
        test(DayOfWeek.SATURDAY,29,Month.SEPTEMBER,THURSDAY);
        test(DayOfWeek.SATURDAY,29,Month.OCTOBER,SATURDAY);
        test(DayOfWeek.SATURDAY,29,Month.NOVEMBER,TUESDAY);
        test(DayOfWeek.SATURDAY,29,Month.DECEMBER,THURSDAY);

        //test 6 n.w.day 30 number
        test(DayOfWeek.SATURDAY,30,Month.JANUARY,SUNDAY);
        test(DayOfWeek.SATURDAY,30,Month.MARCH,WEDNESDAY);
        test(DayOfWeek.SATURDAY,30,Month.APRIL,SATURDAY);
        test(DayOfWeek.SATURDAY,30,Month.MAY,MONDAY);
        test(DayOfWeek.SATURDAY,30,Month.JUNE,THURSDAY);
        test(DayOfWeek.SATURDAY,30,Month.JULY,SATURDAY);
        test(DayOfWeek.SATURDAY,30,Month.AUGUST,TUESDAY);
        test(DayOfWeek.SATURDAY,30,Month.SEPTEMBER,FRIDAY);
        test(DayOfWeek.SATURDAY,30,Month.OCTOBER,SUNDAY);
        test(DayOfWeek.SATURDAY,30,Month.NOVEMBER,WEDNESDAY);
        test(DayOfWeek.SATURDAY,30,Month.DECEMBER,FRIDAY);

        //test 6 n.w.day 31 number
        test(DayOfWeek.SATURDAY,31,Month.JANUARY,MONDAY);
        test(DayOfWeek.SATURDAY,31,Month.MARCH,THURSDAY);
        test(DayOfWeek.SATURDAY,31,Month.MAY,TUESDAY);
        test(DayOfWeek.SATURDAY,31,Month.JULY,SUNDAY);
        test(DayOfWeek.SATURDAY,31,Month.AUGUST,WEDNESDAY);
        test(DayOfWeek.SATURDAY,31,Month.OCTOBER,MONDAY);
        test(DayOfWeek.SATURDAY,31,Month.DECEMBER,SATURDAY);

        //test 7 n.w.day 1 number
        test(DayOfWeek.SUNDAY,1,Month.JANUARY,SUNDAY);
        test(DayOfWeek.SUNDAY,1,Month.FEBRUARY,WEDNESDAY);
        test(DayOfWeek.SUNDAY,1,Month.MARCH,WEDNESDAY);
        test(DayOfWeek.SUNDAY,1,Month.APRIL,SATURDAY);
        test(DayOfWeek.SUNDAY,1,Month.MAY,MONDAY);
        test(DayOfWeek.SUNDAY,1,Month.JUNE,THURSDAY);
        test(DayOfWeek.SUNDAY,1,Month.JULY,SATURDAY);
        test(DayOfWeek.SUNDAY,1,Month.AUGUST,TUESDAY);
        test(DayOfWeek.SUNDAY,1,Month.SEPTEMBER,FRIDAY);
        test(DayOfWeek.SUNDAY,1,Month.OCTOBER,SUNDAY);
        test(DayOfWeek.SUNDAY,1,Month.NOVEMBER,WEDNESDAY);
        test(DayOfWeek.SUNDAY,1,Month.DECEMBER,FRIDAY);

        //test 7 n.w.day 2 number
        test(DayOfWeek.SUNDAY,2,Month.JANUARY,MONDAY);
        test(DayOfWeek.SUNDAY,2,Month.FEBRUARY,THURSDAY);
        test(DayOfWeek.SUNDAY,2,Month.MARCH,THURSDAY);
        test(DayOfWeek.SUNDAY,2,Month.APRIL,SUNDAY);
        test(DayOfWeek.SUNDAY,2,Month.MAY,TUESDAY);
        test(DayOfWeek.SUNDAY,2,Month.JUNE,FRIDAY);
        test(DayOfWeek.SUNDAY,2,Month.JULY,SUNDAY);
        test(DayOfWeek.SUNDAY,2,Month.AUGUST,WEDNESDAY);
        test(DayOfWeek.SUNDAY,2,Month.SEPTEMBER,SATURDAY);
        test(DayOfWeek.SUNDAY,2,Month.OCTOBER,MONDAY);
        test(DayOfWeek.SUNDAY,2,Month.NOVEMBER,THURSDAY);
        test(DayOfWeek.SUNDAY,2,Month.DECEMBER,SATURDAY);

        //test 7 n.w.day 15 number
        test(DayOfWeek.SUNDAY,15,Month.JANUARY,SUNDAY);
        test(DayOfWeek.SUNDAY,15,Month.FEBRUARY,WEDNESDAY);
        test(DayOfWeek.SUNDAY,15,Month.MARCH,WEDNESDAY);
        test(DayOfWeek.SUNDAY,15,Month.APRIL,SATURDAY);
        test(DayOfWeek.SUNDAY,15,Month.MAY,MONDAY);
        test(DayOfWeek.SUNDAY,15,Month.JUNE,THURSDAY);
        test(DayOfWeek.SUNDAY,15,Month.JULY,SATURDAY);
        test(DayOfWeek.SUNDAY,15,Month.AUGUST,TUESDAY);
        test(DayOfWeek.SUNDAY,15,Month.SEPTEMBER,FRIDAY);
        test(DayOfWeek.SUNDAY,15,Month.OCTOBER,SUNDAY);
        test(DayOfWeek.SUNDAY,15,Month.NOVEMBER,WEDNESDAY);
        test(DayOfWeek.SUNDAY,15,Month.DECEMBER,FRIDAY);

        //test 7 n.w.day 27 number
        test(DayOfWeek.SUNDAY,27,Month.JANUARY,FRIDAY);
        test(DayOfWeek.SUNDAY,27,Month.FEBRUARY,MONDAY);
        test(DayOfWeek.SUNDAY,27,Month.MARCH,MONDAY);
        test(DayOfWeek.SUNDAY,27,Month.APRIL,THURSDAY);
        test(DayOfWeek.SUNDAY,27,Month.MAY,SATURDAY);
        test(DayOfWeek.SUNDAY,27,Month.JUNE,TUESDAY);
        test(DayOfWeek.SUNDAY,27,Month.JULY,THURSDAY);
        test(DayOfWeek.SUNDAY,27,Month.AUGUST,SUNDAY);
        test(DayOfWeek.SUNDAY,27,Month.SEPTEMBER,WEDNESDAY);
        test(DayOfWeek.SUNDAY,27,Month.OCTOBER,FRIDAY);
        test(DayOfWeek.SUNDAY,27,Month.NOVEMBER,MONDAY);
        test(DayOfWeek.SUNDAY,27,Month.DECEMBER,WEDNESDAY);

        //test 7 n.w.day 28 number
        test(DayOfWeek.SUNDAY,28,Month.JANUARY,SATURDAY);
        test(DayOfWeek.SUNDAY,28,Month.FEBRUARY,TUESDAY);
        test(DayOfWeek.SUNDAY,28,Month.MARCH,TUESDAY);
        test(DayOfWeek.SUNDAY,28,Month.APRIL,FRIDAY);
        test(DayOfWeek.SUNDAY,28,Month.MAY,SUNDAY);
        test(DayOfWeek.SUNDAY,28,Month.JUNE,WEDNESDAY);
        test(DayOfWeek.SUNDAY,28,Month.JULY,FRIDAY);
        test(DayOfWeek.SUNDAY,28,Month.AUGUST,MONDAY);
        test(DayOfWeek.SUNDAY,28,Month.SEPTEMBER,THURSDAY);
        test(DayOfWeek.SUNDAY,28,Month.OCTOBER,SATURDAY);
        test(DayOfWeek.SUNDAY,28,Month.NOVEMBER,TUESDAY);
        test(DayOfWeek.SUNDAY,28,Month.DECEMBER,THURSDAY);

        //test 7 n.w.day 29 number
        test(DayOfWeek.SUNDAY,29,Month.JANUARY,SUNDAY);
        test(DayOfWeek.SUNDAY,29,Month.MARCH,WEDNESDAY);
        test(DayOfWeek.SUNDAY,29,Month.APRIL,SATURDAY);
        test(DayOfWeek.SUNDAY,29,Month.MAY,MONDAY);
        test(DayOfWeek.SUNDAY,29,Month.JUNE,THURSDAY);
        test(DayOfWeek.SUNDAY,29,Month.JULY,SATURDAY);
        test(DayOfWeek.SUNDAY,29,Month.AUGUST,TUESDAY);
        test(DayOfWeek.SUNDAY,29,Month.SEPTEMBER,FRIDAY);
        test(DayOfWeek.SUNDAY,29,Month.OCTOBER,SUNDAY);
        test(DayOfWeek.SUNDAY,29,Month.NOVEMBER,WEDNESDAY);
        test(DayOfWeek.SUNDAY,29,Month.DECEMBER,FRIDAY);

        //test 7 n.w.day 30 number
        test(DayOfWeek.SUNDAY,30,Month.JANUARY,MONDAY);
        test(DayOfWeek.SUNDAY,30,Month.MARCH,THURSDAY);
        test(DayOfWeek.SUNDAY,30,Month.APRIL,SUNDAY);
        test(DayOfWeek.SUNDAY,30,Month.MAY,TUESDAY);
        test(DayOfWeek.SUNDAY,30,Month.JUNE,FRIDAY);
        test(DayOfWeek.SUNDAY,30,Month.JULY,SUNDAY);
        test(DayOfWeek.SUNDAY,30,Month.AUGUST,WEDNESDAY);
        test(DayOfWeek.SUNDAY,30,Month.SEPTEMBER,SATURDAY);
        test(DayOfWeek.SUNDAY,30,Month.OCTOBER,MONDAY);
        test(DayOfWeek.SUNDAY,30,Month.NOVEMBER,THURSDAY);
        test(DayOfWeek.SUNDAY,30,Month.DECEMBER,SATURDAY);

        //test 7 n.w.day 31 number
        test(DayOfWeek.SUNDAY,31,Month.JANUARY,TUESDAY);
        test(DayOfWeek.SUNDAY,31,Month.MARCH,FRIDAY);
        test(DayOfWeek.SUNDAY,31,Month.MAY,WEDNESDAY);
        test(DayOfWeek.SUNDAY,31,Month.JULY,MONDAY);
        test(DayOfWeek.SUNDAY,31,Month.AUGUST,THURSDAY);
        test(DayOfWeek.SUNDAY,31,Month.OCTOBER,TUESDAY);
        test(DayOfWeek.SUNDAY,31,Month.DECEMBER,SUNDAY);

    }

    @Test
    public void testInvalidValues(){
        //test zero value
        testMyEx(DayOfWeek.FRIDAY,0,Month.MAY);

        //test negative values
        testMyEx(DayOfWeek.WEDNESDAY,-1,Month.JANUARY);
        testMyEx(DayOfWeek.THURSDAY,-2,Month.MARCH);

        //test over values for numbers
        testMyEx(DayOfWeek.FRIDAY,32,Month.JANUARY);
        testMyEx(DayOfWeek.SATURDAY,33,Month.JANUARY);
        testMyEx(DayOfWeek.MONDAY,29,Month.FEBRUARY);
        testMyEx(DayOfWeek.MONDAY,30,Month.FEBRUARY);
        testMyEx(DayOfWeek.MONDAY,32,Month.MARCH);
        testMyEx(DayOfWeek.SATURDAY,31,Month.APRIL);
        testMyEx(DayOfWeek.SUNDAY,32,Month.APRIL);
        testMyEx(DayOfWeek.SUNDAY,32,Month.MAY);
        testMyEx(DayOfWeek.WEDNESDAY,31,Month.JUNE);
        testMyEx(DayOfWeek.THURSDAY,32,Month.JUNE);
        testMyEx(DayOfWeek.THURSDAY,32,Month.JULY);
        testMyEx(DayOfWeek.THURSDAY,32,Month.AUGUST);
        testMyEx(DayOfWeek.MONDAY,31,Month.SEPTEMBER);
        testMyEx(DayOfWeek.TUESDAY,32,Month.SEPTEMBER);
        testMyEx(DayOfWeek.TUESDAY,32,Month.OCTOBER);
        testMyEx(DayOfWeek.SUNDAY,32,Month.NOVEMBER);
        testMyEx(DayOfWeek.SUNDAY,31,Month.NOVEMBER);
        testMyEx(DayOfWeek.SUNDAY,32,Month.DECEMBER);
    }

    private void test(DayOfWeek newYearDay,int number, Month month,String result) throws MyException {
        assertEquals(result,getter.countDaysTillDate(newYearDay,number,month));
    }

    private void testMyEx(DayOfWeek newYearDay,int number, Month month){
        assertThrows(MyException.class,()->getter.countDaysTillDate(newYearDay,number,month));
    }
}