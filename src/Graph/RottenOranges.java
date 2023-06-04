package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public static int orangesRotting(int[][] input) {
        Queue<Pair> queue = new LinkedList();
        int[][] visitedArr = new int[input.length][input[0].length];
        int numberOfFreshOranges = countTotalFreshOranges(input, queue, visitedArr);
        int[] deltaRow = {-1, 0, +1, 0};
        int[] deltaCol = {0, +1, 0, -1};
        int time = 0;
        int numberOfRottenOranges = 0;

        while (!queue.isEmpty()) {
            int row = queue.peek().row;
            int col = queue.peek().column;
            int t = queue.peek().time;
            time = Math.max(time, t);
            queue.remove();
            for(int i=0; i<4; i++) {
                int currentRow = row + deltaRow[i];
                int currentCol = col + deltaCol[i];
                if(isFreshAndNotVisitedOrange(currentRow, currentCol, visitedArr, input)) {
                    queue.add(new Pair(currentRow, currentCol, time + 1));
                    visitedArr[currentRow][currentCol] = 2;
                    numberOfRottenOranges++;
                }
            }
        }

        if(numberOfRottenOranges != numberOfFreshOranges)
            return -1;

        return time;
    }

    public static boolean isFreshAndNotVisitedOrange(int currentRow, int currentCol, int[][] visitedArr, int[][] input) {
        return currentRow >= 0 && currentRow < input.length &&
                currentCol >= 0 && currentCol < input[0].length &&
                visitedArr[currentRow][currentCol] == 0 &&
                input[currentRow][currentCol] == 1;
    }

    public static int countTotalFreshOranges(int[][] input, Queue<Pair> queue, int[][] visitedArr) {
        int countFresh = 0;
        for(int i=0; i<input.length; i++) {
            for(int j=0; j<input[i].length; j++) {
                if(input[i][j]==2) {
                    queue.add(new Pair(i, j, 0));
                    visitedArr[i][j] = 2;
                } else {
                    visitedArr[i][j] = 0;
                }
                if (input[i][j]==1) countFresh++;
            }
        }
        return countFresh;
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
