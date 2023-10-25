package String;

public class FindFirstUniqueCharacter {

    public int firstUniqChar(String s) {
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

}
