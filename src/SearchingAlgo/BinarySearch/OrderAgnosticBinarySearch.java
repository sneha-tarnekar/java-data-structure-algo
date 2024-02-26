package SearchingAlgo.BinarySearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {40, 36, 33, 29, 27, 24, 9, 5, 2};
        int target = 9;
        // Use order agnostic binary search when
        // we don't know the arr is sorted in which order either asc or desc
        int output = orderAgnosticBinarySearch(arr, target);
        System.out.println("Output : " + output);
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }

}
