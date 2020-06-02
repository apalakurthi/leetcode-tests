package com.amazon.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  @Test
  public void isAnagram() {
    Anagram anagram = new Anagram();
    assertTrue(anagram.isAnagram("anagram", "nagaram"));
    assertFalse(anagram.isAnagram("rat", "cat"));
  }
}