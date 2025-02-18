package Pattern;


/*

 *   *   *   *   *
   *   *   *   *
     *   *   *
       *   *
         *

 */
public class StarPattern11 {

    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i * 2; j < n * 2 - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
