package Problems;

//  A happy number is a number defined by the following process:
//  Starting with any positive integer, replace the number by the sum of the squares of its digits.
//  Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//  Those numbers for which this process ends in 1 are happy.
//  Return true if n is a happy number, and false if not.
public class HappyNumber {

    public static boolean isHappy(int n) {
        int slow = getNextNumber(n);
        int fast = getNextNumber(getNextNumber(n));

        while (slow != fast) {
            if (fast == 1)
                return true;
            slow = getNextNumber(slow);
            fast = getNextNumber(getNextNumber(fast));
        }

        return slow == 1;
    }

    private static int getNextNumber(int n) {
        int output = 0;

        while (n > 0) {
            int digit = n % 10;
            output += digit * digit;
            n = n / 10;
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

}
