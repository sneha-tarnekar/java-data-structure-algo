package SearchingAlgo;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {9, 23, 5, 65, 2, 6};
        int target = 65;
        int output = linearSearch(arr, target);
        System.out.println("Output : " + output);
    }

    // Return index of the target in the array
    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

}
