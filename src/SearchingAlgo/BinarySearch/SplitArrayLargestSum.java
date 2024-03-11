package SearchingAlgo.BinarySearch;

public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        int output = splitArray(nums, m);
        System.out.println("Output : " + output);
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);   // In the end of the loop, this will contain max element of array
            end += nums[i];
        }

        //  binary search
        while (start < end) {
            //  try for the middle as potential ans
            int mid = start + (end - start) / 2;

            //  calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    //  if condition is true
                    //  this means you cannot add this num element in this subarray, make new one
                    //  say you add this num in new subarray, them sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;     // here start == end, hence can return start as well
    }

}
