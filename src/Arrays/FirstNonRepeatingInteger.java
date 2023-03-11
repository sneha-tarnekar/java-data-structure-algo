package Arrays;

public class FirstNonRepeatingInteger {

	public static void main(String[] args) {
		int[] arr = {2,4,2,1,3,1};
		int result = findFirstUnique(arr);
		System.out.println(result);
	}
	
	public static int findFirstUnique(int[] arr) 
	 {
	    boolean isRepeated = false;

	    for(int i=0; i<arr.length; i++) {
	    	for(int j=0; j<arr.length; j++) {
	    		if(arr[i] == arr[j] && i != j) {
	    			isRepeated = true;
	    			break;
	    		}
	    	}
	      
	    	if(isRepeated == false) {
	    	  return arr[i];
	    	} else {
	    	  isRepeated = false;
	    	}	
	    }
	   return -1;
	 }

}
