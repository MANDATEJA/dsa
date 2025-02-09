package arrays;

// public class Solution {
//   public int maxSubArray(int[] nums) {
//       int maxSubArraySum = 0;
//       int maxEnding = 0;

//       for(int i = 1; i < nums.length; i++) {
//         maxEnding = Math.max(maxEnding, maxSubArraySum + nums[i]);
//         maxSubArraySum = Math.max(maxSubArraySum, maxEnding);
//       }

//       return maxSubArraySum;
//   }

//   public static void main(String[] args) {
//     int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

//     Solution solution = new Solution();
//     solution.maxSubArray(nums);
//   }
// }

class Solution {
  public int[] productExceptSelf(int[] nums) {
      int length = nums.length;

      int leftPrefix[] = new int[length];
      int rightPrefix[] = new int[length];

      int currentMultiplier = 1;

      for(int i = 0; i < length; i++) {
          leftPrefix[i] = i == 0 ? 1 : currentMultiplier * nums[i - 1];

          // currentMultiplier = nums[i];
          currentMultiplier = i == 0 ? 1 : nums[i];
      }

      currentMultiplier = 1;
      for(int j = length - 2; j > 0; j--) {
          rightPrefix[j] = currentMultiplier * nums[j + 1];

          // currentMultiplier = nums[j];
          currentMultiplier = rightPrefix[j];
      }

      int answer[] = new int[length];

      for(int i = 0; i < length; i++) {
          answer[i] = leftPrefix[i] * rightPrefix[i];
      }

      return answer;
  }

    public static void main(String[] args) {
    int[] nums = {1,2,3,4};

    Solution solution = new Solution();
    solution.productExceptSelf(nums);
  }
}