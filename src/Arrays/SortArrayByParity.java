package Arrays;

/*
    Given an integer array nums,
    move all the even integers at the beginning of the array followed by all the odd integers.
    Return any array that satisfies this condition.
 */
public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int resultIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[resultIndex++] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[resultIndex++] = nums[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] output = sortArrayByParity(nums);

        for (int n : output) {
            System.out.print(n + " ");
        }
    }

}
