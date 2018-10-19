import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] input = {1, 1, 1, 1, 1};
        int S = 3;
        int result = new Solution().findTargetSumWays(input,S);
        System.out.println(result);
    }

   static class Solution {
        int result = 0;
        public int findTargetSumWays(int[] nums, int S) {
            if (nums == null || nums.length == 0) {
                return result;
            }
            findResult(nums, S, 0, 0);
            return result;
        }

        private void findResult(int[] nums, int target, int position, int k) {
            if (position == nums.length) {
                if (target == k) {
                    result++;
                }
                return;
            }
            findResult(nums, target, position + 1, k + nums[position]);
            findResult(nums, target, position + 1, k - nums[position]);

        }
    }
}
