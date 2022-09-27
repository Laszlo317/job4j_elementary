package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i]) {
                counter++;
            } else if (!data[i]) {
                counter--;
            }
        }
        if (counter != data.length && counter != -data.length) {
            result = false;
        }
        return result;
    }
}