package Recursion;

public class CheckSortedArray {

    private static boolean isSorted(int[] input, int len) {
        if(len == 0 || len == input.length) return true;
        if(input[len]<input[len-1]) return false;
        return true && isSorted(input, len-1);
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,8,5,6,7};
        boolean result = isSorted(input, input.length);
        System.out.println("Is sorted : " + result);
    }
}
