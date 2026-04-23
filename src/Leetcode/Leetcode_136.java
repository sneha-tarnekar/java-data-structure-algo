package Leetcode;

import java.util.HashMap;
import java.util.Map;

/*
136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 */
public class Leetcode_136 {

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], nums[i]);
            }
        }
        return map.entrySet().iterator().next().getKey();
    }

    public static void main(String[] args) {
        int[] input = {4,1,2,1,2};
        int result = singleNumber(input);
        System.out.println("Output : "+ result);
    }

}
