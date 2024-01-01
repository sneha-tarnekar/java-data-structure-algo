package String;

//  You are given a string num representing a large integer. An integer is good if it meets the following conditions:
//     - It is a substring of num with length 3.
//     - It consists of only one unique digit.
//  Return the maximum good integer as a string or an empty string "" if no such integer exists.
public class Largest3SameDigitNumber {

    public static String largestGoodInteger(String num) {
        if (num.length() < 3) {
            return "";
        }

        String maxDigit = "";
        for (int i = 0; i < num.length() - 2; i++) {
            char[] numChar = num.substring(i, i + 3).toCharArray();
            if ((numChar[0] == numChar[1]) && (numChar[0] == numChar[2])) {
                char[] maxDigitArr = maxDigit.toCharArray();
                if (maxDigitArr.length == 0 || maxDigitArr[0] < numChar[0]) {
                    maxDigit = "" + numChar[0] + numChar[1] + numChar[2];
                }
            }
        }

        return maxDigit;
    }

    public static void main(String[] args) {
        String num = "6777133339";
        String output = largestGoodInteger(num);
        System.out.println("Output : " + output);
    }

}
