package String;

//Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

public class CheckRepeatedSubstring {

    public static boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<=s.length()/2; i++) {
            if(s.length()%i==0) {
                String current = s.substring(0, i);
                int j=i;
                while(j<s.length() && s.substring(j, j+i).equals(current)) {
                    j+=i;
                }
                if(j==s.length()) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean output = repeatedSubstringPattern("abcabc");
        System.out.println("Is Repeated : " + output);
    }
}
