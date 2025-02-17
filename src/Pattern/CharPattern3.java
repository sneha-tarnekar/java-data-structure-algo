package Pattern;

/*

A
BB
CCC
DDDD

 */

public class CharPattern3 {

    public static void main(String[] args) {
        pattern3(4);
    }

    public static void pattern3(int n) {
        for(char i='A'; i<'A'+n; i++) {
            for(char j='A'; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
