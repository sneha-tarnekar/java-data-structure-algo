package SearchingAlgo.BinarySearch;

public class FindPivotInSortedRotatedArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 0, 1};
        int output = findPivot(arr);
        System.out.println("Output : " + output);
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (arr[mid] < arr[mid - 1]) {
                return mid;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

}
