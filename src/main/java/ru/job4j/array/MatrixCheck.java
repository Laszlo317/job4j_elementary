package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int j = 1; j < board[row].length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = column; i < board[column].length; i++) {
            if (board[column][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

}