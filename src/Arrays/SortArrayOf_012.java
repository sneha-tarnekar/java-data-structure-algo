package Arrays;

public class SortArrayOf_012 {
    public static void sort012(int a[], int n)
    {
        int[] result = new int[n];
        int resultIndex = 0;

        for(int i=0; i<n; i++) {
            if(a[i]==0) {
                result[resultIndex++]=a[i];
            }
        }

        for(int i=0; i<n; i++) {
            if(a[i]==1) {
                result[resultIndex++]=a[i];
            }
        }

        for(int i=0; i<n; i++) {
            if(a[i]==2) {
                result[resultIndex++]=a[i];
            }
        }

        for(int i=0; i<n; i++) {
            a[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 0, 2, 0, 1, 1};
        sort012(input, input.length);

        for(int i=0; i<input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
