package Pattern;

/*

1
2 3
4 5 6
7 8 9 10

 */

public class NumPattern4 {

    public static void main(String[] args) {
        pattern4(4);
    }

    public static void pattern4(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

}
