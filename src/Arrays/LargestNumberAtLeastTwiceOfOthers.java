package Arrays;


/*  You are given an integer array nums where the largest integer is unique.
    Determine whether the largest element in the array is at least twice as much as every other number in the array.
    If it is, return the index of the largest element, or return -1 otherwise.
 */
public class LargestNumberAtLeastTwiceOfOthers {

    public static int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[i] * 2 > max) {
                return -1;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        int[] input = {3, 6, 1, 0};
        int result = dominantIndex(input);
        System.out.println("Output: " + result);
    }
}
