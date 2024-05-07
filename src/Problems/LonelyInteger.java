package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(0, 0, 1, 2, 1);
        int output = lonelyinteger(input);
        System.out.println("Output: " + output);
    }

    public static int lonelyinteger(List<Integer> a) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            map.put(a.get(i), map.getOrDefault(a.get(i), 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;

    }

}
