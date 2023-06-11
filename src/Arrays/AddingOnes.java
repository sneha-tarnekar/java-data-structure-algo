package Arrays;

/*
*   You start with an array A of size N. Initially all elements of the array A are zero.
*   You will be given K positive integers. Let j be one of these integers, you have to add 1 to all A[i], where i ≥ j.
*   Your task is to print the array A after all these K updates are done.
*   Note: 1-based indexing is used everywhere in this question.
*
*   Input:
*       a=[0, 0, 0], N = 3, updates=[1, 1, 2, 3], K = 4
*   Output:
*       [2, 3, 4]
* */
public class AddingOnes {
    public static void update(int a[], int n, int updates[], int k)
    {

        for(int i=0; i<k; i++) {
            a[updates[i]-1]++;
        }
        int temp = 0;
        for(int i=0; i<n; i++) {
            a[i] = a[i]+temp;
            temp = a[i];
        }
    }

    public static void main(String[] args) {
        int[] input = {0, 0, 0};
        int[] updates = {1, 1, 2, 3};
        update(input, input.length, updates, updates.length);

//        print updated array
        for(int i=0; i<input.length; i++) {
            System.out.print(input[i]+" ");
        }
    }
}
