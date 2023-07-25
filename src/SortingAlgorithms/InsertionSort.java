package SortingAlgorithms;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int j;
        for(int i=0; i<arr.length; i++) {
            j=i;
            while(j>0 && arr[j-1]>arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {3, 2, 5, 6, 9, 1};
        insertionSort(input);

        for (int i : input) {
            System.out.print(i + " ");
        }
    }

}
