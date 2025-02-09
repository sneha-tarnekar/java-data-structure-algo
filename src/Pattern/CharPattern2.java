package Pattern;

/*

ABCD
ABC
AB
A

*/

public class CharPattern2 {

    public static void main(String[] args) {
        pattern2(4);
    }

    public static void pattern2(int n) {
        for(int i = n; i > 0; i--) {
            for(char j = 'A'; j<'A'+i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
