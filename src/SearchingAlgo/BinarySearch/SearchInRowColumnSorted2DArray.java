package SearchingAlgo.BinarySearch;

import java.util.Arrays;

public class SearchInRowColumnSorted2DArray {

    public static void main(String[] args) {

        // Array sorted row and column wise
        int[][] arr = {
                {1, 2, 4},
                {3, 5, 9},
                {7, 8, 11}
        };

        int target = 8;

        int[] output = search(arr, target);
        System.out.println("Output : " + Arrays.toString(output));
    }

    public static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;

        while (row <= arr.length - 1 && col >= 0) {

            if (arr[row][col] == target) {
                return new int[]{row, col};
            }

            if (target > arr[row][col]) {
                row++;
            } else {
                col--;
            }

        }

        return new int[]{-1, -1};
    }


}
