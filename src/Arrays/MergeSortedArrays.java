package Arrays;

public class MergeSortedArrays {
	
	public static void main(String[] args) {
		int[] arr1 = {2, 5, 8};
		int[] arr2 = {1, 3, 6, 9};
		int[] result = mergeArrays(arr1, arr2);
		printArray(result);
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {  
      int result[] = new int[arr1.length + arr2.length];

      int i = 0;
      while(i<arr1.length) {
        result[i] = arr1[i];
        i++;
      }

      int j = 0;
      while(j<arr2.length) {
        result[i] = arr2[j];
        i++;
        j++;
      }
      
      // insertion sort
      for(int k = 1; k<result.length; ++k) {
        int key = result[k];
        j = k-1;
        while(j >= 0 && result[j]>key) {
          result[j+1] = result[j];
          j = j-1;
        }
        result[j+1] = key;
      }

      return result;
    }
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
