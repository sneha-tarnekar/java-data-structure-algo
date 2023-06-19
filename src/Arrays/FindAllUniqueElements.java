package Arrays;

public class FindAllUniqueElements {

	public static void main(String[] args) {
		int[] arr = {1, 3, 1, 5, 6, 6, 7, 10, 7};
		findUnique(arr);

	}
	
	public static void findUnique(int[] input) {
		for(int i=0; i<input.length; i++) {
			int count=1;
			for(int j=0; j<input.length; j++) {
				if(i!=j && input[i]==input[j]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(input[i]);
			}
		}
	}

}
