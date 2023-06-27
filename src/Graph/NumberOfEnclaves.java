package Graph;

/*
*   You are given an n x m binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.
*   A move consists of walking from one land cell to another adjacent (4-directionally) land cell
*   or walking off the boundary of the grid.
*   Find the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.
*
*   Input:    { {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0} }
*
*   Output: 3
*
*/
public class NumberOfEnclaves {

    private static int numberOfEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visitedArr = new boolean[n][m];
        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, 1, 0, -1};

        // traverse first row and last row
        for(int j=0; j<m; j++) {
            // row will remain 0 (1st row) and column will varry
            if(!visitedArr[0][j] && grid[0][j]==1) {
                dfs(0, j, grid, visitedArr, deltaRow, deltaCol);
            }
            // row will remain n-1 (last row) and column will varry
            if(!visitedArr[n-1][j] && grid[n-1][j]==1) {
                dfs(n-1, j, grid, visitedArr, deltaRow, deltaCol);
            }
        }

        // traverse first column and last column
        for(int i=0; i<n; i++) {
            // column will remain 0 (1st column) and row will varry
            if(!visitedArr[i][0] && grid[i][0]==1) {
                dfs(i, 0, grid, visitedArr, deltaRow, deltaCol);
            }
            // column will remain n-1 (last column) and row will varry
            if(!visitedArr[i][m-1] && grid[i][m-1]==1) {
                dfs(i, m-1, grid, visitedArr, deltaRow, deltaCol);
            }
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(!visitedArr[i][j] && grid[i][j]==1) {
                    count++;
                }
            }
        }

        return count;

    }

    private static void dfs(int row, int col, int[][] grid, boolean[][] visitedArr, int[] deltaRow, int[] deltaCol) {
        visitedArr[row][col] = true;
        for(int i=0; i<4; i++) {
            int nrow = row + deltaRow[i];
            int ncol = col + deltaCol[i];

            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && !visitedArr[nrow][ncol] && grid[nrow][ncol]==1) {
                dfs(nrow, ncol, grid, visitedArr, deltaRow, deltaCol);
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}};
        int result = numberOfEnclaves(grid);
        System.out.println("Number of Enclaves : " + result);
    }

}
