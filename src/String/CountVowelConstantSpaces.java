package String;

//Count number of vowels, consonants, spaces in String
public class CountVowelConstantSpaces {

    public static void countChar(String str) {
        int vowels = 0;
        int constants = 0;
        int spaces = 0;

        str = str.toLowerCase();
        for (char ch: str.toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
                vowels++;
            } else if (ch >= 'a' && ch<= 'z') {
                constants++;
            } else if (ch == ' ') {
                spaces++;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Constants : "+constants);
        System.out.println("Spaces : "+spaces);
    }

    public static void main(String[] args) {
        countChar("This is a String");
    }

}
