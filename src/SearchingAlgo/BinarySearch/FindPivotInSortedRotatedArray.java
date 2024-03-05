package SearchingAlgo.BinarySearch;

public class FindPivotInSortedRotatedArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 6, 0, 1};
        int output = findPivot(arr);
        System.out.println("Output : " + output);

        int[] arrWithDuplicates = {1, 1, 3, 4, 6, 0, 1, 1};
        output = findPivotWithDuplicates(arrWithDuplicates);
        System.out.println("Output : " + output);
    }

    // This will not work for the array with duplicate elements
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

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return arr.length - 1;
    }

    //  To find pivot in a sorted rotated array with duplicate elements
    public static int findPivotWithDuplicates(int[] arr) {
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

            //  if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //  skip the duplicates
                //  Note: what if these elements at start and end were the pivot??
                //  check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                //  check whether end is pivot
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
