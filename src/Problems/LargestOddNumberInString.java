package Problems;

/*  You are given a string num, representing a large integer.
    Return the largest-valued odd integer (as a string) that is a non-empty substring of num,
    or an empty string "" if no odd integer exists.
 */
public class LargestOddNumberInString {

    public String largestOddNumber(String num) {
        long number = Long.parseLong(num);

        if(number%2 != 0) {
            return num;
        }

        while(number != 0) {
            number = number/10;
            if(number%2 != 0) {
                return Long.toString(number);
            }
        }

        return "";
    }

}
