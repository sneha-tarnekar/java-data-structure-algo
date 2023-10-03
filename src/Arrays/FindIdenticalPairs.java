package Arrays;

/*  Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */

public class FindIdenticalPairs {

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 1, 1, 3};
        int output = numIdenticalPairs(input);
        System.out.println("Output : " + output);
    }
}
