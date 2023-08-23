package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    public static List<Integer> reverseArray(List<Integer> a) {
        Collections.reverse(a);
        return a;
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(1, 2, 4, 5));
        List<Integer> output = reverseArray(input);
        for (Integer ele: output) {
            System.out.print(ele + " ");
        }
    }
}
