package Arrays;

import java.util.TreeSet;

//  Given an integer array nums, return the third distinct maximum number in this array.
//  If the third maximum does not exist, return the maximum number.

public class FindThirdMaxUsingTreeset {

    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet();
        for (int n: nums) {
            set.add(n);
        }

        if(set.size() >=3 ) {
            set.pollLast();
            set.pollLast();
        }

        return set.last();
    }

    public static void main(String[] args) {
        int[] input = {2, 2, 1, 4};
        int result = thirdMax(input);
        System.out.println("3rd Largest Element is : " + result); // 1
    }
}
