package Graph;

/*
 *  Given a matrix mat of size N x M where every element is either ‘O’ or ‘X’.
 *  Replace all ‘O’ with ‘X’ that is surrounded by ‘X’.
 *  An ‘O’ (or a set of ‘O’) is considered to be surrounded by ‘X’
 *  if there are ‘X’ at locations just below, just above just left, and just right of it.
 *
 *  Input:  X X X X
            X O X X
            X O O X
            X O X X
            X X O O

 *  Output: X X X X
            X X X X
            X X X X
            X X X X
            X X O O
 */

public class SurroundedRegions {
    public static void fill(char[][] board) {
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

    public static void main(String[] args) {
        char[][] input = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O'}};

        fill(input);

        for(int i=0; i< input.length; i++) {
            for(int j=0; j<input[0].length; j++) {
                System.out.print(input[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
