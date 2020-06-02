package com.amazon.strings;
/**
 * Longest Common Prefix
 * Solution
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 *
 *
 * */
public class LongestCommonPrefix {

  public String prefix(String[] strs) {


    if(strs.length == 0) {
      return "";
    }

    StringBuilder sb = new StringBuilder();

    int length =strs[0].length();
    for (int i =1; i< strs.length; i++) {
      if (length > strs[i].length()) {
        length = strs[i].length();
      }
    }

    for (int i=0; i<length; i++) {
      char ch = strs[0].charAt(i);
      int count =1;
      for (int j =1; j< strs.length; j++) {
        if(ch == strs[j].charAt(i)) {
          count++;
        }
      }
      if(count ==strs.length) {
        sb.append(ch);
      } else {
        if (sb.length() > 0) {
          return sb.toString();
        } else {
          return "";
        }
      }
    }
    return sb.toString();
  }

}
