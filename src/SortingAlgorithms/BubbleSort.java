package SortingAlgorithms;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for(int i=arr.length-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {3, 2, 5, 6, 9, 1};
        bubbleSort(input);

        for (int i : input) {
            System.out.print(i + " ");
        }
    }
}
