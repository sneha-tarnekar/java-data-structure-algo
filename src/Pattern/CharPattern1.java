package Pattern;

/*

A
AB
ABC
ABCD

 */

public class CharPattern1 {

    public static void main(String[] args) {
        pattern1(4);
    }

    public static void pattern1(int n) {
        for(char i='A'; i<'A'+n; i++) {
            for(char j='A'; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
