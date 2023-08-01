package Recursion;

public class RemoveX {

    public static String removeX(String str) {
        if (str.length() == 0) {
            return str;
        }

        String ans = "";
        if (str.charAt(0) != 'X') {
            ans += str.charAt(0);
        }

        return ans + removeX(str.substring(1));
    }

    public static void main(String[] args) {
        String result = removeX("XasbXn");
        System.out.println(result);
    }

}
