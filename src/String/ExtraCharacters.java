package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//    You are given a 0-indexed string s and a dictionary of words dictionary.
//    You have to break s into one or more non-overlapping substrings such that each substring is present in dictionary.
//    There may be some extra characters in s which are not present in any of the substrings.
//    Return the minimum number of extra characters left over if you break up s optimally.
public class ExtraCharacters {

    public static int minExtraChar(String s, String[] dictionary) {
        int maxLen = s.length() + 1;
        int[] arr = new int[maxLen];

        arr[0] = 0;
        Set<String> wordSet = new HashSet<>(Arrays.asList(dictionary));
        for (int i = 1; i < maxLen; i++) {
            arr[i] = arr[i - 1] + 1;

            for (int length = 1; length <= i; length++) {
                String subStr = s.substring(i - length, i);
                if (wordSet.contains(subStr)) {
                    arr[i] = Math.min(arr[i], arr[i - length]);
                }
            }
        }

        return arr[maxLen - 1];
    }

    public static void main(String[] args) {
        String s = "leetscode";
        String[] dictionary = {"leet","code","leetcode"};
        int output = minExtraChar(s, dictionary);
        System.out.println(output);
    }

}
