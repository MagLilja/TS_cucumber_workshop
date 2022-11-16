package com.example;

public class DateHandler {
    private int month;
    private int dayOfMonth;

    public DateHandler(int month, int dayOfMonth) {
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public static Boolean isNewYear(DateHandler todayis) {
        if (todayis.month == 1 && todayis.dayOfMonth == 1) {
            return true;
        }
        return false;
    }
}