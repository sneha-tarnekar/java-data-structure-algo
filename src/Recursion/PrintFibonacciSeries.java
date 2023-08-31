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
        ArrayList<Integer> arr = new ArrayList();
        fibonacci(6, arr);
    }

}
