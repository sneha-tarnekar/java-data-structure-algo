package Arrays;

import java.util.Arrays;

/*
    Given an integer array nums and an integer k, return the kth largest element in the array.
    Input: nums = [3,2,1,5,6,4], k = 2
    Output: 5
 */
public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] input = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = findKthLargest(input, k);
        System.out.println(k + "th Largest Element is : " + result);
    }
}
