package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineArray {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2, Arrays.asList(1, 9, 9)));
        list.add(Arrays.asList(1, Arrays.asList(2, 3, Arrays.asList(1, 2))));

        List<Integer> result = new ArrayList<>();

        addToList(list, result);

        result.stream().forEach(ele -> System.out.print(ele + " "));
    }

    private static void addToList(List<Object> list, List<Integer> result) {
        for (Object ele : list) {
            if (ele instanceof Integer) {
                result.add((Integer) ele);
            } else {
                addToList((List<Object>) ele, result);
            }
        }
    }

}
