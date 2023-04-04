package Problems;

public class OddNumberPattern {

	public static void main(String[] args) {
		oddNumberPattern(5);
	}

	/* 
	 * 
	 * Sample Input : 5
	 * Sample Output :
	 * 13579
	 * 35791
	 * 57913
	 * 79135
	 * 91357
	 * 
	 */

	public static void oddNumberPattern(int n) {
		for (int i = 1; i < n * 2; i = i + 2) {
			for (int j = i; j < n * 2; j++) {
				if (j % 2 != 0) {
					System.out.print(j);
				}
			}

			for (int k = 1; k < i; k++) {
				if (k % 2 != 0) {
					System.out.print(k);
				}
			}
			System.out.println();
		}
	}

}
