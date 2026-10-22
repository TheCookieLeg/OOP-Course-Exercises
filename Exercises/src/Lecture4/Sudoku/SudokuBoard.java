package Lecture4.Sudoku;


import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private static SudokuBoard instance = null;
    private int[][] board;
    private List<IProcessListener> listeners = new ArrayList<IProcessListener>();


    public SudokuBoard() {
        board = new int[9][9];
        reset();
    }

    public static SudokuBoard get() {
        if (instance == null)
            instance = new SudokuBoard();
        return instance;
    }

    public void setGridValue(int y, int x, int value) {
        try {
            if (y >= 0 && y < 9 &&
                x >= 0 && x < 9) {
                if (value > 0 && value <= 9) {
                    board[y][x] = value;
                } else {
                    throw new IllegalArgumentException("value must be between 1 and 9");
                }
            } else {
                throw new IllegalArgumentException("x and y coordinates must be between 0 and 8");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Illegal argument! " + e.getMessage());
        }
    }

    public int getGridValue(int y, int x) {
        try {
            if (y >= 0 && y < 9 &&
                    x >= 0 && x < 9) {
                return board[y][x];
            }
            else {
                throw new IllegalArgumentException("x and y coordinates must be between 0 and 8");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Illegal argument! " + e.getMessage());
            return -1;
        }

    }

    private void notifyListeners(int y, int x, int value) {
        for(var l : listeners) {
            l.update(y, x, value);
        }
    }

    private void reset() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[j][i] = 0;
            }
        }
    }
}
