package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/*
You are given an array of integers nums,
there is a sliding window of size k which is moving from the very left of the array to the very right.
You can only see the k numbers in the window. Each time the sliding window moves right by one position.
Return the max sliding window.
*/

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        int resultIndex=0;

        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0; i<n; i++) {
            if(!q.isEmpty() && q.peek()==i-k) {
                q.poll();
            }

            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]) {
                q.pollLast();
            }

            q.offer(i);

            if(i>= k-1) {
                result[resultIndex++] = nums[q.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] output = maxSlidingWindow(nums, k);

        for(int i: output) {
            System.out.print(i+" ");
        }
    }
}
