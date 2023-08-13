package Problems;

/*
Find the sum of all divisors for all 'i' from 1 to 'n'

Input: 3
Output: 8
Explaination: We need to find sumOfDivisors(1) + sumOfDivisors(2) +sumOfDivisors(3).
        sumOfDivisors(1) = 1
        sumOfDivisors(2) = 2 + 1 = 3
        sumOfDivisors(3) = 3 + 1 = 4
        Therefore, the answer is sumOfDivisors(1) + sumOfDivisors(2) + sumOfDivisors(3) = 1 + 3 + 4 = 8.
*/

public class FindSumOfAllDivisors {

    public static int sumOfAllDivisors(int n) {
        int sum = 0;
        while (n != 0) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sumOfAllDivisors(3);
        System.out.println("Sum of all divisors : " + result);
    }

}
