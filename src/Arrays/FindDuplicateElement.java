package Arrays;

public class FindDuplicateElement {

	public static void main(String[] args) {
		int[] arr = {0, 7, 5, 2, 5, 4, 1, 5, 3, 6};
		findDuplicate(arr);
	}
		
	public static void findDuplicate(int[] input) {
		for(int i=0; i<input.length; i++) {
			for(int j=i+1; j<input.length; j++) {
				if(input[i]==input[j]) {
					System.out.println(input[i]);
					break;
				}
			}
		}
	}
}
