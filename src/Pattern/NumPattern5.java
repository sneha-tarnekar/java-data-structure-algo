package Pattern;

/*

1        1
12      21
123    321
1234  4321
1234554321

 */

public class NumPattern5 {

    public static void main(String[] args) {
        pattern5(5);
    }

    public static void pattern5(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }

            for(int sp=n*2; sp>i*2; sp--) {
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
