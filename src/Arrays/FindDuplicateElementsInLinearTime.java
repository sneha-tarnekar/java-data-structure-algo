package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
*   Given an array a[] of size N which contains elements from 0 to N-1,
*   you need to find all the elements occurring more than once in the given array.
*   Return the answer in ascending order.
*   Expected Time Complexity: O(n)
*/
public class FindDuplicateElementsInLinearTime {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        map.forEach((k,v) -> {
            if(v>1)
                list.add(k);
        });

        if(list.size()<=0) {
            list.add(-1);
            return list;
        }

        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[] input = {2,3,1,2,3};
        ArrayList<Integer> list = duplicates(input, input.length);

        list.stream().forEach(l -> System.out.print(l+" "));
    }
}
