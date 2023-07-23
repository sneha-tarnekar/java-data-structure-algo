package SortingAlgorithms;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {3, 2, 5, 6, 9, 1};
        selectionSort(input);

        for (int i : input) {
            System.out.print(i + " ");
        }
    }
}
