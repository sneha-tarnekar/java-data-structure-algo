package Arrays;

public class MininumElementOfAnArray {

	public static void main(String[] args) {
		int[] inputArray = {2, 4, 5, 8, 7, 16, 1};
		int result = findMinimum(inputArray);
		System.out.println("Minimun element = "+ result);
	}
	
	public static int findMinimum(int[] arr) {
	    int min = arr[0];
	    for(int i=0; i<arr.length; i++) {
	      if(min>arr[i]) {
	        min = arr[i];
	      }
	    }
	    return min;        
	}

}
