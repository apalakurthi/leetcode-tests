package com.amazon.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement strStr()
 * Solution
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 *
 *
 * */


public class ImplStrStr {

  public int contains(String haystack, String needle) {

    if (needle  == null || needle.trim().length() == 0 ) {
      return 0;
    }

    if (haystack == null || haystack.trim().length() == 0 ) {
      return -1;
    }

    if (haystack.length() < needle.length()) {
      return -1;
    }

    List<Integer> indices = new ArrayList<>();

    for (int i =0; i<haystack.length(); i++) {
      if (needle.charAt(0) == haystack.charAt(i)) {
        indices.add(i);
      }
    }

    if (indices.isEmpty()) {
      return -1;
    }

    for (int index : indices) {
      int count = 0;

      if (haystack.length() < index+needle.length()) {
        return -1;
      }

      for(int i = 0; i< needle.length(); i++) {

        if (haystack.charAt(index+i) != needle.charAt(i)) {
          break;
        }
        count ++;
      }

      if (count == needle.length()) {
        return index;
      }
    }


    return -1;
  }

}
