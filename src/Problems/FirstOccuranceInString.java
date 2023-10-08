package Problems;

/*
    Given two strings needle and haystack,
    return the index of the first occurrence of needle in haystack,
    or -1 if needle is not part of haystack.
 */
public class FirstOccuranceInString {

    public static int firstOcc(String haystack, String needle) {
        int j = -1;
        for(int i=1;i<=haystack.length()/2; i++) {
            if(haystack.length()%i==0) {
                j=i;
                while(j<haystack.length() && haystack.substring(j, j+i).equals(needle)) {
                    j+=i;
                }
            }
        }
        return j-needle.length();
    }

}
