package com.amazon.strings;

/**
 *  Valid Palindrome
 * Solution
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 * */
public class Palindrome {

  public boolean isPalindrome(String s) {

    s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    s.split(" ");

    for(int i=0, j=s.length()-1; i<j; i++, j--) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
    }

    return true;
  }

}
