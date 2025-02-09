package ibm;

import java.sql.Time;

public class PasswordString {
  public static void main(String[] args) {
    getMinFlips("10101101");
  }

  public static void getMinFlips(String pwd) {
    int flips = 0;
    int n = pwd.length();

    // int i = 0;

    // while(i < n) {
    //   char currentChar = pwd.charAt(i);
    //   int count = 0;

    //   // Count the length of countinuous blocks of 0's and 1's
    //   while (i < n && pwd.charAt(i) == currentChar) {
    //     count++;
    //     i++;
    //   }

    //   if (count % 2 != 0) {
    //     flips++;
    //   }
    // }

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        String substring = pwd.substring(i, i + 2);

        long zeroCount = substring.chars().filter(ch -> ch == '0').count();
        long oneCount = substring.chars().filter(ch -> ch == '1').count();

        flips += (int) Math.min(zeroCount, oneCount);
      }
    }

    System.out.println(flips);
  }
}
