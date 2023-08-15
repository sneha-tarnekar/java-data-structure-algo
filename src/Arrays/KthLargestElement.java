package Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

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

    public static int findKthLargestWithoutSort(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num: nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.remove();
            }
        }

        return queue.peek();
    }

    public static void main(String[] args) {
        int[] input = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = findKthLargestWithoutSort(input, k);
        System.out.println(k + "th Largest Element is : " + result);
    }
}
