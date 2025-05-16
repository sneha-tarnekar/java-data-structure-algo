package Arrays;

import java.util.ArrayList;
import java.util.List;

// Leetcode #2900. Longest unequal adjacent groups subsequence
public class LongestSubsequence {

    public static List<String> getLongestSubsequence(String[] words, int[] groups) {

        if (words.length == 0) return new ArrayList();

        List<String> response = new ArrayList();
        response.add(words[0]);

        int previous = groups[0];
        for (int i = 1; i < groups.length; i++) {
            if (groups[i] != previous) {
                response.add(words[i]);
                previous = groups[i];
            }
        }

        return response;
    }

    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "d"};
        int[] groups = {1, 0, 1, 1};
        List<String> result = getLongestSubsequence(words, groups);
        System.out.println("Output: "+result);
    }

}
