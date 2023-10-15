package Problems;

import java.util.Arrays;

/*
    You are given two 0-indexed integer arrays, cost and time, of size n representing the costs and the time taken to paint n different walls respectively. There are two painters available:
    A paid painter that paints the ith wall in time[i] units of time and takes cost[i] units of money.
    A free painter that paints any wall in 1 unit of time at a cost of 0. But the free painter can only be used if the paid painter is already occupied.
    Return the minimum amount of money required to paint the n walls.
 */
public class PaintingTheWalls {

    public static int paintWalls(int[] cost, int[] time) {
        int n = time.length;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, (int) 1e9);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                dp[j] = Math.min(dp[j], dp[Math.max(j - time[i] - 1, 0)] + cost[i]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] cost = {1, 2, 3, 2};
        int[] time = {1, 2, 3, 2};

        int output = paintWalls(cost, time);
        System.out.println("Output : " + output);
    }

}
