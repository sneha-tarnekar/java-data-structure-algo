package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//  Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
public class MajorityElementsII {

    public static List<Integer> majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList();

        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        map.forEach((k,v) -> {
            if(v>(nums.length)/3)
                list.add(k);
        });

        return list;
    }

    public static void main(String[] args) {
        int[] input = {3,2,3};
        List<Integer> output = majorityElement(input);

        for (Integer ele: output) {
            System.out.print(ele + " ");
        }
    }
}
