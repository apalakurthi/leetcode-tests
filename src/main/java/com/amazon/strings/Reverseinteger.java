package com.amazon.strings;

/**
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed
 * integer range: [−231,  231 − 1]. For the purpose of this problem, assume
 * that your function returns 0 when the reversed integer overflows.
 * */

public class Reverseinteger {

  public int reverse(int x) {
    int reversed =  0;

    boolean negative = false;

    if (x < 0) {
      x = x * -1;
      negative = true;
    }

    while (x > 0) {
      int digit = x%10;
      reversed = reversed *10 +digit;
      x = x/10;
    }

    if (reversed == Integer.MAX_VALUE) {
      return 0;
    }

    if (negative) {
      return reversed * -1;
    }

    return reversed;
  }

}