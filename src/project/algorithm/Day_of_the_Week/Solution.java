package project.algorithm.Day_of_the_Week;

import java.util.Calendar;

/**
 * @author linwt
 * @date 2019/9/8 11:11
 */
public class Solution {
    private static final String[] WEEK = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static String dayOfTheWeek(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return WEEK[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
}
