package Graph;

/*
 *  An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
 *
 *  You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].
 *
 *  To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
 *  plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.
 *  Return the modified image after performing the flood fill.
 *
 *  Input:
 *  sr=1, sc=1, newColor=2
 *  image = {
 *               {1, 1, 1},
 *               {1, 1, 0},
 *               {0, 0, 1}
 *          }
 *
 *  Output: {
 *               {2, 2, 2},
 *               {2, 2, 0},
 *               {0, 0, 1}
 *          }
 *
 * */

public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int initColor = image[sr][sc];
        int[][] result = image;

        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, 1, 0, -1};

        dfs(image, result, sr, sc, deltaRow, deltaCol, initColor, newColor);
        return result;
    }

    public static void dfs(int[][] image, int[][] result, int row, int col, int[] deltaRow, int[] deltaCol, int initColor, int newColor) {
        result[row][col] = newColor;
        for (int i = 0; i < 4; i++) {
            int nrow = row + deltaRow[i];
            int ncol = col + deltaCol[i];
            if (isValidToFill(image, result, nrow, ncol, initColor, newColor)) {
                dfs(image, result, nrow, ncol, deltaRow, deltaCol, initColor, newColor);
            }
        }
    }

    public static boolean isValidToFill(int[][] image, int[][] result, int nrow, int ncol, int initColor, int newColor) {
        return nrow >= 0 && nrow < image.length && ncol >= 0 && ncol < image[0].length && image[nrow][ncol] == initColor && result[nrow][ncol] != newColor;
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {0, 0, 1}
        };

        // row = 1, col = 1, newColor = 2
        int[][] result = floodFill(image, 1, 1, 2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}
