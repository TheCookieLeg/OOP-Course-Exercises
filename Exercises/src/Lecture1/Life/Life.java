package Lecture1.Life;
import java.util.Random;

public class Life {

    static int size = 30;
    public static void main(String[] args) {

        char[][] grid = createGrid(size);
        printGrid(grid, size);
        for (int i = 0; i < 100; i++) {
            grid = gameLoop(grid);
            printGrid(grid, size);
            wait(1000);
            clearConsole();
        }
    }

    private static char[][] gameLoop(char[][] grid) {
        return simulate(grid);
    }

    private static char[][] createGrid(int size) {
        char[][] grid = new char[size][size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int n = rand.nextInt(2);
                if (n == 0) {
                    grid[i][j] = 'D';
                } else {
                    grid[i][j] = 'L';
                }
            }
        }
        return grid;
    }

    public static void printGrid(char[][] grid, int size){
        for(int i = 0; i < size + 2; i++){
            if(i == size+1){
                System.out.print("- " + System.lineSeparator());
                continue;
            }
            System.out.print("- ");
        }
        for(int i = 0; i < size; i++){
            for(int j= 0; j < size; j++){
                if(j == 0){
                    System.out.print("| " + grid[i][j] + " ");
                    continue;
                } else if (j == size-1){
                    System.out.print(grid[i][j] + " |" + System.lineSeparator());
                    continue;
                }else {
                    System.out.print(grid[i][j] + " ");
                }
            }
        }
        for(int i = 0; i < size + 2; i++){
            if(i == size+1){
                System.out.print("- " + System.lineSeparator());
                continue;
            }
            System.out.print("- ");
        }
    }

    private static int countNeighbours(char[][] grid, int y, int x) {
        int count = 0;
        int[][] moves = {
                {-1, 0},    // up
                { 1, 0},    // down
                { 0, -1},   // left
                { 0, 1},    // right
                {-1, -1},   // up-left
                {-1, 1},    // up-right
                { 1, -1},   // down-left
                { 1, 1}     // down-right
        };

        for (int i = 0; i < 8; i++) {
            int newY = y + moves[i][0];
            int newX = x + moves[i][1];

            if (newY >= 0 && newY < grid.length &&
                newX >= 0 && newX < grid[0].length) {

                if (grid[newY][newX] == 'L') {
                    count++;
                }
            }
        }
        return count;
    }

    private static char[][] simulate(char[][] grid) {
        char[][] newGrid = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int neighbours = countNeighbours(grid, i, j);
                if (grid[i][j] == 'L') {
                    if (neighbours < 2)
                        newGrid[i][j] = 'D';
                    else if (neighbours == 2 || neighbours == 3)
                        newGrid[i][j] = 'L';
                    else
                        newGrid[i][j] = 'D';
                } else if (grid[i][j] == 'D') {
                    if (neighbours == 3)
                        newGrid[i][j] = 'L';
                    else
                        newGrid[i][j] = 'D';
                }
            }
        }
        return newGrid;
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            System.out.println("Thread was interrupted with message: " + ex.getMessage());
        }
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
