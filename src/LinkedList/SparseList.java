package LinkedList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//  There is a collection of input strings and a collection of query strings.
//  For each query string, determine how many times it occurs in the list of input strings.
//  Return an array of the results.
public class SparseList {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Long> countMap = stringList.stream().collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        List<Integer> count = queries.stream()
                .map(item -> countMap.getOrDefault(item, 0L).intValue())
                .collect(Collectors.toList());
        return count;
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");

        List<Integer> output = matchingStrings(stringList, queries);

        for (Integer ele : output) {
            System.out.print(ele + " ");
        }
    }

}
