package Problems;

public class CombinationSum {

    public static int combinationSum4(int[] nums, int target) {
        int[] arr = new int[target + 1];
        arr[0] = 1;

        for (int i = 0; i < target + 1; i++) {
            for (int n : nums) {
                if (n <= i) {
                    arr[i] += arr[i - n];
                }
            }
        }

        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        int target = 4;
        int output = combinationSum4(input, target);
        System.out.println("Possible Combinations are: " + output);
    }
}
