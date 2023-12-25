package String;

import java.util.Arrays;

//  Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//  An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//  typically using all the original letters exactly once.
public class CheckIsAnagramString {

    public static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        // Case 1
        String s = "anagram";
        String t = "nagaram";

        boolean output = isAnagram(s, t);
        System.out.println(String.format("Is String '%s' and '%s' Anagram : %s", s, t, output));

        // Case 2
        String s1 = "aacc";
        String t1 = "ccab";

        boolean output1 = isAnagram(s1, t1);
        System.out.println(String.format("Is String '%s' and '%s' Anagram : %s", s1, t1, output1));
    }

}
