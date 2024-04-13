package String;

public class CheckPalidromeWithTwoPointer {

    public static void main(String[] args) {
        String input = "abcdedcba";
        boolean output = isPalindrome(input);
        System.out.println(output);
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }

}
