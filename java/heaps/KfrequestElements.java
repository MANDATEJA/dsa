package heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class KfrequestElements {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(topKFrequent(new int[] {1,1,1,2,2,3}, 2)));
  }
  public static int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer, Integer> numsMap = new HashMap<>();

      for(int num: nums) {
          numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
      }

      PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
      // PriorityQueue<int[]> queue = new PriorityQueue<>();

      for(Map.Entry<Integer, Integer> entry: numsMap.entrySet()) {
          queue.offer(new int[] {entry.getKey(), entry.getValue()});
          if(queue.size() > k) {
              queue.poll();
          }

          // queue.offer(new int[] {entry.getKey(), entry.getValue()});
      }

      int[] result = new int[k];
      int index = 0;
      while(!queue.isEmpty()) {
        result[index++] = queue.poll()[0];
      }
      return result;
  }
}