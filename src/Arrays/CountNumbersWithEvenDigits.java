package Arrays;

//  Find Numbers with Even number of Digits
//  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class CountNumbersWithEvenDigits {

    public static void main(String[] args) {
        int[] nums = {-12, 345, 42, -6, 7896};
        int output = findNumbers(nums);
        System.out.println("Output : " + output);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isEven(int num) {
        int digitCount = countDigit(num);
        return digitCount % 2 == 0;
    }

    private static int countDigit(int num) {
        int digit = 0;

        // To cover the case of negative number
        if (num < 0) {
            num = num * -1;
        }

        while (num > 0) {
            digit++;
            num = num / 10;
        }
        return digit;
    }

}
