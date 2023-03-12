package Arrays;

public class SecondMaximumValue {

	public static void main(String[] args) {
		int[] arr = {4,6,9,15,22,3};
		int result = findSecondMaximum(arr);
		System.out.println(result);
	}
	
	public static int findSecondMaximum(int[] arr) {
	    for(int i=1; i<arr.length; ++i) {
	      int key = arr[i];
	      int j = i-1;
	      while(j >= 0 && key < arr[j]) {
	        arr[j+1] = arr[j];
	        j = j-1;
	      }
	      arr[j+1] = key;
	    }
	    
	    return arr[arr.length-2];
	}

}
