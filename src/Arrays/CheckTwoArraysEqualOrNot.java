package Arrays;

import java.util.Arrays;

public class CheckTwoArraysEqualOrNot {

    public static boolean check(int A[],int B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<N; i++) {
            if(A[i]!=B[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 4, 6};
        int[] arr2 = {2, 4, 6, 5};
        int N = 4;
        boolean result = check(arr1, arr2, N);
        System.out.println(result ? "Equal" : "Not equal");
    }
}
