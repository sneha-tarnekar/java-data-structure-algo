package String;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "hello";
        char output = nonRepeatingCharacter(input);
        System.out.println("Output : " + output);
    }

    public static char nonRepeatingCharacter(String S) {
        for (char c : S.toCharArray()) {
            if (S.indexOf(c) == S.lastIndexOf(c)) {
                return c;
            }
        }

        return '$';
    }

}
