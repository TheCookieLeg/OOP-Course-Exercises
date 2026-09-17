package Lecture1.Life;
import java.util.Random;

public class Life {


    public static void main(String[] args) {
        int size = 50;
        char[][] grid = createGrid(size);
        PrintGrid(grid, size);
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

    public static void PrintGrid (char[][] grid, int size){
        for(int i = 0; i < size + 2; i++){
            if(i == size+1){
                System.out.print("- " + System.getProperty("line.separator") );
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
                    System.out.print(grid[i][j] + " |" + System.getProperty("line.separator"));
                    continue;
                }else {
                    System.out.print(grid[i][j] + " ");
                }
            }
        }
        for(int i = 0; i < size + 2; i++){
            if(i == size+1){
                System.out.print("- " + System.getProperty("line.separator") );
                continue;
            }
            System.out.print("- ");
        }
    }
}
