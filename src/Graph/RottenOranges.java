package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public static int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> queue = new LinkedList();
        int[][] visitedArr = new int[n][m];
        int countFresh = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j]==2) {
                    queue.add(new Pair(i, j, 0));
                    visitedArr[i][j] = 2;
                } else {
                    visitedArr[i][j] = 0;
                }
                if (grid[i][j]==1) {
                    countFresh++;
                }
            }
        }

        int time = 0;
        int count = 0;
        int[] deltaRow = {-1, 0, +1, 0};
        int[] deltaCol = {0, +1, 0, -1};

        while (!queue.isEmpty()) {
            int row = queue.peek().row;
            int col = queue.peek().column;
            int t = queue.peek().time;
            time = Math.max(time, t);
            queue.remove();
            for(int i=0; i<4; i++) {
                int currentRow = row + deltaRow[i];
                int currentCol = col + deltaCol[i];

                if(currentRow >= 0 && currentRow < n &&
                        currentCol >= 0 && currentCol < m &&
                        visitedArr[currentRow][currentCol] == 0 &&
                        grid[currentRow][currentCol] == 1) {
                    queue.add(new Pair(currentRow, currentCol, time + 1));
                    visitedArr[currentRow][currentCol] = 2;
                    count++;
                }
            }
        }

        if(count != countFresh) return -1;
        return time;
    }

    public static void main(String[] args) {
        int[][] input = new int[][]{{2,0,2},{1,1,0},{0,1,2}};

        int result = orangesRotting(input);
        System.out.println("Minimum time required to rot all oranges: "+result);
    }
}

class Pair {
    int row;
    int column;
    int time;

    public Pair(int row, int column, int time) {
        this.row = row;
        this.column = column;
        this.time = time;
    }
}
