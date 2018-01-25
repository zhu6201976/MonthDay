package com.example.javatest;


import java.util.Scanner;

/**
 * 求某年某月的天数
 */
public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();
        System.out.println("请输入月份：");
        int month = input.nextInt();
        int monthDay = getMonthDay(year, month);
        System.out.println("天数为：" + monthDay);

    }

    /**
     * 获取某年某月总天数
     *
     * @param year  年
     * @param month 月
     * @return 该年该月总天数
     */
    private static int getMonthDay(int year, int month) {
        int monthDay = 0;
        switch (month) {
            case 1:
                monthDay = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    monthDay = 29;
                } else {
                    monthDay = 28;
                }
                break;
            case 3:
                monthDay = 31;
                break;
            case 4:
                monthDay = 30;
                break;
            case 5:
                monthDay = 31;
                break;
            case 6:
                monthDay = 30;
                break;
            case 7:
                monthDay = 31;
                break;
            case 8:
                monthDay = 31;
                break;
            case 9:
                monthDay = 30;
                break;
            case 10:
                monthDay = 31;
                break;
            case 11:
                monthDay = 30;
                break;
            case 12:
                monthDay = 31;
                break;
        }
        return monthDay;
    }

}

