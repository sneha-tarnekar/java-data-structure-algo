package Arrays;

import java.util.HashSet;

/*  Given an array of integers nums containing n + 1 integers
    where each integer is in the range [1, n] inclusive.
    There is only one repeated number in nums, return this repeated number.
 */

public class FindDuplicateNumberInLinearTime {

    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 5, 9, 3};
        int output = findDuplicate(input);
        System.out.print("Output: " + output);
    }

}
