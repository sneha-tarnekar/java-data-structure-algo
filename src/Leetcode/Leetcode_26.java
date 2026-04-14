package Leetcode;

//26. Remove Duplicates from Sorted Array

public class Leetcode_26 {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[k]<nums[i]) {
                k++;
                nums[k]=nums[i];
            }
        }

        return k+1;
    }
}
