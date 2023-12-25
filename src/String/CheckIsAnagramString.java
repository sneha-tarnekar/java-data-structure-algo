package String;

public class CheckIsAnagramString {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            if (!t.contains(String.valueOf(ch))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean output = isAnagram(s, t);
        System.out.println("Is Anagram : " + output);
    }

}
