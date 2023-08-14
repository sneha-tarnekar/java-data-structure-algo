package Arrays;

import java.util.HashMap;

public class CheckContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], 1);
        }

        return false;
    }

    public static void main(String[] args) {
        int input[] = {1, 2, 3, 1};
        System.out.println("Is Duplicate present : " + containsDuplicate(input));
    }
}
