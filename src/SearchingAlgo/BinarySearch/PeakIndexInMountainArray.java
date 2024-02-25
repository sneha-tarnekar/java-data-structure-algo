package SearchingAlgo.BinarySearch;

//  https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10, 9, 8, 7, 3, 1};
        int output = peak(arr);
        System.out.println("Output : " + output);
    }

    public static int peak(int[] arr) {
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

}
