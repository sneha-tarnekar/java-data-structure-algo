package Recursion;

public class CheckSortedArray {

    private static boolean isSorted(int[] input, int len) {
        if(len == 0 || len == 1) return true;
        if(input[len-1]<input[len-2]) return false;
        return isSorted(input, len-1);
    }

    public static void main(String[] args) {
        int[] input = {1,2,5,6,7};
        boolean result = isSorted(input, input.length);
        System.out.println("Is sorted : " + result);
    }
}
