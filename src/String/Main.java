package String;

public class Main {

    public static void main(String[] args) {
        isSameRef();
        isSameRef2();
    }

    // Both s1 and s2 refer to the same string literal "Java" in the string pool,
    // so == compares their references, which are identical.
    public static void isSameRef() {
        String s1 = "Java";
        String s2 = "Ja" + "va";
        System.out.println(s1 == s2);
    }

    public static void isSameRef2() {
        String s1 = "Java";
        String s2 = "Ja";
        System.out.println(s1 == s2);
        s2 = s2 + "va";
        System.out.println(s1 == s2);
    }

}
