package Problems;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibbonacci(8);
	}

	// [ 1, 1, 2, 3, 5, 8, 13, 21]
	public static void fibbonacci(int n) {
		int prev = 0;
		int next = 1;
		int temp;
		System.out.print(next + " ");
		while (n > 1) {
			temp = next;
			next = prev + next;
			prev = temp;

			System.out.print(next + " ");
			n--;
		}
	}

}
