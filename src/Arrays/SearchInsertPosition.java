package Arrays;

/*  Given a sorted array of distinct integers and a target value,
    return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target < nums[i] || target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 5, 6};
        int target = 5;
        int result = searchInsert(input, target);
        System.out.println("Search Insert Position: " + result);
    }

}
