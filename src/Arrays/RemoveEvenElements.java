package Arrays;

public class RemoveEvenElements {

	public static void main(String[] args) {

		int[] inputArray = {2, 4, 5, 8, 7, 16, 1};
		removeEvenEle(inputArray);
		
	}
	
	public static int[] removeEvenEle(int[] arr) {
		int[] temp = arr;
		int evenIndex = 0;
		for(int i=0; i< arr.length; i++) {
			if(temp[i]%2 == 0) {
				evenIndex++;
			}
		}
		
		arr = new int[evenIndex];
		int index=0;
		for(int i=0; i<temp.length; i++) {
			if(temp[i]%2 == 0) {
				arr[index++] = temp[i];
			}
		}
		
		return arr;
	}

}
