package Pattern;

/*

        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *

 */

public class DiamondPattern {

    public static void printDiamond(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<=n-i-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDiamond(8);
    }
}
