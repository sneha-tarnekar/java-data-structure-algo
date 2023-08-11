package Arrays;

/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
*/

public class RemoveGivenElement {

    public static int removeElement(int[] nums, int val) {
        int resultIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[resultIndex++] = nums[i];
            }
        }

        return resultIndex;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 2, 0};
        int resultlength = removeElement(input, 2);
        System.out.println("Array length after removal : " + resultlength);
        for (int i = 0; i < resultlength; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
