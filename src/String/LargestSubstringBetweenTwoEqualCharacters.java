package String;

import java.util.HashMap;
import java.util.Map;

//  Given a string s, return the length of the longest substring between two equal characters,
//  excluding the two characters. If there is no such substring return -1.
//  A substring is a contiguous sequence of characters within a string.
public class LargestSubstringBetweenTwoEqualCharacters {

    public static int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> lastOccurrence = new HashMap<>();
        int maxLength = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastOccurrence.containsKey(c)) {
                maxLength = Math.max(maxLength, i - lastOccurrence.get(c) - 1);
            } else {
                lastOccurrence.put(c, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abca";
        int output = maxLengthBetweenEqualCharacters(s);
        System.out.println("Output : " + output);
    }

}
