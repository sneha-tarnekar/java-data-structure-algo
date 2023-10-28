package String;

/*
    Given a string s, reverse the order of characters in each word within a sentence
    while still preserving whitespace and initial word order.
 */
public class ReverseWords {

    public static String reverseWords(String s) {
        String output = "";
        String[] strArr = s.split(" ");

        for (String str : strArr) {
            String reverseWord = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + str.toCharArray()[i];
            }
            output = output + reverseWord + " ";
        }

        return output.trim();
    }

    public static void main(String[] args) {
        String s = "Let's take coding contest";
        String output = reverseWords(s);
        System.out.println("Output : " + output);
    }

}
