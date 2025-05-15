package String;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        return strArr[strArr.length-1].length()
                ;
    }

    public static void main(String[] args) {
        System.out.println("length: "+lengthOfLastWord("Have a nice day"));
    }

}
