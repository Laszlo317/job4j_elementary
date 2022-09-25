package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float out = Converter.rubleToEuro(in);
        float expected = 2;
        boolean passed = expected == out;
        System.out.println("140 rubles are " + out + " euro. Test result : " + passed);

        in = 210;
        out = Converter.rubleToDollar(in);
        expected = 3.5f;
        passed = expected == out;
        System.out.println("210 rubles are " + out + " dollars. Test result : " + passed);

    }
}