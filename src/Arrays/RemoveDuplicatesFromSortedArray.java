package Arrays;

import java.util.TreeSet;

/*
 *   Given a sorted array A[] of size N, delete all the duplicated elements from A[].
 *   Modify the array such that if there are X distinct elements in it
 *   then the first X positions of the array should be filled with them in increasing order
 *   and return the number of distinct elements in the array.
 */
public class RemoveDuplicatesFromSortedArray {

    static int remove_duplicate(int A[], int N) {
        TreeSet<Integer> set = new TreeSet();
        for (int i = 0; i < N; i++) {
            set.add(A[i]);
        }

        int k = set.size();

        int j = 0;
        for (int ele : set) {
            A[j++] = ele;
        }
        return k;
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 3, 3, 4, 4};
        int uniqueElements = remove_duplicate(input, input.length);
        System.out.println("After removing all the duplicates, number of array elements remained : " + uniqueElements);
    }
}
