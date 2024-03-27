package SearchingAlgo.BinarySearch;

import java.util.Arrays;

public class SearchInSorted2DArray {

    public static void main(String[] args) {

        // Array sorted row and column wise
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 11}
        };

        int target = 7;

        int[] output = search(matrix, target);
        System.out.println("Output : " + Arrays.toString(output));
    }

    public static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop
        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Check whether the mid-column you are at contains the answer
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rEnd][cMid] == target) {
            return new int[]{rEnd, cMid};
        }

        // Else consider four parts and

        // search in first half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }

        // search in second half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        // search in third half
        if (target <= matrix[rEnd][cMid - 1]) {
            return binarySearch(matrix, rEnd, 0, cMid - 1, target);
        }

        // search in fourth half
        if (target >= matrix[rEnd][cMid + 1]) {
            return binarySearch(matrix, rEnd, cMid + 1, cols - 1, target);
        }

        return new int[]{-1, -1};
    }

    // Search in the provided row between the column provided
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }

            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }

}
