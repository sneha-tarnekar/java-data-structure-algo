package SearchingAlgo.BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 23, 65};
        int target = 9;
        int output = binarySearch(arr, target);
        System.out.println("Output : " + output);
    }

    // Return index of the target in the array
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
