package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        char subject;
        if (name.isEmpty() || !isLowerLatinLetter(name.charAt(0))) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            subject = name.charAt(i);
            if (isSpecialSymbol(subject) || isLowerLatinLetter(subject)
                    || isUpperLatinLetter(subject) || Character.isDigit(subject)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        for (int i = 65; i <= 90; i++) {
            if (code == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        for (int i = 97; i <= 122; i++) {
            if (code == i) {
                return true;
            }
        }
        return false;
    }
}