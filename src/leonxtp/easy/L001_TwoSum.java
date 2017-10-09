package leonxtp.easy;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
public class L001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String args[]) {
        L001_TwoSum twoSum = new L001_TwoSum();
        int[] sample = {2, 7, 11, 15, 33, 49, 50};
        int[] result = twoSum.twoSum(sample, 99);
        if (result != null) {
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("Solution doesn't exist!");
        }
    }
}
