package SearchingAlgo.BinarySearch;

//  https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 5, 3, 1};
        int[] arr = {1, 5, 2};
        int target = 2;
        int output = search(arr, target);
        System.out.println("Output : " + output);
    }

    public static int search(int[] arr, int target) {
        int peak = findPeak(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return binarySearch(arr, target, peak, arr.length - 1);
    }

    // Find peak element in mountain array
    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // Order agnostic binary search
    public static int binarySearch(int[] arr, int target, int start, int end) {
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
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }

}
