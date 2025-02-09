package ibm;

import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    // System.out.println(getHCF(70, 15));

    // String inputStr = "a3b5c2a2";
    // String compressedResult = properCompression(inputStr);
    // System.out.println(compressedResult);  // Output: "aaabbbbbcc"

    decimalToBinary(25);

  }

  private static int getHCF(int a, int b) {
    int hcf = Math.min(a, b);

    while(hcf > 0) {
      if (a % hcf ==0 && b % hcf ==0) {
        break;
      }

      hcf--;
    }

    return hcf;
  }

  // private static String properCompression(String inputStr) {
  //   char[] inputChars =  inputStr.toCharArray();

  //   StringBuilder  outString= new StringBuilder();

  //   int i = 0;

  //   while ( i < inputChars.length) {
  //     outString.append(Character.toString(inputChars[i]).repeat(inputChars[++i]));
  //     i++;
  //   }

  //   return new String(outString.toString().toCharArray());
  //   // return inputStr;
  // }

  public static String properCompression(String s) {
    StringBuilder compressedStr = new StringBuilder();

    for (int i = 0; i < s.length(); i += 2) {
      char c = s.charAt(i);
      int count = Character.getNumericValue(s.charAt(i + 1));
      while (count > 0) {
        compressedStr.append(c);
        count--;
      }
    }

    // return compressedStr.toString();
    char[] tempArray = compressedStr.toString().toCharArray();
    Arrays.sort(tempArray);
    // Array
    return new String(tempArray);
  }

  private static void decimalToBinary(int number) {
    System.out.println(Integer.toBinaryString(number));
  }

}
