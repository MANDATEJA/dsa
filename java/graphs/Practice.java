package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
  public static void main(String[] args) {
    // System.out.println(Arrays.deepToString(adjacencyMatrix(new int[][] {{0, 1}, {1, 2}, {0, 3}, {3, 4}, {3,6}, {3, 7}, {4,2}, {4, 5}, {5, 2}}, 8)));
    System.out.println(adjacencyMap(new int[][] {{0, 1}, {1, 2}, {0, 3}, {3, 4}, {3,6}, {3, 7}, {4,2}, {4, 5}, {5, 2}}, 8));
  }

  private static int[][] adjacencyMatrix(int[][] graph, int n) {
    int[][] matrix = new int[n][n];

    for(int[] node: graph) {
      matrix[node[0]][node[1]] = 1;
    }

    return matrix;
  }

  private static Map<Integer, List<Integer>> adjacencyMap(int[][] graph, int n) {
    Map<Integer, List<Integer>> map = new HashMap<>();

    for(int[] node: graph) {
      // map.put(node[0], map.getOrDefault(node[0], new ArrayList<Integer>()).add(node[1]));
      List<Integer> list = map.getOrDefault(node[0], new ArrayList<>());
      list.add(node[1]);
      map.put(node[0], list);
    }

    return map;
  }
}
