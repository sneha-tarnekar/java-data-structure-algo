package Pattern;

/*

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

 */
public class StarPattern14_Diamond {

    public static void main(String[] args) {
        pattern(8);
    }

    public static void pattern(int n) {
        for (int row = 0; row < n * 2; row++) {

            int totalColsInRows = row > n ? n * 2 - row : row;
            int totalNumberOfSpaces = n - totalColsInRows;

            for (int col = 0; col < totalNumberOfSpaces; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
