package Arrays;

public class RearrangePositiveNagativeValues {

	public static void main(String[] args) {
		int[] inputArray = {2, 4, -5, 8, -7, -16, 1};
		reArrange(inputArray);
		MergeSortedArrays.printArray(inputArray);
	}
	
	public static void reArrange(int[] arr) {
	    int[] resultArr = new int[arr.length];
	    int resultArrIndex = 0;
	    for(int i=0; i<arr.length; i++) {
	      if(arr[i]<0){
	        // resultArrIndex++ will first save the element then perform increament
	        resultArr[resultArrIndex++] = arr[i];
	      }
	    }    

	    for(int i=0; i<arr.length; i++) {
	      if(arr[i]>=0){
	        resultArr[resultArrIndex++] = arr[i];
	      }
	    }    

	    // Now put sorted element in input array 
	    for(int i=0; i<arr.length; i++) {
	      arr[i] = resultArr[i];
	    }
	}

}
