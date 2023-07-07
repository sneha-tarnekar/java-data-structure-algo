package Arrays;

public class MissingNumber {

    public static int missingNumber(int A[], int N) {
        for (int i = 1; i <= N; i++) {
            boolean flag = true;
            for (int j = 0; j < N - 1; j++) {
                if (A[j] == i) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] input = {1, 4, 3};
        int N = 4;
        int result = missingNumber(input, N);
        System.out.println("Missing number : " + result);
    }
}
