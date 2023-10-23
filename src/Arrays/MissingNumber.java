package Arrays;

import java.util.Arrays;

public class MissingNumber {

    // Approach 1
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

    // Approach 2
    public static int missingNum(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }

        if (nums[0] > 0) {
            return nums[0] - 1;
        }

        return nums[nums.length - 1] + 1;
    }

    public static void main(String[] args) {
        int[] input = {1, 4, 3};
        int N = 4;
        int result = missingNumber(input, N);
        System.out.println("Missing number : " + result);

        result = missingNum(input);
        System.out.println("Missing num : " + result);
    }

}
