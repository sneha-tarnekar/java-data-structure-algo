package SearchingAlgo.BinarySearch;

public class RotationCount {

    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 5, 5, 6, 7, 1, 2, 3, 3, 3};
        int output = countRotations(arr);
        System.out.println("Output : " + output);
    }

    public static int countRotations(int[] arr) {
        int pivot = findPivotWithDuplicates(arr);
        return pivot + 1;
    }

    // Find pivot in sorted rotated array with no duplicate elements
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if start is greater than equal to mid then search in first half
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {     // else search in second half
                start = mid + 1;
            }
        }

        return -1;
    }

    // Find pivot in sorted rotated array with duplicate elements
    public static int findPivotWithDuplicates(int[] arr) {

        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

}
