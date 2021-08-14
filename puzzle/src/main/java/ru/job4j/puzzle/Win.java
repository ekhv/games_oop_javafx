package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        int xWinConter = 0;

        for (int[] field : board) {
            int x = 0;
            for (int column : field) {
                if (column == 1) {
                    xWinConter += x;
                }
                x += 1;
            }
        }

        return xWinConter % 5 == 0;
    }
}
