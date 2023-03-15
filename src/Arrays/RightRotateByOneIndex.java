package Arrays;

public class RightRotateByOneIndex {

	public static void main(String[] args) {
		int[] inputArray = {2, 4, 5, 8, 7, 16, 1};
		rotateArray(inputArray);
		MergeSortedArrays.printArray(inputArray);
	}
	
	public static void rotateArray(int[] arr){
	    int key = arr[arr.length-1];
	    for(int i=arr.length-1; i>0; i--) {
	      arr[i] = arr[i-1];
	    }
	    arr[0] = key;
	}

}
