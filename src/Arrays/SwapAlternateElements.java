package Arrays;

public class SwapAlternateElements {

	public static void main(String[] args) {
		int[] arr1 = {9, 3, 6, 12, 4, 32};
		swapAlternate(arr1.length, arr1);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}
	
	public static void swapAlternate(int n, int[] input) {
		for(int i=0; i<n; i=i+2) {
			int temp = input[i];
			input[i]=input[i+1];
			input[i+1]=temp;	
		}
	}

}
