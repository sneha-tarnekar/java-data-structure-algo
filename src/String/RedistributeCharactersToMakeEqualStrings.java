package String;

import java.util.HashMap;
import java.util.Map;

//    You are given an array of strings words (0-indexed).
//    In one operation, pick two distinct indices i and j,
//    where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].
//    Return true if you can make every string in words equal using any number of operations, and false otherwise.
public class RedistributeCharactersToMakeEqualStrings {

    public static boolean makeEqual(String[] words) {
        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < words.length; i++) {
            char[] inner = words[i].toCharArray();
            for (int j = 0; j < inner.length; j++) {
                map.merge(inner[j], 1, Integer::sum);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % words.length != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "aabc", "bc"};
        boolean output = makeEqual(words);
        System.out.println("Output : " + output);
    }

}
