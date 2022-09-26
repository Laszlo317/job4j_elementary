package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent /= 100;
        for (; amount > 0; amount -= salary) {
            amount += amount * percent;
            year++;
        }
        return year;
    }
}