package com.amazon.strings;
/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 *
 *
 * Example 1:
 *
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 *
 * */
public class ReverseString {

  public char[] reverse(char[] input) {

    for(int i=0, j= input.length-1; i<j; i++, j--) {
      char temp = input[j];
      input[j]= input[i];
      input[i]= temp;
    }
    return input;
  }

}
