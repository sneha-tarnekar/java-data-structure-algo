package SearchingAlgo.BinarySearch;

//  https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 10, 15, 18, 0, 1, 3, 4};
        int target = 9;
        int output = search(arr, target);
        System.out.println("Output : " + output);
    }

    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // If array is not rotated, apply binary search directly
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if (target == arr[pivot]) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

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
