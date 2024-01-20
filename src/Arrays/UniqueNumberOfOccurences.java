package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//  Given an array of integers arr,
//  return true if the number of occurrences of each value in the array is unique or false otherwise.
public class UniqueNumberOfOccurences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        boolean isUnique = true;

        List<Integer> values = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            values.add(entry.getValue());
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            values.remove(entry.getValue());
            if (values.contains(entry.getValue())) {
                isUnique = false;
            }
        }

        return isUnique;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean output = uniqueOccurrences(arr);
        System.out.println("Output : " + output);
    }

}
