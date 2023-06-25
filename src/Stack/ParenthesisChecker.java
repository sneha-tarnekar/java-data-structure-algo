package Stack;
import java.util.Stack;

public class ParenthesisChecker {

    private static boolean isParenthesis(String x)
    {
        Stack<Character> leftSymbols = new Stack<>();
        // Loop for each character of the string
        for (char c : x.toCharArray()) {
            // If left symbol is encountered
            if (c == '(' || c == '{' || c == '[') {
                leftSymbols.push(c);
            }
            // If right symbol is encountered
            else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            // If none of the valid symbols is encountered
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }

    public static void main(String[] args) {
        if(isParenthesis("{([])}")) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}
