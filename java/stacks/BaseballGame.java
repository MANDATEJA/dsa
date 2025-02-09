package stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseballGame {
  public static void main(String[] args) {
    System.out.println(calPoints(new String[] {"1","C"}));
  }

  public static int calPoints(String[] operations) {
    List<Integer> records = new ArrayList<>();
    Stack<String> opsStack = new Stack<>();

    for(int i = operations.length - 1; i>=0; i--) {
        opsStack.push(operations[i]);
    }

    while(opsStack.size() > 0) {
        String record = opsStack.pop();

        if (record.matches("[CD+]")) {
            if(record == "+") {
                records.add(records.get(records.size() - 1) + records.get(records.size() - 2));
            } else if (record == "C") {
                records.remove(records.size() - 1);
            } else {
                records.add(records.get(records.size() - 1) * 2);
            }
        } else {
            records.add(Integer.parseInt(record));
        }
    }

    int sum = 0;

    for(int n: records) {
        sum += n;
    }

    return sum;
  }
}
