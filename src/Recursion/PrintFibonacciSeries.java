package Recursion;

import java.util.ArrayList;

public class PrintFibonacciSeries {

    public static int fibonacci(int i, ArrayList<Integer> visitedArr) {
        if (i <= 1) {
            if (!visitedArr.contains(i)) System.out.print(i + " ");
            visitedArr.add(i);
            return i;
        }

        int ans = fibonacci(i - 2, visitedArr) + fibonacci(i - 1, visitedArr);

        if (!visitedArr.contains(i)) System.out.print(ans + " ");
        visitedArr.add(i);

        return ans;
    }

    public static void main(String args[]) {
        findFibonacci(7);
    }

    public static void findFibonacci(int n) {
        if (n < 2) {
            System.out.print(n - 1 + " ");
            return;
        }

        findFibonacci(n - 1);

        int fb = n - 1 + n - 2;
        System.out.print(fb + " ");
    }

}
