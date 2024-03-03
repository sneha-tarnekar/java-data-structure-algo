package SearchingAlgo.BinarySearch;

public class CeilOfNumber {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;
        int output = ceiling(arr, target);
        System.out.println(output);

    }

    private static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[arr.length - 1]) {
                return Integer.MAX_VALUE;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }

        return arr[start];
    }

}
