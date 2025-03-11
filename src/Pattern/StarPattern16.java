package Pattern;

/*

 ****
 *  *
 *  *
 ****

 */

public class StarPattern16 {

    public static void main(String[] args) {
        pattern(8);
    }

    public static void pattern(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 || i==n-1 || j==0 || j==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

}
