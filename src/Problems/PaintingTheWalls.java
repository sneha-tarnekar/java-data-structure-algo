package Problems;

/*
    You are given two 0-indexed integer arrays, cost and time, of size n representing the costs and the time taken to paint n different walls respectively. There are two painters available:
    A paid painter that paints the ith wall in time[i] units of time and takes cost[i] units of money.
    A free painter that paints any wall in 1 unit of time at a cost of 0. But the free painter can only be used if the paid painter is already occupied.
    Return the minimum amount of money required to paint the n walls.
 */
public class PaintingTheWalls {

    public static int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = cost[i - 1] + dp[i - 1];
            int totalTime = time[i - 1];

            for (int j = i - 2; j >= 0; j--) {
                totalTime += time[j];
                dp[i] = Math.min(dp[i], dp[j] + totalTime);
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int[] cost = {2, 3, 4, 2};
        int[] time = {1, 1, 1, 1};

        int output = paintWalls(cost, time);
        System.out.println("Output : " + output);
    }

}
