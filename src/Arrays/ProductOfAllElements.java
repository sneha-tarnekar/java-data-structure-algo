package Arrays;

public class ProductOfAllElements {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		int[] result = findProduct(arr);
		MergeSortedArrays.printArray(result);
	}
	
	 public static int[] findProduct(int arr[]) {    
	    int [] result = new int[arr.length];

	    for(int i=0; i<arr.length; i++) {
	      result[i] = 1;
	      for(int j=0; j<arr.length; j++) {
	        if(i != j) {
	          result[i] = result[i]*arr[j];
	        }
	      }
	    }

	    return result; 
	 } 

}
