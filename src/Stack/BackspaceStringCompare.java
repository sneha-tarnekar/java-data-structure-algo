package Stack;

import java.util.Stack;

/*
    Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
    Note that after backspacing an empty text, the text will continue empty.
 */
public class BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        java.util.Stack<Character> str1 = new java.util.Stack<>();
        java.util.Stack<Character> str2 = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!str1.isEmpty())
                    str1.pop();
            } else {
                str1.push(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!str2.isEmpty())
                    str2.pop();
            } else {
                str2.push(c);
            }
        }

        return str1.equals(str2);
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean output = backspaceCompare(s, t);
        System.out.println("Output : " + output);
    }

}
