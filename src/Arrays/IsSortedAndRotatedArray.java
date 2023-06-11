package Arrays;

public class IsSortedAndRotatedArray {
    public static boolean isSortedAndRotated(int[] nums) {
        int count = 0;

//        check array is sorted
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]>nums[i+1]) {
                count++;
            }
        }

//        check array is rotated
        if(nums[nums.length-1]>nums[0]) {
            count++;
        }

        return count<=1;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5};
        System.out.println("Is array sorted and rotated: " + isSortedAndRotated(nums));
    }
}
