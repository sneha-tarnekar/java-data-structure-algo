package Arrays;

public class RearrangeInMaxMin {

	public static void main(String[] args) {
		int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
		maxMin(inputArray);
		MergeSortedArrays.printArray(inputArray);
	}
	
	public static void maxMin(int[] arr) {
	    int[] result = new int[arr.length];
	    int max = 0;
	    int min = 1;

	    // Solution 1
	    for(int i=arr.length-1; i>=0; i--) {
	      if(max < arr.length) {
	        result[max] = arr[i];
	        max = max + 2;
	      }
	    }

	    for(int i=0; i<arr.length; i++) {
	      if(min < arr.length) {
	        result[min] = arr[i];
	        min = min + 2;
	      }
	    } 

	    // Solution 2 - preferred
	    int minIndex = 0;
	    int maxIndex = arr.length-1;
	    boolean switchIndex = true;
	    for(int i=0; i<arr.length; i++) {
	      if(switchIndex) 
	        result[i] = arr[maxIndex--];
	      else 
	        result[i] = arr[minIndex++];

	      switchIndex = !switchIndex;
	    }
	    
	    for(int i=0; i<arr.length; i++) {
	      arr[i] = result[i];
	    }
	  }

}
