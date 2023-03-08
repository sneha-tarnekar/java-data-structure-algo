package Arrays;

public class CheckSumOfTwoNumbers {

	public static void main(String[] args) {
		int[] arr1 = {2, 1, 4, 6, 5, 8};
		int num = 11;
		int[] result = findSum(arr1, num);
		MergeSortedArrays.printArray(result);
	}
	
	public static int[] findSum(int[] arr, int n) {
	    int[] result = new int[2];

	    for(int i=0; i<arr.length; i++) {
	      for(int j=i+1; j<arr.length; j++) {
	        if((arr[i]+arr[j]) == n) {
	          result[0] = arr[i];
	          result[1] = arr[j];
	          return result;
	        }
	      }
	    }
	    
	    return arr; 
	}

}
