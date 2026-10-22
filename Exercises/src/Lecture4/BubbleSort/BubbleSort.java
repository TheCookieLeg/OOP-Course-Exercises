package Lecture4.BubbleSort;

public class BubbleSort {
    private static int[] list = { 2, 1, 4, 5, 1, 5, 1, 15, 123, 41, 5, 13, 2 };

    public static void main(String[] args) {
        printArray(list);
        int[] plonk = bubbleSort(list);
        printArray(plonk);
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < n - 1; i++) {
            swapped = false;

            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap places
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {break;}
        }

        return arr;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
