package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int rsl = left > right ? left : right;
        return rsl;
    }

    public static int max(int first, int second, int third) {
        int rsl = first > second ? first : second;
        return rsl > third ? rsl : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int rsl = first > second ? first : second;
        rsl = rsl > third ? rsl : third;
        return rsl > fourth ? rsl : fourth;
    }
}