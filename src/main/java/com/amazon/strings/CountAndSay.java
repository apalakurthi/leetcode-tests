package com.amazon.strings;
/**
 * Count and Say
 * Solution
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence. You can do so recursively, in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 *
 *
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 *
 * **/
public class CountAndSay {

  public String countAndSay(int n) {
    if(n<=0) {
      return "";
    }

    String result = "1";
    if (n ==1) {
      return result;
    }

    for(int i=1; i< n; i++){
      int count = 0;
      char ch = Character.MIN_VALUE;
      StringBuilder sb = new StringBuilder();
      for (int j= 0; j<result.length(); j++) {
        if (ch == Character.MIN_VALUE) {
          ch = result.charAt(j);
          ++count;
        } else if (ch == result.charAt(j)) {
          ++count;
        } else if (ch != result.charAt(j)) {
          sb.append(count);
          sb.append(ch);
          ch = result.charAt(j);
          count = 1;
        }
      }
      sb.append(count);
      sb.append(ch);
      result = sb.toString();
    }
    return result;
  }

}
