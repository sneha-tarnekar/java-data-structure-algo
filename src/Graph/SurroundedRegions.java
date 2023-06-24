package Graph;

public class SurroundedRegions {
    public void fill(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] visitedArr = new boolean[n][m];
        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, 1, 0, -1};

        // traverse first row and last row
        for(int j=0; j<m; j++) {
            // row will remain 0 (1st row) and column will varry
            if(!visitedArr[0][j] && board[0][j]=='O') {
                dfs(0, j, board, visitedArr, deltaRow, deltaCol);
            }
            // row will remain n-1 (last row) and column will varry
            if(!visitedArr[n-1][j] && board[n-1][j]=='O') {
                dfs(n-1, j, board, visitedArr, deltaRow, deltaCol);
            }
        }

        // traverse first column and last column
        for(int i=0; i<n; i++) {
            // column will remain 0 (1st column) and row will varry
            if(!visitedArr[i][0] && board[i][0]=='O') {
                dfs(i, 0, board, visitedArr, deltaRow, deltaCol);
            }
            // column will remain n-1 (last column) and row will varry
            if(!visitedArr[i][m-1] && board[i][m-1]=='O') {
                dfs(i, m-1, board, visitedArr, deltaRow, deltaCol);
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(!visitedArr[i][j] && board[i][j]=='O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private static void dfs(int row, int col, char[][] board, boolean[][] visitedArr, int[] deltaRow, int[] deltaCol) {
        visitedArr[row][col] = true;
        for(int i=0; i<4; i++) {
            int nrow = row + deltaRow[i];
            int ncol = col + deltaCol[i];

            if(nrow>=0 && nrow<board.length && ncol>=0 && ncol<board[0].length && !visitedArr[nrow][ncol] && board[nrow][ncol]=='O') {
                dfs(nrow, ncol, board, visitedArr, deltaRow, deltaCol);
            }
        }
    }
}
