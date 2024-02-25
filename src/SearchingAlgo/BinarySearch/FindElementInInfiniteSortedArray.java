package SearchingAlgo.BinarySearch;

public class FindElementInInfiniteSortedArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 19, 22, 25, 26, 28, 30, 32, 33, 36};
        int target = 23;
        int output = search(arr, target);
        System.out.println(output);
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            // double the size of box (range)
            // end = previous end + (size of previous range) * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }

        return -1;
    }

}
