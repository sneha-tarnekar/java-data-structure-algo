package Graph;

import java.util.LinkedList;
import java.util.Queue;

/*
 *  Given a binary grid of N*M. Find the distance of the nearest 1 in the grid for each cell.
 *  The distance is calculated as |i1  – i2| + |j1 – j2|,
 *  where i1, j1 are the row number and column number of the current cell, and i2, j2 are the row number
 *  and column number of the nearest cell having value 1.
 *
 *  Input: [
 *              1 0 1
 *              1 1 0
 *              1 0 0
 *          ]
 *
 *  Output: [
 *              0 1 0
 *              0 0 1
 *              0 1 2
 *          ]
 */

public class DistanceOfNearestCellHaving1 {

    public static int[][] nearestCellDistance(int[][] input) {
        int rowLength = input.length;
        int colLength = input[0].length;
        int[][] result = new int[rowLength][colLength];
        boolean[][] visitedArr = new boolean[rowLength][colLength];
        Queue<NodeDistancePair> queue = new LinkedList();
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (input[i][j] == 1) {
                    queue.add(new NodeDistancePair(i, j, 0));
                    visitedArr[i][j] = true;
                } else {
                    visitedArr[i][j] = false;
                }
            }
        }

        while (!queue.isEmpty()) {
            int row = queue.peek().row;
            int col = queue.peek().col;
            int steps = queue.peek().steps;
            queue.poll();
            result[row][col] = steps;

            int[] deltaRow = {-1, 0, 1, 0};
            int[] deltaCol = {0, 1, 0, -1};

            for (int i = 0; i < 4; i++) {
                int drow = row + deltaRow[i];
                int dcol = col + deltaCol[i];
                if (drow >= 0 && drow < rowLength &&
                        dcol >= 0 && dcol < colLength &&
                        !visitedArr[drow][dcol]) {
                    visitedArr[drow][dcol] = true;
                    queue.add(new NodeDistancePair(drow, dcol, steps+1));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {
                {0, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1}
        };
        int[][] result = nearestCellDistance(input);

        for(int i=0; i<result.length; i++) {
            for (int j=0; j<result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class NodeDistancePair {
    int row;
    int col;
    int steps;

    public NodeDistancePair(int row, int col, int steps) {
        this.row = row;
        this.col = col;
        this.steps = steps;
    }
}
