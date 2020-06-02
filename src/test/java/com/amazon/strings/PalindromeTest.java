package com.amazon.strings;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

  @Test
  public void isPalindrome() {
    Palindrome palindrome = new Palindrome();
    assertTrue(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    assertFalse(palindrome.isPalindrome("race a car"));
    assertFalse(palindrome.isPalindrome("0P"));

  }
}
