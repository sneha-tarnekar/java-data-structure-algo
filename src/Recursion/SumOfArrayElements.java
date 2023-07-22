package Recursion;

public class SumOfArrayElements {

    private static int sum(int[] input, int len) {
        if(len == 0) return 0;
        return input[len-1]+sum(input, len-1);
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};
        int result = sum(input, input.length);
        System.out.println("Sum = " + result);
    }

}
