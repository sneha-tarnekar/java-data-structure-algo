package Problems;

/*
    Given an array of integers nums sorted in non-decreasing order,
    find the starting and ending position of a given target value.
    If target is not found in the array, return [-1, -1].
 */
public class FirstAndLastPositionOfElement {

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int index = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i]==target) {
                res[index] = i;
                if(index == 0) index++;
            }
        }

        if(res[1]<0)
            res[1] = res[0];

        return res;
    }

    public static void main(String[] args) {
        int[] input = {5,7,7,8,8,10};
        int target = 8;
        int[] output = searchRange(input, target);

        for (int ele: output) {
            System.out.print(ele+" ");
        }
    }

}
