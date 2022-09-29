package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] age = new short[10];
        float[] prices = new float[40];
        System.out.println(age.length);
        System.out.println(prices.length);
        String[] names = new String[4];
        names[0] = "Kirill";
        names[1] = "Andrey";
        names[2] = "Igor";
        names[3] = "Dorothy";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
