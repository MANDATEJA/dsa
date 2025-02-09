package arrays;

import java.util.Arrays;

public class MaxSubarraySum {

  // Naive approach
  // private int calculateMaxSubarraySum(int[] array) {
  //   int sum = 0;
    
  //   for(int i = 0; i < array.length; i++) {
  //     int currentSum = 0;
  //     for (int j = i; j< array.length; j++) {
  //       currentSum += array[j];

  //       sum = Math.max(sum, currentSum);
  //     }
  //   }

  //   return sum;
  // }

  // Using kadane's algorithm
  // Docs link: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
  private int maxSum(int[] array) {
    int sum = 0;
    int maxEnding = 0;

    for (int i = 1; i < array.length; i++) {
      maxEnding = Math.max(maxEnding + array[i], array[i]);

      sum = Math.max(maxEnding, sum);
    }

    return sum;
  }


  public static void main(String[] args) {
    MaxSubarraySum maxSubarraySum = new MaxSubarraySum();

    // int[] array = {1, 2, -3, 4, 5};
    int[] arr = {2, 3, -8, 7, -1, 2, 3};
    // int sum = maxSubarraySum.calculateMaxSubarraySum(array);
    int sum = maxSubarraySum.maxSum(arr);

    System.out.println("Max subarray sum: " + sum);
  }
}