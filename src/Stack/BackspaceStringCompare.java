package Stack;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {

        String str1 = "";
        for(char ch: s.toCharArray()) {
            if(ch == '#' && str1.length()>0) {
                str1 = str1.substring(0, str1.length() - 1);

            } else{
                str1 = str1 +ch;
            }
        }

        String str2 = "";
        for(char ch: t.toCharArray()) {
            if(ch == '#' && str2.length()>0) {
                str2 = str2.substring(0, str2.length() - 1);
            } else{
                str2 = str2 +ch;
            }
        }

        str1 = str1.replace("#","");
        str2 = str2.replace("#","");
        System.out.println("String1 : "+str1+"  String2 : "+str2);

        return str1.equals(str2);

    }

}
