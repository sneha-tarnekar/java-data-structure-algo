package String;

/*
    Given a string s, find the first non-repeating character in it and return its index.
    If it does not exist, return -1.
 */
public class FindFirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();

        boolean isRepeated = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return i;
            } else {
                isRepeated = false;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String input = "lovetocode";
        int output = firstUniqChar(input);
        System.out.println("Output : " + output);
    }

}
