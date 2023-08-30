package Recursion;

public class FindNthFibonacciNumber {
    public static int fib(int i) {
        if (i <= 1)
            return i;
        return fib(i - 1) + fib(i - 2);

//       return ans;
    }

    //driver code to test the function
    public static void main(String args[]) {
        System.out.println(fib(6));
    }
}
